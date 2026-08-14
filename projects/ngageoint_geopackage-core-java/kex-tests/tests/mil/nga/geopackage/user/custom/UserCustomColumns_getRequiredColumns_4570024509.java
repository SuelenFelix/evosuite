package mil.nga.geopackage.user.custom;

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
import static mil.nga.geopackage.user.custom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class UserCustomColumns_getRequiredColumns_4570024509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2461;

    public UserCustomColumns_getRequiredColumns_4570024509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2462 = new ArrayList();
        ArrayList term2491 = new ArrayList();
        HashMap term2496 = new HashMap();
        term2461 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term2478 = (Object[]) newArray("java.lang.String", 1);
        setField(term2461, term2461.getClass(), "requiredColumns", term2462);
        setField(term2461, term2461.getClass(), "tableName", "BjugTaMcxJ");
        setElement(term2478, 0, "vGiuZVPJNH");
        setField(term2461, term2461.getClass(), "columnNames", term2478);
        setField(term2461, term2461.getClass(), "columns", term2491);
        setBooleanField(term2461, term2461.getClass(), "custom", false);
        setField(term2461, term2461.getClass(), "nameToIndex", term2496);
        setIntField(term2461, term2461.getClass(), "pkIndex", -244121226);
        setBooleanField(term2461, term2461.getClass(), "pkModifiable", false);
        setBooleanField(term2461, term2461.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredColumns", argTypes, term2461, args);
    }

};


