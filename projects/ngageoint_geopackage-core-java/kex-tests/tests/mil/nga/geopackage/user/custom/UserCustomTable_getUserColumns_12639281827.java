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

public class UserCustomTable_getUserColumns_12639281827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6284;

    public UserCustomTable_getUserColumns_12639281827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6286 = new ArrayList();
        HashMap term6290 = new HashMap();
        term6284 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term6285 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6284, term6284.getClass(), "columns", null);
        setField(term6285, term6285.getClass(), "constraints", term6286);
        setField(term6285, term6285.getClass(), "typedContraints", term6290);
        setField(term6284, term6284.getClass(), "constraints", term6285);
        setField(term6284, term6284.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term6284, args);
    }

};


