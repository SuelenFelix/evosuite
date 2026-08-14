package net.obvj.performetrics.config;

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
import static net.obvj.performetrics.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Configuration_setScale_214609916215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29573;
     Object term29575;

    public Configuration_setScale_214609916215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29573 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        setField(term29573, term29573.getClass(), "conversionMode", null);
        setIntField(term29573, term29573.getClass(), "scale", 0);
        setField(term29573, term29573.getClass(), "printStyle", null);
        setField(term29573, term29573.getClass(), "printStyleForSummary", null);
        setField(term29573, term29573.getClass(), "printStyleForDetails", null);
        term29575 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29575;
        callMethod(klass, "setScale", argTypes, term29573, args);
    }

};


