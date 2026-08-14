package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_hashCode_113534958112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4128;

    public Location_hashCode_113534958112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4128 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term4128, term4128.getClass(), "id", 463622836963501975L);
        setField(term4128, term4128.getClass(), "place", "zUlRdimJtU");
        setField(term4128, term4128.getClass(), "description", "vwbEQQNQrx");
        setDoubleField(term4128, term4128.getClass(), "longitude", 0.11577948268926874);
        setDoubleField(term4128, term4128.getClass(), "latitude", 0.5617009352394552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4128, args);
    }

};


