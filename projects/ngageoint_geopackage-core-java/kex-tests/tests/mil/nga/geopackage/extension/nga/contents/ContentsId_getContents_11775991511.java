package mil.nga.geopackage.extension.nga.contents;

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
import static mil.nga.geopackage.extension.nga.contents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContentsId_getContents_11775991511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public ContentsId_getContents_11775991511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.contents.ContentsId"));
        setLongField(term153, term153.getClass(), "id", 0L);
        setField(term153, term153.getClass(), "contents", null);
        setField(term153, term153.getClass(), "tableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.contents.ContentsId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContents", argTypes, term153, args);
    }

};


