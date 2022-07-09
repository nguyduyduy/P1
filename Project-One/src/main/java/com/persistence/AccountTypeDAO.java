package com.persistence;

import com.models.Account_Type;
import com.utils.CustomCRUDInterface;

public class AccountTypeDAO implements CustomCRUDInterface<Account_Type> {
    @Override
    public Integer create(Account_Type account_type) {
        return null;
    }

    @Override
    public Account_Type read(Integer id) {
        return null;
    }

    @Override
    public Account_Type update(Account_Type account_type) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
