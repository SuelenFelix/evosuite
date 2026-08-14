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

public class PrintStyleBuilder_withLegends_125232057562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105359;

    public PrintStyleBuilder_withLegends_125232057562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105359 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105359, term105359.getClass(), "printFormat", null);
        setBooleanField(term105359, term105359.getClass(), "printHeader", false);
        setField(term105359, term105359.getClass(), "headerFormat", null);
        setBooleanField(term105359, term105359.getClass(), "printTrailer", false);
        setField(term105359, term105359.getClass(), "trailerFormat", null);
        setField(term105359, term105359.getClass(), "rowFormat", null);
        setField(term105359, term105359.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105359, term105359.getClass(), "printSectionSummary", false);
        setField(term105359, term105359.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105359, term105359.getClass(), "printSectionTrailer", false);
        setField(term105359, term105359.getClass(), "sectionTrailerFormat", null);
        setField(term105359, term105359.getClass(), "durationFormat", null);
        setBooleanField(term105359, term105359.getClass(), "printLegend", false);
        setField(term105359, term105359.getClass(), "simpleLine", null);
        setField(term105359, term105359.getClass(), "alternativeLine", null);
        setField(term105359, term105359.getClass(), "excludedTypes", null);
        setField(term105359, term105359.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withLegends", argTypes, term105359, args);
    }

};


