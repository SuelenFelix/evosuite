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

public class PrintStyleBuilder_withoutSectionTrailer_9448682711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71976;

    public PrintStyleBuilder_withoutSectionTrailer_9448682711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72131 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term72130 = ((Class) term72131).getDeclaredField((String) "DETAILED");
        ((Field) term72130).setAccessible(true);
        Object enum242 = ((Field) term72130).get((Object) null);
        Class<? extends Object> term72447 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term72446 = ((Class) term72447).getDeclaredField((String) "SHORTER");
        ((Field) term72446).setAccessible(true);
        Object enum243 = ((Field) term72446).get((Object) null);
        Class<? extends Object> term72705 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term72704 = ((Class) term72705).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term72704).setAccessible(true);
        Object enum244 =  ((Field) term72704).get((Object) null);
        Class<? extends Object> term72920 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term72919 = ((Class) term72920).getDeclaredField((String) "USER_TIME");
        ((Field) term72919).setAccessible(true);
        Object enum245 =  ((Field) term72919).get((Object) null);
        Class<? extends Object> term73129 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term73128 = ((Class) term73129).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term73128).setAccessible(true);
        Object enum246 =  ((Field) term73128).get((Object) null);
        Class<? extends Object> term73356 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term73355 = ((Class) term73356).getDeclaredField((String) "CPU_TIME");
        ((Field) term73355).setAccessible(true);
        Object enum247 =  ((Field) term73355).get((Object) null);
        ArrayList term72101 = new ArrayList();
        ((ArrayList) term72101).add(enum244);
        ((ArrayList) term72101).add(enum245);
        ((ArrayList) term72101).add(enum245);
        ((ArrayList) term72101).add(enum245);
        ((ArrayList) term72101).add(enum246);
        ((ArrayList) term72101).add(enum247);
        ((ArrayList) term72101).add(enum244);
        ((ArrayList) term72101).add(enum246);
        HashMap term72121 = new HashMap();
        term71976 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term71976, term71976.getClass(), "printFormat", enum242);
        setBooleanField(term71976, term71976.getClass(), "printHeader", false);
        setField(term71976, term71976.getClass(), "headerFormat", "SqjyKmayBx");
        setBooleanField(term71976, term71976.getClass(), "printTrailer", false);
        setField(term71976, term71976.getClass(), "trailerFormat", "XjDhvToxJy");
        setField(term71976, term71976.getClass(), "rowFormat", "nxSTJflLQy");
        setField(term71976, term71976.getClass(), "sectionHeaderFormat", "FlHzxEfFzI");
        setBooleanField(term71976, term71976.getClass(), "printSectionSummary", false);
        setField(term71976, term71976.getClass(), "sectionSummaryRowFormat", "aSATgQUpoe");
        setBooleanField(term71976, term71976.getClass(), "printSectionTrailer", false);
        setField(term71976, term71976.getClass(), "sectionTrailerFormat", "VkPSXewZfB");
        setField(term71976, term71976.getClass(), "durationFormat", enum243);
        setBooleanField(term71976, term71976.getClass(), "printLegend", false);
        setField(term71976, term71976.getClass(), "simpleLine", "ubodzJoMGW");
        setField(term71976, term71976.getClass(), "alternativeLine", "weddIktxOA");
        setField(term71976, term71976.getClass(), "excludedTypes", term72101);
        setField(term71976, term71976.getClass(), "customCounterNames", term72121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutSectionTrailer", argTypes, term71976, args);
    }

};


