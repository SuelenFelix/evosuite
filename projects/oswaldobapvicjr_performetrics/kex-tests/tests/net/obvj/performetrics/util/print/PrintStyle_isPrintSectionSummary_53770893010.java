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

public class PrintStyle_isPrintSectionSummary_53770893010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43007;

    public PrintStyle_isPrintSectionSummary_53770893010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43007 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term43007, term43007.getClass(), "printFormat", null);
        setBooleanField(term43007, term43007.getClass(), "printHeader", false);
        setField(term43007, term43007.getClass(), "headerFormat", null);
        setBooleanField(term43007, term43007.getClass(), "printTrailer", false);
        setField(term43007, term43007.getClass(), "trailerFormat", null);
        setField(term43007, term43007.getClass(), "rowFormat", null);
        setField(term43007, term43007.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term43007, term43007.getClass(), "printSectionSummary", false);
        setField(term43007, term43007.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term43007, term43007.getClass(), "printSectionTrailer", false);
        setField(term43007, term43007.getClass(), "sectionTrailerFormat", null);
        setField(term43007, term43007.getClass(), "durationFormat", null);
        setBooleanField(term43007, term43007.getClass(), "printLegend", false);
        setField(term43007, term43007.getClass(), "simpleLine", null);
        setField(term43007, term43007.getClass(), "alternativeLine", null);
        setField(term43007, term43007.getClass(), "excludedTypes", null);
        setField(term43007, term43007.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionSummary", argTypes, term43007, args);
    }

};


