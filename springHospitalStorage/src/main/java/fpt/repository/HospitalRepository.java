/**
 * 
 */
package fpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fpt.model.Hospital;

/**
 * @author YenDV
 *
 */
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
