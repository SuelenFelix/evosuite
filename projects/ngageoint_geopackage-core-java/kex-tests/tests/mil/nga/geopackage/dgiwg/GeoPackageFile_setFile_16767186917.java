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

public class GeoPackageFile_setFile_16767186917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17823;
     Object term17939;

    public GeoPackageFile_setFile_16767186917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17964 = Class.forName((String) "java.io.File$PathStatus");
        Field term17963 = ((Class) term17964).getDeclaredField((String) "CHECKED");
        ((Field) term17963).setAccessible(true);
        Object enum44 = ((Field) term17963).get((Object) null);
        Integer term17898 = new Integer(1134449235);
        Integer term17900 = new Integer(-883034806);
        Integer term17914 = new Integer(1585847225);
        Integer term17916 = new Integer(597278769);
        ArrayList term17932 = new ArrayList();
        ((ArrayList) term17932).add("");
        ((ArrayList) term17932).add("");
        ((ArrayList) term17932).add("");
        term17823 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term17824 = newInstance(Class.forName("java.io.File"));
        Object term17849 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term17930 = newInstance(Class.forName("java.util.Date"));
        setField(term17824, term17824.getClass(), "path", "rYbtIDVdnd");
        setField(term17824, term17824.getClass(), "status", enum44);
        setIntField(term17824, term17824.getClass(), "prefixLength", -2038273078);
        setField(term17824, term17824.getClass(), "filePath", null);
        setField(term17823, term17823.getClass(), "file", term17824);
        setField(term17849, term17849.getClass(), "producer", "UKAReurpHG");
        setField(term17849, term17849.getClass(), "dataProduct", "WVRMUmrljA");
        setField(term17849, term17849.getClass(), "geographicCoverageArea", "NTlKJDDWlk");
        setField(term17849, term17849.getClass(), "zoomLevels", "vOuMEpOQAg");
        setField(term17849, term17849.getClass(), "zoomLevel1", term17898);
        setField(term17849, term17849.getClass(), "zoomLevel2", term17900);
        setField(term17849, term17849.getClass(), "version", "SIODFGaQhr");
        setField(term17849, term17849.getClass(), "majorVersion", term17914);
        setField(term17849, term17849.getClass(), "minorVersion", term17916);
        setField(term17849, term17849.getClass(), "creationDateText", "qYzsiuXOgS");
        setLongField(term17930, term17930.getClass(), "fastTime", 1606045635837L);
        setField(term17930, term17930.getClass(), "cdate", null);
        setField(term17849, term17849.getClass(), "creationDate", term17930);
        setField(term17849, term17849.getClass(), "additional", term17932);
        setField(term17823, term17823.getClass(), "fileName", term17849);
        term17939 = newInstance(Class.forName("java.io.File"));
        setField(term17939, term17939.getClass(), "path", "WZzvmIHhzZ");
        setField(term17939, term17939.getClass(), "status", enum44);
        setIntField(term17939, term17939.getClass(), "prefixLength", 1227103734);
        setField(term17939, term17939.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term17939;
        callMethod(klass, "setFile", argTypes, term17823, args);
    }

};


