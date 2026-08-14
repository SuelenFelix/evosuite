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

public class PrintStyleBuilder_withAllTypes_18179542721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84817;

    public PrintStyleBuilder_withAllTypes_18179542721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84960 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term84959 = ((Class) term84960).getDeclaredField((String) "SUMMARIZED");
        ((Field) term84959).setAccessible(true);
        Object enum286 = ((Field) term84959).get((Object) null);
        Class<? extends Object> term85282 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term85281 = ((Class) term85282).getDeclaredField((String) "SHORTER");
        ((Field) term85281).setAccessible(true);
        Object enum287 = ((Field) term85281).get((Object) null);
        ArrayList term84944 = new ArrayList();
        HashMap term84948 = new HashMap();
        term84817 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term84817, term84817.getClass(), "printFormat", enum286);
        setBooleanField(term84817, term84817.getClass(), "printHeader", false);
        setField(term84817, term84817.getClass(), "headerFormat", "DGRqjjdhzy");
        setBooleanField(term84817, term84817.getClass(), "printTrailer", false);
        setField(term84817, term84817.getClass(), "trailerFormat", "lQFkjJUPAR");
        setField(term84817, term84817.getClass(), "rowFormat", "BsuVlGUUjV");
        setField(term84817, term84817.getClass(), "sectionHeaderFormat", "bHHjfDCntT");
        setBooleanField(term84817, term84817.getClass(), "printSectionSummary", true);
        setField(term84817, term84817.getClass(), "sectionSummaryRowFormat", "sEphiduvkv");
        setBooleanField(term84817, term84817.getClass(), "printSectionTrailer", true);
        setField(term84817, term84817.getClass(), "sectionTrailerFormat", "PbLgCSAHce");
        setField(term84817, term84817.getClass(), "durationFormat", enum287);
        setBooleanField(term84817, term84817.getClass(), "printLegend", true);
        setField(term84817, term84817.getClass(), "simpleLine", "NWldOLAbqk");
        setField(term84817, term84817.getClass(), "alternativeLine", "qnYaYSpDwO");
        setField(term84817, term84817.getClass(), "excludedTypes", term84944);
        setField(term84817, term84817.getClass(), "customCounterNames", term84948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withAllTypes", argTypes, term84817, args);
    }

};


