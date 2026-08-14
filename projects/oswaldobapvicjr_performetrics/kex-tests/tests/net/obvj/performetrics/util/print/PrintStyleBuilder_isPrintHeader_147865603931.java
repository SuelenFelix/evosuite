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

public class PrintStyleBuilder_isPrintHeader_147865603931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85009;

    public PrintStyleBuilder_isPrintHeader_147865603931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85162 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term85161 = ((Class) term85162).getDeclaredField((String) "DETAILED");
        ((Field) term85161).setAccessible(true);
        Object enum288 = ((Field) term85161).get((Object) null);
        Class<? extends Object> term85478 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term85477 = ((Class) term85478).getDeclaredField((String) "SHORT");
        ((Field) term85477).setAccessible(true);
        Object enum289 = ((Field) term85477).get((Object) null);
        Class<? extends Object> term85730 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term85729 = ((Class) term85730).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term85729).setAccessible(true);
        Object enum290 =  ((Field) term85729).get((Object) null);
        Class<? extends Object> term85957 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term85956 = ((Class) term85957).getDeclaredField((String) "USER_TIME");
        ((Field) term85956).setAccessible(true);
        Object enum291 =  ((Field) term85956).get((Object) null);
        Class<? extends Object> term86166 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86165 = ((Class) term86166).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term86165).setAccessible(true);
        Object enum292 =  ((Field) term86165).get((Object) null);
        Class<? extends Object> term86381 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86380 = ((Class) term86381).getDeclaredField((String) "CPU_TIME");
        ((Field) term86380).setAccessible(true);
        Object enum293 =  ((Field) term86380).get((Object) null);
        ArrayList term85132 = new ArrayList();
        ((ArrayList) term85132).add(enum290);
        ((ArrayList) term85132).add(enum290);
        ((ArrayList) term85132).add(enum291);
        ((ArrayList) term85132).add(enum292);
        ((ArrayList) term85132).add(enum293);
        ((ArrayList) term85132).add(enum291);
        HashMap term85152 = new HashMap();
        term85009 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term85009, term85009.getClass(), "printFormat", enum288);
        setBooleanField(term85009, term85009.getClass(), "printHeader", true);
        setField(term85009, term85009.getClass(), "headerFormat", "DAxyHoTLzZ");
        setBooleanField(term85009, term85009.getClass(), "printTrailer", false);
        setField(term85009, term85009.getClass(), "trailerFormat", "fhZgTouhCC");
        setField(term85009, term85009.getClass(), "rowFormat", "wrikqJwXvL");
        setField(term85009, term85009.getClass(), "sectionHeaderFormat", "UiWhvbypdr");
        setBooleanField(term85009, term85009.getClass(), "printSectionSummary", true);
        setField(term85009, term85009.getClass(), "sectionSummaryRowFormat", "CgleElJNje");
        setBooleanField(term85009, term85009.getClass(), "printSectionTrailer", true);
        setField(term85009, term85009.getClass(), "sectionTrailerFormat", "ZrchvNGMtd");
        setField(term85009, term85009.getClass(), "durationFormat", enum289);
        setBooleanField(term85009, term85009.getClass(), "printLegend", false);
        setField(term85009, term85009.getClass(), "simpleLine", "WaEcyVlcIx");
        setField(term85009, term85009.getClass(), "alternativeLine", "ONcbPCQnHd");
        setField(term85009, term85009.getClass(), "excludedTypes", term85132);
        setField(term85009, term85009.getClass(), "customCounterNames", term85152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintHeader", argTypes, term85009, args);
    }

};


