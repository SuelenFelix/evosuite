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

public class PrintStyleBuilder_withCustomCounterName_143681775425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76835;
     Object enum261;

    public PrintStyleBuilder_withCustomCounterName_143681775425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77156 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term77155 = ((Class) term77156).getDeclaredField((String) "SUMMARIZED");
        ((Field) term77155).setAccessible(true);
        Object enum259 = ((Field) term77155).get((Object) null);
        Class<? extends Object> term77478 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term77477 = ((Class) term77478).getDeclaredField((String) "LINUX");
        ((Field) term77477).setAccessible(true);
        Object enum260 = ((Field) term77477).get((Object) null);
        Class<? extends Object> term77730 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term77729 = ((Class) term77730).getDeclaredField((String) "USER_TIME");
        ((Field) term77729).setAccessible(true);
        enum261 =  ((Field) term77729).get((Object) null);
        Class<? extends Object> term77939 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term77938 = ((Class) term77939).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term77938).setAccessible(true);
        Object enum262 =  ((Field) term77938).get((Object) null);
        Class<? extends Object> term78166 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term78165 = ((Class) term78166).getDeclaredField((String) "CPU_TIME");
        ((Field) term78165).setAccessible(true);
        Object enum263 =  ((Field) term78165).get((Object) null);
        Class<? extends Object> term78372 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term78371 = ((Class) term78372).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term78371).setAccessible(true);
        Object enum264 =  ((Field) term78371).get((Object) null);
        ArrayList term77114 = new ArrayList();
        ((ArrayList) term77114).add(enum261);
        ((ArrayList) term77114).add(enum262);
        ((ArrayList) term77114).add(enum261);
        ((ArrayList) term77114).add(enum263);
        ((ArrayList) term77114).add(enum264);
        ((ArrayList) term77114).add(enum263);
        HashMap term77134 = new HashMap();
        term76835 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term76835, term76835.getClass(), "printFormat", enum259);
        setBooleanField(term76835, term76835.getClass(), "printHeader", true);
        setField(term76835, term76835.getClass(), "headerFormat", "DAujxZPHJC");
        setBooleanField(term76835, term76835.getClass(), "printTrailer", true);
        setField(term76835, term76835.getClass(), "trailerFormat", "IlBhdrCvHq");
        setField(term76835, term76835.getClass(), "rowFormat", "OirVUQhauU");
        setField(term76835, term76835.getClass(), "sectionHeaderFormat", "GLbyDfbNZI");
        setBooleanField(term76835, term76835.getClass(), "printSectionSummary", false);
        setField(term76835, term76835.getClass(), "sectionSummaryRowFormat", "oNLcCYDAsO");
        setBooleanField(term76835, term76835.getClass(), "printSectionTrailer", false);
        setField(term76835, term76835.getClass(), "sectionTrailerFormat", "CNqMxLvtcJ");
        setField(term76835, term76835.getClass(), "durationFormat", enum260);
        setBooleanField(term76835, term76835.getClass(), "printLegend", false);
        setField(term76835, term76835.getClass(), "simpleLine", "ktbqerIaKW");
        setField(term76835, term76835.getClass(), "alternativeLine", "VoghngXfsK");
        setField(term76835, term76835.getClass(), "excludedTypes", term77114);
        setField(term76835, term76835.getClass(), "customCounterNames", term77134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum261;
        args[1] = "iiHBhsNFgk";
        callMethod(klass, "withCustomCounterName", argTypes, term76835, args);
    }

};


