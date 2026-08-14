package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Extensions_getTableName_20173719852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14873;

    public Extensions_getTableName_20173719852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14873 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term14873, term14873.getClass(), "tableName", "PCipZnmBOF");
        setField(term14873, term14873.getClass(), "columnName", "zcorEihhLK");
        setField(term14873, term14873.getClass(), "extensionName", "GrqozDKFOk");
        setField(term14873, term14873.getClass(), "definition", "CFyoseFGLF");
        setField(term14873, term14873.getClass(), "scope", "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term14873, args);
    }

};


