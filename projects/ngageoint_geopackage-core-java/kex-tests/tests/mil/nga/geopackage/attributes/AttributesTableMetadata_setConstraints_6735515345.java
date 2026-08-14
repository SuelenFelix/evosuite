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

public class AttributesTableMetadata_setConstraints_6735515345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4588;
     Object term4668;

    public AttributesTableMetadata_setConstraints_6735515345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4590 = new ArrayList();
        HashMap term4594 = new HashMap();
        ArrayList term4660 = new ArrayList();
        ArrayList term4664 = new ArrayList();
        term4588 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term4589 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4589, term4589.getClass(), "constraints", term4590);
        setField(term4589, term4589.getClass(), "typedContraints", term4594);
        setField(term4588, term4588.getClass(), "constraints", term4589);
        setField(term4588, term4588.getClass(), "tableName", "XebAeSnCKZ");
        setField(term4588, term4588.getClass(), "dataType", "GeddnXjHGy");
        setField(term4588, term4588.getClass(), "identifier", "vLTbaoAxBm");
        setField(term4588, term4588.getClass(), "description", "BXTjEyEZxD");
        setField(term4588, term4588.getClass(), "idColumnName", "oKhVzOKUFW");
        setBooleanField(term4588, term4588.getClass(), "autoincrement", true);
        setField(term4588, term4588.getClass(), "additionalColumns", term4660);
        setField(term4588, term4588.getClass(), "columns", term4664);
        ArrayList term4669 = new ArrayList();
        HashMap term4673 = new HashMap();
        term4668 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4668, term4668.getClass(), "constraints", term4669);
        setField(term4668, term4668.getClass(), "typedContraints", term4673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[1];
        args[0] = term4668;
        callMethod(klass, "setConstraints", argTypes, term4588, args);
    }

};


