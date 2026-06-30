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

public class OrderInfoDTO_OrderInfoDTOBuilder_build_20657350014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2378;

    public OrderInfoDTO_OrderInfoDTOBuilder_build_20657350014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2378 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO$OrderInfoDTOBuilder"));
        setField(term2378, term2378.getClass(), "id", "AWRooQKkdW");
        setIntField(term2378, term2378.getClass(), "price", 1193880199);
        setIntField(term2378, term2378.getClass(), "quantity", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO$OrderInfoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2378, args);
    }

};


