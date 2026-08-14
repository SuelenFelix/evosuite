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

public class PrintStyle_getSectionSummaryRowFormat_85114707918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38864;

    public PrintStyle_getSectionSummaryRowFormat_85114707918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39019 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term39018 = ((Class) term39019).getDeclaredField((String) "SUMMARIZED");
        ((Field) term39018).setAccessible(true);
        Object enum128 = ((Field) term39018).get((Object) null);
        Class<? extends Object> term39341 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term39340 = ((Class) term39341).getDeclaredField((String) "SHORT");
        ((Field) term39340).setAccessible(true);
        Object enum129 = ((Field) term39340).get((Object) null);
        Class<? extends Object> term39593 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term39592 = ((Class) term39593).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term39592).setAccessible(true);
        Object enum130 =  ((Field) term39592).get((Object) null);
        Class<? extends Object> term39820 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term39819 = ((Class) term39820).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term39819).setAccessible(true);
        Object enum131 =  ((Field) term39819).get((Object) null);
        Class<? extends Object> term40035 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term40034 = ((Class) term40035).getDeclaredField((String) "USER_TIME");
        ((Field) term40034).setAccessible(true);
        Object enum132 =  ((Field) term40034).get((Object) null);
        Class<? extends Object> term40244 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term40243 = ((Class) term40244).getDeclaredField((String) "CPU_TIME");
        ((Field) term40243).setAccessible(true);
        Object enum133 =  ((Field) term40243).get((Object) null);
        ArrayList term38989 = new ArrayList();
        ((ArrayList) term38989).add(enum130);
        ((ArrayList) term38989).add(enum131);
        ((ArrayList) term38989).add(enum132);
        ((ArrayList) term38989).add(enum130);
        ((ArrayList) term38989).add(enum132);
        ((ArrayList) term38989).add(enum132);
        ((ArrayList) term38989).add(enum133);
        ((ArrayList) term38989).add(enum133);
        HashMap term39009 = new HashMap();
        term38864 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term38864, term38864.getClass(), "printFormat", enum128);
        setBooleanField(term38864, term38864.getClass(), "printHeader", false);
        setField(term38864, term38864.getClass(), "headerFormat", "mfCpTPPQQm");
        setBooleanField(term38864, term38864.getClass(), "printTrailer", true);
        setField(term38864, term38864.getClass(), "trailerFormat", "OcJCIDNIXA");
        setField(term38864, term38864.getClass(), "rowFormat", "XfRABIFVEp");
        setField(term38864, term38864.getClass(), "sectionHeaderFormat", "MHGKyEnwKc");
        setBooleanField(term38864, term38864.getClass(), "printSectionSummary", false);
        setField(term38864, term38864.getClass(), "sectionSummaryRowFormat", "ShIELyuULw");
        setBooleanField(term38864, term38864.getClass(), "printSectionTrailer", false);
        setField(term38864, term38864.getClass(), "sectionTrailerFormat", "IpQuOGMgmj");
        setField(term38864, term38864.getClass(), "durationFormat", enum129);
        setBooleanField(term38864, term38864.getClass(), "printLegend", false);
        setField(term38864, term38864.getClass(), "simpleLine", "pJbnHTYrxn");
        setField(term38864, term38864.getClass(), "alternativeLine", "iIRsCSYqXH");
        setField(term38864, term38864.getClass(), "excludedTypes", term38989);
        setField(term38864, term38864.getClass(), "customCounterNames", term39009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionSummaryRowFormat", argTypes, term38864, args);
    }

};


