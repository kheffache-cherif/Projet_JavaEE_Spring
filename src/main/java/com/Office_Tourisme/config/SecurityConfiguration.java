
/* La configuration Suivante permets l'accès aux differents URL : enregistrement , ficher css...
 * donner  acccès à la page de connexion personalisée et la déconnection
 * 
 * Aprés ça il faut crerer le password encoders 
 * */

package com.Office_Tourisme.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.Office_Tourisme.Service.UserService;



@Configuration  // class de cofiguration    Spring   // de calcul
@EnableWebSecurity  // Integration de spring Sécurity avec Spring MVC
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {// extends :
//Provides a convenient base class for creating a WebSecurityConfigurer instance.The implementation allows customization by overriding methods. 
	@Autowired
	private UserService userService;
	
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {  // Utilisation de BCryptPasswordEncoder
        return new BCryptPasswordEncoder();
    }
	
	@Bean //Intégration des donnes spring JP   // Bean est le fournisseur  d'authentification
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);  // on la la meyhode set qui prend comme param le srvice  d'ou l'injection de se dernier Mais aussi il doit implementer UserDetailsService 
        auth.setPasswordEncoder(passwordEncoder());  // et la l'encoding
        return auth;
    }
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// class Manager en paramettre
        auth.authenticationProvider(authenticationProvider());
        // je passe authenticationProvider en paramettre
        // pour integrer les dependance du Provider
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//HttpSecurity nous fournissons tout le ressort de configuration
		// Comme l'acces rapide aux ressoiurces statique et configuration URL
		http.authorizeRequests().antMatchers(  // configuration URLs exemple ci-dessous
				 "/registration**",
	                "/js/**",
	                "/css/**",
	                "/img/**").permitAll()
		.anyRequest().authenticated()  /// authentification de toute request ID
		.and()
		.formLogin()
		.loginPage("/login")  // parametre par defaut
		.permitAll()
		.and()
		.logout()
		.invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))// lors du click sue connexion
		.logoutSuccessUrl("/login?logout")  // redirection
		.permitAll();
	}

}
