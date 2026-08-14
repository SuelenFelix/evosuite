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

public class PrintStyle_toString_7421582504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22371;

    public PrintStyle_toString_7421582504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22524 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term22523 = ((Class) term22524).getDeclaredField((String) "SUMMARIZED");
        ((Field) term22523).setAccessible(true);
        Object enum71 = ((Field) term22523).get((Object) null);
        Class<? extends Object> term22846 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term22845 = ((Class) term22846).getDeclaredField((String) "SHORTER");
        ((Field) term22845).setAccessible(true);
        Object enum72 = ((Field) term22845).get((Object) null);
        Class<? extends Object> term23104 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term23103 = ((Class) term23104).getDeclaredField((String) "CPU_TIME");
        ((Field) term23103).setAccessible(true);
        Object enum73 =  ((Field) term23103).get((Object) null);
        Class<? extends Object> term23310 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term23309 = ((Class) term23310).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term23309).setAccessible(true);
        Object enum74 =  ((Field) term23309).get((Object) null);
        Class<? extends Object> term23525 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term23524 = ((Class) term23525).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term23524).setAccessible(true);
        Object enum75 =  ((Field) term23524).get((Object) null);
        ArrayList term22498 = new ArrayList();
        ((ArrayList) term22498).add(enum73);
        ((ArrayList) term22498).add(enum74);
        ((ArrayList) term22498).add(enum75);
        ((ArrayList) term22498).add(enum73);
        ((ArrayList) term22498).add(enum74);
        HashMap term22514 = new HashMap();
        term22371 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term22371, term22371.getClass(), "printFormat", enum71);
        setBooleanField(term22371, term22371.getClass(), "printHeader", true);
        setField(term22371, term22371.getClass(), "headerFormat", "lHfTrWKMPk");
        setBooleanField(term22371, term22371.getClass(), "printTrailer", false);
        setField(term22371, term22371.getClass(), "trailerFormat", "JDaAnsVTGV");
        setField(term22371, term22371.getClass(), "rowFormat", "mLUZFTfjle");
        setField(term22371, term22371.getClass(), "sectionHeaderFormat", "xIeFjkHkOe");
        setBooleanField(term22371, term22371.getClass(), "printSectionSummary", true);
        setField(term22371, term22371.getClass(), "sectionSummaryRowFormat", "SdCKLMIYnX");
        setBooleanField(term22371, term22371.getClass(), "printSectionTrailer", false);
        setField(term22371, term22371.getClass(), "sectionTrailerFormat", "OJJtVNPyKZ");
        setField(term22371, term22371.getClass(), "durationFormat", enum72);
        setBooleanField(term22371, term22371.getClass(), "printLegend", false);
        setField(term22371, term22371.getClass(), "simpleLine", "AKNapTAfmD");
        setField(term22371, term22371.getClass(), "alternativeLine", "xJgPlLxpgC");
        setField(term22371, term22371.getClass(), "excludedTypes", term22498);
        setField(term22371, term22371.getClass(), "customCounterNames", term22514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toString", argTypes, term22371, args);
    }

};


