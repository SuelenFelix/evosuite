package icu.samnyan.aqua.sega.diva.util;

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
import static icu.samnyan.aqua.sega.diva.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DivaStringUtils_arrToCsv_13350341661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2717;

    public DivaStringUtils_arrToCsv_13350341661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2717 = (int[]) newIntArray(5);
        setIntElement(term2717, 0, 1484323161);
        setIntElement(term2717, 1, 391863371);
        setIntElement(term2717, 2, -1922583790);
        setIntElement(term2717, 3, -616727354);
        setIntElement(term2717, 4, -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.util.DivaStringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2717;
        callMethod(klass, "arrToCsv", argTypes, null, args);
    }

};


