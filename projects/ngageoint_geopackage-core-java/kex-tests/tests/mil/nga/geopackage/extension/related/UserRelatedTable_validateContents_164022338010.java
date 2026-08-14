package mil.nga.geopackage.extension.related;

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
import static mil.nga.geopackage.extension.related.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserRelatedTable_validateContents_164022338010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;

    public UserRelatedTable_validateContents_164022338010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3026 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable"));
        setField(term3026, term3026.getClass(), "relationName", null);
        setField(term3026, term3026.getClass(), "dataType", null);
        setField(term3026, term3026.getClass(), "columns", null);
        setField(term3026, term3026.getClass(), "constraints", null);
        setField(term3026, term3026.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateContents", argTypes, term3026, args);
    }

};


