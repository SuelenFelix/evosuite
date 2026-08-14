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

public class PrintStyle_isPrintable_121733620123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46077;
     Object enum158;

    public PrintStyle_isPrintable_121733620123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46243 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term46242 = ((Class) term46243).getDeclaredField((String) "DETAILED");
        ((Field) term46242).setAccessible(true);
        Object enum154 = ((Field) term46242).get((Object) null);
        Class<? extends Object> term46559 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term46558 = ((Class) term46559).getDeclaredField((String) "FULL");
        ((Field) term46558).setAccessible(true);
        Object enum155 = ((Field) term46558).get((Object) null);
        Class<? extends Object> term46808 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term46807 = ((Class) term46808).getDeclaredField((String) "USER_TIME");
        ((Field) term46807).setAccessible(true);
        Object enum156 =  ((Field) term46807).get((Object) null);
        Class<? extends Object> term47017 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term47016 = ((Class) term47017).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term47016).setAccessible(true);
        Object enum157 =  ((Field) term47016).get((Object) null);
        ArrayList term46199 = new ArrayList();
        ((ArrayList) term46199).add(enum156);
        ((ArrayList) term46199).add(enum156);
        ((ArrayList) term46199).add(enum157);
        HashMap term46211 = new HashMap();
        term46077 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term46077, term46077.getClass(), "printFormat", enum154);
        setBooleanField(term46077, term46077.getClass(), "printHeader", false);
        setField(term46077, term46077.getClass(), "headerFormat", "uPuCVuZYOI");
        setBooleanField(term46077, term46077.getClass(), "printTrailer", false);
        setField(term46077, term46077.getClass(), "trailerFormat", "TweMFhxNdj");
        setField(term46077, term46077.getClass(), "rowFormat", "NBrvVzvQHe");
        setField(term46077, term46077.getClass(), "sectionHeaderFormat", "FjOiNAfBOc");
        setBooleanField(term46077, term46077.getClass(), "printSectionSummary", true);
        setField(term46077, term46077.getClass(), "sectionSummaryRowFormat", "iCCsaLHohG");
        setBooleanField(term46077, term46077.getClass(), "printSectionTrailer", false);
        setField(term46077, term46077.getClass(), "sectionTrailerFormat", "NJhGgctbdj");
        setField(term46077, term46077.getClass(), "durationFormat", enum155);
        setBooleanField(term46077, term46077.getClass(), "printLegend", true);
        setField(term46077, term46077.getClass(), "simpleLine", "MYWYUeLGOp");
        setField(term46077, term46077.getClass(), "alternativeLine", "tsTGdgQYUL");
        setField(term46077, term46077.getClass(), "excludedTypes", term46199);
        setField(term46077, term46077.getClass(), "customCounterNames", term46211);
        Class<? extends Object> term47244 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term47243 = ((Class) term47244).getDeclaredField((String) "CPU_TIME");
        ((Field) term47243).setAccessible(true);
        enum158 = ((Field) term47243).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum158;
        callMethod(klass, "isPrintable", argTypes, term46077, args);
    }

};


