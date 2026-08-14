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

public class GeoPackageFileName_hashCode_112700545743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31173;

    public GeoPackageFileName_hashCode_112700545743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31222 = new Integer(-1870495012);
        Integer term31224 = new Integer(-1310015129);
        Integer term31238 = new Integer(-2104981311);
        Integer term31240 = new Integer(-571169753);
        ArrayList term31256 = new ArrayList();
        ((ArrayList) term31256).add("HuOUlaFmvJ");
        ((ArrayList) term31256).add("dWVwcwFGNo");
        ((ArrayList) term31256).add("PNdLRrSAIY");
        term31173 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term31254 = newInstance(Class.forName("java.util.Date"));
        setField(term31173, term31173.getClass(), "producer", "DddqUYfomL");
        setField(term31173, term31173.getClass(), "dataProduct", "YQwoogpPyi");
        setField(term31173, term31173.getClass(), "geographicCoverageArea", "rnPhHoorxj");
        setField(term31173, term31173.getClass(), "zoomLevels", "GuwJLKquuI");
        setField(term31173, term31173.getClass(), "zoomLevel1", term31222);
        setField(term31173, term31173.getClass(), "zoomLevel2", term31224);
        setField(term31173, term31173.getClass(), "version", "vYMCjgnztg");
        setField(term31173, term31173.getClass(), "majorVersion", term31238);
        setField(term31173, term31173.getClass(), "minorVersion", term31240);
        setField(term31173, term31173.getClass(), "creationDateText", "YupgKTSEiI");
        setLongField(term31254, term31254.getClass(), "fastTime", 1853963979281L);
        setField(term31254, term31254.getClass(), "cdate", null);
        setField(term31173, term31173.getClass(), "creationDate", term31254);
        setField(term31173, term31173.getClass(), "additional", term31256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31173, args);
    }

};


