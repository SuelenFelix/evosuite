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
import java.lang.Boolean;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_init_87862578138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988;
     Object term3990;
     Object term3993;

    public AttributesTableMetadata_init_87862578138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3988 = new Boolean(false);
        term3990 = new LinkedList();
        ArrayList term3994 = new ArrayList();
        HashMap term3998 = new HashMap();
        term3993 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3993, term3993.getClass(), "constraints", term3994);
        setField(term3993, term3993.getClass(), "typedContraints", term3998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[5];
        args[0] = "RTTvrwwhou";
        args[1] = "lRORwXipuk";
        args[2] = term3988;
        args[3] = term3990;
        args[4] = term3993;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


