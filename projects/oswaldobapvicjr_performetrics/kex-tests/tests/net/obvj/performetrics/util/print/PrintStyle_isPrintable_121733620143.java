package net.obvj.performetrics.util.print;

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
import static net.obvj.performetrics.util.print.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PrintStyle_isPrintable_121733620143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50073;

    public PrintStyle_isPrintable_121733620143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50073 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50073, term50073.getClass(), "printFormat", null);
        setBooleanField(term50073, term50073.getClass(), "printHeader", false);
        setField(term50073, term50073.getClass(), "headerFormat", null);
        setBooleanField(term50073, term50073.getClass(), "printTrailer", false);
        setField(term50073, term50073.getClass(), "trailerFormat", null);
        setField(term50073, term50073.getClass(), "rowFormat", null);
        setField(term50073, term50073.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term50073, term50073.getClass(), "printSectionSummary", false);
        setField(term50073, term50073.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term50073, term50073.getClass(), "printSectionTrailer", false);
        setField(term50073, term50073.getClass(), "sectionTrailerFormat", null);
        setField(term50073, term50073.getClass(), "durationFormat", null);
        setBooleanField(term50073, term50073.getClass(), "printLegend", false);
        setField(term50073, term50073.getClass(), "simpleLine", null);
        setField(term50073, term50073.getClass(), "alternativeLine", null);
        setField(term50073, term50073.getClass(), "excludedTypes", null);
        setField(term50073, term50073.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isPrintable", argTypes, term50073, args);
    }

};


