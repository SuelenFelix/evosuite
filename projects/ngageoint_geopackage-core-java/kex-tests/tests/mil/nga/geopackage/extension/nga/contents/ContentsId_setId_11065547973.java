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
import java.lang.Long;

public class ContentsId_setId_11065547973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term63;

    public ContentsId_setId_11065547973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.contents.ContentsId"));
        setLongField(term49, term49.getClass(), "id", -8257434502486459194L);
        setField(term49, term49.getClass(), "contents", null);
        setField(term49, term49.getClass(), "tableName", "MuLcgQHgqz");
        term63 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.contents.ContentsId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term63;
        callMethod(klass, "setId", argTypes, term49, args);
    }

};


