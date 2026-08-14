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

public class PrintStyleBuilder_withoutTypes_59533452623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73929;
     Object term74231;

    public PrintStyleBuilder_withoutTypes_59533452623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74233 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term74232 = ((Class) term74233).getDeclaredField((String) "DETAILED");
        ((Field) term74232).setAccessible(true);
        Object enum249 = ((Field) term74232).get((Object) null);
        Class<? extends Object> term74549 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term74548 = ((Class) term74549).getDeclaredField((String) "LINUX");
        ((Field) term74548).setAccessible(true);
        Object enum250 = ((Field) term74548).get((Object) null);
        Class<? extends Object> term74801 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term74800 = ((Class) term74801).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term74800).setAccessible(true);
        Object enum251 =  ((Field) term74800).get((Object) null);
        Class<? extends Object> term75028 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term75027 = ((Class) term75028).getDeclaredField((String) "CPU_TIME");
        ((Field) term75027).setAccessible(true);
        Object enum252 =  ((Field) term75027).get((Object) null);
        Class<? extends Object> term75234 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term75233 = ((Class) term75234).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term75233).setAccessible(true);
        Object enum253 =  ((Field) term75233).get((Object) null);
        ArrayList term74206 = new ArrayList();
        ((ArrayList) term74206).add(enum251);
        ((ArrayList) term74206).add(enum252);
        ((ArrayList) term74206).add(enum252);
        ((ArrayList) term74206).add(enum251);
        ((ArrayList) term74206).add(enum253);
        HashMap term74222 = new HashMap();
        term73929 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term73929, term73929.getClass(), "printFormat", enum249);
        setBooleanField(term73929, term73929.getClass(), "printHeader", false);
        setField(term73929, term73929.getClass(), "headerFormat", "goAoCMhKBu");
        setBooleanField(term73929, term73929.getClass(), "printTrailer", true);
        setField(term73929, term73929.getClass(), "trailerFormat", "BWxJSgKHRT");
        setField(term73929, term73929.getClass(), "rowFormat", "AGXoIndFnm");
        setField(term73929, term73929.getClass(), "sectionHeaderFormat", "mwmFMNEzkK");
        setBooleanField(term73929, term73929.getClass(), "printSectionSummary", true);
        setField(term73929, term73929.getClass(), "sectionSummaryRowFormat", "kVAmKknVln");
        setBooleanField(term73929, term73929.getClass(), "printSectionTrailer", false);
        setField(term73929, term73929.getClass(), "sectionTrailerFormat", "MRFLbEGYKG");
        setField(term73929, term73929.getClass(), "durationFormat", enum250);
        setBooleanField(term73929, term73929.getClass(), "printLegend", true);
        setField(term73929, term73929.getClass(), "simpleLine", "BYrGukTyof");
        setField(term73929, term73929.getClass(), "alternativeLine", "jiCGTTzKGB");
        setField(term73929, term73929.getClass(), "excludedTypes", term74206);
        setField(term73929, term73929.getClass(), "customCounterNames", term74222);
        term74231 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 1);
        setElement(term74231, 0, enum253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74231;
        callMethod(klass, "withoutTypes", argTypes, term73929, args);
    }

};


