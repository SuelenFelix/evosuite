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

public class GeoPackageFileName_getCreationDateText_58718923724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26387;

    public GeoPackageFileName_getCreationDateText_58718923724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26436 = new Integer(480137250);
        Integer term26438 = new Integer(-341152642);
        Integer term26452 = new Integer(-2015854073);
        Integer term26454 = new Integer(538259104);
        ArrayList term26470 = new ArrayList();
        ((ArrayList) term26470).add("IVacFDAZcj");
        ((ArrayList) term26470).add("EEYmuwyVDP");
        term26387 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term26468 = newInstance(Class.forName("java.util.Date"));
        setField(term26387, term26387.getClass(), "producer", "ZwjARhAtHC");
        setField(term26387, term26387.getClass(), "dataProduct", "XXvscsYBWv");
        setField(term26387, term26387.getClass(), "geographicCoverageArea", "uePedtiAfL");
        setField(term26387, term26387.getClass(), "zoomLevels", "AdSHvysxQB");
        setField(term26387, term26387.getClass(), "zoomLevel1", term26436);
        setField(term26387, term26387.getClass(), "zoomLevel2", term26438);
        setField(term26387, term26387.getClass(), "version", "jlraKkBWFA");
        setField(term26387, term26387.getClass(), "majorVersion", term26452);
        setField(term26387, term26387.getClass(), "minorVersion", term26454);
        setField(term26387, term26387.getClass(), "creationDateText", "mRBtFTxVdE");
        setLongField(term26468, term26468.getClass(), "fastTime", 1442370534632L);
        setField(term26468, term26468.getClass(), "cdate", null);
        setField(term26387, term26387.getClass(), "creationDate", term26468);
        setField(term26387, term26387.getClass(), "additional", term26470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreationDateText", argTypes, term26387, args);
    }

};


