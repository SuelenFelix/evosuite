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

public class GeoPackageFileName_delimitersToSpaces_33025413236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29258;

    public GeoPackageFileName_delimitersToSpaces_33025413236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29307 = new Integer(-2066804303);
        Integer term29309 = new Integer(-1731761810);
        Integer term29323 = new Integer(197109649);
        Integer term29325 = new Integer(-1239406390);
        ArrayList term29341 = new ArrayList();
        ((ArrayList) term29341).add("UbZGBpQZQW");
        ((ArrayList) term29341).add("SvGTualQPa");
        ((ArrayList) term29341).add("mdxcgZwsaP");
        ((ArrayList) term29341).add("XildIRoZHG");
        ((ArrayList) term29341).add("lEcrFlxJXH");
        ((ArrayList) term29341).add("VNdDwXMYxR");
        ((ArrayList) term29341).add("bVbexZPmwW");
        ((ArrayList) term29341).add("tvxYdqiyGc");
        ((ArrayList) term29341).add("ZEXFoMSKeG");
        term29258 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term29339 = newInstance(Class.forName("java.util.Date"));
        setField(term29258, term29258.getClass(), "producer", "DNOtiLPAIY");
        setField(term29258, term29258.getClass(), "dataProduct", "FnEkAHBfyV");
        setField(term29258, term29258.getClass(), "geographicCoverageArea", "VfmNFpEuax");
        setField(term29258, term29258.getClass(), "zoomLevels", "ANHjlWPmZG");
        setField(term29258, term29258.getClass(), "zoomLevel1", term29307);
        setField(term29258, term29258.getClass(), "zoomLevel2", term29309);
        setField(term29258, term29258.getClass(), "version", "SibzENsyyy");
        setField(term29258, term29258.getClass(), "majorVersion", term29323);
        setField(term29258, term29258.getClass(), "minorVersion", term29325);
        setField(term29258, term29258.getClass(), "creationDateText", "mrqGHotaef");
        setLongField(term29339, term29339.getClass(), "fastTime", 1633004775487L);
        setField(term29339, term29339.getClass(), "cdate", null);
        setField(term29258, term29258.getClass(), "creationDate", term29339);
        setField(term29258, term29258.getClass(), "additional", term29341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HvxahUfZcJ";
        callMethod(klass, "delimitersToSpaces", argTypes, term29258, args);
    }

};


