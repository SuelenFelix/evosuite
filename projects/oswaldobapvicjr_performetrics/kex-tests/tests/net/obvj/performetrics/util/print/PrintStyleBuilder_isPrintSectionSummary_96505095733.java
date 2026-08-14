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

public class PrintStyleBuilder_isPrintSectionSummary_96505095733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87952;

    public PrintStyleBuilder_isPrintSectionSummary_96505095733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88107 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term88106 = ((Class) term88107).getDeclaredField((String) "SUMMARIZED");
        ((Field) term88106).setAccessible(true);
        Object enum299 = ((Field) term88106).get((Object) null);
        Class<? extends Object> term88429 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term88428 = ((Class) term88429).getDeclaredField((String) "SHORT");
        ((Field) term88428).setAccessible(true);
        Object enum300 = ((Field) term88428).get((Object) null);
        Class<? extends Object> term88681 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term88680 = ((Class) term88681).getDeclaredField((String) "USER_TIME");
        ((Field) term88680).setAccessible(true);
        Object enum301 =  ((Field) term88680).get((Object) null);
        Class<? extends Object> term88890 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term88889 = ((Class) term88890).getDeclaredField((String) "CPU_TIME");
        ((Field) term88889).setAccessible(true);
        Object enum302 =  ((Field) term88889).get((Object) null);
        Class<? extends Object> term89096 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89095 = ((Class) term89096).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term89095).setAccessible(true);
        Object enum303 =  ((Field) term89095).get((Object) null);
        Class<? extends Object> term89323 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89322 = ((Class) term89323).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term89322).setAccessible(true);
        Object enum304 =  ((Field) term89322).get((Object) null);
        ArrayList term88077 = new ArrayList();
        ((ArrayList) term88077).add(enum301);
        ((ArrayList) term88077).add(enum302);
        ((ArrayList) term88077).add(enum302);
        ((ArrayList) term88077).add(enum302);
        ((ArrayList) term88077).add(enum303);
        ((ArrayList) term88077).add(enum304);
        ((ArrayList) term88077).add(enum301);
        HashMap term88097 = new HashMap();
        term87952 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term87952, term87952.getClass(), "printFormat", enum299);
        setBooleanField(term87952, term87952.getClass(), "printHeader", true);
        setField(term87952, term87952.getClass(), "headerFormat", "fbnKvthhOz");
        setBooleanField(term87952, term87952.getClass(), "printTrailer", false);
        setField(term87952, term87952.getClass(), "trailerFormat", "PGfCDJTBek");
        setField(term87952, term87952.getClass(), "rowFormat", "ZwjARhAtHC");
        setField(term87952, term87952.getClass(), "sectionHeaderFormat", "XXvscsYBWv");
        setBooleanField(term87952, term87952.getClass(), "printSectionSummary", true);
        setField(term87952, term87952.getClass(), "sectionSummaryRowFormat", "uePedtiAfL");
        setBooleanField(term87952, term87952.getClass(), "printSectionTrailer", true);
        setField(term87952, term87952.getClass(), "sectionTrailerFormat", "AdSHvysxQB");
        setField(term87952, term87952.getClass(), "durationFormat", enum300);
        setBooleanField(term87952, term87952.getClass(), "printLegend", false);
        setField(term87952, term87952.getClass(), "simpleLine", "jlraKkBWFA");
        setField(term87952, term87952.getClass(), "alternativeLine", "mRBtFTxVdE");
        setField(term87952, term87952.getClass(), "excludedTypes", term88077);
        setField(term87952, term87952.getClass(), "customCounterNames", term88097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionSummary", argTypes, term87952, args);
    }

};


