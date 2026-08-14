package com.pfa.app;

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
import static com.pfa.app.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProjectTrackingSystemApplication_main_15023814481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70578;

    public ProjectTrackingSystemApplication_main_15023814481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70578 = (Object[]) newArray("java.lang.String", 7);
        setElement(term70578, 0, "xPudQMxgBM");
        setElement(term70578, 1, "dZjsEGIcWz");
        setElement(term70578, 2, "svjpGAjnRN");
        setElement(term70578, 3, "pttzoCMsTO");
        setElement(term70578, 4, "UZDKpgGSjX");
        setElement(term70578, 5, "foaQZmXMHo");
        setElement(term70578, 6, "BTiRFFuMmf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.ProjectTrackingSystemApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70578;
        callMethod(klass, "main", argTypes, null, args);
    }

};


