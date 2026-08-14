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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserRelatedTable_validateContents_16402233805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2969;

    public UserRelatedTable_validateContents_16402233805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2995 = new ArrayList();
        HashMap term2999 = new HashMap();
        term2969 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable"));
        Object term2994 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2969, term2969.getClass(), "relationName", "ffYhPOzlUs");
        setField(term2969, term2969.getClass(), "dataType", "MLqYREekMl");
        setField(term2969, term2969.getClass(), "columns", null);
        setField(term2994, term2994.getClass(), "constraints", term2995);
        setField(term2994, term2994.getClass(), "typedContraints", term2999);
        setField(term2969, term2969.getClass(), "constraints", term2994);
        setField(term2969, term2969.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateContents", argTypes, term2969, args);
    }

};


