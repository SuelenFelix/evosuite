package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTable_init_1544818232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5033;

    public AttributesTable_init_1544818232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5035 = new ArrayList();
        HashMap term5039 = new HashMap();
        term5033 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term5034 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5033, term5033.getClass(), "columns", null);
        setField(term5034, term5034.getClass(), "constraints", term5035);
        setField(term5034, term5034.getClass(), "typedContraints", term5039);
        setField(term5033, term5033.getClass(), "constraints", term5034);
        setField(term5033, term5033.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[1];
        args[0] = term5033;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


