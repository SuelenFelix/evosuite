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
import java.lang.Character;
import java.lang.Integer;

public class PrintStyleBuilder_withAlternativeLine_138319056618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68332;
     Object term68477;
     Object term68479;

    public PrintStyleBuilder_withAlternativeLine_138319056618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68482 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term68481 = ((Class) term68482).getDeclaredField((String) "DETAILED");
        ((Field) term68481).setAccessible(true);
        Object enum230 = ((Field) term68481).get((Object) null);
        Class<? extends Object> term68798 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term68797 = ((Class) term68798).getDeclaredField((String) "ISO_8601");
        ((Field) term68797).setAccessible(true);
        Object enum231 = ((Field) term68797).get((Object) null);
        Class<? extends Object> term69059 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term69058 = ((Class) term69059).getDeclaredField((String) "CPU_TIME");
        ((Field) term69058).setAccessible(true);
        Object enum232 =  ((Field) term69058).get((Object) null);
        ArrayList term68458 = new ArrayList();
        ((ArrayList) term68458).add(enum232);
        HashMap term68466 = new HashMap();
        term68332 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term68332, term68332.getClass(), "printFormat", enum230);
        setBooleanField(term68332, term68332.getClass(), "printHeader", true);
        setField(term68332, term68332.getClass(), "headerFormat", "XjDhvToxJy");
        setBooleanField(term68332, term68332.getClass(), "printTrailer", true);
        setField(term68332, term68332.getClass(), "trailerFormat", "nxSTJflLQy");
        setField(term68332, term68332.getClass(), "rowFormat", "FlHzxEfFzI");
        setField(term68332, term68332.getClass(), "sectionHeaderFormat", "aSATgQUpoe");
        setBooleanField(term68332, term68332.getClass(), "printSectionSummary", true);
        setField(term68332, term68332.getClass(), "sectionSummaryRowFormat", "VkPSXewZfB");
        setBooleanField(term68332, term68332.getClass(), "printSectionTrailer", false);
        setField(term68332, term68332.getClass(), "sectionTrailerFormat", "ubodzJoMGW");
        setField(term68332, term68332.getClass(), "durationFormat", enum231);
        setBooleanField(term68332, term68332.getClass(), "printLegend", true);
        setField(term68332, term68332.getClass(), "simpleLine", "weddIktxOA");
        setField(term68332, term68332.getClass(), "alternativeLine", "uSlMeISsDD");
        setField(term68332, term68332.getClass(), "excludedTypes", term68458);
        setField(term68332, term68332.getClass(), "customCounterNames", term68466);
        term68477 = new Character('G');
        term68479 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term68477;
        args[1] = term68479;
        callMethod(klass, "withAlternativeLine", argTypes, term68332, args);
    }

};


