package com.hps.provider.repository;

import com.hps.provider.bean.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
