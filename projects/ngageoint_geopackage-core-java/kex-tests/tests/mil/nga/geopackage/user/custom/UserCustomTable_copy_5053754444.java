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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserCustomTable_copy_5053754444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2831;

    public UserCustomTable_copy_5053754444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2833 = new ArrayList();
        HashMap term2837 = new HashMap();
        term2831 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2832 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2831, term2831.getClass(), "columns", null);
        setField(term2832, term2832.getClass(), "constraints", term2833);
        setField(term2832, term2832.getClass(), "typedContraints", term2837);
        setField(term2831, term2831.getClass(), "constraints", term2832);
        setField(term2831, term2831.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term2831, args);
    }

};


