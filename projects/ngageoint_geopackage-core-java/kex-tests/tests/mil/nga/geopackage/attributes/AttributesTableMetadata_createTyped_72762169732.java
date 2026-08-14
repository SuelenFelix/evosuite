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

public class AttributesTableMetadata_createTyped_72762169732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137208;

    public AttributesTableMetadata_createTyped_72762169732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term137210 = new ArrayList();
        HashMap term137214 = new HashMap();
        term137208 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term137209 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term137208, term137208.getClass(), "columns", null);
        setField(term137209, term137209.getClass(), "constraints", term137210);
        setField(term137209, term137209.getClass(), "typedContraints", term137214);
        setField(term137208, term137208.getClass(), "constraints", term137209);
        setField(term137208, term137208.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[2];
        args[0] = "CaxKtuZUJI";
        args[1] = term137208;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


