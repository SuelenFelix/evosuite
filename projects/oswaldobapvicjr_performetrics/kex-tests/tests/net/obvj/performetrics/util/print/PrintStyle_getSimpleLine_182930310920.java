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

public class PrintStyle_getSimpleLine_182930310920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41833;

    public PrintStyle_getSimpleLine_182930310920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42134 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term42133 = ((Class) term42134).getDeclaredField((String) "DETAILED");
        ((Field) term42133).setAccessible(true);
        Object enum139 = ((Field) term42133).get((Object) null);
        Class<? extends Object> term42450 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term42449 = ((Class) term42450).getDeclaredField((String) "LINUX");
        ((Field) term42449).setAccessible(true);
        Object enum140 = ((Field) term42449).get((Object) null);
        Class<? extends Object> term42702 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term42701 = ((Class) term42702).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term42701).setAccessible(true);
        Object enum141 =  ((Field) term42701).get((Object) null);
        Class<? extends Object> term42917 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term42916 = ((Class) term42917).getDeclaredField((String) "USER_TIME");
        ((Field) term42916).setAccessible(true);
        Object enum142 =  ((Field) term42916).get((Object) null);
        ArrayList term42110 = new ArrayList();
        ((ArrayList) term42110).add(enum141);
        ((ArrayList) term42110).add(enum142);
        HashMap term42122 = new HashMap();
        term41833 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term41833, term41833.getClass(), "printFormat", enum139);
        setBooleanField(term41833, term41833.getClass(), "printHeader", false);
        setField(term41833, term41833.getClass(), "headerFormat", "bxrCBbrrct");
        setBooleanField(term41833, term41833.getClass(), "printTrailer", false);
        setField(term41833, term41833.getClass(), "trailerFormat", "CKWpJaaaxX");
        setField(term41833, term41833.getClass(), "rowFormat", "UBRmXJmfrt");
        setField(term41833, term41833.getClass(), "sectionHeaderFormat", "WZzvmIHhzZ");
        setBooleanField(term41833, term41833.getClass(), "printSectionSummary", false);
        setField(term41833, term41833.getClass(), "sectionSummaryRowFormat", "doQLHkjpNm");
        setBooleanField(term41833, term41833.getClass(), "printSectionTrailer", true);
        setField(term41833, term41833.getClass(), "sectionTrailerFormat", "lCyLIcSuom");
        setField(term41833, term41833.getClass(), "durationFormat", enum140);
        setBooleanField(term41833, term41833.getClass(), "printLegend", false);
        setField(term41833, term41833.getClass(), "simpleLine", "CGOpQSZZwI");
        setField(term41833, term41833.getClass(), "alternativeLine", "ypEdrstygY");
        setField(term41833, term41833.getClass(), "excludedTypes", term42110);
        setField(term41833, term41833.getClass(), "customCounterNames", term42122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSimpleLine", argTypes, term41833, args);
    }

};


