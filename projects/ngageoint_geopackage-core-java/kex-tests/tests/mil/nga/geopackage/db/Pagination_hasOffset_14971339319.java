package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Pagination_hasOffset_14971339319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11547;

    public Pagination_hasOffset_14971339319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11549 = new Long(5127676408959197577L);
        term11547 = newInstance(Class.forName("mil.nga.geopackage.db.Pagination"));
        setIntField(term11547, term11547.getClass(), "limit", 458147407);
        setField(term11547, term11547.getClass(), "offset", term11549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.Pagination");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasOffset", argTypes, term11547, args);
    }

};


