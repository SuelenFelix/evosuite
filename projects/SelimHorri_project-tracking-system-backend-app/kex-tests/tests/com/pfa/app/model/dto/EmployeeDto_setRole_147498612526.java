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

public class EmployeeDto_setRole_147498612526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10079;

    public EmployeeDto_setRole_147498612526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10079 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10079, term10079.getClass(), "employeeId", "uzmqjnOUXu");
        setField(term10079, term10079.getClass(), "firstName", "xeyjTOCOJb");
        setField(term10079, term10079.getClass(), "lastName", "DGRqjjdhzy");
        setField(term10079, term10079.getClass(), "email", "lQFkjJUPAR");
        setField(term10079, term10079.getClass(), "phone", "BsuVlGUUjV");
        setField(term10079, term10079.getClass(), "hiredate", "bHHjfDCntT");
        setField(term10079, term10079.getClass(), "job", "sEphiduvkv");
        setField(term10079, term10079.getClass(), "salary", "PbLgCSAHce");
        setField(term10079, term10079.getClass(), "managerId", "NWldOLAbqk");
        setField(term10079, term10079.getClass(), "username", "qnYaYSpDwO");
        setField(term10079, term10079.getClass(), "password", "dgbFDCdHtj");
        setField(term10079, term10079.getClass(), "role", "EKpdCBubDE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zMsSLTfGhl";
        callMethod(klass, "setRole", argTypes, term10079, args);
    }

};


