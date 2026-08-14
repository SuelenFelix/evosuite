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

public class PrintStyle_getExcludedTypes_89972023942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50067;

    public PrintStyle_getExcludedTypes_89972023942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50067 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50067, term50067.getClass(), "printFormat", null);
        setBooleanField(term50067, term50067.getClass(), "printHeader", false);
        setField(term50067, term50067.getClass(), "headerFormat", null);
        setBooleanField(term50067, term50067.getClass(), "printTrailer", false);
        setField(term50067, term50067.getClass(), "trailerFormat", null);
        setField(term50067, term50067.getClass(), "rowFormat", null);
        setField(term50067, term50067.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term50067, term50067.getClass(), "printSectionSummary", false);
        setField(term50067, term50067.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term50067, term50067.getClass(), "printSectionTrailer", false);
        setField(term50067, term50067.getClass(), "sectionTrailerFormat", null);
        setField(term50067, term50067.getClass(), "durationFormat", null);
        setBooleanField(term50067, term50067.getClass(), "printLegend", false);
        setField(term50067, term50067.getClass(), "simpleLine", null);
        setField(term50067, term50067.getClass(), "alternativeLine", null);
        setField(term50067, term50067.getClass(), "excludedTypes", null);
        setField(term50067, term50067.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludedTypes", argTypes, term50067, args);
    }

};


