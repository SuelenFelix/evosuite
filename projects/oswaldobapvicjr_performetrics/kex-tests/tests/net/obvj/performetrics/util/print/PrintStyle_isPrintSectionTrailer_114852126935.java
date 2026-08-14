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

public class PrintStyle_isPrintSectionTrailer_114852126935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60436;

    public PrintStyle_isPrintSectionTrailer_114852126935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60436 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term60436, term60436.getClass(), "printFormat", null);
        setBooleanField(term60436, term60436.getClass(), "printHeader", false);
        setField(term60436, term60436.getClass(), "headerFormat", null);
        setBooleanField(term60436, term60436.getClass(), "printTrailer", false);
        setField(term60436, term60436.getClass(), "trailerFormat", null);
        setField(term60436, term60436.getClass(), "rowFormat", null);
        setField(term60436, term60436.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term60436, term60436.getClass(), "printSectionSummary", false);
        setField(term60436, term60436.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term60436, term60436.getClass(), "printSectionTrailer", false);
        setField(term60436, term60436.getClass(), "sectionTrailerFormat", null);
        setField(term60436, term60436.getClass(), "durationFormat", null);
        setBooleanField(term60436, term60436.getClass(), "printLegend", false);
        setField(term60436, term60436.getClass(), "simpleLine", null);
        setField(term60436, term60436.getClass(), "alternativeLine", null);
        setField(term60436, term60436.getClass(), "excludedTypes", null);
        setField(term60436, term60436.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term60436, args);
    }

};


