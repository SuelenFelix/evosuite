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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class GeoPackageFileName_addDelimiter_144918825240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30410;
     Object term30521;

    public GeoPackageFileName_addDelimiter_144918825240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30459 = new Integer(497269071);
        Integer term30461 = new Integer(-1899301124);
        Integer term30475 = new Integer(-1882480155);
        Integer term30477 = new Integer(-1410220680);
        ArrayList term30493 = new ArrayList();
        ((ArrayList) term30493).add("mxVLTgCwki");
        ((ArrayList) term30493).add("wCurppnDSA");
        term30410 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term30491 = newInstance(Class.forName("java.util.Date"));
        setField(term30410, term30410.getClass(), "producer", "TKOMaGswbU");
        setField(term30410, term30410.getClass(), "dataProduct", "YcTbglHiUq");
        setField(term30410, term30410.getClass(), "geographicCoverageArea", "TiUqHrjoEU");
        setField(term30410, term30410.getClass(), "zoomLevels", "eoEvZbdLjL");
        setField(term30410, term30410.getClass(), "zoomLevel1", term30459);
        setField(term30410, term30410.getClass(), "zoomLevel2", term30461);
        setField(term30410, term30410.getClass(), "version", "BkIxsyPkGy");
        setField(term30410, term30410.getClass(), "majorVersion", term30475);
        setField(term30410, term30410.getClass(), "minorVersion", term30477);
        setField(term30410, term30410.getClass(), "creationDateText", "mrMGwoRgVY");
        setLongField(term30491, term30491.getClass(), "fastTime", 1761994701322L);
        setField(term30491, term30491.getClass(), "cdate", null);
        setField(term30410, term30410.getClass(), "creationDate", term30491);
        setField(term30410, term30410.getClass(), "additional", term30493);
        term30521 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term30522 = (byte[]) newByteArray(16);
        setField(term30521, term30521.getClass(), "value", term30522);
        setByteField(term30521, term30521.getClass(), "coder", (byte) 48);
        setIntField(term30521, term30521.getClass(), "count", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term30521;
        callMethod(klass, "addDelimiter", argTypes, term30410, args);
    }

};


