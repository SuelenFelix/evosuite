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

public class PrintStyle_init_10809136123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21088;

    public PrintStyle_init_10809136123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21389 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term21388 = ((Class) term21389).getDeclaredField((String) "DETAILED");
        ((Field) term21388).setAccessible(true);
        Object enum67 = ((Field) term21388).get((Object) null);
        Class<? extends Object> term21705 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term21704 = ((Class) term21705).getDeclaredField((String) "LINUX");
        ((Field) term21704).setAccessible(true);
        Object enum68 = ((Field) term21704).get((Object) null);
        Class<? extends Object> term21957 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term21956 = ((Class) term21957).getDeclaredField((String) "CPU_TIME");
        ((Field) term21956).setAccessible(true);
        Object enum69 =  ((Field) term21956).get((Object) null);
        Class<? extends Object> term22163 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term22162 = ((Class) term22163).getDeclaredField((String) "USER_TIME");
        ((Field) term22162).setAccessible(true);
        Object enum70 =  ((Field) term22162).get((Object) null);
        ArrayList term21365 = new ArrayList();
        ((ArrayList) term21365).add(enum69);
        ((ArrayList) term21365).add(enum70);
        HashMap term21377 = new HashMap();
        term21088 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term21088, term21088.getClass(), "printFormat", enum67);
        setBooleanField(term21088, term21088.getClass(), "printHeader", true);
        setField(term21088, term21088.getClass(), "headerFormat", "iNwOJRBEjp");
        setBooleanField(term21088, term21088.getClass(), "printTrailer", false);
        setField(term21088, term21088.getClass(), "trailerFormat", "XylxrMBraH");
        setField(term21088, term21088.getClass(), "rowFormat", "pORebkoRdD");
        setField(term21088, term21088.getClass(), "sectionHeaderFormat", "mXGCWJDOqA");
        setBooleanField(term21088, term21088.getClass(), "printSectionSummary", false);
        setField(term21088, term21088.getClass(), "sectionSummaryRowFormat", "dpNsDgfPso");
        setBooleanField(term21088, term21088.getClass(), "printSectionTrailer", true);
        setField(term21088, term21088.getClass(), "sectionTrailerFormat", "hCWPJQKpdc");
        setField(term21088, term21088.getClass(), "durationFormat", enum68);
        setBooleanField(term21088, term21088.getClass(), "printLegend", false);
        setField(term21088, term21088.getClass(), "simpleLine", "WzMEhMXkKx");
        setField(term21088, term21088.getClass(), "alternativeLine", "XOiDvlDhdc");
        setField(term21088, term21088.getClass(), "excludedTypes", term21365);
        setField(term21088, term21088.getClass(), "customCounterNames", term21377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Object[] args = new Object[1];
        args[0] = term21088;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


