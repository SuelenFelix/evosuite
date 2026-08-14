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

public class PrintStyleBuilder_getSectionTrailerFormat_17163656781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105473;

    public PrintStyleBuilder_getSectionTrailerFormat_17163656781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105473 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105473, term105473.getClass(), "printFormat", null);
        setBooleanField(term105473, term105473.getClass(), "printHeader", false);
        setField(term105473, term105473.getClass(), "headerFormat", null);
        setBooleanField(term105473, term105473.getClass(), "printTrailer", false);
        setField(term105473, term105473.getClass(), "trailerFormat", null);
        setField(term105473, term105473.getClass(), "rowFormat", null);
        setField(term105473, term105473.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105473, term105473.getClass(), "printSectionSummary", false);
        setField(term105473, term105473.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105473, term105473.getClass(), "printSectionTrailer", false);
        setField(term105473, term105473.getClass(), "sectionTrailerFormat", null);
        setField(term105473, term105473.getClass(), "durationFormat", null);
        setBooleanField(term105473, term105473.getClass(), "printLegend", false);
        setField(term105473, term105473.getClass(), "simpleLine", null);
        setField(term105473, term105473.getClass(), "alternativeLine", null);
        setField(term105473, term105473.getClass(), "excludedTypes", null);
        setField(term105473, term105473.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionTrailerFormat", argTypes, term105473, args);
    }

};


