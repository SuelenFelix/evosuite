package org.openRealmOfStars.utilities;

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
import static org.openRealmOfStars.utilities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Logger_toString_11736747486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796;

    public Logger_toString_11736747486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term796 = newInstance(Class.forName("org.openRealmOfStars.utilities.Logger"));
        Object[] term797 = (Object[]) newArray("java.lang.String", 11);
        setElement(term797, 0, "");
        setElement(term797, 1, "");
        setElement(term797, 2, "");
        setElement(term797, 3, "");
        setElement(term797, 4, "");
        setElement(term797, 5, "");
        setElement(term797, 6, "");
        setElement(term797, 7, "");
        setElement(term797, 8, "");
        setElement(term797, 9, "");
        setElement(term797, 10, "");
        setField(term796, term796.getClass(), "textLog", term797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.Logger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term796, args);
    }

};


