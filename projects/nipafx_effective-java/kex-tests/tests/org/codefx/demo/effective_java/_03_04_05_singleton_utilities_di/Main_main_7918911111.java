package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Main_main_7918911111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15847;

    public Main_main_7918911111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15847 = (Object[]) newArray("java.lang.String", 9);
        setElement(term15847, 0, "TEParAifyi");
        setElement(term15847, 1, "OWDIEULEFu");
        setElement(term15847, 2, "dWRymuLBtr");
        setElement(term15847, 3, "AijpHYOFuy");
        setElement(term15847, 4, "SbAoxhfrkn");
        setElement(term15847, 5, "kuTXqwMtDB");
        setElement(term15847, 6, "Ghbwtircqb");
        setElement(term15847, 7, "xrwlQZdwCp");
        setElement(term15847, 8, "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Main");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15847;
        callMethod(klass, "main", argTypes, null, args);
    }

};


