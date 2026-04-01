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

public class Logger_addLog_797044472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public Logger_addLog_797044472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676 = newInstance(Class.forName("org.openRealmOfStars.utilities.Logger"));
        Object[] term677 = (Object[]) newArray("java.lang.String", 11);
        setElement(term677, 0, "");
        setElement(term677, 1, "");
        setElement(term677, 2, "");
        setElement(term677, 3, "");
        setElement(term677, 4, "");
        setElement(term677, 5, "");
        setElement(term677, 6, "");
        setElement(term677, 7, "");
        setElement(term677, 8, "");
        setElement(term677, 9, "");
        setElement(term677, 10, "");
        setField(term676, term676.getClass(), "textLog", term677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.Logger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "addLog", argTypes, term676, args);
    }

};


