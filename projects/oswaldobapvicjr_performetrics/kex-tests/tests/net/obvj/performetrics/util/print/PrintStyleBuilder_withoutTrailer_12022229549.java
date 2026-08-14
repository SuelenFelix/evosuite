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

public class PrintStyleBuilder_withoutTrailer_12022229549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57842;

    public PrintStyleBuilder_withoutTrailer_12022229549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57994 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term57993 = ((Class) term57994).getDeclaredField((String) "SUMMARIZED");
        ((Field) term57993).setAccessible(true);
        Object enum194 = ((Field) term57993).get((Object) null);
        Class<? extends Object> term58316 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term58315 = ((Class) term58316).getDeclaredField((String) "FULL");
        ((Field) term58315).setAccessible(true);
        Object enum195 = ((Field) term58315).get((Object) null);
        Class<? extends Object> term58565 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term58564 = ((Class) term58565).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term58564).setAccessible(true);
        Object enum196 =  ((Field) term58564).get((Object) null);
        Class<? extends Object> term58780 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term58779 = ((Class) term58780).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term58779).setAccessible(true);
        Object enum197 =  ((Field) term58779).get((Object) null);
        Class<? extends Object> term59007 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term59006 = ((Class) term59007).getDeclaredField((String) "USER_TIME");
        ((Field) term59006).setAccessible(true);
        Object enum198 =  ((Field) term59006).get((Object) null);
        ArrayList term57966 = new ArrayList();
        ((ArrayList) term57966).add(enum196);
        ((ArrayList) term57966).add(enum196);
        ((ArrayList) term57966).add(enum197);
        ((ArrayList) term57966).add(enum198);
        ((ArrayList) term57966).add(enum196);
        ((ArrayList) term57966).add(enum198);
        ((ArrayList) term57966).add(enum198);
        ((ArrayList) term57966).add(enum198);
        ((ArrayList) term57966).add(enum197);
        HashMap term57982 = new HashMap();
        term57842 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term57842, term57842.getClass(), "printFormat", enum194);
        setBooleanField(term57842, term57842.getClass(), "printHeader", false);
        setField(term57842, term57842.getClass(), "headerFormat", "llRfwANcVF");
        setBooleanField(term57842, term57842.getClass(), "printTrailer", false);
        setField(term57842, term57842.getClass(), "trailerFormat", "sUEeHQTWkA");
        setField(term57842, term57842.getClass(), "rowFormat", "BDIRCxAWLA");
        setField(term57842, term57842.getClass(), "sectionHeaderFormat", "eOJfbiZLnb");
        setBooleanField(term57842, term57842.getClass(), "printSectionSummary", true);
        setField(term57842, term57842.getClass(), "sectionSummaryRowFormat", "nKZKnxWYCK");
        setBooleanField(term57842, term57842.getClass(), "printSectionTrailer", true);
        setField(term57842, term57842.getClass(), "sectionTrailerFormat", "JOqQxuzRuZ");
        setField(term57842, term57842.getClass(), "durationFormat", enum195);
        setBooleanField(term57842, term57842.getClass(), "printLegend", false);
        setField(term57842, term57842.getClass(), "simpleLine", "RSaoipUlsg");
        setField(term57842, term57842.getClass(), "alternativeLine", "cSHGbqKqlN");
        setField(term57842, term57842.getClass(), "excludedTypes", term57966);
        setField(term57842, term57842.getClass(), "customCounterNames", term57982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutTrailer", argTypes, term57842, args);
    }

};


