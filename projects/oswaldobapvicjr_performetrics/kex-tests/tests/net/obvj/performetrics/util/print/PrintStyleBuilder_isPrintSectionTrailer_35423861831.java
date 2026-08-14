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

public class PrintStyleBuilder_isPrintSectionTrailer_35423861831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97848;

    public PrintStyleBuilder_isPrintSectionTrailer_35423861831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98157 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term98156 = ((Class) term98157).getDeclaredField((String) "SUMMARIZED");
        ((Field) term98156).setAccessible(true);
        Object enum332 = ((Field) term98156).get((Object) null);
        Class<? extends Object> term98479 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term98478 = ((Class) term98479).getDeclaredField((String) "LINUX");
        ((Field) term98478).setAccessible(true);
        Object enum333 = ((Field) term98478).get((Object) null);
        Class<? extends Object> term98731 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term98730 = ((Class) term98731).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term98730).setAccessible(true);
        Object enum334 =  ((Field) term98730).get((Object) null);
        Class<? extends Object> term98958 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term98957 = ((Class) term98958).getDeclaredField((String) "USER_TIME");
        ((Field) term98957).setAccessible(true);
        Object enum335 =  ((Field) term98957).get((Object) null);
        Class<? extends Object> term99167 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term99166 = ((Class) term99167).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term99166).setAccessible(true);
        Object enum336 =  ((Field) term99166).get((Object) null);
        Class<? extends Object> term99382 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term99381 = ((Class) term99382).getDeclaredField((String) "CPU_TIME");
        ((Field) term99381).setAccessible(true);
        Object enum337 =  ((Field) term99381).get((Object) null);
        ArrayList term98127 = new ArrayList();
        ((ArrayList) term98127).add(enum334);
        ((ArrayList) term98127).add(enum335);
        ((ArrayList) term98127).add(enum336);
        ((ArrayList) term98127).add(enum337);
        ((ArrayList) term98127).add(enum335);
        HashMap term98147 = new HashMap();
        term97848 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term97848, term97848.getClass(), "printFormat", enum332);
        setBooleanField(term97848, term97848.getClass(), "printHeader", true);
        setField(term97848, term97848.getClass(), "headerFormat", "wgRGBNrTGP");
        setBooleanField(term97848, term97848.getClass(), "printTrailer", false);
        setField(term97848, term97848.getClass(), "trailerFormat", "FIdNVptZpW");
        setField(term97848, term97848.getClass(), "rowFormat", "rQjxAhisjm");
        setField(term97848, term97848.getClass(), "sectionHeaderFormat", "ZDhASPHjDG");
        setBooleanField(term97848, term97848.getClass(), "printSectionSummary", true);
        setField(term97848, term97848.getClass(), "sectionSummaryRowFormat", "HNVOAXYNEZ");
        setBooleanField(term97848, term97848.getClass(), "printSectionTrailer", false);
        setField(term97848, term97848.getClass(), "sectionTrailerFormat", "gbbYBYyfvr");
        setField(term97848, term97848.getClass(), "durationFormat", enum333);
        setBooleanField(term97848, term97848.getClass(), "printLegend", true);
        setField(term97848, term97848.getClass(), "simpleLine", "SrWMUlbtWV");
        setField(term97848, term97848.getClass(), "alternativeLine", "VePIumgrrU");
        setField(term97848, term97848.getClass(), "excludedTypes", term98127);
        setField(term97848, term97848.getClass(), "customCounterNames", term98147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term97848, args);
    }

};


