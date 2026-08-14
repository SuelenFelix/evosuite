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

public class PrintStyleBuilder_withoutTypes_59533452664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105371;

    public PrintStyleBuilder_withoutTypes_59533452664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105371 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105371, term105371.getClass(), "printFormat", null);
        setBooleanField(term105371, term105371.getClass(), "printHeader", false);
        setField(term105371, term105371.getClass(), "headerFormat", null);
        setBooleanField(term105371, term105371.getClass(), "printTrailer", false);
        setField(term105371, term105371.getClass(), "trailerFormat", null);
        setField(term105371, term105371.getClass(), "rowFormat", null);
        setField(term105371, term105371.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105371, term105371.getClass(), "printSectionSummary", false);
        setField(term105371, term105371.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105371, term105371.getClass(), "printSectionTrailer", false);
        setField(term105371, term105371.getClass(), "sectionTrailerFormat", null);
        setField(term105371, term105371.getClass(), "durationFormat", null);
        setBooleanField(term105371, term105371.getClass(), "printLegend", false);
        setField(term105371, term105371.getClass(), "simpleLine", null);
        setField(term105371, term105371.getClass(), "alternativeLine", null);
        setField(term105371, term105371.getClass(), "excludedTypes", null);
        setField(term105371, term105371.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withoutTypes", argTypes, term105371, args);
    }

};


