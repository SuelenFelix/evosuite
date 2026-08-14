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

public class FeatureColumns_setGeometryColumnName_3415099286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812;

    public FeatureColumns_setGeometryColumnName_3415099286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term851 = new ArrayList();
        HashMap term856 = new HashMap();
        term812 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term838 = (Object[]) newArray("java.lang.String", 1);
        setField(term812, term812.getClass(), "geometryColumn", "xrwlQZdwCp");
        setIntField(term812, term812.getClass(), "geometryIndex", 1227103734);
        setField(term812, term812.getClass(), "tableName", "IDCWpPLRkE");
        setElement(term838, 0, "nyiiPDVjAc");
        setField(term812, term812.getClass(), "columnNames", term838);
        setField(term812, term812.getClass(), "columns", term851);
        setBooleanField(term812, term812.getClass(), "custom", true);
        setField(term812, term812.getClass(), "nameToIndex", term856);
        setIntField(term812, term812.getClass(), "pkIndex", -1339778481);
        setBooleanField(term812, term812.getClass(), "pkModifiable", false);
        setBooleanField(term812, term812.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "setGeometryColumnName", argTypes, term812, args);
    }

};


