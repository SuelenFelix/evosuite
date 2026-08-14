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

public class SpatialReferenceSystemSfSql_setSrtext_103560615211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2006;

    public SpatialReferenceSystemSfSql_setSrtext_103560615211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2006 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql"));
        setIntField(term2006, term2006.getClass(), "srid", 458147407);
        setField(term2006, term2006.getClass(), "authName", "LvJFtLBaxj");
        setIntField(term2006, term2006.getClass(), "authSrid", -184153539);
        setField(term2006, term2006.getClass(), "srtext", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSfSql");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TimdotUuNC";
        callMethod(klass, "setSrtext", argTypes, term2006, args);
    }

};


