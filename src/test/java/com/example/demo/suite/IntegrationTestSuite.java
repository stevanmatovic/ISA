package com.example.demo.suite;

import com.example.demo.AuthenticationControllerTest;
import com.example.demo.ProtectedControllerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  AuthenticationControllerTest.class,
  ProtectedControllerTest.class
})
public class IntegrationTestSuite {

}
