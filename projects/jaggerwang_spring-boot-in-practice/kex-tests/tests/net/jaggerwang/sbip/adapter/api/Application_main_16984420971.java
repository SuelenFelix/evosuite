package net.jaggerwang.sbip.adapter.api;

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
import static net.jaggerwang.sbip.adapter.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Application_main_16984420971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30606;

    public Application_main_16984420971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30606 = (Object[]) newArray("java.lang.String", 6);
        setElement(term30606, 0, "goAoCMhKBu");
        setElement(term30606, 1, "BWxJSgKHRT");
        setElement(term30606, 2, "AGXoIndFnm");
        setElement(term30606, 3, "mwmFMNEzkK");
        setElement(term30606, 4, "kVAmKknVln");
        setElement(term30606, 5, "MRFLbEGYKG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.Application");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term30606;
        callMethod(klass, "main", argTypes, null, args);
    }

};


