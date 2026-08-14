package net.obvj.performetrics.config;

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
import static net.obvj.performetrics.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Configuration_setPrintStyleForDetails_166740295210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26836;
     Object term27187;

    public Configuration_setPrintStyleForDetails_166740295210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27303 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term27302 = ((Class) term27303).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term27302).setAccessible(true);
        Object enum83 = ((Field) term27302).get((Object) null);
        Class<? extends Object> term27543 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term27542 = ((Class) term27543).getDeclaredField((String) "SUMMARIZED");
        ((Field) term27542).setAccessible(true);
        Object enum84 = ((Field) term27542).get((Object) null);
        Class<? extends Object> term27827 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term27826 = ((Class) term27827).getDeclaredField((String) "FULL");
        ((Field) term27826).setAccessible(true);
        Object enum85 = ((Field) term27826).get((Object) null);
        HashMap term26989 = new HashMap();
        Set<Object> term28127 =  ((Map) term26989).keySet();
        HashSet term26988 = new HashSet((Collection<? extends Object>) term28127);
        Class<? extends Object> term26995 = Class.forName((String) "java.nio.file.spi.FileSystemProvider");
        Class<? extends Object> term28239 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28238 = ((Class) term28239).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term28238).setAccessible(true);
        Object enum86 = ((Field) term28238).get((Object) null);
        Class<? extends Object> term28466 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28465 = ((Class) term28466).getDeclaredField((String) "CPU_TIME");
        ((Field) term28465).setAccessible(true);
        Object enum87 = ((Field) term28465).get((Object) null);
        Class<? extends Object> term28672 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28671 = ((Class) term28672).getDeclaredField((String) "USER_TIME");
        ((Field) term28671).setAccessible(true);
        Object enum88 =  ((Field) term28671).get((Object) null);
        Class<? extends Object> term28881 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28880 = ((Class) term28881).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term28880).setAccessible(true);
        Object enum89 =  ((Field) term28880).get((Object) null);
        Class<? extends Object> term29096 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term29095 = ((Class) term29096).getDeclaredField((String) "DETAILED");
        ((Field) term29095).setAccessible(true);
        Object enum90 = ((Field) term29095).get((Object) null);
        term26836 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term26858 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term26994 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term27005 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term27014 = (Object[]) newArray("java.lang.Object", 4);
        Object term27016 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term27182 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term27183 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term27184 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term27185 = (Object[]) newArray("java.lang.Object", 4);
        setField(term26836, term26836.getClass(), "conversionMode", enum83);
        setIntField(term26836, term26836.getClass(), "scale", 9);
        setField(term26858, term26858.getClass(), "printFormat", enum84);
        setBooleanField(term26858, term26858.getClass(), "printHeader", true);
        setField(term26858, term26858.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term26858, term26858.getClass(), "printTrailer", false);
        setField(term26858, term26858.getClass(), "trailerFormat", null);
        setField(term26858, term26858.getClass(), "rowFormat", "%-15s  %19s");
        setField(term26858, term26858.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term26858, term26858.getClass(), "printSectionSummary", false);
        setField(term26858, term26858.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term26858, term26858.getClass(), "printSectionTrailer", false);
        setField(term26858, term26858.getClass(), "sectionTrailerFormat", null);
        setField(term26858, term26858.getClass(), "durationFormat", enum85);
        setBooleanField(term26858, term26858.getClass(), "printLegend", false);
        setField(term26858, term26858.getClass(), "simpleLine", "------------------------------------");
        setField(term26858, term26858.getClass(), "alternativeLine", "====================================");
        setField(term26858, term26858.getClass(), "excludedTypes", term26988);
        setField(term26994, term26994.getClass(), "keyType", term26995);
        setElement(term27005, 0, enum86);
        setElement(term27005, 1, enum87);
        setElement(term27005, 2, enum88);
        setElement(term27005, 3, enum89);
        setField(term26994, term26994.getClass(), "keyUniverse", term27005);
        setField(term26994, term26994.getClass(), "vals", term27014);
        setIntField(term26994, term26994.getClass(), "size", 0);
        setField(term26994, term26994.getClass(), "entrySet", null);
        setField(term26994, term26994.getClass(), "keySet", null);
        setField(term26994, term26994.getClass(), "values", null);
        setField(term26858, term26858.getClass(), "customCounterNames", term26994);
        setField(term26836, term26836.getClass(), "printStyle", term26858);
        setField(term26836, term26836.getClass(), "printStyleForSummary", term26858);
        setField(term27016, term27016.getClass(), "printFormat", enum90);
        setBooleanField(term27016, term27016.getClass(), "printHeader", true);
        setField(term27016, term27016.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term27016, term27016.getClass(), "printTrailer", false);
        setField(term27016, term27016.getClass(), "trailerFormat", null);
        setField(term27016, term27016.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term27016, term27016.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term27016, term27016.getClass(), "printSectionSummary", true);
        setField(term27016, term27016.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term27016, term27016.getClass(), "printSectionTrailer", false);
        setField(term27016, term27016.getClass(), "sectionTrailerFormat", null);
        setField(term27016, term27016.getClass(), "durationFormat", enum85);
        setBooleanField(term27016, term27016.getClass(), "printLegend", false);
        setField(term27016, term27016.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term27016, term27016.getClass(), "alternativeLine", "===============================================");
        setField(term27016, term27016.getClass(), "excludedTypes", term27182);
        setField(term27183, term27183.getClass(), "keyType", term26995);
        setElement(term27184, 0, enum86);
        setElement(term27184, 1, enum87);
        setElement(term27184, 2, enum88);
        setElement(term27184, 3, enum89);
        setField(term27183, term27183.getClass(), "keyUniverse", term27184);
        setField(term27183, term27183.getClass(), "vals", term27185);
        setIntField(term27183, term27183.getClass(), "size", 0);
        setField(term27183, term27183.getClass(), "entrySet", null);
        setField(term27183, term27183.getClass(), "keySet", null);
        setField(term27183, term27183.getClass(), "values", null);
        setField(term27016, term27016.getClass(), "customCounterNames", term27183);
        setField(term26836, term26836.getClass(), "printStyleForDetails", term27016);
        ArrayList term27289 = new ArrayList();
        ((ArrayList) term27289).add(enum88);
        ((ArrayList) term27289).add(enum89);
        ((ArrayList) term27289).add(enum88);
        HashMap term27293 = new HashMap();
        term27187 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term27187, term27187.getClass(), "printFormat", enum84);
        setBooleanField(term27187, term27187.getClass(), "printHeader", false);
        setField(term27187, term27187.getClass(), "headerFormat", "HyxfbSQYBe");
        setBooleanField(term27187, term27187.getClass(), "printTrailer", true);
        setField(term27187, term27187.getClass(), "trailerFormat", "pCTimMblYc");
        setField(term27187, term27187.getClass(), "rowFormat", "hNxWaHcfhY");
        setField(term27187, term27187.getClass(), "sectionHeaderFormat", "RkybSrpybU");
        setBooleanField(term27187, term27187.getClass(), "printSectionSummary", false);
        setField(term27187, term27187.getClass(), "sectionSummaryRowFormat", "xOEqzGAmDU");
        setBooleanField(term27187, term27187.getClass(), "printSectionTrailer", true);
        setField(term27187, term27187.getClass(), "sectionTrailerFormat", "eZFUvlxvGV");
        setField(term27187, term27187.getClass(), "durationFormat", enum85);
        setBooleanField(term27187, term27187.getClass(), "printLegend", false);
        setField(term27187, term27187.getClass(), "simpleLine", "BYqFIqCKAV");
        setField(term27187, term27187.getClass(), "alternativeLine", "vrQLuWIDJX");
        setField(term27187, term27187.getClass(), "excludedTypes", term27289);
        setField(term27187, term27187.getClass(), "customCounterNames", term27293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term27187;
        callMethod(klass, "setPrintStyleForDetails", argTypes, term26836, args);
    }

};


