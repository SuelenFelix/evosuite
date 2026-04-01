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
import java.lang.Integer;

public class Logger_getMessage_20508818855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term794;

    public Logger_getMessage_20508818855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770 = newInstance(Class.forName("org.openRealmOfStars.utilities.Logger"));
        Object[] term771 = (Object[]) newArray("java.lang.String", 11);
        setElement(term771, 0, "");
        setElement(term771, 1, "");
        setElement(term771, 2, "");
        setElement(term771, 3, "");
        setElement(term771, 4, "");
        setElement(term771, 5, "");
        setElement(term771, 6, "");
        setElement(term771, 7, "");
        setElement(term771, 8, "");
        setElement(term771, 9, "");
        setElement(term771, 10, "");
        setField(term770, term770.getClass(), "textLog", term771);
        term794 = new Integer(-1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.Logger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term794;
        callMethod(klass, "getMessage", argTypes, term770, args);
    }

};


