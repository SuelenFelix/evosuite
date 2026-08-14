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

public class PrintStyleBuilder_withoutHeader_14201945807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55079;

    public PrintStyleBuilder_withoutHeader_14201945807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55230 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term55229 = ((Class) term55230).getDeclaredField((String) "SUMMARIZED");
        ((Field) term55229).setAccessible(true);
        Object enum184 = ((Field) term55229).get((Object) null);
        Class<? extends Object> term55552 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term55551 = ((Class) term55552).getDeclaredField((String) "SHORT");
        ((Field) term55551).setAccessible(true);
        Object enum185 = ((Field) term55551).get((Object) null);
        Class<? extends Object> term55804 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term55803 = ((Class) term55804).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term55803).setAccessible(true);
        Object enum186 =  ((Field) term55803).get((Object) null);
        Class<? extends Object> term56031 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term56030 = ((Class) term56031).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term56030).setAccessible(true);
        Object enum187 =  ((Field) term56030).get((Object) null);
        Class<? extends Object> term56246 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term56245 = ((Class) term56246).getDeclaredField((String) "USER_TIME");
        ((Field) term56245).setAccessible(true);
        Object enum188 =  ((Field) term56245).get((Object) null);
        ArrayList term55204 = new ArrayList();
        ((ArrayList) term55204).add(enum186);
        ((ArrayList) term55204).add(enum186);
        ((ArrayList) term55204).add(enum186);
        ((ArrayList) term55204).add(enum186);
        ((ArrayList) term55204).add(enum187);
        ((ArrayList) term55204).add(enum187);
        ((ArrayList) term55204).add(enum188);
        HashMap term55220 = new HashMap();
        term55079 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term55079, term55079.getClass(), "printFormat", enum184);
        setBooleanField(term55079, term55079.getClass(), "printHeader", true);
        setField(term55079, term55079.getClass(), "headerFormat", "VDokbsCuqq");
        setBooleanField(term55079, term55079.getClass(), "printTrailer", true);
        setField(term55079, term55079.getClass(), "trailerFormat", "xClUIcPECX");
        setField(term55079, term55079.getClass(), "rowFormat", "avhRaGZaBF");
        setField(term55079, term55079.getClass(), "sectionHeaderFormat", "JkgoRtImdE");
        setBooleanField(term55079, term55079.getClass(), "printSectionSummary", true);
        setField(term55079, term55079.getClass(), "sectionSummaryRowFormat", "qFGKIJjlmV");
        setBooleanField(term55079, term55079.getClass(), "printSectionTrailer", true);
        setField(term55079, term55079.getClass(), "sectionTrailerFormat", "IHqvyhMtuM");
        setField(term55079, term55079.getClass(), "durationFormat", enum185);
        setBooleanField(term55079, term55079.getClass(), "printLegend", false);
        setField(term55079, term55079.getClass(), "simpleLine", "dAldIGYAXV");
        setField(term55079, term55079.getClass(), "alternativeLine", "mLwibAPEsa");
        setField(term55079, term55079.getClass(), "excludedTypes", term55204);
        setField(term55079, term55079.getClass(), "customCounterNames", term55220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutHeader", argTypes, term55079, args);
    }

};


