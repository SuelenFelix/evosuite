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

public class PrintStyleBuilder_getSectionTrailerFormat_17163656737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105661;

    public PrintStyleBuilder_getSectionTrailerFormat_17163656737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105818 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term105817 = ((Class) term105818).getDeclaredField((String) "SUMMARIZED");
        ((Field) term105817).setAccessible(true);
        Object enum359 = ((Field) term105817).get((Object) null);
        Class<? extends Object> term106140 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term106139 = ((Class) term106140).getDeclaredField((String) "SHORTER");
        ((Field) term106139).setAccessible(true);
        Object enum360 = ((Field) term106139).get((Object) null);
        Class<? extends Object> term106398 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106397 = ((Class) term106398).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term106397).setAccessible(true);
        Object enum361 =  ((Field) term106397).get((Object) null);
        Class<? extends Object> term106625 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106624 = ((Class) term106625).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term106624).setAccessible(true);
        Object enum362 =  ((Field) term106624).get((Object) null);
        Class<? extends Object> term106840 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term106839 = ((Class) term106840).getDeclaredField((String) "CPU_TIME");
        ((Field) term106839).setAccessible(true);
        Object enum363 =  ((Field) term106839).get((Object) null);
        Class<? extends Object> term107046 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term107045 = ((Class) term107046).getDeclaredField((String) "USER_TIME");
        ((Field) term107045).setAccessible(true);
        Object enum364 =  ((Field) term107045).get((Object) null);
        ArrayList term105788 = new ArrayList();
        ((ArrayList) term105788).add(enum361);
        ((ArrayList) term105788).add(enum362);
        ((ArrayList) term105788).add(enum363);
        ((ArrayList) term105788).add(enum363);
        ((ArrayList) term105788).add(enum364);
        ((ArrayList) term105788).add(enum364);
        ((ArrayList) term105788).add(enum362);
        ((ArrayList) term105788).add(enum361);
        ((ArrayList) term105788).add(enum362);
        HashMap term105808 = new HashMap();
        term105661 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term105661, term105661.getClass(), "printFormat", enum359);
        setBooleanField(term105661, term105661.getClass(), "printHeader", true);
        setField(term105661, term105661.getClass(), "headerFormat", "IOddzvEWcl");
        setBooleanField(term105661, term105661.getClass(), "printTrailer", false);
        setField(term105661, term105661.getClass(), "trailerFormat", "bIrtpkYJWT");
        setField(term105661, term105661.getClass(), "rowFormat", "VuLLXpvPpZ");
        setField(term105661, term105661.getClass(), "sectionHeaderFormat", "UEdzEKEEEV");
        setBooleanField(term105661, term105661.getClass(), "printSectionSummary", true);
        setField(term105661, term105661.getClass(), "sectionSummaryRowFormat", "BcENaQFYSd");
        setBooleanField(term105661, term105661.getClass(), "printSectionTrailer", true);
        setField(term105661, term105661.getClass(), "sectionTrailerFormat", "POPYycoDBy");
        setField(term105661, term105661.getClass(), "durationFormat", enum360);
        setBooleanField(term105661, term105661.getClass(), "printLegend", true);
        setField(term105661, term105661.getClass(), "simpleLine", "LuWMOXdAPA");
        setField(term105661, term105661.getClass(), "alternativeLine", "blSffTnsOv");
        setField(term105661, term105661.getClass(), "excludedTypes", term105788);
        setField(term105661, term105661.getClass(), "customCounterNames", term105808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionTrailerFormat", argTypes, term105661, args);
    }

};


