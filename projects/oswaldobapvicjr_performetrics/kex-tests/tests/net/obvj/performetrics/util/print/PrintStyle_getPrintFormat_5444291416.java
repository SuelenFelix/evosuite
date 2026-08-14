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

public class PrintStyle_getPrintFormat_5444291416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23757;

    public PrintStyle_getPrintFormat_5444291416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23903 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term23902 = ((Class) term23903).getDeclaredField((String) "SUMMARIZED");
        ((Field) term23902).setAccessible(true);
        Object enum76 = ((Field) term23902).get((Object) null);
        Class<? extends Object> term24225 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term24224 = ((Class) term24225).getDeclaredField((String) "FULL");
        ((Field) term24224).setAccessible(true);
        Object enum77 = ((Field) term24224).get((Object) null);
        Class<? extends Object> term24474 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term24473 = ((Class) term24474).getDeclaredField((String) "USER_TIME");
        ((Field) term24473).setAccessible(true);
        Object enum78 =  ((Field) term24473).get((Object) null);
        Class<? extends Object> term24683 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term24682 = ((Class) term24683).getDeclaredField((String) "CPU_TIME");
        ((Field) term24682).setAccessible(true);
        Object enum79 =  ((Field) term24682).get((Object) null);
        ArrayList term23881 = new ArrayList();
        ((ArrayList) term23881).add(enum78);
        ((ArrayList) term23881).add(enum79);
        HashMap term23893 = new HashMap();
        term23757 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term23757, term23757.getClass(), "printFormat", enum76);
        setBooleanField(term23757, term23757.getClass(), "printHeader", true);
        setField(term23757, term23757.getClass(), "headerFormat", "gCWtLVKVVe");
        setBooleanField(term23757, term23757.getClass(), "printTrailer", true);
        setField(term23757, term23757.getClass(), "trailerFormat", "fWKJoSoCwE");
        setField(term23757, term23757.getClass(), "rowFormat", "wfaXBpWAUH");
        setField(term23757, term23757.getClass(), "sectionHeaderFormat", "VMeAzAHwZj");
        setBooleanField(term23757, term23757.getClass(), "printSectionSummary", true);
        setField(term23757, term23757.getClass(), "sectionSummaryRowFormat", "PznxWXsZME");
        setBooleanField(term23757, term23757.getClass(), "printSectionTrailer", true);
        setField(term23757, term23757.getClass(), "sectionTrailerFormat", "ZzIujlwVsw");
        setField(term23757, term23757.getClass(), "durationFormat", enum77);
        setBooleanField(term23757, term23757.getClass(), "printLegend", true);
        setField(term23757, term23757.getClass(), "simpleLine", "LWyEaeIyAo");
        setField(term23757, term23757.getClass(), "alternativeLine", "yVMkkQhvmN");
        setField(term23757, term23757.getClass(), "excludedTypes", term23881);
        setField(term23757, term23757.getClass(), "customCounterNames", term23893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintFormat", argTypes, term23757, args);
    }

};


