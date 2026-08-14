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

public class AttributesTableMetadata_create_128840060514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135503;
     Object term135505;
     Object term135508;

    public AttributesTableMetadata_create_128840060514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135503 = new Boolean(true);
        term135505 = new LinkedList();
        ArrayList term135509 = new ArrayList();
        HashMap term135513 = new HashMap();
        term135508 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term135508, term135508.getClass(), "constraints", term135509);
        setField(term135508, term135508.getClass(), "typedContraints", term135513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[5];
        args[0] = "MgDkHuQnRs";
        args[1] = "iEeRhESASl";
        args[2] = term135503;
        args[3] = term135505;
        args[4] = term135508;
        callMethod(klass, "create", argTypes, null, args);
    }

};


