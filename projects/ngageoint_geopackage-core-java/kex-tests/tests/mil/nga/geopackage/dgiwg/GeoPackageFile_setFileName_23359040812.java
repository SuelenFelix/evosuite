package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;

public class GeoPackageFile_setFileName_23359040812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19822;
     Object term19937;

    public GeoPackageFile_setFileName_23359040812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19973 = Class.forName((String) "java.io.File$PathStatus");
        Field term19972 = ((Class) term19973).getDeclaredField((String) "INVALID");
        ((Field) term19972).setAccessible(true);
        Object enum49 = ((Field) term19972).get((Object) null);
        Integer term19897 = new Integer(-1530420153);
        Integer term19899 = new Integer(-469968304);
        Integer term19913 = new Integer(-1145578966);
        Integer term19915 = new Integer(679763016);
        ArrayList term19931 = new ArrayList();
        ((ArrayList) term19931).add("");
        ((ArrayList) term19931).add("");
        term19822 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term19823 = newInstance(Class.forName("java.io.File"));
        Object term19848 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term19929 = newInstance(Class.forName("java.util.Date"));
        setField(term19823, term19823.getClass(), "path", "HHQcYMSBVc");
        setField(term19823, term19823.getClass(), "status", enum49);
        setIntField(term19823, term19823.getClass(), "prefixLength", -883034806);
        setField(term19823, term19823.getClass(), "filePath", null);
        setField(term19822, term19822.getClass(), "file", term19823);
        setField(term19848, term19848.getClass(), "producer", "wdoqITnaAP");
        setField(term19848, term19848.getClass(), "dataProduct", "rIPMBcrNqB");
        setField(term19848, term19848.getClass(), "geographicCoverageArea", "UDaboHZHhz");
        setField(term19848, term19848.getClass(), "zoomLevels", "nRvKihUSPj");
        setField(term19848, term19848.getClass(), "zoomLevel1", term19897);
        setField(term19848, term19848.getClass(), "zoomLevel2", term19899);
        setField(term19848, term19848.getClass(), "version", "BbNeQJpYPr");
        setField(term19848, term19848.getClass(), "majorVersion", term19913);
        setField(term19848, term19848.getClass(), "minorVersion", term19915);
        setField(term19848, term19848.getClass(), "creationDateText", "riMtzCoxNj");
        setLongField(term19929, term19929.getClass(), "fastTime", 1500721068023L);
        setField(term19929, term19929.getClass(), "cdate", null);
        setField(term19848, term19848.getClass(), "creationDate", term19929);
        setField(term19848, term19848.getClass(), "additional", term19931);
        setField(term19822, term19822.getClass(), "fileName", term19848);
        Class<? extends Object> term20186 = Class.forName((String) "java.io.File$PathStatus");
        Field term20185 = ((Class) term20186).getDeclaredField((String) "CHECKED");
        ((Field) term20185).setAccessible(true);
        Object enum50 = ((Field) term20185).get((Object) null);
        term19937 = newInstance(Class.forName("java.io.File"));
        setField(term19937, term19937.getClass(), "path", "HwLHeGLyhe");
        setField(term19937, term19937.getClass(), "status", enum50);
        setIntField(term19937, term19937.getClass(), "prefixLength", 1585847225);
        setField(term19937, term19937.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term19937;
        callMethod(klass, "setFileName", argTypes, term19822, args);
    }

};


