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

public class PrintStyle_toString_74215825029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60400;

    public PrintStyle_toString_74215825029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60400 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term60400, term60400.getClass(), "printFormat", null);
        setBooleanField(term60400, term60400.getClass(), "printHeader", false);
        setField(term60400, term60400.getClass(), "headerFormat", null);
        setBooleanField(term60400, term60400.getClass(), "printTrailer", false);
        setField(term60400, term60400.getClass(), "trailerFormat", null);
        setField(term60400, term60400.getClass(), "rowFormat", null);
        setField(term60400, term60400.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term60400, term60400.getClass(), "printSectionSummary", false);
        setField(term60400, term60400.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term60400, term60400.getClass(), "printSectionTrailer", false);
        setField(term60400, term60400.getClass(), "sectionTrailerFormat", null);
        setField(term60400, term60400.getClass(), "durationFormat", null);
        setBooleanField(term60400, term60400.getClass(), "printLegend", false);
        setField(term60400, term60400.getClass(), "simpleLine", null);
        setField(term60400, term60400.getClass(), "alternativeLine", null);
        setField(term60400, term60400.getClass(), "excludedTypes", null);
        setField(term60400, term60400.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toString", argTypes, term60400, args);
    }

};


