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

public class PrintStyleBuilder_resetCustomCounterNames_97921221323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87142;

    public PrintStyleBuilder_resetCustomCounterNames_97921221323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87287 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term87286 = ((Class) term87287).getDeclaredField((String) "DETAILED");
        ((Field) term87286).setAccessible(true);
        Object enum294 = ((Field) term87286).get((Object) null);
        Class<? extends Object> term87603 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term87602 = ((Class) term87603).getDeclaredField((String) "SHORT");
        ((Field) term87602).setAccessible(true);
        Object enum295 = ((Field) term87602).get((Object) null);
        Class<? extends Object> term87855 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87854 = ((Class) term87855).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term87854).setAccessible(true);
        Object enum296 =  ((Field) term87854).get((Object) null);
        Class<? extends Object> term88082 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term88081 = ((Class) term88082).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term88081).setAccessible(true);
        Object enum297 =  ((Field) term88081).get((Object) null);
        ArrayList term87265 = new ArrayList();
        ((ArrayList) term87265).add(enum296);
        ((ArrayList) term87265).add(enum297);
        ((ArrayList) term87265).add(enum297);
        ((ArrayList) term87265).add(enum297);
        HashMap term87277 = new HashMap();
        term87142 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term87142, term87142.getClass(), "printFormat", enum294);
        setBooleanField(term87142, term87142.getClass(), "printHeader", true);
        setField(term87142, term87142.getClass(), "headerFormat", "nrQjODRMLD");
        setBooleanField(term87142, term87142.getClass(), "printTrailer", true);
        setField(term87142, term87142.getClass(), "trailerFormat", "PNoWXrsFic");
        setField(term87142, term87142.getClass(), "rowFormat", "QZBHZqZope");
        setField(term87142, term87142.getClass(), "sectionHeaderFormat", "VBUahCvyxC");
        setBooleanField(term87142, term87142.getClass(), "printSectionSummary", true);
        setField(term87142, term87142.getClass(), "sectionSummaryRowFormat", "MlzTkzKMCX");
        setBooleanField(term87142, term87142.getClass(), "printSectionTrailer", true);
        setField(term87142, term87142.getClass(), "sectionTrailerFormat", "UqKUbMyPMJ");
        setField(term87142, term87142.getClass(), "durationFormat", enum295);
        setBooleanField(term87142, term87142.getClass(), "printLegend", true);
        setField(term87142, term87142.getClass(), "simpleLine", "QpYltHAdyY");
        setField(term87142, term87142.getClass(), "alternativeLine", "lbmSGBwIiV");
        setField(term87142, term87142.getClass(), "excludedTypes", term87265);
        setField(term87142, term87142.getClass(), "customCounterNames", term87277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetCustomCounterNames", argTypes, term87142, args);
    }

};


