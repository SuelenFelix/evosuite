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

public class Logger_getLogMessages_19981740703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722;

    public Logger_getLogMessages_19981740703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722 = newInstance(Class.forName("org.openRealmOfStars.utilities.Logger"));
        Object[] term723 = (Object[]) newArray("java.lang.String", 11);
        setElement(term723, 0, "");
        setElement(term723, 1, "");
        setElement(term723, 2, "");
        setElement(term723, 3, "");
        setElement(term723, 4, "");
        setElement(term723, 5, "");
        setElement(term723, 6, "");
        setElement(term723, 7, "");
        setElement(term723, 8, "");
        setElement(term723, 9, "");
        setElement(term723, 10, "");
        setField(term722, term722.getClass(), "textLog", term723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.Logger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogMessages", argTypes, term722, args);
    }

};


