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

public class AttributesTableMetadata_create_149726934450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138615;
     Object term138617;

    public AttributesTableMetadata_create_149726934450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138615 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138615, term138615.getClass(), "constraints", null);
        setField(term138615, term138615.getClass(), "tableName", null);
        setField(term138615, term138615.getClass(), "dataType", null);
        setField(term138615, term138615.getClass(), "identifier", null);
        setField(term138615, term138615.getClass(), "description", null);
        setField(term138615, term138615.getClass(), "idColumnName", null);
        setBooleanField(term138615, term138615.getClass(), "autoincrement", false);
        setField(term138615, term138615.getClass(), "additionalColumns", null);
        setField(term138615, term138615.getClass(), "columns", null);
        term138617 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term138617;
        callMethod(klass, "create", argTypes, term138615, args);
    }

};


