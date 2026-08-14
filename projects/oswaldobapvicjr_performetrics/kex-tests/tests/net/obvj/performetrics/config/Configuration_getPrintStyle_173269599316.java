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

public class Configuration_getPrintStyle_173269599316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29577;

    public Configuration_getPrintStyle_173269599316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29577 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        setField(term29577, term29577.getClass(), "conversionMode", null);
        setIntField(term29577, term29577.getClass(), "scale", 0);
        setField(term29577, term29577.getClass(), "printStyle", null);
        setField(term29577, term29577.getClass(), "printStyleForSummary", null);
        setField(term29577, term29577.getClass(), "printStyleForDetails", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintStyle", argTypes, term29577, args);
    }

};


