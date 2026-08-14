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

public class PrintStyle_getSectionHeaderFormat_2671835037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50037;

    public PrintStyle_getSectionHeaderFormat_2671835037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50037 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50037, term50037.getClass(), "printFormat", null);
        setBooleanField(term50037, term50037.getClass(), "printHeader", false);
        setField(term50037, term50037.getClass(), "headerFormat", null);
        setBooleanField(term50037, term50037.getClass(), "printTrailer", false);
        setField(term50037, term50037.getClass(), "trailerFormat", null);
        setField(term50037, term50037.getClass(), "rowFormat", null);
        setField(term50037, term50037.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term50037, term50037.getClass(), "printSectionSummary", false);
        setField(term50037, term50037.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term50037, term50037.getClass(), "printSectionTrailer", false);
        setField(term50037, term50037.getClass(), "sectionTrailerFormat", null);
        setField(term50037, term50037.getClass(), "durationFormat", null);
        setBooleanField(term50037, term50037.getClass(), "printLegend", false);
        setField(term50037, term50037.getClass(), "simpleLine", null);
        setField(term50037, term50037.getClass(), "alternativeLine", null);
        setField(term50037, term50037.getClass(), "excludedTypes", null);
        setField(term50037, term50037.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionHeaderFormat", argTypes, term50037, args);
    }

};


