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

public class UserRelatedTable_getRelationName_753147313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2859;

    public UserRelatedTable_getRelationName_753147313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2885 = new ArrayList();
        HashMap term2889 = new HashMap();
        term2859 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable"));
        Object term2884 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2859, term2859.getClass(), "relationName", "UoYtihxVaS");
        setField(term2859, term2859.getClass(), "dataType", "JDswTTCZHV");
        setField(term2859, term2859.getClass(), "columns", null);
        setField(term2884, term2884.getClass(), "constraints", term2885);
        setField(term2884, term2884.getClass(), "typedContraints", term2889);
        setField(term2859, term2859.getClass(), "constraints", term2884);
        setField(term2859, term2859.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelationName", argTypes, term2859, args);
    }

};


