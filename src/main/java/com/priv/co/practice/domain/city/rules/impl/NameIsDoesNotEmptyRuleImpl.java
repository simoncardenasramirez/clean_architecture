package com.priv.co.practice.domain.city.rules.impl;

import com.priv.co.practice.crosscutting.helpers.TextHelper;
import com.priv.co.practice.domain.city.exception.NameIsEmptyException;
import com.priv.co.practice.domain.city.rules.NameIsDoesNotEmptyRule;
import org.springframework.stereotype.Service;

@Service
public class NameIsDoesNotEmptyRuleImpl implements NameIsDoesNotEmptyRule {

    @Override
    public void execute(String data) {
        if(TextHelper.isEmpty(data) || TextHelper.isNull(data)) {
            throw NameIsEmptyException.create("el nombre de la ciudad es obligatorio");
        }
    }
}
