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

public class UserRelatedTable_getRelationName_753147318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3024;

    public UserRelatedTable_getRelationName_753147318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3024 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable"));
        setField(term3024, term3024.getClass(), "relationName", null);
        setField(term3024, term3024.getClass(), "dataType", null);
        setField(term3024, term3024.getClass(), "columns", null);
        setField(term3024, term3024.getClass(), "constraints", null);
        setField(term3024, term3024.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelationName", argTypes, term3024, args);
    }

};


