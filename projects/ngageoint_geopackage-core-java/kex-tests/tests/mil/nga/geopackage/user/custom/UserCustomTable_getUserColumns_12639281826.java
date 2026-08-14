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

public class UserCustomTable_getUserColumns_12639281826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2853;

    public UserCustomTable_getUserColumns_12639281826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2855 = new ArrayList();
        HashMap term2859 = new HashMap();
        term2853 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2854 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2853, term2853.getClass(), "columns", null);
        setField(term2854, term2854.getClass(), "constraints", term2855);
        setField(term2854, term2854.getClass(), "typedContraints", term2859);
        setField(term2853, term2853.getClass(), "constraints", term2854);
        setField(term2853, term2853.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term2853, args);
    }

};


