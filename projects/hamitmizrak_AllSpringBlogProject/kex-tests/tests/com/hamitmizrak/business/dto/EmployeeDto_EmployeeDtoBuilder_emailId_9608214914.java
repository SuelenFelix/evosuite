package com.hamitmizrak.business.dto;

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
import static com.hamitmizrak.business.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class EmployeeDto_EmployeeDtoBuilder_emailId_9608214914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;

    public EmployeeDto_EmployeeDtoBuilder_emailId_9608214914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term393 = new Long(4872422362414183754L);
        term392 = newInstance(Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder"));
        setField(term392, term392.getClass(), "id", term393);
        setField(term392, term392.getClass(), "firstName", "tbcdzjIfER");
        setField(term392, term392.getClass(), "lastName", "HyxfbSQYBe");
        setField(term392, term392.getClass(), "emailId", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "emailId", argTypes, term392, args);
    }

};


