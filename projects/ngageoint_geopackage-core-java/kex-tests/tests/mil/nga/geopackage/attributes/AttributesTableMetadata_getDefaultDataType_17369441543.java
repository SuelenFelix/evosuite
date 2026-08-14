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

public class AttributesTableMetadata_getDefaultDataType_17369441543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138077;

    public AttributesTableMetadata_getDefaultDataType_17369441543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term138079 = new ArrayList();
        HashMap term138083 = new HashMap();
        ArrayList term138149 = new ArrayList();
        ArrayList term138153 = new ArrayList();
        term138077 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term138078 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term138078, term138078.getClass(), "constraints", term138079);
        setField(term138078, term138078.getClass(), "typedContraints", term138083);
        setField(term138077, term138077.getClass(), "constraints", term138078);
        setField(term138077, term138077.getClass(), "tableName", "HABnTZidNp");
        setField(term138077, term138077.getClass(), "dataType", "qXysRdBrsg");
        setField(term138077, term138077.getClass(), "identifier", "hbtKoWkZLU");
        setField(term138077, term138077.getClass(), "description", "VCWjXeMQGX");
        setField(term138077, term138077.getClass(), "idColumnName", "KzrkBfSzqK");
        setBooleanField(term138077, term138077.getClass(), "autoincrement", true);
        setField(term138077, term138077.getClass(), "additionalColumns", term138149);
        setField(term138077, term138077.getClass(), "columns", term138153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term138077, args);
    }

};


