package io.javamonkey.data.service.init;

import io.javamonkey.data.service.dal.UserRepository;
import io.javamonkey.data.service.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataServiceInitializer implements ApplicationRunner
{
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		if(userRepo.count() == 0){
			initializeUsers();
		}
	}
	
	private void initializeUsers()
	{
		for(int i=1; i <= 100; i++){
			User user = new User("user"+i+"@javamonkey.io", "pass"+i);
			userRepo.save(user);
		}
	}

}
