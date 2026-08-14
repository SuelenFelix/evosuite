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

public class SpatialReferenceSystemSfSql_getSrtext_81030766410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1959;

    public SpatialReferenceSystemSfSql_getSrtext_81030766410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1959 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql"));
        setIntField(term1959, term1959.getClass(), "srid", -1048298087);
        setField(term1959, term1959.getClass(), "authName", "bWWfajKbEX");
        setIntField(term1959, term1959.getClass(), "authSrid", 292681826);
        setField(term1959, term1959.getClass(), "srtext", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSrtext", argTypes, term1959, args);
    }

};


