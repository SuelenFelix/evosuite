package com.pfa.app.model.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDto_getRole_24489044325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9814;

    public EmployeeDto_getRole_24489044325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9814 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term9814, term9814.getClass(), "employeeId", "LrqwfrKKtS");
        setField(term9814, term9814.getClass(), "firstName", "ZUdnQXfzCI");
        setField(term9814, term9814.getClass(), "lastName", "EULDrUNQvw");
        setField(term9814, term9814.getClass(), "email", "BtvAvsJSei");
        setField(term9814, term9814.getClass(), "phone", "vqnBkkxoIa");
        setField(term9814, term9814.getClass(), "hiredate", "bycpZjxXFn");
        setField(term9814, term9814.getClass(), "job", "jQWttOAiwL");
        setField(term9814, term9814.getClass(), "salary", "DzKFxEuEEC");
        setField(term9814, term9814.getClass(), "managerId", "CAMnvfDLJL");
        setField(term9814, term9814.getClass(), "username", "mfHtgSbdjD");
        setField(term9814, term9814.getClass(), "password", "cmuaUiHMVL");
        setField(term9814, term9814.getClass(), "role", "xjoSGPWUgu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term9814, args);
    }

};


