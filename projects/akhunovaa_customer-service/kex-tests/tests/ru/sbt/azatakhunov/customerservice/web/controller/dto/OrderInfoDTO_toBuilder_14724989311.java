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

public class OrderInfoDTO_toBuilder_14724989311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1904;

    public OrderInfoDTO_toBuilder_14724989311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1904 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO"));
        setField(term1904, term1904.getClass(), "id", "LvJFtLBaxj");
        setIntField(term1904, term1904.getClass(), "price", 568599855);
        setIntField(term1904, term1904.getClass(), "quantity", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term1904, args);
    }

};


