package com.sha.springbootproductseller.service;

import com.sha.springbootproductseller.model.User;

/**
 * @author piyush
 * @date 08.02.2023

 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
