package ru.sbt.azatakhunov.customerservice.domain;

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
import static ru.sbt.azatakhunov.customerservice.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerInfo_CustomerInfoBuilder_id_9343020571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CustomerInfo_CustomerInfoBuilder_id_9343020571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo$CustomerInfoBuilder"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "pw", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "name", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "address", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "registeredDay", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo$CustomerInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "id", argTypes, term1, args);
    }

};


