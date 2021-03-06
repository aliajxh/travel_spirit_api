package com.java8.travel_spirit_api.service;

import com.java8.travel_spirit_api.dto.PackageFilter;
import com.java8.travel_spirit_api.dto.PackagesDTO;
import com.java8.travel_spirit_api.entity.Packages;
import com.java8.travel_spirit_api.utils.ServiceResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PackagesService {
    List<PackagesDTO> getFeaturedOffers();

    ServiceResponse addPackages(PackagesDTO packagesDTO);

    List<PackagesDTO> getPackages();

    List<PackagesDTO> getPackageByName(String name);

    ResponseEntity<List<Packages>> search(PackageFilter filter);

    List<PackagesDTO> getPromotionalOffers();

    List<PackagesDTO> getDestinations(PackageFilter dto);

    List<PackagesDTO> getBookingPackage(Long id);
}
