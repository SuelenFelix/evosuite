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

public class AttributesTableMetadata_createTyped_134035695230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object term3328;
     Object term3331;

    public AttributesTableMetadata_createTyped_134035695230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3326 = new Boolean(false);
        term3328 = new LinkedList();
        ArrayList term3332 = new ArrayList();
        HashMap term3336 = new HashMap();
        term3331 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3331, term3331.getClass(), "constraints", term3332);
        setField(term3331, term3331.getClass(), "typedContraints", term3336);
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
        args[0] = "HpZXWDPhlg";
        args[1] = "lBOokzEPfe";
        args[2] = "dtGZCsKXbW";
        args[3] = term3326;
        args[4] = term3328;
        args[5] = term3331;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


