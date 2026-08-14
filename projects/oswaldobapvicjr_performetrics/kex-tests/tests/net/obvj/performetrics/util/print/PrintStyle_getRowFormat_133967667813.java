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

public class PrintStyle_getRowFormat_133967667813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85122;

    public PrintStyle_getRowFormat_133967667813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85277 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term85276 = ((Class) term85277).getDeclaredField((String) "SUMMARIZED");
        ((Field) term85276).setAccessible(true);
        Object enum286 = ((Field) term85276).get((Object) null);
        Class<? extends Object> term85599 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term85598 = ((Class) term85599).getDeclaredField((String) "SHORT");
        ((Field) term85598).setAccessible(true);
        Object enum287 = ((Field) term85598).get((Object) null);
        Class<? extends Object> term85851 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term85850 = ((Class) term85851).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term85850).setAccessible(true);
        Object enum288 =  ((Field) term85850).get((Object) null);
        Class<? extends Object> term86078 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86077 = ((Class) term86078).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term86077).setAccessible(true);
        Object enum289 =  ((Field) term86077).get((Object) null);
        Class<? extends Object> term86293 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86292 = ((Class) term86293).getDeclaredField((String) "USER_TIME");
        ((Field) term86292).setAccessible(true);
        Object enum290 =  ((Field) term86292).get((Object) null);
        Class<? extends Object> term86502 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86501 = ((Class) term86502).getDeclaredField((String) "CPU_TIME");
        ((Field) term86501).setAccessible(true);
        Object enum291 =  ((Field) term86501).get((Object) null);
        ArrayList term85247 = new ArrayList();
        ((ArrayList) term85247).add(enum288);
        ((ArrayList) term85247).add(enum288);
        ((ArrayList) term85247).add(enum289);
        ((ArrayList) term85247).add(enum290);
        ((ArrayList) term85247).add(enum288);
        ((ArrayList) term85247).add(enum290);
        ((ArrayList) term85247).add(enum290);
        ((ArrayList) term85247).add(enum291);
        HashMap term85267 = new HashMap();
        term85122 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term85122, term85122.getClass(), "printFormat", enum286);
        setBooleanField(term85122, term85122.getClass(), "printHeader", false);
        setField(term85122, term85122.getClass(), "headerFormat", "EdPAvpluZg");
        setBooleanField(term85122, term85122.getClass(), "printTrailer", true);
        setField(term85122, term85122.getClass(), "trailerFormat", "DzHVBMqWtE");
        setField(term85122, term85122.getClass(), "rowFormat", "THZSpzBRYP");
        setField(term85122, term85122.getClass(), "sectionHeaderFormat", "ZfBIVGBQOE");
        setBooleanField(term85122, term85122.getClass(), "printSectionSummary", true);
        setField(term85122, term85122.getClass(), "sectionSummaryRowFormat", "QSrDQfEsTR");
        setBooleanField(term85122, term85122.getClass(), "printSectionTrailer", false);
        setField(term85122, term85122.getClass(), "sectionTrailerFormat", "PsqusYmejD");
        setField(term85122, term85122.getClass(), "durationFormat", enum287);
        setBooleanField(term85122, term85122.getClass(), "printLegend", true);
        setField(term85122, term85122.getClass(), "simpleLine", "NTWMiBEaDF");
        setField(term85122, term85122.getClass(), "alternativeLine", "SPBstwKFVr");
        setField(term85122, term85122.getClass(), "excludedTypes", term85247);
        setField(term85122, term85122.getClass(), "customCounterNames", term85267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowFormat", argTypes, term85122, args);
    }

};


