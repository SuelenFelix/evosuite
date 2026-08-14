package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAttributesTable_init_66278193320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13156;

    public SimpleAttributesTable_init_66278193320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13158 = new ArrayList();
        HashMap term13162 = new HashMap();
        term13156 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term13157 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term13156, term13156.getClass(), "columns", null);
        setField(term13157, term13157.getClass(), "constraints", term13158);
        setField(term13157, term13157.getClass(), "typedContraints", term13162);
        setField(term13156, term13156.getClass(), "constraints", term13157);
        setField(term13156, term13156.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[1];
        args[0] = term13156;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


