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

public class PrintStyle_getRowFormat_133967667816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35921;

    public PrintStyle_getRowFormat_133967667816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36070 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term36069 = ((Class) term36070).getDeclaredField((String) "DETAILED");
        ((Field) term36069).setAccessible(true);
        Object enum117 = ((Field) term36069).get((Object) null);
        Class<? extends Object> term36386 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term36385 = ((Class) term36386).getDeclaredField((String) "SHORT");
        ((Field) term36385).setAccessible(true);
        Object enum118 = ((Field) term36385).get((Object) null);
        Class<? extends Object> term36638 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term36637 = ((Class) term36638).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term36637).setAccessible(true);
        Object enum119 =  ((Field) term36637).get((Object) null);
        Class<? extends Object> term36865 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term36864 = ((Class) term36865).getDeclaredField((String) "USER_TIME");
        ((Field) term36864).setAccessible(true);
        Object enum120 =  ((Field) term36864).get((Object) null);
        Class<? extends Object> term37074 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term37073 = ((Class) term37074).getDeclaredField((String) "CPU_TIME");
        ((Field) term37073).setAccessible(true);
        Object enum121 =  ((Field) term37073).get((Object) null);
        ArrayList term36044 = new ArrayList();
        ((ArrayList) term36044).add(enum119);
        ((ArrayList) term36044).add(enum120);
        ((ArrayList) term36044).add(enum119);
        ((ArrayList) term36044).add(enum121);
        ((ArrayList) term36044).add(enum120);
        ((ArrayList) term36044).add(enum120);
        ((ArrayList) term36044).add(enum120);
        HashMap term36060 = new HashMap();
        term35921 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term35921, term35921.getClass(), "printFormat", enum117);
        setBooleanField(term35921, term35921.getClass(), "printHeader", false);
        setField(term35921, term35921.getClass(), "headerFormat", "PCipZnmBOF");
        setBooleanField(term35921, term35921.getClass(), "printTrailer", true);
        setField(term35921, term35921.getClass(), "trailerFormat", "zcorEihhLK");
        setField(term35921, term35921.getClass(), "rowFormat", "GrqozDKFOk");
        setField(term35921, term35921.getClass(), "sectionHeaderFormat", "CFyoseFGLF");
        setBooleanField(term35921, term35921.getClass(), "printSectionSummary", false);
        setField(term35921, term35921.getClass(), "sectionSummaryRowFormat", "SFqCrhEWLm");
        setBooleanField(term35921, term35921.getClass(), "printSectionTrailer", false);
        setField(term35921, term35921.getClass(), "sectionTrailerFormat", "GZdcJyZntS");
        setField(term35921, term35921.getClass(), "durationFormat", enum118);
        setBooleanField(term35921, term35921.getClass(), "printLegend", true);
        setField(term35921, term35921.getClass(), "simpleLine", "OIHoJeysUi");
        setField(term35921, term35921.getClass(), "alternativeLine", "WXMWFDGcLB");
        setField(term35921, term35921.getClass(), "excludedTypes", term36044);
        setField(term35921, term35921.getClass(), "customCounterNames", term36060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowFormat", argTypes, term35921, args);
    }

};


