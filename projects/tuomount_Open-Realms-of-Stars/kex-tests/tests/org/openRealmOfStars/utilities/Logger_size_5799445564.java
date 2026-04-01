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

public class Logger_size_5799445564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;

    public Logger_size_5799445564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746 = newInstance(Class.forName("org.openRealmOfStars.utilities.Logger"));
        Object[] term747 = (Object[]) newArray("java.lang.String", 11);
        setElement(term747, 0, "");
        setElement(term747, 1, "");
        setElement(term747, 2, "");
        setElement(term747, 3, "");
        setElement(term747, 4, "");
        setElement(term747, 5, "");
        setElement(term747, 6, "");
        setElement(term747, 7, "");
        setElement(term747, 8, "");
        setElement(term747, 9, "");
        setElement(term747, 10, "");
        setField(term746, term746.getClass(), "textLog", term747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.Logger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term746, args);
    }

};


