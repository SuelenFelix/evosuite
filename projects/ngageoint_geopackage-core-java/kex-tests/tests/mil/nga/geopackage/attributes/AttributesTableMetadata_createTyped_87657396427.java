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

public class AttributesTableMetadata_createTyped_87657396427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136738;
     Object term136740;

    public AttributesTableMetadata_createTyped_87657396427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136738 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term136738, term136738.getClass(), "constraints", null);
        setField(term136738, term136738.getClass(), "tableName", null);
        setField(term136738, term136738.getClass(), "dataType", null);
        setField(term136738, term136738.getClass(), "identifier", null);
        setField(term136738, term136738.getClass(), "description", null);
        setField(term136738, term136738.getClass(), "idColumnName", null);
        setBooleanField(term136738, term136738.getClass(), "autoincrement", false);
        setField(term136738, term136738.getClass(), "additionalColumns", null);
        setField(term136738, term136738.getClass(), "columns", null);
        term136740 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term136740;
        args[4] = null;
        callMethod(klass, "createTyped", argTypes, term136738, args);
    }

};


