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

public class PrintFormat_2_toTotalRowFormat_3637473373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum12;
     Object term3718;
     Object term3724;

    public PrintFormat_2_toTotalRowFormat_3637473373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3878 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term3877 = ((Class) term3878).getDeclaredField((String) "DETAILED");
        ((Field) term3877).setAccessible(true);
        enum12 = ((Field) term3877).get((Object) null);
        term3718 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term3719 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term3719, term3719.getClass(), "seconds", 198000L);
        setIntField(term3719, term3719.getClass(), "nanos", 0);
        setField(term3718, term3718.getClass(), "internalDuration", term3719);
        setLongField(term3718, term3718.getClass(), "effectiveTotalSeconds", -8257434502486459194L);
        setIntField(term3718, term3718.getClass(), "effectiveNanoseconds", -2038273078);
        Class<? extends Object> term4134 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term4133 = ((Class) term4134).getDeclaredField((String) "SUMMARIZED");
        ((Field) term4133).setAccessible(true);
        Object enum13 = ((Field) term4133).get((Object) null);
        Class<? extends Object> term4456 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term4455 = ((Class) term4456).getDeclaredField((String) "FULL");
        ((Field) term4455).setAccessible(true);
        Object enum14 = ((Field) term4455).get((Object) null);
        Class<? extends Object> term4705 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term4704 = ((Class) term4705).getDeclaredField((String) "CPU_TIME");
        ((Field) term4704).setAccessible(true);
        Object enum15 =  ((Field) term4704).get((Object) null);
        Class<? extends Object> term4911 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term4910 = ((Class) term4911).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term4910).setAccessible(true);
        Object enum16 =  ((Field) term4910).get((Object) null);
        Class<? extends Object> term5126 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term5125 = ((Class) term5126).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term5125).setAccessible(true);
        Object enum17 =  ((Field) term5125).get((Object) null);
        Class<? extends Object> term5353 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term5352 = ((Class) term5353).getDeclaredField((String) "USER_TIME");
        ((Field) term5352).setAccessible(true);
        Object enum18 =  ((Field) term5352).get((Object) null);
        ArrayList term3848 = new ArrayList();
        ((ArrayList) term3848).add(enum15);
        ((ArrayList) term3848).add(enum16);
        ((ArrayList) term3848).add(enum15);
        ((ArrayList) term3848).add(enum17);
        ((ArrayList) term3848).add(enum18);
        ((ArrayList) term3848).add(enum18);
        ((ArrayList) term3848).add(enum15);
        ((ArrayList) term3848).add(enum17);
        ((ArrayList) term3848).add(enum16);
        HashMap term3868 = new HashMap();
        term3724 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term3724, term3724.getClass(), "printFormat", enum13);
        setBooleanField(term3724, term3724.getClass(), "printHeader", false);
        setField(term3724, term3724.getClass(), "headerFormat", "xOEqzGAmDU");
        setBooleanField(term3724, term3724.getClass(), "printTrailer", true);
        setField(term3724, term3724.getClass(), "trailerFormat", "eZFUvlxvGV");
        setField(term3724, term3724.getClass(), "rowFormat", "BYqFIqCKAV");
        setField(term3724, term3724.getClass(), "sectionHeaderFormat", "vrQLuWIDJX");
        setBooleanField(term3724, term3724.getClass(), "printSectionSummary", false);
        setField(term3724, term3724.getClass(), "sectionSummaryRowFormat", "flxyYxBRtu");
        setBooleanField(term3724, term3724.getClass(), "printSectionTrailer", true);
        setField(term3724, term3724.getClass(), "sectionTrailerFormat", "OclPbYPkcH");
        setField(term3724, term3724.getClass(), "durationFormat", enum14);
        setBooleanField(term3724, term3724.getClass(), "printLegend", false);
        setField(term3724, term3724.getClass(), "simpleLine", "IoAlmYsBwc");
        setField(term3724, term3724.getClass(), "alternativeLine", "TEParAifyi");
        setField(term3724, term3724.getClass(), "excludedTypes", term3848);
        setField(term3724, term3724.getClass(), "customCounterNames", term3868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[2];
        args[0] = term3718;
        args[1] = term3724;
        callMethod(klass, "toTotalRowFormat", argTypes, enum12, args);
    }

};


