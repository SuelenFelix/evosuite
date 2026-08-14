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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class AttributesTableMetadata_init_178160467341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4163;
     Object term4166;
     Object term4176;

    public AttributesTableMetadata_init_178160467341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4163 = new LinkedList();
        ArrayList term4167 = new ArrayList();
        HashMap term4171 = new HashMap();
        term4166 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4166, term4166.getClass(), "constraints", term4167);
        setField(term4166, term4166.getClass(), "typedContraints", term4171);
        term4176 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = "wsysQLGFnl";
        args[1] = "ckQLZGFjMX";
        args[2] = term4163;
        args[3] = term4166;
        args[4] = term4176;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


