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

public class PrintStyleBuilder_withoutHeader_142019458049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112342;

    public PrintStyleBuilder_withoutHeader_142019458049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112342 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term112342, term112342.getClass(), "printFormat", null);
        setBooleanField(term112342, term112342.getClass(), "printHeader", false);
        setField(term112342, term112342.getClass(), "headerFormat", null);
        setBooleanField(term112342, term112342.getClass(), "printTrailer", false);
        setField(term112342, term112342.getClass(), "trailerFormat", null);
        setField(term112342, term112342.getClass(), "rowFormat", null);
        setField(term112342, term112342.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term112342, term112342.getClass(), "printSectionSummary", false);
        setField(term112342, term112342.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term112342, term112342.getClass(), "printSectionTrailer", false);
        setField(term112342, term112342.getClass(), "sectionTrailerFormat", null);
        setField(term112342, term112342.getClass(), "durationFormat", null);
        setBooleanField(term112342, term112342.getClass(), "printLegend", false);
        setField(term112342, term112342.getClass(), "simpleLine", null);
        setField(term112342, term112342.getClass(), "alternativeLine", null);
        setField(term112342, term112342.getClass(), "excludedTypes", null);
        setField(term112342, term112342.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutHeader", argTypes, term112342, args);
    }

};


