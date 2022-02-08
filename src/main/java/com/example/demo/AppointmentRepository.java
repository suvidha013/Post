package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment ,Integer>{

}
