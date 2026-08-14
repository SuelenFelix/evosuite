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

public class PrintStyle_getDurationFormat_58512458131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60412;

    public PrintStyle_getDurationFormat_58512458131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60412 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term60412, term60412.getClass(), "printFormat", null);
        setBooleanField(term60412, term60412.getClass(), "printHeader", false);
        setField(term60412, term60412.getClass(), "headerFormat", null);
        setBooleanField(term60412, term60412.getClass(), "printTrailer", false);
        setField(term60412, term60412.getClass(), "trailerFormat", null);
        setField(term60412, term60412.getClass(), "rowFormat", null);
        setField(term60412, term60412.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term60412, term60412.getClass(), "printSectionSummary", false);
        setField(term60412, term60412.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term60412, term60412.getClass(), "printSectionTrailer", false);
        setField(term60412, term60412.getClass(), "sectionTrailerFormat", null);
        setField(term60412, term60412.getClass(), "durationFormat", null);
        setBooleanField(term60412, term60412.getClass(), "printLegend", false);
        setField(term60412, term60412.getClass(), "simpleLine", null);
        setField(term60412, term60412.getClass(), "alternativeLine", null);
        setField(term60412, term60412.getClass(), "excludedTypes", null);
        setField(term60412, term60412.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDurationFormat", argTypes, term60412, args);
    }

};


