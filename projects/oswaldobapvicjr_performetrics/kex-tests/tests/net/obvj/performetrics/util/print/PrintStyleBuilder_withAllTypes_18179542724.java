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

public class PrintStyleBuilder_withAllTypes_18179542724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75448;

    public PrintStyleBuilder_withAllTypes_18179542724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75602 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term75601 = ((Class) term75602).getDeclaredField((String) "SUMMARIZED");
        ((Field) term75601).setAccessible(true);
        Object enum254 = ((Field) term75601).get((Object) null);
        Class<? extends Object> term75924 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term75923 = ((Class) term75924).getDeclaredField((String) "ISO_8601");
        ((Field) term75923).setAccessible(true);
        Object enum255 = ((Field) term75923).get((Object) null);
        Class<? extends Object> term76185 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term76184 = ((Class) term76185).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term76184).setAccessible(true);
        Object enum256 =  ((Field) term76184).get((Object) null);
        Class<? extends Object> term76400 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term76399 = ((Class) term76400).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term76399).setAccessible(true);
        Object enum257 =  ((Field) term76399).get((Object) null);
        Class<? extends Object> term76627 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term76626 = ((Class) term76627).getDeclaredField((String) "USER_TIME");
        ((Field) term76626).setAccessible(true);
        Object enum258 =  ((Field) term76626).get((Object) null);
        ArrayList term75576 = new ArrayList();
        ((ArrayList) term75576).add(enum256);
        ((ArrayList) term75576).add(enum257);
        ((ArrayList) term75576).add(enum256);
        ((ArrayList) term75576).add(enum257);
        ((ArrayList) term75576).add(enum257);
        ((ArrayList) term75576).add(enum258);
        ((ArrayList) term75576).add(enum258);
        ((ArrayList) term75576).add(enum258);
        HashMap term75592 = new HashMap();
        term75448 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term75448, term75448.getClass(), "printFormat", enum254);
        setBooleanField(term75448, term75448.getClass(), "printHeader", true);
        setField(term75448, term75448.getClass(), "headerFormat", "YgQvdcBQKw");
        setBooleanField(term75448, term75448.getClass(), "printTrailer", true);
        setField(term75448, term75448.getClass(), "trailerFormat", "FiYYLuailz");
        setField(term75448, term75448.getClass(), "rowFormat", "XebAeSnCKZ");
        setField(term75448, term75448.getClass(), "sectionHeaderFormat", "GeddnXjHGy");
        setBooleanField(term75448, term75448.getClass(), "printSectionSummary", true);
        setField(term75448, term75448.getClass(), "sectionSummaryRowFormat", "vLTbaoAxBm");
        setBooleanField(term75448, term75448.getClass(), "printSectionTrailer", true);
        setField(term75448, term75448.getClass(), "sectionTrailerFormat", "BXTjEyEZxD");
        setField(term75448, term75448.getClass(), "durationFormat", enum255);
        setBooleanField(term75448, term75448.getClass(), "printLegend", true);
        setField(term75448, term75448.getClass(), "simpleLine", "oKhVzOKUFW");
        setField(term75448, term75448.getClass(), "alternativeLine", "mNHyqmOAFy");
        setField(term75448, term75448.getClass(), "excludedTypes", term75576);
        setField(term75448, term75448.getClass(), "customCounterNames", term75592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withAllTypes", argTypes, term75448, args);
    }

};


