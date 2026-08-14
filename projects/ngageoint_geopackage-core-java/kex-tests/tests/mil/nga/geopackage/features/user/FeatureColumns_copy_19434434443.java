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

public class FeatureColumns_copy_19434434443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;

    public FeatureColumns_copy_19434434443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337 = new ArrayList();
        HashMap term342 = new HashMap();
        term262 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term288 = (Object[]) newArray("java.lang.String", 4);
        setField(term262, term262.getClass(), "geometryColumn", "uuaPigETmJ");
        setIntField(term262, term262.getClass(), "geometryIndex", 1484323161);
        setField(term262, term262.getClass(), "tableName", "MxlszYVzRf");
        setElement(term288, 0, "LQFpaHEwXR");
        setElement(term288, 1, "oVcInYnLWB");
        setElement(term288, 2, "aJlieCFVtF");
        setElement(term288, 3, "ZiaGIbnzTs");
        setField(term262, term262.getClass(), "columnNames", term288);
        setField(term262, term262.getClass(), "columns", term337);
        setBooleanField(term262, term262.getClass(), "custom", true);
        setField(term262, term262.getClass(), "nameToIndex", term342);
        setIntField(term262, term262.getClass(), "pkIndex", 391863371);
        setBooleanField(term262, term262.getClass(), "pkModifiable", true);
        setBooleanField(term262, term262.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term262, args);
    }

};


