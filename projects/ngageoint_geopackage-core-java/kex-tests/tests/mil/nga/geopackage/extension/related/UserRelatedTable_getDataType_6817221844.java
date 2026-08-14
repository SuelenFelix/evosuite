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

public class UserRelatedTable_getDataType_6817221844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2914;

    public UserRelatedTable_getDataType_6817221844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2940 = new ArrayList();
        HashMap term2944 = new HashMap();
        term2914 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable"));
        Object term2939 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2914, term2914.getClass(), "relationName", "onpbIeEKoi");
        setField(term2914, term2914.getClass(), "dataType", "YRHGsAkhxb");
        setField(term2914, term2914.getClass(), "columns", null);
        setField(term2939, term2939.getClass(), "constraints", term2940);
        setField(term2939, term2939.getClass(), "typedContraints", term2944);
        setField(term2914, term2914.getClass(), "constraints", term2939);
        setField(term2914, term2914.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term2914, args);
    }

};


