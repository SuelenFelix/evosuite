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
import java.lang.Integer;

public class OrderInfoDTO_OrderInfoDTOBuilder_quantity_9777346369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2436;
     Object term2439;

    public OrderInfoDTO_OrderInfoDTOBuilder_quantity_9777346369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2436 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO$OrderInfoDTOBuilder"));
        setField(term2436, term2436.getClass(), "id", null);
        setIntField(term2436, term2436.getClass(), "price", 0);
        setIntField(term2436, term2436.getClass(), "quantity", 0);
        term2439 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO$OrderInfoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2439;
        callMethod(klass, "quantity", argTypes, term2436, args);
    }

};


