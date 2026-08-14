package com.victorlevin.TinkoffStockService.dto;

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
import static com.victorlevin.TinkoffStockService.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class FigiesDto_getFigies_2381298891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public FigiesDto_getFigies_2381298891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add("PAEBtnZtTD");
        ((ArrayList) term2).add("sjlJAEtRrb");
        ((ArrayList) term2).add("MuLcgQHgqz");
        ((ArrayList) term2).add("xxtlPwDYFs");
        ((ArrayList) term2).add("jJCZpVmanW");
        term1 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.FigiesDto"));
        setField(term1, term1.getClass(), "figies", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.FigiesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFigies", argTypes, term1, args);
    }

};


