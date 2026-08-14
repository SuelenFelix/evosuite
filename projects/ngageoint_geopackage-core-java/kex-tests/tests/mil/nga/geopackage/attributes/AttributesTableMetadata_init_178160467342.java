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

public class AttributesTableMetadata_init_178160467342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138042;
     Object term138045;
     Object term138055;

    public AttributesTableMetadata_init_178160467342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138042 = new LinkedList();
        ArrayList term138046 = new ArrayList();
        HashMap term138050 = new HashMap();
        term138045 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term138045, term138045.getClass(), "constraints", term138046);
        setField(term138045, term138045.getClass(), "typedContraints", term138050);
        term138055 = new Boolean(true);
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
        args[0] = "fctYGLXetS";
        args[1] = "UPbgrEUWQD";
        args[2] = term138042;
        args[3] = term138045;
        args[4] = term138055;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


