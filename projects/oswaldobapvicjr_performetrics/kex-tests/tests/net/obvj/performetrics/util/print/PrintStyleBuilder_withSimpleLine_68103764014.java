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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintStyleBuilder_withSimpleLine_68103764014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76540;

    public PrintStyleBuilder_withSimpleLine_68103764014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76693 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term76692 = ((Class) term76693).getDeclaredField((String) "SUMMARIZED");
        ((Field) term76692).setAccessible(true);
        Object enum259 = ((Field) term76692).get((Object) null);
        Class<? extends Object> term77015 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term77014 = ((Class) term77015).getDeclaredField((String) "SHORT");
        ((Field) term77014).setAccessible(true);
        Object enum260 = ((Field) term77014).get((Object) null);
        ArrayList term76665 = new ArrayList();
        HashMap term76669 = new HashMap();
        term76540 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term76540, term76540.getClass(), "printFormat", enum259);
        setBooleanField(term76540, term76540.getClass(), "printHeader", false);
        setField(term76540, term76540.getClass(), "headerFormat", "vBnWPlsZMk");
        setBooleanField(term76540, term76540.getClass(), "printTrailer", false);
        setField(term76540, term76540.getClass(), "trailerFormat", "fIZsWucfXz");
        setField(term76540, term76540.getClass(), "rowFormat", "IApvtmfhnq");
        setField(term76540, term76540.getClass(), "sectionHeaderFormat", "VSaNnhMpRc");
        setBooleanField(term76540, term76540.getClass(), "printSectionSummary", true);
        setField(term76540, term76540.getClass(), "sectionSummaryRowFormat", "QNjNTLlUaV");
        setBooleanField(term76540, term76540.getClass(), "printSectionTrailer", false);
        setField(term76540, term76540.getClass(), "sectionTrailerFormat", "hIYsRyOZxk");
        setField(term76540, term76540.getClass(), "durationFormat", enum260);
        setBooleanField(term76540, term76540.getClass(), "printLegend", false);
        setField(term76540, term76540.getClass(), "simpleLine", "RjNoEywJbC");
        setField(term76540, term76540.getClass(), "alternativeLine", "RTTvrwwhou");
        setField(term76540, term76540.getClass(), "excludedTypes", term76665);
        setField(term76540, term76540.getClass(), "customCounterNames", term76669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fVdTcjgHdw";
        callMethod(klass, "withSimpleLine", argTypes, term76540, args);
    }

};


