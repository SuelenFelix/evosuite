package mil.nga.geopackage.user;

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
import static mil.nga.geopackage.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserCorePaginatedResults_setPagination_8860269356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6325;

    public UserCorePaginatedResults_setPagination_8860269356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6327 = new Long(-4502405999831680926L);
        term6325 = newInstance(Class.forName("mil.nga.geopackage.db.Pagination"));
        setIntField(term6325, term6325.getClass(), "limit", 454281060);
        setField(term6325, term6325.getClass(), "offset", term6327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.Pagination");
        Object[] args = new Object[1];
        args[0] = term6325;
        callMethod(klass, "setPagination", argTypes, null, args);
    }

};


