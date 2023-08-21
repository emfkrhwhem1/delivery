package org.delivery.api.domain.user.business;

import lombok.RequiredArgsConstructor;
import org.delivery.api.common.annotation.Business;
import org.delivery.api.domain.user.converter.UserConverter;

@RequiredArgsConstructor
@Business
public class UserBusiness {

    private final UserBusiness userBusiness;
    private final UserConverter userConverter;

}
