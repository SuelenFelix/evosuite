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

public class GeoPackageFileName_getProducer_2961360993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20890;

    public GeoPackageFileName_getProducer_2961360993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20939 = new Integer(1876565163);
        Integer term20941 = new Integer(-817164822);
        Integer term20955 = new Integer(-1016503459);
        Integer term20957 = new Integer(-1968847291);
        ArrayList term20973 = new ArrayList();
        ((ArrayList) term20973).add("IHqvyhMtuM");
        ((ArrayList) term20973).add("dAldIGYAXV");
        ((ArrayList) term20973).add("mLwibAPEsa");
        ((ArrayList) term20973).add("zsWKWiTFuo");
        ((ArrayList) term20973).add("UPUbwyHQKN");
        ((ArrayList) term20973).add("lgQkrXANyI");
        term20890 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term20971 = newInstance(Class.forName("java.util.Date"));
        setField(term20890, term20890.getClass(), "producer", "aanyiAOJCl");
        setField(term20890, term20890.getClass(), "dataProduct", "VDokbsCuqq");
        setField(term20890, term20890.getClass(), "geographicCoverageArea", "xClUIcPECX");
        setField(term20890, term20890.getClass(), "zoomLevels", "avhRaGZaBF");
        setField(term20890, term20890.getClass(), "zoomLevel1", term20939);
        setField(term20890, term20890.getClass(), "zoomLevel2", term20941);
        setField(term20890, term20890.getClass(), "version", "JkgoRtImdE");
        setField(term20890, term20890.getClass(), "majorVersion", term20955);
        setField(term20890, term20890.getClass(), "minorVersion", term20957);
        setField(term20890, term20890.getClass(), "creationDateText", "qFGKIJjlmV");
        setLongField(term20971, term20971.getClass(), "fastTime", 1589457921030L);
        setField(term20971, term20971.getClass(), "cdate", null);
        setField(term20890, term20890.getClass(), "creationDate", term20971);
        setField(term20890, term20890.getClass(), "additional", term20973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProducer", argTypes, term20890, args);
    }

};


