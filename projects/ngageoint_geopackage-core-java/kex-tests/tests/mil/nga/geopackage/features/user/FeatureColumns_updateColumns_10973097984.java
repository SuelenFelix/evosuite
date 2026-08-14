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

public class FeatureColumns_updateColumns_10973097984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public FeatureColumns_updateColumns_10973097984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term515 = new ArrayList();
        HashMap term520 = new HashMap();
        term416 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term442 = (Object[]) newArray("java.lang.String", 6);
        setField(term416, term416.getClass(), "geometryColumn", "HyxfbSQYBe");
        setIntField(term416, term416.getClass(), "geometryIndex", -1922583790);
        setField(term416, term416.getClass(), "tableName", "pCTimMblYc");
        setElement(term442, 0, "hNxWaHcfhY");
        setElement(term442, 1, "RkybSrpybU");
        setElement(term442, 2, "xOEqzGAmDU");
        setElement(term442, 3, "eZFUvlxvGV");
        setElement(term442, 4, "BYqFIqCKAV");
        setElement(term442, 5, "vrQLuWIDJX");
        setField(term416, term416.getClass(), "columnNames", term442);
        setField(term416, term416.getClass(), "columns", term515);
        setBooleanField(term416, term416.getClass(), "custom", true);
        setField(term416, term416.getClass(), "nameToIndex", term520);
        setIntField(term416, term416.getClass(), "pkIndex", -616727354);
        setBooleanField(term416, term416.getClass(), "pkModifiable", false);
        setBooleanField(term416, term416.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term416, args);
    }

};


