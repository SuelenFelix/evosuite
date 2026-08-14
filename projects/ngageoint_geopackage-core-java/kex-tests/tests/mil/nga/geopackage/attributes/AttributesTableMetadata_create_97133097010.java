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

public class AttributesTableMetadata_create_97133097010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1846;
     Object term1848;
     Object term1851;

    public AttributesTableMetadata_create_97133097010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1846 = new Boolean(false);
        term1848 = new LinkedList();
        ArrayList term1852 = new ArrayList();
        HashMap term1856 = new HashMap();
        term1851 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term1851, term1851.getClass(), "constraints", term1852);
        setField(term1851, term1851.getClass(), "typedContraints", term1856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[4];
        args[0] = "OYbzXylRWW";
        args[1] = term1846;
        args[2] = term1848;
        args[3] = term1851;
        callMethod(klass, "create", argTypes, null, args);
    }

};


