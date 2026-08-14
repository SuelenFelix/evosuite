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

public class PrintStyleBuilder_withoutHeader_142019458050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105279;

    public PrintStyleBuilder_withoutHeader_142019458050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105279 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105279, term105279.getClass(), "printFormat", null);
        setBooleanField(term105279, term105279.getClass(), "printHeader", false);
        setField(term105279, term105279.getClass(), "headerFormat", null);
        setBooleanField(term105279, term105279.getClass(), "printTrailer", false);
        setField(term105279, term105279.getClass(), "trailerFormat", null);
        setField(term105279, term105279.getClass(), "rowFormat", null);
        setField(term105279, term105279.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105279, term105279.getClass(), "printSectionSummary", false);
        setField(term105279, term105279.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105279, term105279.getClass(), "printSectionTrailer", false);
        setField(term105279, term105279.getClass(), "sectionTrailerFormat", null);
        setField(term105279, term105279.getClass(), "durationFormat", null);
        setBooleanField(term105279, term105279.getClass(), "printLegend", false);
        setField(term105279, term105279.getClass(), "simpleLine", null);
        setField(term105279, term105279.getClass(), "alternativeLine", null);
        setField(term105279, term105279.getClass(), "excludedTypes", null);
        setField(term105279, term105279.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutHeader", argTypes, term105279, args);
    }

};


