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

public class PrintStyleBuilder_withDurationFormat_80952244061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105353;

    public PrintStyleBuilder_withDurationFormat_80952244061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105353 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105353, term105353.getClass(), "printFormat", null);
        setBooleanField(term105353, term105353.getClass(), "printHeader", false);
        setField(term105353, term105353.getClass(), "headerFormat", null);
        setBooleanField(term105353, term105353.getClass(), "printTrailer", false);
        setField(term105353, term105353.getClass(), "trailerFormat", null);
        setField(term105353, term105353.getClass(), "rowFormat", null);
        setField(term105353, term105353.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105353, term105353.getClass(), "printSectionSummary", false);
        setField(term105353, term105353.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105353, term105353.getClass(), "printSectionTrailer", false);
        setField(term105353, term105353.getClass(), "sectionTrailerFormat", null);
        setField(term105353, term105353.getClass(), "durationFormat", null);
        setBooleanField(term105353, term105353.getClass(), "printLegend", false);
        setField(term105353, term105353.getClass(), "simpleLine", null);
        setField(term105353, term105353.getClass(), "alternativeLine", null);
        setField(term105353, term105353.getClass(), "excludedTypes", null);
        setField(term105353, term105353.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withDurationFormat", argTypes, term105353, args);
    }

};


