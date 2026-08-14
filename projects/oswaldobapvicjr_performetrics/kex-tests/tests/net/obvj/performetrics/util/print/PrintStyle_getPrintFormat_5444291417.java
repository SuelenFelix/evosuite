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

public class PrintStyle_getPrintFormat_5444291417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24888;

    public PrintStyle_getPrintFormat_5444291417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24888 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term24888, term24888.getClass(), "printFormat", null);
        setBooleanField(term24888, term24888.getClass(), "printHeader", false);
        setField(term24888, term24888.getClass(), "headerFormat", null);
        setBooleanField(term24888, term24888.getClass(), "printTrailer", false);
        setField(term24888, term24888.getClass(), "trailerFormat", null);
        setField(term24888, term24888.getClass(), "rowFormat", null);
        setField(term24888, term24888.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term24888, term24888.getClass(), "printSectionSummary", false);
        setField(term24888, term24888.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term24888, term24888.getClass(), "printSectionTrailer", false);
        setField(term24888, term24888.getClass(), "sectionTrailerFormat", null);
        setField(term24888, term24888.getClass(), "durationFormat", null);
        setBooleanField(term24888, term24888.getClass(), "printLegend", false);
        setField(term24888, term24888.getClass(), "simpleLine", null);
        setField(term24888, term24888.getClass(), "alternativeLine", null);
        setField(term24888, term24888.getClass(), "excludedTypes", null);
        setField(term24888, term24888.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintFormat", argTypes, term24888, args);
    }

};


