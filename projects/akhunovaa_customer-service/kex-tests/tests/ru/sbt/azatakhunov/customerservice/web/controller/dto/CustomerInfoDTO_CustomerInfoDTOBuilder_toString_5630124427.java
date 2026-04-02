package ru.sbt.azatakhunov.customerservice.web.controller.dto;

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
import static ru.sbt.azatakhunov.customerservice.web.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerInfoDTO_CustomerInfoDTOBuilder_toString_5630124427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3223;

    public CustomerInfoDTO_CustomerInfoDTOBuilder_toString_5630124427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3223 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.CustomerInfoDTO$CustomerInfoDTOBuilder"));
        setField(term3223, term3223.getClass(), "id", "ZzIujlwVsw");
        setField(term3223, term3223.getClass(), "pw", "LWyEaeIyAo");
        setField(term3223, term3223.getClass(), "name", "yVMkkQhvmN");
        setField(term3223, term3223.getClass(), "address", "mvrkADEgpp");
        setField(term3223, term3223.getClass(), "registeredDay", "pXOkjyeIRb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.CustomerInfoDTO$CustomerInfoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3223, args);
    }

};


