package com.mypack.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.mypack.model.Parent;

public class UserDetail implements UserDetails {
	
	private Parent parent;
	
	public UserDetail(Parent parent) {
		super();
		this.parent = parent;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(parent.getRole());
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		
		return parent.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return parent.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
