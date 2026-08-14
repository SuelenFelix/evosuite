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

public class PrintStyle_builder_2205042162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21082;

    public PrintStyle_builder_2205042162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21082 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term21082, term21082.getClass(), "printFormat", null);
        setBooleanField(term21082, term21082.getClass(), "printHeader", false);
        setField(term21082, term21082.getClass(), "headerFormat", null);
        setBooleanField(term21082, term21082.getClass(), "printTrailer", false);
        setField(term21082, term21082.getClass(), "trailerFormat", null);
        setField(term21082, term21082.getClass(), "rowFormat", null);
        setField(term21082, term21082.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term21082, term21082.getClass(), "printSectionSummary", false);
        setField(term21082, term21082.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term21082, term21082.getClass(), "printSectionTrailer", false);
        setField(term21082, term21082.getClass(), "sectionTrailerFormat", null);
        setField(term21082, term21082.getClass(), "durationFormat", null);
        setBooleanField(term21082, term21082.getClass(), "printLegend", false);
        setField(term21082, term21082.getClass(), "simpleLine", null);
        setField(term21082, term21082.getClass(), "alternativeLine", null);
        setField(term21082, term21082.getClass(), "excludedTypes", null);
        setField(term21082, term21082.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "builder", argTypes, term21082, args);
    }

};


