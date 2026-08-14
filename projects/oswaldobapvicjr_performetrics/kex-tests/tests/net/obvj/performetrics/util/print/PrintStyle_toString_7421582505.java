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

public class PrintStyle_toString_7421582505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23751;

    public PrintStyle_toString_7421582505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23751 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term23751, term23751.getClass(), "printFormat", null);
        setBooleanField(term23751, term23751.getClass(), "printHeader", false);
        setField(term23751, term23751.getClass(), "headerFormat", null);
        setBooleanField(term23751, term23751.getClass(), "printTrailer", false);
        setField(term23751, term23751.getClass(), "trailerFormat", null);
        setField(term23751, term23751.getClass(), "rowFormat", null);
        setField(term23751, term23751.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term23751, term23751.getClass(), "printSectionSummary", false);
        setField(term23751, term23751.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term23751, term23751.getClass(), "printSectionTrailer", false);
        setField(term23751, term23751.getClass(), "sectionTrailerFormat", null);
        setField(term23751, term23751.getClass(), "durationFormat", null);
        setBooleanField(term23751, term23751.getClass(), "printLegend", false);
        setField(term23751, term23751.getClass(), "simpleLine", null);
        setField(term23751, term23751.getClass(), "alternativeLine", null);
        setField(term23751, term23751.getClass(), "excludedTypes", null);
        setField(term23751, term23751.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toString", argTypes, term23751, args);
    }

};


