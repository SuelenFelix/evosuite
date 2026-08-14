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

public class PrintStyleBuilder_withCustomCounterName_143681775422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85539;
     Object enum291;

    public PrintStyleBuilder_withCustomCounterName_143681775422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85705 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term85704 = ((Class) term85705).getDeclaredField((String) "SUMMARIZED");
        ((Field) term85704).setAccessible(true);
        Object enum288 = ((Field) term85704).get((Object) null);
        Class<? extends Object> term86027 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term86026 = ((Class) term86027).getDeclaredField((String) "FULL");
        ((Field) term86026).setAccessible(true);
        Object enum289 = ((Field) term86026).get((Object) null);
        Class<? extends Object> term86276 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86275 = ((Class) term86276).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term86275).setAccessible(true);
        Object enum290 =  ((Field) term86275).get((Object) null);
        Class<? extends Object> term86503 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86502 = ((Class) term86503).getDeclaredField((String) "CPU_TIME");
        ((Field) term86502).setAccessible(true);
        enum291 =  ((Field) term86502).get((Object) null);
        Class<? extends Object> term86709 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86708 = ((Class) term86709).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term86708).setAccessible(true);
        Object enum292 =  ((Field) term86708).get((Object) null);
        Class<? extends Object> term86924 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term86923 = ((Class) term86924).getDeclaredField((String) "USER_TIME");
        ((Field) term86923).setAccessible(true);
        Object enum293 =  ((Field) term86923).get((Object) null);
        ArrayList term85663 = new ArrayList();
        ((ArrayList) term85663).add(enum290);
        ((ArrayList) term85663).add(enum291);
        ((ArrayList) term85663).add(enum291);
        ((ArrayList) term85663).add(enum292);
        ((ArrayList) term85663).add(enum293);
        ((ArrayList) term85663).add(enum290);
        HashMap term85683 = new HashMap();
        term85539 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term85539, term85539.getClass(), "printFormat", enum288);
        setBooleanField(term85539, term85539.getClass(), "printHeader", true);
        setField(term85539, term85539.getClass(), "headerFormat", "EKpdCBubDE");
        setBooleanField(term85539, term85539.getClass(), "printTrailer", false);
        setField(term85539, term85539.getClass(), "trailerFormat", "zMsSLTfGhl");
        setField(term85539, term85539.getClass(), "rowFormat", "bEmHScVZaQ");
        setField(term85539, term85539.getClass(), "sectionHeaderFormat", "TcuXODkzBV");
        setBooleanField(term85539, term85539.getClass(), "printSectionSummary", true);
        setField(term85539, term85539.getClass(), "sectionSummaryRowFormat", "coJPjrBZNe");
        setBooleanField(term85539, term85539.getClass(), "printSectionTrailer", false);
        setField(term85539, term85539.getClass(), "sectionTrailerFormat", "vMsWjuPTnO");
        setField(term85539, term85539.getClass(), "durationFormat", enum289);
        setBooleanField(term85539, term85539.getClass(), "printLegend", false);
        setField(term85539, term85539.getClass(), "simpleLine", "zHvfKaOstO");
        setField(term85539, term85539.getClass(), "alternativeLine", "tOszriqETr");
        setField(term85539, term85539.getClass(), "excludedTypes", term85663);
        setField(term85539, term85539.getClass(), "customCounterNames", term85683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum291;
        args[1] = "jcWKHRWhyj";
        callMethod(klass, "withCustomCounterName", argTypes, term85539, args);
    }

};


