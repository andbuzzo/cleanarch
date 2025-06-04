package com.d3h.cleanarch.core.dataprovider;

import com.d3h.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
