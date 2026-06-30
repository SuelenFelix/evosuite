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

public class OrderInfoDTO_setId_14726759176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2030;

    public OrderInfoDTO_setId_14726759176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2030 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO"));
        setField(term2030, term2030.getClass(), "id", "swZVeJAxjt");
        setIntField(term2030, term2030.getClass(), "price", 1725571209);
        setIntField(term2030, term2030.getClass(), "quantity", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.OrderInfoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "setId", argTypes, term2030, args);
    }

};


