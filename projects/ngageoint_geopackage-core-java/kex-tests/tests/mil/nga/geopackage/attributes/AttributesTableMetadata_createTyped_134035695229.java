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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_createTyped_134035695229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136857;
     Object term136859;
     Object term136862;

    public AttributesTableMetadata_createTyped_134035695229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136857 = new Boolean(true);
        term136859 = new LinkedList();
        ArrayList term136863 = new ArrayList();
        HashMap term136867 = new HashMap();
        term136862 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term136862, term136862.getClass(), "constraints", term136863);
        setField(term136862, term136862.getClass(), "typedContraints", term136867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[6];
        args[0] = "bTxfZATYLW";
        args[1] = "lFWdVTokyG";
        args[2] = "PwXoorKXoP";
        args[3] = term136857;
        args[4] = term136859;
        args[5] = term136862;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


