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

public class PrintStyleBuilder_isPrintSectionTrailer_35423861875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105437;

    public PrintStyleBuilder_isPrintSectionTrailer_35423861875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105437 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105437, term105437.getClass(), "printFormat", null);
        setBooleanField(term105437, term105437.getClass(), "printHeader", false);
        setField(term105437, term105437.getClass(), "headerFormat", null);
        setBooleanField(term105437, term105437.getClass(), "printTrailer", false);
        setField(term105437, term105437.getClass(), "trailerFormat", null);
        setField(term105437, term105437.getClass(), "rowFormat", null);
        setField(term105437, term105437.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105437, term105437.getClass(), "printSectionSummary", false);
        setField(term105437, term105437.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105437, term105437.getClass(), "printSectionTrailer", false);
        setField(term105437, term105437.getClass(), "sectionTrailerFormat", null);
        setField(term105437, term105437.getClass(), "durationFormat", null);
        setBooleanField(term105437, term105437.getClass(), "printLegend", false);
        setField(term105437, term105437.getClass(), "simpleLine", null);
        setField(term105437, term105437.getClass(), "alternativeLine", null);
        setField(term105437, term105437.getClass(), "excludedTypes", null);
        setField(term105437, term105437.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term105437, args);
    }

};


