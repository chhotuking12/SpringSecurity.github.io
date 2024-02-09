package com.mypack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mypack.model.Parent;
import com.mypack.repository.ParentRepository;
@Service
public class UserdetilImp implements UserDetailsService {
		@Autowired
		private ParentRepository rp;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Parent byEmail = rp.getByEmail(username);
		if(byEmail==null) {
			throw new UsernameNotFoundException("could not find");
		}
		
		UserDetail userDetail = new UserDetail(byEmail);
		
		return userDetail;
	}

}
