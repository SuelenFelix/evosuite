package mil.nga.geopackage.features.user;

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
import static mil.nga.geopackage.features.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class FeatureColumns_hasGeometryColumn_1396026049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1210;

    public FeatureColumns_hasGeometryColumn_1396026049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1249 = new ArrayList();
        HashMap term1254 = new HashMap();
        term1210 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term1236 = (Object[]) newArray("java.lang.String", 1);
        setField(term1210, term1210.getClass(), "geometryColumn", "onpbIeEKoi");
        setIntField(term1210, term1210.getClass(), "geometryIndex", 597278769);
        setField(term1210, term1210.getClass(), "tableName", "YRHGsAkhxb");
        setElement(term1236, 0, "ffYhPOzlUs");
        setField(term1210, term1210.getClass(), "columnNames", term1236);
        setField(term1210, term1210.getClass(), "columns", term1249);
        setBooleanField(term1210, term1210.getClass(), "custom", true);
        setField(term1210, term1210.getClass(), "nameToIndex", term1254);
        setIntField(term1210, term1210.getClass(), "pkIndex", -1685132342);
        setBooleanField(term1210, term1210.getClass(), "pkModifiable", true);
        setBooleanField(term1210, term1210.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasGeometryColumn", argTypes, term1210, args);
    }

};


