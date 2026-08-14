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

public class PrintStyle_getTrailerFormat_159677508535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50025;

    public PrintStyle_getTrailerFormat_159677508535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50025 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50025, term50025.getClass(), "printFormat", null);
        setBooleanField(term50025, term50025.getClass(), "printHeader", false);
        setField(term50025, term50025.getClass(), "headerFormat", null);
        setBooleanField(term50025, term50025.getClass(), "printTrailer", false);
        setField(term50025, term50025.getClass(), "trailerFormat", null);
        setField(term50025, term50025.getClass(), "rowFormat", null);
        setField(term50025, term50025.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term50025, term50025.getClass(), "printSectionSummary", false);
        setField(term50025, term50025.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term50025, term50025.getClass(), "printSectionTrailer", false);
        setField(term50025, term50025.getClass(), "sectionTrailerFormat", null);
        setField(term50025, term50025.getClass(), "durationFormat", null);
        setBooleanField(term50025, term50025.getClass(), "printLegend", false);
        setField(term50025, term50025.getClass(), "simpleLine", null);
        setField(term50025, term50025.getClass(), "alternativeLine", null);
        setField(term50025, term50025.getClass(), "excludedTypes", null);
        setField(term50025, term50025.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailerFormat", argTypes, term50025, args);
    }

};


