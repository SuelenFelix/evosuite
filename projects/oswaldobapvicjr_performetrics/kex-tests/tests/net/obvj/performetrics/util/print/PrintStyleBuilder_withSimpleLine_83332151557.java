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
import java.lang.Character;
import java.lang.Integer;

public class PrintStyleBuilder_withSimpleLine_83332151557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105321;
     Object term105327;
     Object term105329;

    public PrintStyleBuilder_withSimpleLine_83332151557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105321 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105321, term105321.getClass(), "printFormat", null);
        setBooleanField(term105321, term105321.getClass(), "printHeader", false);
        setField(term105321, term105321.getClass(), "headerFormat", null);
        setBooleanField(term105321, term105321.getClass(), "printTrailer", false);
        setField(term105321, term105321.getClass(), "trailerFormat", null);
        setField(term105321, term105321.getClass(), "rowFormat", null);
        setField(term105321, term105321.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term105321, term105321.getClass(), "printSectionSummary", false);
        setField(term105321, term105321.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term105321, term105321.getClass(), "printSectionTrailer", false);
        setField(term105321, term105321.getClass(), "sectionTrailerFormat", null);
        setField(term105321, term105321.getClass(), "durationFormat", null);
        setBooleanField(term105321, term105321.getClass(), "printLegend", false);
        setField(term105321, term105321.getClass(), "simpleLine", null);
        setField(term105321, term105321.getClass(), "alternativeLine", null);
        setField(term105321, term105321.getClass(), "excludedTypes", null);
        setField(term105321, term105321.getClass(), "customCounterNames", null);
        term105327 = new Character((char) 0);
        term105329 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105327;
        args[1] = term105329;
        callMethod(klass, "withSimpleLine", argTypes, term105321, args);
    }

};


