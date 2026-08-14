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

public class PrintStyleBuilder_getExcludedTypes_60303964884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105491;

    public PrintStyleBuilder_getExcludedTypes_60303964884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105491 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105491, term105491.getClass(), "printFormat", null);
        setBooleanField(term105491, term105491.getClass(), "printHeader", false);
        setField(term105491, term105491.getClass(), "headerFormat", null);
        setBooleanField(term105491, term105491.getClass(), "printTrailer", false);
        setField(term105491, term105491.getClass(), "trailerFormat", null);
        setField(term105491, term105491.getClass(), "rowFormat", null);
        setField(term105491, term105491.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105491, term105491.getClass(), "printSectionSummary", false);
        setField(term105491, term105491.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105491, term105491.getClass(), "printSectionTrailer", false);
        setField(term105491, term105491.getClass(), "sectionTrailerFormat", null);
        setField(term105491, term105491.getClass(), "durationFormat", null);
        setBooleanField(term105491, term105491.getClass(), "printLegend", false);
        setField(term105491, term105491.getClass(), "simpleLine", null);
        setField(term105491, term105491.getClass(), "alternativeLine", null);
        setField(term105491, term105491.getClass(), "excludedTypes", null);
        setField(term105491, term105491.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludedTypes", argTypes, term105491, args);
    }

};


