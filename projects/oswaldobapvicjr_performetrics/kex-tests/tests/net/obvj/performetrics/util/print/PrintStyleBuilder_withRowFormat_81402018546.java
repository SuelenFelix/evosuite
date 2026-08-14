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

public class PrintStyleBuilder_withRowFormat_81402018546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112324;

    public PrintStyleBuilder_withRowFormat_81402018546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112324 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term112324, term112324.getClass(), "printFormat", null);
        setBooleanField(term112324, term112324.getClass(), "printHeader", false);
        setField(term112324, term112324.getClass(), "headerFormat", null);
        setBooleanField(term112324, term112324.getClass(), "printTrailer", false);
        setField(term112324, term112324.getClass(), "trailerFormat", null);
        setField(term112324, term112324.getClass(), "rowFormat", null);
        setField(term112324, term112324.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term112324, term112324.getClass(), "printSectionSummary", false);
        setField(term112324, term112324.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term112324, term112324.getClass(), "printSectionTrailer", false);
        setField(term112324, term112324.getClass(), "sectionTrailerFormat", null);
        setField(term112324, term112324.getClass(), "durationFormat", null);
        setBooleanField(term112324, term112324.getClass(), "printLegend", false);
        setField(term112324, term112324.getClass(), "simpleLine", null);
        setField(term112324, term112324.getClass(), "alternativeLine", null);
        setField(term112324, term112324.getClass(), "excludedTypes", null);
        setField(term112324, term112324.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withRowFormat", argTypes, term112324, args);
    }

};


