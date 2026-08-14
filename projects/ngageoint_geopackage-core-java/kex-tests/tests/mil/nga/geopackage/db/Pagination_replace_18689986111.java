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

public class Pagination_replace_18689986111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11493;

    public Pagination_replace_18689986111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11495 = new Long(-8885298608300233488L);
        term11493 = newInstance(Class.forName("mil.nga.geopackage.db.Pagination"));
        setIntField(term11493, term11493.getClass(), "limit", -1968847291);
        setField(term11493, term11493.getClass(), "offset", term11495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.Pagination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.Pagination");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term11493;
        args[1] = "OeQLvhVERT";
        callMethod(klass, "replace", argTypes, null, args);
    }

};


