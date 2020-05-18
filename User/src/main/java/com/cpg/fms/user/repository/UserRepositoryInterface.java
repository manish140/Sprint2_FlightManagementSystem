package com.cpg.fms.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cpg.fms.user.model.User;

@Repository
public interface UserRepositoryInterface extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE userId = ?1")
	public User viewUser(long userId);
	
	
	boolean existsUserByuserPhone(long userPhone);
	boolean existsUserByuserEmail(String userEmail);
	
   public User findUserByUserEmailAndUserPassword(String userEmail,String userPassword);
}
