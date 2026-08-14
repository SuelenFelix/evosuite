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

public class PrintStyle_getPrintFormat_54442914127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97750;

    public PrintStyle_getPrintFormat_54442914127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97750 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term97750, term97750.getClass(), "printFormat", null);
        setBooleanField(term97750, term97750.getClass(), "printHeader", false);
        setField(term97750, term97750.getClass(), "headerFormat", null);
        setBooleanField(term97750, term97750.getClass(), "printTrailer", false);
        setField(term97750, term97750.getClass(), "trailerFormat", null);
        setField(term97750, term97750.getClass(), "rowFormat", null);
        setField(term97750, term97750.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term97750, term97750.getClass(), "printSectionSummary", false);
        setField(term97750, term97750.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term97750, term97750.getClass(), "printSectionTrailer", false);
        setField(term97750, term97750.getClass(), "sectionTrailerFormat", null);
        setField(term97750, term97750.getClass(), "durationFormat", null);
        setBooleanField(term97750, term97750.getClass(), "printLegend", false);
        setField(term97750, term97750.getClass(), "simpleLine", null);
        setField(term97750, term97750.getClass(), "alternativeLine", null);
        setField(term97750, term97750.getClass(), "excludedTypes", null);
        setField(term97750, term97750.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintFormat", argTypes, term97750, args);
    }

};


