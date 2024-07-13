package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {

	// You can define queries in the Spring Data repositories. A query must start
	// with a prefix, for example, findBy.

	// Fetch cars by brand
	List<Car> findByBrand(@Param("brand") String brand);

	// Fetch cars by color
	List<Car> findByColor(@Param("color") String color);

	// Fetch cars by model year
	List<Car> findByModelYear(int modelYear);

	// There can be multiple fields after the By keyword, concatenated with the And
	// and Or keywords

	// Fetch cars by brand and model
	List<Car> findByBrandAndModel(String brand, String model);

	// Fetch cars by brand or color
	List<Car> findByBrandOrColor(String brand, String color);

	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByModelYearAsc(String brand);

	// You can also create queries by using SQL statements via the @Query
	// annotation.

	// Fetch cars by brand using SQL
	@Query("select c from Car c where c.brand = ?1")
	List<Car> findByBrandQuery(String brand);

	// Fetch cars by brand using SQL like option
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);
}

/*
 * import org.springframework.data.repository.PagingAndSortingRepository; public
 * interface CarRepository extends PagingAndSortingRepository <Car, Long> { }
 * 
 * In this case, you now have the two new additional methods that the repository
 * provides: Iterable<T> findAll(Sort sort) Returns all entities sorted by the
 * given options Page<T> findAll(Pageable pageable) Returns all entities
 * according to the given paging options
 */
