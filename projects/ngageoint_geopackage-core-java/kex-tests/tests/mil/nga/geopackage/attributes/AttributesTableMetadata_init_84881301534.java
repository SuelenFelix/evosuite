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

public class AttributesTableMetadata_init_84881301534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137253;
     Object term137256;

    public AttributesTableMetadata_init_84881301534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137253 = new LinkedList();
        ArrayList term137257 = new ArrayList();
        HashMap term137261 = new HashMap();
        term137256 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term137256, term137256.getClass(), "constraints", term137257);
        setField(term137256, term137256.getClass(), "typedContraints", term137261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[4];
        args[0] = "wokzuoOQRu";
        args[1] = "jIVcJcAtbp";
        args[2] = term137253;
        args[3] = term137256;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


