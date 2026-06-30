package com.zxl.dailypractice.card.two.august.august16;

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
import static com.zxl.dailypractice.card.two.august.august16.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Solution_insert_2605947891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term66;

    public Solution_insert_2605947891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august16.Solution"));
        Object[] term4 = (Object[]) newArray("java.lang.String", 5);
        setElement(term4, 0, "PAEBtnZtTD");
        setElement(term4, 1, "sjlJAEtRrb");
        setElement(term4, 2, "MuLcgQHgqz");
        setElement(term4, 3, "xxtlPwDYFs");
        setElement(term4, 4, "jJCZpVmanW");
        setField(term3, term3.getClass(), "stream", term4);
        setIntField(term3, term3.getClass(), "ptr", 1162663216);
        term66 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august16.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term66;
        args[1] = "EGtDIRbSSb";
        callMethod(klass, "insert", argTypes, term3, args);
    }

};


