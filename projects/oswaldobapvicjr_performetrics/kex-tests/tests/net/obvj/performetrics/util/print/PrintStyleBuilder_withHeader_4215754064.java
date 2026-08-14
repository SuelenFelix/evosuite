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

public class PrintStyleBuilder_withHeader_4215754064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53525;

    public PrintStyleBuilder_withHeader_4215754064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53525 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term53525, term53525.getClass(), "printFormat", null);
        setBooleanField(term53525, term53525.getClass(), "printHeader", false);
        setField(term53525, term53525.getClass(), "headerFormat", null);
        setBooleanField(term53525, term53525.getClass(), "printTrailer", false);
        setField(term53525, term53525.getClass(), "trailerFormat", null);
        setField(term53525, term53525.getClass(), "rowFormat", null);
        setField(term53525, term53525.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term53525, term53525.getClass(), "printSectionSummary", false);
        setField(term53525, term53525.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term53525, term53525.getClass(), "printSectionTrailer", false);
        setField(term53525, term53525.getClass(), "sectionTrailerFormat", null);
        setField(term53525, term53525.getClass(), "durationFormat", null);
        setBooleanField(term53525, term53525.getClass(), "printLegend", false);
        setField(term53525, term53525.getClass(), "simpleLine", null);
        setField(term53525, term53525.getClass(), "alternativeLine", null);
        setField(term53525, term53525.getClass(), "excludedTypes", null);
        setField(term53525, term53525.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withHeader", argTypes, term53525, args);
    }

};


