package com.example.cassandra.spring_cassandra_crud.Repository;

import com.example.cassandra.spring_cassandra_crud.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository <Product, Integer>{

}
