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

public class PrintStyleBuilder_getDurationFormat_208788446829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82508;

    public PrintStyleBuilder_getDurationFormat_208788446829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82661 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term82660 = ((Class) term82661).getDeclaredField((String) "SUMMARIZED");
        ((Field) term82660).setAccessible(true);
        Object enum279 = ((Field) term82660).get((Object) null);
        Class<? extends Object> term82983 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term82982 = ((Class) term82983).getDeclaredField((String) "SHORTER");
        ((Field) term82982).setAccessible(true);
        Object enum280 = ((Field) term82982).get((Object) null);
        Class<? extends Object> term83241 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term83240 = ((Class) term83241).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term83240).setAccessible(true);
        Object enum281 =  ((Field) term83240).get((Object) null);
        Class<? extends Object> term83456 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term83455 = ((Class) term83456).getDeclaredField((String) "CPU_TIME");
        ((Field) term83455).setAccessible(true);
        Object enum282 =  ((Field) term83455).get((Object) null);
        Class<? extends Object> term83662 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term83661 = ((Class) term83662).getDeclaredField((String) "USER_TIME");
        ((Field) term83661).setAccessible(true);
        Object enum283 =  ((Field) term83661).get((Object) null);
        ArrayList term82635 = new ArrayList();
        ((ArrayList) term82635).add(enum281);
        ((ArrayList) term82635).add(enum282);
        ((ArrayList) term82635).add(enum283);
        HashMap term82651 = new HashMap();
        term82508 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term82508, term82508.getClass(), "printFormat", enum279);
        setBooleanField(term82508, term82508.getClass(), "printHeader", true);
        setField(term82508, term82508.getClass(), "headerFormat", "EKpdCBubDE");
        setBooleanField(term82508, term82508.getClass(), "printTrailer", true);
        setField(term82508, term82508.getClass(), "trailerFormat", "zMsSLTfGhl");
        setField(term82508, term82508.getClass(), "rowFormat", "bEmHScVZaQ");
        setField(term82508, term82508.getClass(), "sectionHeaderFormat", "TcuXODkzBV");
        setBooleanField(term82508, term82508.getClass(), "printSectionSummary", true);
        setField(term82508, term82508.getClass(), "sectionSummaryRowFormat", "coJPjrBZNe");
        setBooleanField(term82508, term82508.getClass(), "printSectionTrailer", true);
        setField(term82508, term82508.getClass(), "sectionTrailerFormat", "vMsWjuPTnO");
        setField(term82508, term82508.getClass(), "durationFormat", enum280);
        setBooleanField(term82508, term82508.getClass(), "printLegend", false);
        setField(term82508, term82508.getClass(), "simpleLine", "zHvfKaOstO");
        setField(term82508, term82508.getClass(), "alternativeLine", "tOszriqETr");
        setField(term82508, term82508.getClass(), "excludedTypes", term82635);
        setField(term82508, term82508.getClass(), "customCounterNames", term82651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDurationFormat", argTypes, term82508, args);
    }

};


