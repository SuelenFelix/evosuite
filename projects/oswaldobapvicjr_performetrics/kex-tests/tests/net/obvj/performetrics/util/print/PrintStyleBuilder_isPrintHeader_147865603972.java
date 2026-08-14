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

public class PrintStyleBuilder_isPrintHeader_147865603972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105419;

    public PrintStyleBuilder_isPrintHeader_147865603972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105419 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105419, term105419.getClass(), "printFormat", null);
        setBooleanField(term105419, term105419.getClass(), "printHeader", false);
        setField(term105419, term105419.getClass(), "headerFormat", null);
        setBooleanField(term105419, term105419.getClass(), "printTrailer", false);
        setField(term105419, term105419.getClass(), "trailerFormat", null);
        setField(term105419, term105419.getClass(), "rowFormat", null);
        setField(term105419, term105419.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105419, term105419.getClass(), "printSectionSummary", false);
        setField(term105419, term105419.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105419, term105419.getClass(), "printSectionTrailer", false);
        setField(term105419, term105419.getClass(), "sectionTrailerFormat", null);
        setField(term105419, term105419.getClass(), "durationFormat", null);
        setBooleanField(term105419, term105419.getClass(), "printLegend", false);
        setField(term105419, term105419.getClass(), "simpleLine", null);
        setField(term105419, term105419.getClass(), "alternativeLine", null);
        setField(term105419, term105419.getClass(), "excludedTypes", null);
        setField(term105419, term105419.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintHeader", argTypes, term105419, args);
    }

};


