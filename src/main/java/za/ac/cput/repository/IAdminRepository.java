package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.List;

public interface IAdminRepository extends IRepository<Admin, Integer>{

     List<Admin>getAll();




}
