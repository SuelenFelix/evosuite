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

public class PrintStyle_builder_113578482226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49977;

    public PrintStyle_builder_113578482226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49977 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term49977, term49977.getClass(), "printFormat", null);
        setBooleanField(term49977, term49977.getClass(), "printHeader", false);
        setField(term49977, term49977.getClass(), "headerFormat", null);
        setBooleanField(term49977, term49977.getClass(), "printTrailer", false);
        setField(term49977, term49977.getClass(), "trailerFormat", null);
        setField(term49977, term49977.getClass(), "rowFormat", null);
        setField(term49977, term49977.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term49977, term49977.getClass(), "printSectionSummary", false);
        setField(term49977, term49977.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term49977, term49977.getClass(), "printSectionTrailer", false);
        setField(term49977, term49977.getClass(), "sectionTrailerFormat", null);
        setField(term49977, term49977.getClass(), "durationFormat", null);
        setBooleanField(term49977, term49977.getClass(), "printLegend", false);
        setField(term49977, term49977.getClass(), "simpleLine", null);
        setField(term49977, term49977.getClass(), "alternativeLine", null);
        setField(term49977, term49977.getClass(), "excludedTypes", null);
        setField(term49977, term49977.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintFormat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "builder", argTypes, term49977, args);
    }

};


