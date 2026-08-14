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

public class PrintStyleBuilder_withoutLegends_178235200363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105365;

    public PrintStyleBuilder_withoutLegends_178235200363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105365 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105365, term105365.getClass(), "printFormat", null);
        setBooleanField(term105365, term105365.getClass(), "printHeader", false);
        setField(term105365, term105365.getClass(), "headerFormat", null);
        setBooleanField(term105365, term105365.getClass(), "printTrailer", false);
        setField(term105365, term105365.getClass(), "trailerFormat", null);
        setField(term105365, term105365.getClass(), "rowFormat", null);
        setField(term105365, term105365.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105365, term105365.getClass(), "printSectionSummary", false);
        setField(term105365, term105365.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105365, term105365.getClass(), "printSectionTrailer", false);
        setField(term105365, term105365.getClass(), "sectionTrailerFormat", null);
        setField(term105365, term105365.getClass(), "durationFormat", null);
        setBooleanField(term105365, term105365.getClass(), "printLegend", false);
        setField(term105365, term105365.getClass(), "simpleLine", null);
        setField(term105365, term105365.getClass(), "alternativeLine", null);
        setField(term105365, term105365.getClass(), "excludedTypes", null);
        setField(term105365, term105365.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutLegends", argTypes, term105365, args);
    }

};


