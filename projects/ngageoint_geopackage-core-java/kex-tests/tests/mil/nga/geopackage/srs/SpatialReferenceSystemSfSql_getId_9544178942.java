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

public class SpatialReferenceSystemSfSql_getId_9544178942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;

    public SpatialReferenceSystemSfSql_getId_9544178942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1555 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql"));
        setIntField(term1555, term1555.getClass(), "srid", -1087774327);
        setField(term1555, term1555.getClass(), "authName", "kBdSllIBVz");
        setIntField(term1555, term1555.getClass(), "authSrid", -1530420153);
        setField(term1555, term1555.getClass(), "srtext", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1555, args);
    }

};


