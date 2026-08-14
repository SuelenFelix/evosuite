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

public class PrintStyle_getPrintableCounterName_178205181545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50085;

    public PrintStyle_getPrintableCounterName_178205181545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50085 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50085, term50085.getClass(), "printFormat", null);
        setBooleanField(term50085, term50085.getClass(), "printHeader", false);
        setField(term50085, term50085.getClass(), "headerFormat", null);
        setBooleanField(term50085, term50085.getClass(), "printTrailer", false);
        setField(term50085, term50085.getClass(), "trailerFormat", null);
        setField(term50085, term50085.getClass(), "rowFormat", null);
        setField(term50085, term50085.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term50085, term50085.getClass(), "printSectionSummary", false);
        setField(term50085, term50085.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term50085, term50085.getClass(), "printSectionTrailer", false);
        setField(term50085, term50085.getClass(), "sectionTrailerFormat", null);
        setField(term50085, term50085.getClass(), "durationFormat", null);
        setBooleanField(term50085, term50085.getClass(), "printLegend", false);
        setField(term50085, term50085.getClass(), "simpleLine", null);
        setField(term50085, term50085.getClass(), "alternativeLine", null);
        setField(term50085, term50085.getClass(), "excludedTypes", null);
        setField(term50085, term50085.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPrintableCounterName", argTypes, term50085, args);
    }

};


