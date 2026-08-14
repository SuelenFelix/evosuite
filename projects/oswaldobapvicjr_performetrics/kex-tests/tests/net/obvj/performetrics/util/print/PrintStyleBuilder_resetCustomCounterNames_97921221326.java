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

public class PrintStyleBuilder_resetCustomCounterNames_97921221326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78596;

    public PrintStyleBuilder_resetCustomCounterNames_97921221326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78744 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term78743 = ((Class) term78744).getDeclaredField((String) "DETAILED");
        ((Field) term78743).setAccessible(true);
        Object enum265 = ((Field) term78743).get((Object) null);
        Class<? extends Object> term79060 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term79059 = ((Class) term79060).getDeclaredField((String) "ISO_8601");
        ((Field) term79059).setAccessible(true);
        Object enum266 = ((Field) term79059).get((Object) null);
        Class<? extends Object> term79321 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term79320 = ((Class) term79321).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term79320).setAccessible(true);
        Object enum267 =  ((Field) term79320).get((Object) null);
        Class<? extends Object> term79548 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term79547 = ((Class) term79548).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term79547).setAccessible(true);
        Object enum268 =  ((Field) term79547).get((Object) null);
        ArrayList term78722 = new ArrayList();
        ((ArrayList) term78722).add(enum267);
        ((ArrayList) term78722).add(enum268);
        HashMap term78734 = new HashMap();
        term78596 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term78596, term78596.getClass(), "printFormat", enum265);
        setBooleanField(term78596, term78596.getClass(), "printHeader", true);
        setField(term78596, term78596.getClass(), "headerFormat", "HknsTajwxJ");
        setBooleanField(term78596, term78596.getClass(), "printTrailer", true);
        setField(term78596, term78596.getClass(), "trailerFormat", "XtiurrVYKw");
        setField(term78596, term78596.getClass(), "rowFormat", "rsumfoDNHa");
        setField(term78596, term78596.getClass(), "sectionHeaderFormat", "ceCWHUTQUM");
        setBooleanField(term78596, term78596.getClass(), "printSectionSummary", false);
        setField(term78596, term78596.getClass(), "sectionSummaryRowFormat", "LrqwfrKKtS");
        setBooleanField(term78596, term78596.getClass(), "printSectionTrailer", false);
        setField(term78596, term78596.getClass(), "sectionTrailerFormat", "ZUdnQXfzCI");
        setField(term78596, term78596.getClass(), "durationFormat", enum266);
        setBooleanField(term78596, term78596.getClass(), "printLegend", false);
        setField(term78596, term78596.getClass(), "simpleLine", "EULDrUNQvw");
        setField(term78596, term78596.getClass(), "alternativeLine", "BtvAvsJSei");
        setField(term78596, term78596.getClass(), "excludedTypes", term78722);
        setField(term78596, term78596.getClass(), "customCounterNames", term78734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetCustomCounterNames", argTypes, term78596, args);
    }

};


