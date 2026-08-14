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

public class GeoPackageFile_setFileName_25240860313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20328;

    public GeoPackageFile_setFileName_25240860313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20470 = Class.forName((String) "java.io.File$PathStatus");
        Field term20469 = ((Class) term20470).getDeclaredField((String) "INVALID");
        ((Field) term20469).setAccessible(true);
        Object enum51 = ((Field) term20469).get((Object) null);
        Integer term20403 = new Integer(1962444399);
        Integer term20405 = new Integer(767834723);
        Integer term20419 = new Integer(-602026508);
        Integer term20421 = new Integer(-157887805);
        ArrayList term20437 = new ArrayList();
        ((ArrayList) term20437).add("");
        ((ArrayList) term20437).add("");
        ((ArrayList) term20437).add("");
        ((ArrayList) term20437).add("");
        ((ArrayList) term20437).add("");
        ((ArrayList) term20437).add("");
        term20328 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term20329 = newInstance(Class.forName("java.io.File"));
        Object term20354 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term20435 = newInstance(Class.forName("java.util.Date"));
        setField(term20329, term20329.getClass(), "path", "RDnkgWkcbz");
        setField(term20329, term20329.getClass(), "status", enum51);
        setIntField(term20329, term20329.getClass(), "prefixLength", 597278769);
        setField(term20329, term20329.getClass(), "filePath", null);
        setField(term20328, term20328.getClass(), "file", term20329);
        setField(term20354, term20354.getClass(), "producer", "IBpaxltauX");
        setField(term20354, term20354.getClass(), "dataProduct", "hePqROaplw");
        setField(term20354, term20354.getClass(), "geographicCoverageArea", "PJcSNDruWd");
        setField(term20354, term20354.getClass(), "zoomLevels", "VVNNlAePXF");
        setField(term20354, term20354.getClass(), "zoomLevel1", term20403);
        setField(term20354, term20354.getClass(), "zoomLevel2", term20405);
        setField(term20354, term20354.getClass(), "version", "jnwVnmKAFv");
        setField(term20354, term20354.getClass(), "majorVersion", term20419);
        setField(term20354, term20354.getClass(), "minorVersion", term20421);
        setField(term20354, term20354.getClass(), "creationDateText", "TXyHhqeCjR");
        setLongField(term20435, term20435.getClass(), "fastTime", 1797203628025L);
        setField(term20435, term20435.getClass(), "cdate", null);
        setField(term20354, term20354.getClass(), "creationDate", term20435);
        setField(term20354, term20354.getClass(), "additional", term20437);
        setField(term20328, term20328.getClass(), "fileName", term20354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOVuNSCCLe";
        callMethod(klass, "setFileName", argTypes, term20328, args);
    }

};


