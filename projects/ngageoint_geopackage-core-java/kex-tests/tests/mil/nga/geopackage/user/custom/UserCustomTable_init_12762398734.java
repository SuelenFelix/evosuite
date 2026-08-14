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

public class UserCustomTable_init_12762398734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6251;

    public UserCustomTable_init_12762398734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6253 = new ArrayList();
        HashMap term6257 = new HashMap();
        term6251 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term6252 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6251, term6251.getClass(), "columns", null);
        setField(term6252, term6252.getClass(), "constraints", term6253);
        setField(term6252, term6252.getClass(), "typedContraints", term6257);
        setField(term6251, term6251.getClass(), "constraints", term6252);
        setField(term6251, term6251.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[1];
        args[0] = term6251;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


