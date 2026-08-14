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

public class PrintStyle_toString_7421582503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33702;

    public PrintStyle_toString_7421582503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34001 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term34000 = ((Class) term34001).getDeclaredField((String) "SUMMARIZED");
        ((Field) term34000).setAccessible(true);
        Object enum113 = ((Field) term34000).get((Object) null);
        Class<? extends Object> term34323 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term34322 = ((Class) term34323).getDeclaredField((String) "LINUX");
        ((Field) term34322).setAccessible(true);
        Object enum114 = ((Field) term34322).get((Object) null);
        Class<? extends Object> term34575 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term34574 = ((Class) term34575).getDeclaredField((String) "CPU_TIME");
        ((Field) term34574).setAccessible(true);
        Object enum115 =  ((Field) term34574).get((Object) null);
        ArrayList term33981 = new ArrayList();
        ((ArrayList) term33981).add(enum115);
        HashMap term33989 = new HashMap();
        term33702 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term33702, term33702.getClass(), "printFormat", enum113);
        setBooleanField(term33702, term33702.getClass(), "printHeader", true);
        setField(term33702, term33702.getClass(), "headerFormat", "BRIVNtfUWU");
        setBooleanField(term33702, term33702.getClass(), "printTrailer", false);
        setField(term33702, term33702.getClass(), "trailerFormat", "DbiCVtPPCT");
        setField(term33702, term33702.getClass(), "rowFormat", "WzFopsaDuG");
        setField(term33702, term33702.getClass(), "sectionHeaderFormat", "PapWxkhEWe");
        setBooleanField(term33702, term33702.getClass(), "printSectionSummary", true);
        setField(term33702, term33702.getClass(), "sectionSummaryRowFormat", "smnHEqRFRx");
        setBooleanField(term33702, term33702.getClass(), "printSectionTrailer", true);
        setField(term33702, term33702.getClass(), "sectionTrailerFormat", "XYtryyobou");
        setField(term33702, term33702.getClass(), "durationFormat", enum114);
        setBooleanField(term33702, term33702.getClass(), "printLegend", false);
        setField(term33702, term33702.getClass(), "simpleLine", "OYbzXylRWW");
        setField(term33702, term33702.getClass(), "alternativeLine", "DSNsTGYXDF");
        setField(term33702, term33702.getClass(), "excludedTypes", term33981);
        setField(term33702, term33702.getClass(), "customCounterNames", term33989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toString", argTypes, term33702, args);
    }

};


