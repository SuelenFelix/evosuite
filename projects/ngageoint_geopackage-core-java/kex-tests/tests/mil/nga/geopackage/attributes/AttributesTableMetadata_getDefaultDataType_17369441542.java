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

public class AttributesTableMetadata_getDefaultDataType_17369441542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198;

    public AttributesTableMetadata_getDefaultDataType_17369441542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4200 = new ArrayList();
        HashMap term4204 = new HashMap();
        ArrayList term4270 = new ArrayList();
        ArrayList term4274 = new ArrayList();
        term4198 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term4199 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4199, term4199.getClass(), "constraints", term4200);
        setField(term4199, term4199.getClass(), "typedContraints", term4204);
        setField(term4198, term4198.getClass(), "constraints", term4199);
        setField(term4198, term4198.getClass(), "tableName", "qphdrqUtNx");
        setField(term4198, term4198.getClass(), "dataType", "bwlLFAfNWx");
        setField(term4198, term4198.getClass(), "identifier", "JWodNQzjjV");
        setField(term4198, term4198.getClass(), "description", "CAgxWjhxNf");
        setField(term4198, term4198.getClass(), "idColumnName", "goAoCMhKBu");
        setBooleanField(term4198, term4198.getClass(), "autoincrement", true);
        setField(term4198, term4198.getClass(), "additionalColumns", term4270);
        setField(term4198, term4198.getClass(), "columns", term4274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term4198, args);
    }

};


