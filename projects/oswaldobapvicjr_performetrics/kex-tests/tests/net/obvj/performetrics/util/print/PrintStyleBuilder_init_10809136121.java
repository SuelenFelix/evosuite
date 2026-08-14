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

public class PrintStyleBuilder_init_10809136121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50367;

    public PrintStyleBuilder_init_10809136121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50505 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term50504 = ((Class) term50505).getDeclaredField((String) "DETAILED");
        ((Field) term50504).setAccessible(true);
        Object enum169 = ((Field) term50504).get((Object) null);
        Class<? extends Object> term50821 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term50820 = ((Class) term50821).getDeclaredField((String) "FULL");
        ((Field) term50820).setAccessible(true);
        Object enum170 = ((Field) term50820).get((Object) null);
        ArrayList term50489 = new ArrayList();
        HashMap term50493 = new HashMap();
        term50367 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term50367, term50367.getClass(), "printFormat", enum169);
        setBooleanField(term50367, term50367.getClass(), "printHeader", true);
        setField(term50367, term50367.getClass(), "headerFormat", "ZfBIVGBQOE");
        setBooleanField(term50367, term50367.getClass(), "printTrailer", true);
        setField(term50367, term50367.getClass(), "trailerFormat", "QSrDQfEsTR");
        setField(term50367, term50367.getClass(), "rowFormat", "PsqusYmejD");
        setField(term50367, term50367.getClass(), "sectionHeaderFormat", "NTWMiBEaDF");
        setBooleanField(term50367, term50367.getClass(), "printSectionSummary", true);
        setField(term50367, term50367.getClass(), "sectionSummaryRowFormat", "SPBstwKFVr");
        setBooleanField(term50367, term50367.getClass(), "printSectionTrailer", true);
        setField(term50367, term50367.getClass(), "sectionTrailerFormat", "WxYUTuqmIq");
        setField(term50367, term50367.getClass(), "durationFormat", enum170);
        setBooleanField(term50367, term50367.getClass(), "printLegend", false);
        setField(term50367, term50367.getClass(), "simpleLine", "OeQLvhVERT");
        setField(term50367, term50367.getClass(), "alternativeLine", "IlvgFINwIa");
        setField(term50367, term50367.getClass(), "excludedTypes", term50489);
        setField(term50367, term50367.getClass(), "customCounterNames", term50493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term50367;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


