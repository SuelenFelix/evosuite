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

public class PrintStyleBuilder_withSimpleLine_83332151513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74947;
     Object term75102;
     Object term75104;

    public PrintStyleBuilder_withSimpleLine_83332151513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75107 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term75106 = ((Class) term75107).getDeclaredField((String) "DETAILED");
        ((Field) term75106).setAccessible(true);
        Object enum253 = ((Field) term75106).get((Object) null);
        Class<? extends Object> term75423 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term75422 = ((Class) term75423).getDeclaredField((String) "ISO_8601");
        ((Field) term75422).setAccessible(true);
        Object enum254 = ((Field) term75422).get((Object) null);
        Class<? extends Object> term75684 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term75683 = ((Class) term75684).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term75683).setAccessible(true);
        Object enum255 =  ((Field) term75683).get((Object) null);
        Class<? extends Object> term75911 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term75910 = ((Class) term75911).getDeclaredField((String) "CPU_TIME");
        ((Field) term75910).setAccessible(true);
        Object enum256 =  ((Field) term75910).get((Object) null);
        Class<? extends Object> term76117 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term76116 = ((Class) term76117).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term76116).setAccessible(true);
        Object enum257 =  ((Field) term76116).get((Object) null);
        Class<? extends Object> term76332 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term76331 = ((Class) term76332).getDeclaredField((String) "USER_TIME");
        ((Field) term76331).setAccessible(true);
        Object enum258 =  ((Field) term76331).get((Object) null);
        ArrayList term75073 = new ArrayList();
        ((ArrayList) term75073).add(enum255);
        ((ArrayList) term75073).add(enum256);
        ((ArrayList) term75073).add(enum256);
        ((ArrayList) term75073).add(enum257);
        ((ArrayList) term75073).add(enum258);
        ((ArrayList) term75073).add(enum257);
        ((ArrayList) term75073).add(enum255);
        HashMap term75093 = new HashMap();
        term74947 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term74947, term74947.getClass(), "printFormat", enum253);
        setBooleanField(term74947, term74947.getClass(), "printHeader", true);
        setField(term74947, term74947.getClass(), "headerFormat", "VUkRVwROTl");
        setBooleanField(term74947, term74947.getClass(), "printTrailer", false);
        setField(term74947, term74947.getClass(), "trailerFormat", "UDlkdccCRn");
        setField(term74947, term74947.getClass(), "rowFormat", "McpzErOcYb");
        setField(term74947, term74947.getClass(), "sectionHeaderFormat", "jqrVEUvYEz");
        setBooleanField(term74947, term74947.getClass(), "printSectionSummary", true);
        setField(term74947, term74947.getClass(), "sectionSummaryRowFormat", "QITgiBrmfj");
        setBooleanField(term74947, term74947.getClass(), "printSectionTrailer", false);
        setField(term74947, term74947.getClass(), "sectionTrailerFormat", "pXxkiXgQnq");
        setField(term74947, term74947.getClass(), "durationFormat", enum254);
        setBooleanField(term74947, term74947.getClass(), "printLegend", false);
        setField(term74947, term74947.getClass(), "simpleLine", "tKmrUDURku");
        setField(term74947, term74947.getClass(), "alternativeLine", "JeZbrwZmsP");
        setField(term74947, term74947.getClass(), "excludedTypes", term75073);
        setField(term74947, term74947.getClass(), "customCounterNames", term75093);
        term75102 = new Character('G');
        term75104 = new Integer(-1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term75102;
        args[1] = term75104;
        callMethod(klass, "withSimpleLine", argTypes, term74947, args);
    }

};


