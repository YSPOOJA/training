class Departments {
   int department_Id;
   String department_Name;
   int manager_Id;
   int location_Id;
}


class Employees {
    int employee_Id;
    String first_Name;
    String last_Name;
    String email;
    int phone_Int;
    int hire_Date;
    int job_Id;
    float salary;
    float commission_Pct;
    int manager_Id;
    int department_Id;
 }


 class Jobs {
    int job_Id;
    String job_Title;
    int  min_Salary;
    int max_Salary;
}

class Country {
    int country_Id;
    String country_Name;
    int region_Id;
}

class Locations {
    int location_Id;
    String street_Address;
    int postal_Code;
    String city;
    String state_Province;
    int country_Id;
}

class Regions {
    int region_Id;
    String region_Name;
}