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

public class StringFindUtil_FoundResult_getEnd_15174304645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;

    public StringFindUtil_FoundResult_getEnd_15174304645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36 = newInstance(Class.forName("de.phip1611.StringFindUtil$FoundResult"));
        setIntField(term36, term36.getClass(), "start", 0);
        setIntField(term36, term36.getClass(), "end", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.phip1611.StringFindUtil$FoundResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnd", argTypes, term36, args);
    }

};


