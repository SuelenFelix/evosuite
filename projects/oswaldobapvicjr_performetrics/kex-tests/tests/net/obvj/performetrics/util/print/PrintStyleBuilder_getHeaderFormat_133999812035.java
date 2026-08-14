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

public class PrintStyleBuilder_getHeaderFormat_133999812035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90903;

    public PrintStyleBuilder_getHeaderFormat_133999812035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91056 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term91055 = ((Class) term91056).getDeclaredField((String) "DETAILED");
        ((Field) term91055).setAccessible(true);
        Object enum310 = ((Field) term91055).get((Object) null);
        Class<? extends Object> term91372 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term91371 = ((Class) term91372).getDeclaredField((String) "SHORT");
        ((Field) term91371).setAccessible(true);
        Object enum311 = ((Field) term91371).get((Object) null);
        Class<? extends Object> term91624 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term91623 = ((Class) term91624).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term91623).setAccessible(true);
        Object enum312 =  ((Field) term91623).get((Object) null);
        Class<? extends Object> term91839 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term91838 = ((Class) term91839).getDeclaredField((String) "CPU_TIME");
        ((Field) term91838).setAccessible(true);
        Object enum313 =  ((Field) term91838).get((Object) null);
        Class<? extends Object> term92045 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term92044 = ((Class) term92045).getDeclaredField((String) "USER_TIME");
        ((Field) term92044).setAccessible(true);
        Object enum314 =  ((Field) term92044).get((Object) null);
        Class<? extends Object> term92254 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term92253 = ((Class) term92254).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term92253).setAccessible(true);
        Object enum315 =  ((Field) term92253).get((Object) null);
        ArrayList term91026 = new ArrayList();
        ((ArrayList) term91026).add(enum312);
        ((ArrayList) term91026).add(enum313);
        ((ArrayList) term91026).add(enum314);
        ((ArrayList) term91026).add(enum313);
        ((ArrayList) term91026).add(enum314);
        ((ArrayList) term91026).add(enum313);
        ((ArrayList) term91026).add(enum315);
        HashMap term91046 = new HashMap();
        term90903 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term90903, term90903.getClass(), "printFormat", enum310);
        setBooleanField(term90903, term90903.getClass(), "printHeader", true);
        setField(term90903, term90903.getClass(), "headerFormat", "ZbHJVEqcoa");
        setBooleanField(term90903, term90903.getClass(), "printTrailer", false);
        setField(term90903, term90903.getClass(), "trailerFormat", "awDQVEVIKi");
        setField(term90903, term90903.getClass(), "rowFormat", "HJwNgUzZZR");
        setField(term90903, term90903.getClass(), "sectionHeaderFormat", "FvUCZgTXhq");
        setBooleanField(term90903, term90903.getClass(), "printSectionSummary", false);
        setField(term90903, term90903.getClass(), "sectionSummaryRowFormat", "wWWidPCHzx");
        setBooleanField(term90903, term90903.getClass(), "printSectionTrailer", false);
        setField(term90903, term90903.getClass(), "sectionTrailerFormat", "OwPIiBRuKK");
        setField(term90903, term90903.getClass(), "durationFormat", enum311);
        setBooleanField(term90903, term90903.getClass(), "printLegend", true);
        setField(term90903, term90903.getClass(), "simpleLine", "sgfGySMODT");
        setField(term90903, term90903.getClass(), "alternativeLine", "ndAITnOsny");
        setField(term90903, term90903.getClass(), "excludedTypes", term91026);
        setField(term90903, term90903.getClass(), "customCounterNames", term91046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderFormat", argTypes, term90903, args);
    }

};


