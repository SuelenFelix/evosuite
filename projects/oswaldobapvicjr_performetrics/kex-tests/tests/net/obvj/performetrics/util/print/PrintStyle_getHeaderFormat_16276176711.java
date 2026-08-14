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

public class PrintStyle_getHeaderFormat_16276176711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83035;

    public PrintStyle_getHeaderFormat_16276176711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83180 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term83179 = ((Class) term83180).getDeclaredField((String) "SUMMARIZED");
        ((Field) term83179).setAccessible(true);
        Object enum279 = ((Field) term83179).get((Object) null);
        Class<? extends Object> term83502 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term83501 = ((Class) term83502).getDeclaredField((String) "SHORT");
        ((Field) term83501).setAccessible(true);
        Object enum280 = ((Field) term83501).get((Object) null);
        Class<? extends Object> term83754 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term83753 = ((Class) term83754).getDeclaredField((String) "USER_TIME");
        ((Field) term83753).setAccessible(true);
        Object enum281 =  ((Field) term83753).get((Object) null);
        ArrayList term83160 = new ArrayList();
        ((ArrayList) term83160).add(enum281);
        HashMap term83168 = new HashMap();
        term83035 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term83035, term83035.getClass(), "printFormat", enum279);
        setBooleanField(term83035, term83035.getClass(), "printHeader", true);
        setField(term83035, term83035.getClass(), "headerFormat", "MYWYUeLGOp");
        setBooleanField(term83035, term83035.getClass(), "printTrailer", false);
        setField(term83035, term83035.getClass(), "trailerFormat", "tsTGdgQYUL");
        setField(term83035, term83035.getClass(), "rowFormat", "TtGbVmKcnX");
        setField(term83035, term83035.getClass(), "sectionHeaderFormat", "GJVkUrCVdD");
        setBooleanField(term83035, term83035.getClass(), "printSectionSummary", false);
        setField(term83035, term83035.getClass(), "sectionSummaryRowFormat", "zNdorvdUgu");
        setBooleanField(term83035, term83035.getClass(), "printSectionTrailer", false);
        setField(term83035, term83035.getClass(), "sectionTrailerFormat", "oPxuZbkYio");
        setField(term83035, term83035.getClass(), "durationFormat", enum280);
        setBooleanField(term83035, term83035.getClass(), "printLegend", true);
        setField(term83035, term83035.getClass(), "simpleLine", "vKitydDVnM");
        setField(term83035, term83035.getClass(), "alternativeLine", "urCiQnUFBM");
        setField(term83035, term83035.getClass(), "excludedTypes", term83160);
        setField(term83035, term83035.getClass(), "customCounterNames", term83168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderFormat", argTypes, term83035, args);
    }

};


