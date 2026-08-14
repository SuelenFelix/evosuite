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
import java.lang.Integer;

public class FeatureColumns_setGeometryIndex_18383375428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098;
     Object term1168;

    public FeatureColumns_setGeometryIndex_18383375428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1149 = new ArrayList();
        HashMap term1154 = new HashMap();
        term1098 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term1124 = (Object[]) newArray("java.lang.String", 2);
        setField(term1098, term1098.getClass(), "geometryColumn", "jDtqGUpnZN");
        setIntField(term1098, term1098.getClass(), "geometryIndex", 1134449235);
        setField(term1098, term1098.getClass(), "tableName", "nGKItKLYNC");
        setElement(term1124, 0, "UiUYnPrcCi");
        setElement(term1124, 1, "UoYtihxVaS");
        setField(term1098, term1098.getClass(), "columnNames", term1124);
        setField(term1098, term1098.getClass(), "columns", term1149);
        setBooleanField(term1098, term1098.getClass(), "custom", false);
        setField(term1098, term1098.getClass(), "nameToIndex", term1154);
        setIntField(term1098, term1098.getClass(), "pkIndex", -883034806);
        setBooleanField(term1098, term1098.getClass(), "pkModifiable", true);
        setBooleanField(term1098, term1098.getClass(), "valueValidation", true);
        term1168 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1168;
        callMethod(klass, "setGeometryIndex", argTypes, term1098, args);
    }

};


