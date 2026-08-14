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

public class PrintStyleBuilder_getAlternativeLine_207561648739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108626;

    public PrintStyleBuilder_getAlternativeLine_207561648739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108777 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term108776 = ((Class) term108777).getDeclaredField((String) "SUMMARIZED");
        ((Field) term108776).setAccessible(true);
        Object enum370 = ((Field) term108776).get((Object) null);
        Class<? extends Object> term109099 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term109098 = ((Class) term109099).getDeclaredField((String) "SHORT");
        ((Field) term109098).setAccessible(true);
        Object enum371 = ((Field) term109098).get((Object) null);
        Class<? extends Object> term109351 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term109350 = ((Class) term109351).getDeclaredField((String) "USER_TIME");
        ((Field) term109350).setAccessible(true);
        Object enum372 =  ((Field) term109350).get((Object) null);
        Class<? extends Object> term109560 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term109559 = ((Class) term109560).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term109559).setAccessible(true);
        Object enum373 =  ((Field) term109559).get((Object) null);
        Class<? extends Object> term109775 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term109774 = ((Class) term109775).getDeclaredField((String) "CPU_TIME");
        ((Field) term109774).setAccessible(true);
        Object enum374 =  ((Field) term109774).get((Object) null);
        ArrayList term108751 = new ArrayList();
        ((ArrayList) term108751).add(enum372);
        ((ArrayList) term108751).add(enum373);
        ((ArrayList) term108751).add(enum374);
        ((ArrayList) term108751).add(enum374);
        ((ArrayList) term108751).add(enum374);
        HashMap term108767 = new HashMap();
        term108626 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term108626, term108626.getClass(), "printFormat", enum370);
        setBooleanField(term108626, term108626.getClass(), "printHeader", false);
        setField(term108626, term108626.getClass(), "headerFormat", "EHoNUaeyvT");
        setBooleanField(term108626, term108626.getClass(), "printTrailer", false);
        setField(term108626, term108626.getClass(), "trailerFormat", "ZwKmasCVIy");
        setField(term108626, term108626.getClass(), "rowFormat", "pxokrVaeMd");
        setField(term108626, term108626.getClass(), "sectionHeaderFormat", "ujxmmZZcbT");
        setBooleanField(term108626, term108626.getClass(), "printSectionSummary", true);
        setField(term108626, term108626.getClass(), "sectionSummaryRowFormat", "BOvgwHfoHQ");
        setBooleanField(term108626, term108626.getClass(), "printSectionTrailer", true);
        setField(term108626, term108626.getClass(), "sectionTrailerFormat", "hPpFNeDBIb");
        setField(term108626, term108626.getClass(), "durationFormat", enum371);
        setBooleanField(term108626, term108626.getClass(), "printLegend", false);
        setField(term108626, term108626.getClass(), "simpleLine", "DNOtiLPAIY");
        setField(term108626, term108626.getClass(), "alternativeLine", "FnEkAHBfyV");
        setField(term108626, term108626.getClass(), "excludedTypes", term108751);
        setField(term108626, term108626.getClass(), "customCounterNames", term108767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlternativeLine", argTypes, term108626, args);
    }

};


