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

public class CustomerInfo_CustomerInfoBuilder_address_629854244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;

    public CustomerInfo_CustomerInfoBuilder_address_629854244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo$CustomerInfoBuilder"));
        setField(term400, term400.getClass(), "id", "HyxfbSQYBe");
        setField(term400, term400.getClass(), "pw", "pCTimMblYc");
        setField(term400, term400.getClass(), "name", "hNxWaHcfhY");
        setField(term400, term400.getClass(), "address", "RkybSrpybU");
        setField(term400, term400.getClass(), "registeredDay", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo$CustomerInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "address", argTypes, term400, args);
    }

};


