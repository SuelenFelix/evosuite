package de.phip1611;

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
import static de.phip1611.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StringFindUtil_FoundResult_getStart_352654011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public StringFindUtil_FoundResult_getStart_352654011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("de.phip1611.StringFindUtil$FoundResult"));
        setIntField(term25, term25.getClass(), "start", 1162663216);
        setIntField(term25, term25.getClass(), "end", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.phip1611.StringFindUtil$FoundResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart", argTypes, term25, args);
    }

};


