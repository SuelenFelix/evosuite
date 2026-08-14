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

public class GeoPackageFileName_addValue_165641429339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30205;
     Object term30292;

    public GeoPackageFileName_addValue_165641429339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30254 = new Integer(729658803);
        Integer term30256 = new Integer(114754804);
        Integer term30270 = new Integer(1687361082);
        Integer term30272 = new Integer(584893196);
        ArrayList term30288 = new ArrayList();
        term30205 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term30286 = newInstance(Class.forName("java.util.Date"));
        setField(term30205, term30205.getClass(), "producer", "xVFgeyYxZS");
        setField(term30205, term30205.getClass(), "dataProduct", "iQiGTulJiH");
        setField(term30205, term30205.getClass(), "geographicCoverageArea", "utCuuVCKqE");
        setField(term30205, term30205.getClass(), "zoomLevels", "zSfoqzJbPT");
        setField(term30205, term30205.getClass(), "zoomLevel1", term30254);
        setField(term30205, term30205.getClass(), "zoomLevel2", term30256);
        setField(term30205, term30205.getClass(), "version", "QUymMnsCIj");
        setField(term30205, term30205.getClass(), "majorVersion", term30270);
        setField(term30205, term30205.getClass(), "minorVersion", term30272);
        setField(term30205, term30205.getClass(), "creationDateText", "ikTtOgdVYS");
        setLongField(term30286, term30286.getClass(), "fastTime", 1741444563811L);
        setField(term30286, term30286.getClass(), "cdate", null);
        setField(term30205, term30205.getClass(), "creationDate", term30286);
        setField(term30205, term30205.getClass(), "additional", term30288);
        term30292 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term30293 = (byte[]) newByteArray(16);
        setField(term30292, term30292.getClass(), "value", term30293);
        setByteField(term30292, term30292.getClass(), "coder", (byte) 47);
        setIntField(term30292, term30292.getClass(), "count", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term30292;
        args[1] = "JptuwlirlS";
        callMethod(klass, "addValue", argTypes, term30205, args);
    }

};


