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

public class AttributesTableMetadata_init_56149029841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137995;
     Object term137998;

    public AttributesTableMetadata_init_56149029841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137995 = new LinkedList();
        ArrayList term137999 = new ArrayList();
        HashMap term138003 = new HashMap();
        term137998 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term137998, term137998.getClass(), "constraints", term137999);
        setField(term137998, term137998.getClass(), "typedContraints", term138003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[3];
        args[0] = "rwlrpQuNrG";
        args[1] = term137995;
        args[2] = term137998;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


