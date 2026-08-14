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

public class FeatureColumns_getGeometryIndex_9146766367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;

    public FeatureColumns_getGeometryIndex_9146766367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1009 = new ArrayList();
        HashMap term1014 = new HashMap();
        term922 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term948 = (Object[]) newArray("java.lang.String", 5);
        setField(term922, term922.getClass(), "geometryColumn", "UlajhuVLaP");
        setIntField(term922, term922.getClass(), "geometryIndex", 1725571209);
        setField(term922, term922.getClass(), "tableName", "gGSMzuGICf");
        setElement(term948, 0, "hxCBltsObl");
        setElement(term948, 1, "BndsHwAFMv");
        setElement(term948, 2, "GzFkzHGYFt");
        setElement(term948, 3, "tShwQLRGNe");
        setElement(term948, 4, "LvtrsXUliU");
        setField(term922, term922.getClass(), "columnNames", term948);
        setField(term922, term922.getClass(), "columns", term1009);
        setBooleanField(term922, term922.getClass(), "custom", true);
        setField(term922, term922.getClass(), "nameToIndex", term1014);
        setIntField(term922, term922.getClass(), "pkIndex", -522618178);
        setBooleanField(term922, term922.getClass(), "pkModifiable", true);
        setBooleanField(term922, term922.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryIndex", argTypes, term922, args);
    }

};


