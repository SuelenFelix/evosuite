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

public class PrintStyleBuilder_withoutTrailer_12022229547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67969;

    public PrintStyleBuilder_withoutTrailer_12022229547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68113 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term68112 = ((Class) term68113).getDeclaredField((String) "SUMMARIZED");
        ((Field) term68112).setAccessible(true);
        Object enum229 = ((Field) term68112).get((Object) null);
        Class<? extends Object> term68435 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term68434 = ((Class) term68435).getDeclaredField((String) "FULL");
        ((Field) term68434).setAccessible(true);
        Object enum230 = ((Field) term68434).get((Object) null);
        Class<? extends Object> term68684 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term68683 = ((Class) term68684).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term68683).setAccessible(true);
        Object enum231 =  ((Field) term68683).get((Object) null);
        ArrayList term68093 = new ArrayList();
        ((ArrayList) term68093).add(enum231);
        HashMap term68101 = new HashMap();
        term67969 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term67969, term67969.getClass(), "printFormat", enum229);
        setBooleanField(term67969, term67969.getClass(), "printHeader", true);
        setField(term67969, term67969.getClass(), "headerFormat", "oKwCDqywym");
        setBooleanField(term67969, term67969.getClass(), "printTrailer", false);
        setField(term67969, term67969.getClass(), "trailerFormat", "zjZYTddemL");
        setField(term67969, term67969.getClass(), "rowFormat", "QtrylgCLiF");
        setField(term67969, term67969.getClass(), "sectionHeaderFormat", "orEuhCStGM");
        setBooleanField(term67969, term67969.getClass(), "printSectionSummary", true);
        setField(term67969, term67969.getClass(), "sectionSummaryRowFormat", "HhEaSXWvrY");
        setBooleanField(term67969, term67969.getClass(), "printSectionTrailer", true);
        setField(term67969, term67969.getClass(), "sectionTrailerFormat", "CVRGEomOth");
        setField(term67969, term67969.getClass(), "durationFormat", enum230);
        setBooleanField(term67969, term67969.getClass(), "printLegend", true);
        setField(term67969, term67969.getClass(), "simpleLine", "vSeruUyNWX");
        setField(term67969, term67969.getClass(), "alternativeLine", "UkKvaeJfEC");
        setField(term67969, term67969.getClass(), "excludedTypes", term68093);
        setField(term67969, term67969.getClass(), "customCounterNames", term68101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutTrailer", argTypes, term67969, args);
    }

};


