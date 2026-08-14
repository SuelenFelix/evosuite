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

public class PrintStyle_getExcludedTypes_89972023919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92737;

    public PrintStyle_getExcludedTypes_89972023919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92880 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term92879 = ((Class) term92880).getDeclaredField((String) "DETAILED");
        ((Field) term92879).setAccessible(true);
        Object enum312 = ((Field) term92879).get((Object) null);
        Class<? extends Object> term93196 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term93195 = ((Class) term93196).getDeclaredField((String) "SHORT");
        ((Field) term93195).setAccessible(true);
        Object enum313 = ((Field) term93195).get((Object) null);
        Class<? extends Object> term93448 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93447 = ((Class) term93448).getDeclaredField((String) "USER_TIME");
        ((Field) term93447).setAccessible(true);
        Object enum314 =  ((Field) term93447).get((Object) null);
        ArrayList term92860 = new ArrayList();
        ((ArrayList) term92860).add(enum314);
        HashMap term92868 = new HashMap();
        term92737 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term92737, term92737.getClass(), "printFormat", enum312);
        setBooleanField(term92737, term92737.getClass(), "printHeader", true);
        setField(term92737, term92737.getClass(), "headerFormat", "PvmBHIXaMY");
        setBooleanField(term92737, term92737.getClass(), "printTrailer", true);
        setField(term92737, term92737.getClass(), "trailerFormat", "hulYxtowxw");
        setField(term92737, term92737.getClass(), "rowFormat", "GNEmuHPNcU");
        setField(term92737, term92737.getClass(), "sectionHeaderFormat", "IoSfuKDFRe");
        setBooleanField(term92737, term92737.getClass(), "printSectionSummary", true);
        setField(term92737, term92737.getClass(), "sectionSummaryRowFormat", "AWYyZiNfsm");
        setBooleanField(term92737, term92737.getClass(), "printSectionTrailer", false);
        setField(term92737, term92737.getClass(), "sectionTrailerFormat", "ITRRYiuDwH");
        setField(term92737, term92737.getClass(), "durationFormat", enum313);
        setBooleanField(term92737, term92737.getClass(), "printLegend", true);
        setField(term92737, term92737.getClass(), "simpleLine", "llRfwANcVF");
        setField(term92737, term92737.getClass(), "alternativeLine", "sUEeHQTWkA");
        setField(term92737, term92737.getClass(), "excludedTypes", term92860);
        setField(term92737, term92737.getClass(), "customCounterNames", term92868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludedTypes", argTypes, term92737, args);
    }

};


