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

public class AttributesTableMetadata_createTyped_72762169733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3589;

    public AttributesTableMetadata_createTyped_72762169733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3591 = new ArrayList();
        HashMap term3595 = new HashMap();
        term3589 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term3590 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3589, term3589.getClass(), "columns", null);
        setField(term3590, term3590.getClass(), "constraints", term3591);
        setField(term3590, term3590.getClass(), "typedContraints", term3595);
        setField(term3589, term3589.getClass(), "constraints", term3590);
        setField(term3589, term3589.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[2];
        args[0] = "MgLCedQfoj";
        args[1] = term3589;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


