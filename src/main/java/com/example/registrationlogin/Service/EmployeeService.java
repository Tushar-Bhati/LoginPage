package com.example.registrationlogin.Service;

import com.example.registrationlogin.Dto.EmployeeDto;
import com.example.registrationlogin.Dto.LoginDTO;
import com.example.registrationlogin.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDto employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
