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

public class OrderInfoDTO_setPrice_19960860207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2077;
     Object term2092;

    public OrderInfoDTO_setPrice_19960860207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2077 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO"));
        setField(term2077, term2077.getClass(), "id", "GVizqqzXpy");
        setIntField(term2077, term2077.getClass(), "price", 1134449235);
        setIntField(term2077, term2077.getClass(), "quantity", -883034806);
        term2092 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2092;
        callMethod(klass, "setPrice", argTypes, term2077, args);
    }

};


