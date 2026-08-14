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
import java.lang.Integer;

public class SpatialReferenceSystemSfSql_setAuthSrid_15936650919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1910;
     Object term1937;

    public SpatialReferenceSystemSfSql_setAuthSrid_15936650919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1910 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql"));
        setIntField(term1910, term1910.getClass(), "srid", 454281060);
        setField(term1910, term1910.getClass(), "authName", "VgZnGoIFwQ");
        setIntField(term1910, term1910.getClass(), "authSrid", -1786399638);
        setField(term1910, term1910.getClass(), "srtext", "jUbSRrkrYZ");
        term1937 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1937;
        callMethod(klass, "setAuthSrid", argTypes, term1910, args);
    }

};


