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

public class PrintStyle_isPrintLegend_13218879032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60418;

    public PrintStyle_isPrintLegend_13218879032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60418 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term60418, term60418.getClass(), "printFormat", null);
        setBooleanField(term60418, term60418.getClass(), "printHeader", false);
        setField(term60418, term60418.getClass(), "headerFormat", null);
        setBooleanField(term60418, term60418.getClass(), "printTrailer", false);
        setField(term60418, term60418.getClass(), "trailerFormat", null);
        setField(term60418, term60418.getClass(), "rowFormat", null);
        setField(term60418, term60418.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term60418, term60418.getClass(), "printSectionSummary", false);
        setField(term60418, term60418.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term60418, term60418.getClass(), "printSectionTrailer", false);
        setField(term60418, term60418.getClass(), "sectionTrailerFormat", null);
        setField(term60418, term60418.getClass(), "durationFormat", null);
        setBooleanField(term60418, term60418.getClass(), "printLegend", false);
        setField(term60418, term60418.getClass(), "simpleLine", null);
        setField(term60418, term60418.getClass(), "alternativeLine", null);
        setField(term60418, term60418.getClass(), "excludedTypes", null);
        setField(term60418, term60418.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintLegend", argTypes, term60418, args);
    }

};


