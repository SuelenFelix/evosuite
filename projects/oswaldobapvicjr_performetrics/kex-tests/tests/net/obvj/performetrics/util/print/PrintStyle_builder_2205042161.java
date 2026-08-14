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

public class PrintStyle_builder_2205042161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19556;

    public PrintStyle_builder_2205042161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19861 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term19860 = ((Class) term19861).getDeclaredField((String) "SUMMARIZED");
        ((Field) term19860).setAccessible(true);
        Object enum62 = ((Field) term19860).get((Object) null);
        Class<? extends Object> term20183 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term20182 = ((Class) term20183).getDeclaredField((String) "LINUX");
        ((Field) term20182).setAccessible(true);
        Object enum63 = ((Field) term20182).get((Object) null);
        Class<? extends Object> term20435 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term20434 = ((Class) term20435).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term20434).setAccessible(true);
        Object enum64 =  ((Field) term20434).get((Object) null);
        Class<? extends Object> term20650 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term20649 = ((Class) term20650).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term20649).setAccessible(true);
        Object enum65 =  ((Field) term20649).get((Object) null);
        Class<? extends Object> term20877 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term20876 = ((Class) term20877).getDeclaredField((String) "CPU_TIME");
        ((Field) term20876).setAccessible(true);
        Object enum66 =  ((Field) term20876).get((Object) null);
        ArrayList term19835 = new ArrayList();
        ((ArrayList) term19835).add(enum64);
        ((ArrayList) term19835).add(enum64);
        ((ArrayList) term19835).add(enum65);
        ((ArrayList) term19835).add(enum65);
        ((ArrayList) term19835).add(enum65);
        ((ArrayList) term19835).add(enum66);
        ((ArrayList) term19835).add(enum66);
        HashMap term19851 = new HashMap();
        term19556 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term19556, term19556.getClass(), "printFormat", enum62);
        setBooleanField(term19556, term19556.getClass(), "printHeader", false);
        setField(term19556, term19556.getClass(), "headerFormat", "sEnIVFtZuQ");
        setBooleanField(term19556, term19556.getClass(), "printTrailer", false);
        setField(term19556, term19556.getClass(), "trailerFormat", "ZVecLZMLHF");
        setField(term19556, term19556.getClass(), "rowFormat", "fztQhjqwdP");
        setField(term19556, term19556.getClass(), "sectionHeaderFormat", "eVpkWxjuki");
        setBooleanField(term19556, term19556.getClass(), "printSectionSummary", true);
        setField(term19556, term19556.getClass(), "sectionSummaryRowFormat", "SJiQaLvSKv");
        setBooleanField(term19556, term19556.getClass(), "printSectionTrailer", false);
        setField(term19556, term19556.getClass(), "sectionTrailerFormat", "OEXDRUKcFl");
        setField(term19556, term19556.getClass(), "durationFormat", enum63);
        setBooleanField(term19556, term19556.getClass(), "printLegend", false);
        setField(term19556, term19556.getClass(), "simpleLine", "RYdKCNNMBR");
        setField(term19556, term19556.getClass(), "alternativeLine", "yGtHPyvYiQ");
        setField(term19556, term19556.getClass(), "excludedTypes", term19835);
        setField(term19556, term19556.getClass(), "customCounterNames", term19851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term19556;
        callMethod(klass, "builder", argTypes, null, args);
    }

};


