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

public class GeoPackageFileName_setGeographicCoverageArea_5933303258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22131;

    public GeoPackageFileName_setGeographicCoverageArea_5933303258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22180 = new Integer(1225272962);
        Integer term22182 = new Integer(1324040357);
        Integer term22196 = new Integer(-1588772968);
        Integer term22198 = new Integer(-93135961);
        ArrayList term22214 = new ArrayList();
        ((ArrayList) term22214).add("QtrylgCLiF");
        ((ArrayList) term22214).add("orEuhCStGM");
        ((ArrayList) term22214).add("HhEaSXWvrY");
        ((ArrayList) term22214).add("CVRGEomOth");
        ((ArrayList) term22214).add("vSeruUyNWX");
        term22131 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term22212 = newInstance(Class.forName("java.util.Date"));
        setField(term22131, term22131.getClass(), "producer", "OUeBWNTQDh");
        setField(term22131, term22131.getClass(), "dataProduct", "gltJarNuUk");
        setField(term22131, term22131.getClass(), "geographicCoverageArea", "ZwZIDwYcSW");
        setField(term22131, term22131.getClass(), "zoomLevels", "sOdkipUKRu");
        setField(term22131, term22131.getClass(), "zoomLevel1", term22180);
        setField(term22131, term22131.getClass(), "zoomLevel2", term22182);
        setField(term22131, term22131.getClass(), "version", "oKwCDqywym");
        setField(term22131, term22131.getClass(), "majorVersion", term22196);
        setField(term22131, term22131.getClass(), "minorVersion", term22198);
        setField(term22131, term22131.getClass(), "creationDateText", "zjZYTddemL");
        setLongField(term22212, term22212.getClass(), "fastTime", 1882638884364L);
        setField(term22212, term22212.getClass(), "cdate", null);
        setField(term22131, term22131.getClass(), "creationDate", term22212);
        setField(term22131, term22131.getClass(), "additional", term22214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UkKvaeJfEC";
        callMethod(klass, "setGeographicCoverageArea", argTypes, term22131, args);
    }

};


