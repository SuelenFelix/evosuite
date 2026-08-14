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

public class AttributesTableMetadata_create_12424346618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;

    public AttributesTableMetadata_create_12424346618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2321 = new ArrayList();
        HashMap term2325 = new HashMap();
        term2319 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term2320 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2319, term2319.getClass(), "columns", null);
        setField(term2320, term2320.getClass(), "constraints", term2321);
        setField(term2320, term2320.getClass(), "typedContraints", term2325);
        setField(term2319, term2319.getClass(), "constraints", term2320);
        setField(term2319, term2319.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[1];
        args[0] = term2319;
        callMethod(klass, "create", argTypes, null, args);
    }

};


