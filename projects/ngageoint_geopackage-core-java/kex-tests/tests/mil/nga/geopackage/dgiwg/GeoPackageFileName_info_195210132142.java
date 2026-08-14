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

public class GeoPackageFileName_info_195210132142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30828;

    public GeoPackageFileName_info_195210132142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30877 = new Integer(-1214628358);
        Integer term30879 = new Integer(1102721075);
        Integer term30893 = new Integer(-426764678);
        Integer term30895 = new Integer(-1222614956);
        ArrayList term30911 = new ArrayList();
        ((ArrayList) term30911).add("tkmmGweDwJ");
        ((ArrayList) term30911).add("pMfTuAFXxg");
        ((ArrayList) term30911).add("XCZmhkblRc");
        ((ArrayList) term30911).add("gFUWMydGCU");
        ((ArrayList) term30911).add("LLegSTfqJt");
        ((ArrayList) term30911).add("XQfmqLbqHS");
        ((ArrayList) term30911).add("jLVLqQSjqg");
        ((ArrayList) term30911).add("JKGueoHesL");
        ((ArrayList) term30911).add("CRAUqtVBkU");
        term30828 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term30909 = newInstance(Class.forName("java.util.Date"));
        setField(term30828, term30828.getClass(), "producer", "wdtiuPgTVJ");
        setField(term30828, term30828.getClass(), "dataProduct", "HUgzMgrpsK");
        setField(term30828, term30828.getClass(), "geographicCoverageArea", "ubaBUfLolu");
        setField(term30828, term30828.getClass(), "zoomLevels", "itAUCFhZhq");
        setField(term30828, term30828.getClass(), "zoomLevel1", term30877);
        setField(term30828, term30828.getClass(), "zoomLevel2", term30879);
        setField(term30828, term30828.getClass(), "version", "bIqaKgXgPm");
        setField(term30828, term30828.getClass(), "majorVersion", term30893);
        setField(term30828, term30828.getClass(), "minorVersion", term30895);
        setField(term30828, term30828.getClass(), "creationDateText", "uOJFOUcNvv");
        setLongField(term30909, term30909.getClass(), "fastTime", 1362780563394L);
        setField(term30909, term30909.getClass(), "cdate", null);
        setField(term30828, term30828.getClass(), "creationDate", term30909);
        setField(term30828, term30828.getClass(), "additional", term30911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "info", argTypes, term30828, args);
    }

};


