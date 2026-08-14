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

public class PrintStyleBuilder_getSimpleLine_32654322238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107254;

    public PrintStyleBuilder_getSimpleLine_32654322238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107405 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term107404 = ((Class) term107405).getDeclaredField((String) "SUMMARIZED");
        ((Field) term107404).setAccessible(true);
        Object enum365 = ((Field) term107404).get((Object) null);
        Class<? extends Object> term107727 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term107726 = ((Class) term107727).getDeclaredField((String) "SHORT");
        ((Field) term107726).setAccessible(true);
        Object enum366 = ((Field) term107726).get((Object) null);
        Class<? extends Object> term107979 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term107978 = ((Class) term107979).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term107978).setAccessible(true);
        Object enum367 =  ((Field) term107978).get((Object) null);
        Class<? extends Object> term108194 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term108193 = ((Class) term108194).getDeclaredField((String) "CPU_TIME");
        ((Field) term108193).setAccessible(true);
        Object enum368 =  ((Field) term108193).get((Object) null);
        Class<? extends Object> term108400 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term108399 = ((Class) term108400).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term108399).setAccessible(true);
        Object enum369 =  ((Field) term108399).get((Object) null);
        ArrayList term107379 = new ArrayList();
        ((ArrayList) term107379).add(enum367);
        ((ArrayList) term107379).add(enum368);
        ((ArrayList) term107379).add(enum368);
        ((ArrayList) term107379).add(enum367);
        ((ArrayList) term107379).add(enum368);
        ((ArrayList) term107379).add(enum369);
        ((ArrayList) term107379).add(enum369);
        HashMap term107395 = new HashMap();
        term107254 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term107254, term107254.getClass(), "printFormat", enum365);
        setBooleanField(term107254, term107254.getClass(), "printHeader", false);
        setField(term107254, term107254.getClass(), "headerFormat", "TVxGTjeDcu");
        setBooleanField(term107254, term107254.getClass(), "printTrailer", false);
        setField(term107254, term107254.getClass(), "trailerFormat", "ABPtcyCzkR");
        setField(term107254, term107254.getClass(), "rowFormat", "QgHhxMyKvr");
        setField(term107254, term107254.getClass(), "sectionHeaderFormat", "VGiXZZTWRO");
        setBooleanField(term107254, term107254.getClass(), "printSectionSummary", true);
        setField(term107254, term107254.getClass(), "sectionSummaryRowFormat", "MlPtwXnJOJ");
        setBooleanField(term107254, term107254.getClass(), "printSectionTrailer", false);
        setField(term107254, term107254.getClass(), "sectionTrailerFormat", "DbfiyFeaTe");
        setField(term107254, term107254.getClass(), "durationFormat", enum366);
        setBooleanField(term107254, term107254.getClass(), "printLegend", false);
        setField(term107254, term107254.getClass(), "simpleLine", "dQxXGBtDLZ");
        setField(term107254, term107254.getClass(), "alternativeLine", "EgSgEFIyyN");
        setField(term107254, term107254.getClass(), "excludedTypes", term107379);
        setField(term107254, term107254.getClass(), "customCounterNames", term107395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSimpleLine", argTypes, term107254, args);
    }

};


