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
import java.lang.Character;
import java.lang.Integer;

public class PrintStyleBuilder_withAlternativeLine_138319056615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77276;
     Object term77421;
     Object term77423;

    public PrintStyleBuilder_withAlternativeLine_138319056615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77426 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term77425 = ((Class) term77426).getDeclaredField((String) "DETAILED");
        ((Field) term77425).setAccessible(true);
        Object enum261 = ((Field) term77425).get((Object) null);
        Class<? extends Object> term77742 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term77741 = ((Class) term77742).getDeclaredField((String) "FULL");
        ((Field) term77741).setAccessible(true);
        Object enum262 = ((Field) term77741).get((Object) null);
        Class<? extends Object> term77991 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term77990 = ((Class) term77991).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term77990).setAccessible(true);
        Object enum263 =  ((Field) term77990).get((Object) null);
        Class<? extends Object> term78206 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term78205 = ((Class) term78206).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term78205).setAccessible(true);
        Object enum264 =  ((Field) term78205).get((Object) null);
        ArrayList term77398 = new ArrayList();
        ((ArrayList) term77398).add(enum263);
        ((ArrayList) term77398).add(enum264);
        ((ArrayList) term77398).add(enum264);
        HashMap term77410 = new HashMap();
        term77276 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term77276, term77276.getClass(), "printFormat", enum261);
        setBooleanField(term77276, term77276.getClass(), "printHeader", true);
        setField(term77276, term77276.getClass(), "headerFormat", "wwAwLLcLPp");
        setBooleanField(term77276, term77276.getClass(), "printTrailer", true);
        setField(term77276, term77276.getClass(), "trailerFormat", "nHpMKOmlpQ");
        setField(term77276, term77276.getClass(), "rowFormat", "fKhrQsJToZ");
        setField(term77276, term77276.getClass(), "sectionHeaderFormat", "wsysQLGFnl");
        setBooleanField(term77276, term77276.getClass(), "printSectionSummary", false);
        setField(term77276, term77276.getClass(), "sectionSummaryRowFormat", "ckQLZGFjMX");
        setBooleanField(term77276, term77276.getClass(), "printSectionTrailer", true);
        setField(term77276, term77276.getClass(), "sectionTrailerFormat", "qphdrqUtNx");
        setField(term77276, term77276.getClass(), "durationFormat", enum262);
        setBooleanField(term77276, term77276.getClass(), "printLegend", true);
        setField(term77276, term77276.getClass(), "simpleLine", "bwlLFAfNWx");
        setField(term77276, term77276.getClass(), "alternativeLine", "JWodNQzjjV");
        setField(term77276, term77276.getClass(), "excludedTypes", term77398);
        setField(term77276, term77276.getClass(), "customCounterNames", term77410);
        term77421 = new Character('Y');
        term77423 = new Integer(-1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term77421;
        args[1] = term77423;
        callMethod(klass, "withAlternativeLine", argTypes, term77276, args);
    }

};


