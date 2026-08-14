package mil.nga.geopackage.srs;

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
import static mil.nga.geopackage.srs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpatialReferenceSystemSqlMm_getSrsId_17702908656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480;

    public SpatialReferenceSystemSqlMm_getSrsId_17702908656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm"));
        setField(term480, term480.getClass(), "srsName", "RkybSrpybU");
        setIntField(term480, term480.getClass(), "srsId", -522618178);
        setField(term480, term480.getClass(), "organization", "xOEqzGAmDU");
        setIntField(term480, term480.getClass(), "organizationCoordsysId", 1134449235);
        setField(term480, term480.getClass(), "definition", "eZFUvlxvGV");
        setField(term480, term480.getClass(), "description", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSrsId", argTypes, term480, args);
    }

};


