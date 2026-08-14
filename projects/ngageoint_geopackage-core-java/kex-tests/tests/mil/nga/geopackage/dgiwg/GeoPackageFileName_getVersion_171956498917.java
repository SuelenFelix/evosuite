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

public class GeoPackageFileName_getVersion_171956498917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24452;

    public GeoPackageFileName_getVersion_171956498917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24501 = new Integer(-1347665717);
        Integer term24503 = new Integer(-1888585309);
        Integer term24517 = new Integer(683666002);
        Integer term24519 = new Integer(1596213415);
        ArrayList term24535 = new ArrayList();
        ((ArrayList) term24535).add("mNHyqmOAFy");
        ((ArrayList) term24535).add("UxgSdhxPCH");
        ((ArrayList) term24535).add("DAujxZPHJC");
        term24452 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term24533 = newInstance(Class.forName("java.util.Date"));
        setField(term24452, term24452.getClass(), "producer", "FiYYLuailz");
        setField(term24452, term24452.getClass(), "dataProduct", "XebAeSnCKZ");
        setField(term24452, term24452.getClass(), "geographicCoverageArea", "GeddnXjHGy");
        setField(term24452, term24452.getClass(), "zoomLevels", "vLTbaoAxBm");
        setField(term24452, term24452.getClass(), "zoomLevel1", term24501);
        setField(term24452, term24452.getClass(), "zoomLevel2", term24503);
        setField(term24452, term24452.getClass(), "version", "BXTjEyEZxD");
        setField(term24452, term24452.getClass(), "majorVersion", term24517);
        setField(term24452, term24452.getClass(), "minorVersion", term24519);
        setField(term24452, term24452.getClass(), "creationDateText", "oKhVzOKUFW");
        setLongField(term24533, term24533.getClass(), "fastTime", 1502158153899L);
        setField(term24533, term24533.getClass(), "cdate", null);
        setField(term24452, term24452.getClass(), "creationDate", term24533);
        setField(term24452, term24452.getClass(), "additional", term24535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term24452, args);
    }

};


