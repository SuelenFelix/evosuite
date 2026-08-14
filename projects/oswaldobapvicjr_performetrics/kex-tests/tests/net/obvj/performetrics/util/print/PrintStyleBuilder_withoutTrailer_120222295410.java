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

public class PrintStyleBuilder_withoutTrailer_120222295410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59215;

    public PrintStyleBuilder_withoutTrailer_120222295410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59215 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term59215, term59215.getClass(), "printFormat", null);
        setBooleanField(term59215, term59215.getClass(), "printHeader", false);
        setField(term59215, term59215.getClass(), "headerFormat", null);
        setBooleanField(term59215, term59215.getClass(), "printTrailer", false);
        setField(term59215, term59215.getClass(), "trailerFormat", null);
        setField(term59215, term59215.getClass(), "rowFormat", null);
        setField(term59215, term59215.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term59215, term59215.getClass(), "printSectionSummary", false);
        setField(term59215, term59215.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term59215, term59215.getClass(), "printSectionTrailer", false);
        setField(term59215, term59215.getClass(), "sectionTrailerFormat", null);
        setField(term59215, term59215.getClass(), "durationFormat", null);
        setBooleanField(term59215, term59215.getClass(), "printLegend", false);
        setField(term59215, term59215.getClass(), "simpleLine", null);
        setField(term59215, term59215.getClass(), "alternativeLine", null);
        setField(term59215, term59215.getClass(), "excludedTypes", null);
        setField(term59215, term59215.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutTrailer", argTypes, term59215, args);
    }

};


