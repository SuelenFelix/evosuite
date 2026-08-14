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

public class PrintStyle_getRowFormat_133967667836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50031;

    public PrintStyle_getRowFormat_133967667836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50031 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50031, term50031.getClass(), "printFormat", null);
        setBooleanField(term50031, term50031.getClass(), "printHeader", false);
        setField(term50031, term50031.getClass(), "headerFormat", null);
        setBooleanField(term50031, term50031.getClass(), "printTrailer", false);
        setField(term50031, term50031.getClass(), "trailerFormat", null);
        setField(term50031, term50031.getClass(), "rowFormat", null);
        setField(term50031, term50031.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term50031, term50031.getClass(), "printSectionSummary", false);
        setField(term50031, term50031.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term50031, term50031.getClass(), "printSectionTrailer", false);
        setField(term50031, term50031.getClass(), "sectionTrailerFormat", null);
        setField(term50031, term50031.getClass(), "durationFormat", null);
        setBooleanField(term50031, term50031.getClass(), "printLegend", false);
        setField(term50031, term50031.getClass(), "simpleLine", null);
        setField(term50031, term50031.getClass(), "alternativeLine", null);
        setField(term50031, term50031.getClass(), "excludedTypes", null);
        setField(term50031, term50031.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowFormat", argTypes, term50031, args);
    }

};


