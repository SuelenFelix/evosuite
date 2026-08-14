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

public class UserCustomTable_getDataType_8654833865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2842;

    public UserCustomTable_getDataType_8654833865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2844 = new ArrayList();
        HashMap term2848 = new HashMap();
        term2842 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2843 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2842, term2842.getClass(), "columns", null);
        setField(term2843, term2843.getClass(), "constraints", term2844);
        setField(term2843, term2843.getClass(), "typedContraints", term2848);
        setField(term2842, term2842.getClass(), "constraints", term2843);
        setField(term2842, term2842.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term2842, args);
    }

};


