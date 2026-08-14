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

public class PrintStyleBuilder_withCustomCounterName_143681775466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105383;

    public PrintStyleBuilder_withCustomCounterName_143681775466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105383 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105383, term105383.getClass(), "printFormat", null);
        setBooleanField(term105383, term105383.getClass(), "printHeader", false);
        setField(term105383, term105383.getClass(), "headerFormat", null);
        setBooleanField(term105383, term105383.getClass(), "printTrailer", false);
        setField(term105383, term105383.getClass(), "trailerFormat", null);
        setField(term105383, term105383.getClass(), "rowFormat", null);
        setField(term105383, term105383.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105383, term105383.getClass(), "printSectionSummary", false);
        setField(term105383, term105383.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105383, term105383.getClass(), "printSectionTrailer", false);
        setField(term105383, term105383.getClass(), "sectionTrailerFormat", null);
        setField(term105383, term105383.getClass(), "durationFormat", null);
        setBooleanField(term105383, term105383.getClass(), "printLegend", false);
        setField(term105383, term105383.getClass(), "simpleLine", null);
        setField(term105383, term105383.getClass(), "alternativeLine", null);
        setField(term105383, term105383.getClass(), "excludedTypes", null);
        setField(term105383, term105383.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "withCustomCounterName", argTypes, term105383, args);
    }

};


