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

public class PrintStyleBuilder_withoutHeader_14201945805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65475;

    public PrintStyleBuilder_withoutHeader_14201945805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65618 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term65617 = ((Class) term65618).getDeclaredField((String) "SUMMARIZED");
        ((Field) term65617).setAccessible(true);
        Object enum221 = ((Field) term65617).get((Object) null);
        Class<? extends Object> term65940 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term65939 = ((Class) term65940).getDeclaredField((String) "SHORT");
        ((Field) term65939).setAccessible(true);
        Object enum222 = ((Field) term65939).get((Object) null);
        Class<? extends Object> term66192 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term66191 = ((Class) term66192).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term66191).setAccessible(true);
        Object enum223 =  ((Field) term66191).get((Object) null);
        ArrayList term65600 = new ArrayList();
        ((ArrayList) term65600).add(enum223);
        HashMap term65608 = new HashMap();
        term65475 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term65475, term65475.getClass(), "printFormat", enum221);
        setBooleanField(term65475, term65475.getClass(), "printHeader", false);
        setField(term65475, term65475.getClass(), "headerFormat", "qUtkFGMNUV");
        setBooleanField(term65475, term65475.getClass(), "printTrailer", false);
        setField(term65475, term65475.getClass(), "trailerFormat", "mGRiYhnMcR");
        setField(term65475, term65475.getClass(), "rowFormat", "NFlvfJCVPO");
        setField(term65475, term65475.getClass(), "sectionHeaderFormat", "KarbTXFmUU");
        setBooleanField(term65475, term65475.getClass(), "printSectionSummary", false);
        setField(term65475, term65475.getClass(), "sectionSummaryRowFormat", "jiUSjqwSIQ");
        setBooleanField(term65475, term65475.getClass(), "printSectionTrailer", false);
        setField(term65475, term65475.getClass(), "sectionTrailerFormat", "MgLCedQfoj");
        setField(term65475, term65475.getClass(), "durationFormat", enum222);
        setBooleanField(term65475, term65475.getClass(), "printLegend", true);
        setField(term65475, term65475.getClass(), "simpleLine", "zgKiINdgNu");
        setField(term65475, term65475.getClass(), "alternativeLine", "zLMTXDQHYH");
        setField(term65475, term65475.getClass(), "excludedTypes", term65600);
        setField(term65475, term65475.getClass(), "customCounterNames", term65608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutHeader", argTypes, term65475, args);
    }

};


