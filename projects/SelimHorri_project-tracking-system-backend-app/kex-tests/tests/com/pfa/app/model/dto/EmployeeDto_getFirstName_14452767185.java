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

public class EmployeeDto_getFirstName_14452767185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4294;

    public EmployeeDto_getFirstName_14452767185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4294 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term4294, term4294.getClass(), "employeeId", "SOrEHbcbmn");
        setField(term4294, term4294.getClass(), "firstName", "bnsyeQXFdu");
        setField(term4294, term4294.getClass(), "lastName", "BwtdjiefJn");
        setField(term4294, term4294.getClass(), "email", "jDmhBrIoDa");
        setField(term4294, term4294.getClass(), "phone", "SPtPatHeOm");
        setField(term4294, term4294.getClass(), "hiredate", "ywmcuThdfL");
        setField(term4294, term4294.getClass(), "job", "GBOEuByOfr");
        setField(term4294, term4294.getClass(), "salary", "NHbOFFjyVK");
        setField(term4294, term4294.getClass(), "managerId", "zaloBqlrSo");
        setField(term4294, term4294.getClass(), "username", "vvoLrMGCoN");
        setField(term4294, term4294.getClass(), "password", "pXdglvyrQe");
        setField(term4294, term4294.getClass(), "role", "OcfNzHYdki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term4294, args);
    }

};


