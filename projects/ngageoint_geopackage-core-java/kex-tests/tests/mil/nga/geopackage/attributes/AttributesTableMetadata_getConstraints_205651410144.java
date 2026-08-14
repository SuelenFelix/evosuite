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

public class AttributesTableMetadata_getConstraints_205651410144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4458;

    public AttributesTableMetadata_getConstraints_205651410144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4460 = new ArrayList();
        HashMap term4464 = new HashMap();
        ArrayList term4530 = new ArrayList();
        ArrayList term4534 = new ArrayList();
        term4458 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term4459 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4459, term4459.getClass(), "constraints", term4460);
        setField(term4459, term4459.getClass(), "typedContraints", term4464);
        setField(term4458, term4458.getClass(), "constraints", term4459);
        setField(term4458, term4458.getClass(), "tableName", "BYrGukTyof");
        setField(term4458, term4458.getClass(), "dataType", "jiCGTTzKGB");
        setField(term4458, term4458.getClass(), "identifier", "MqICFYzDJj");
        setField(term4458, term4458.getClass(), "description", "YgQvdcBQKw");
        setField(term4458, term4458.getClass(), "idColumnName", "FiYYLuailz");
        setBooleanField(term4458, term4458.getClass(), "autoincrement", true);
        setField(term4458, term4458.getClass(), "additionalColumns", term4530);
        setField(term4458, term4458.getClass(), "columns", term4534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstraints", argTypes, term4458, args);
    }

};


