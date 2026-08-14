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

public class AttributesTableMetadata_create_12424346617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135942;

    public AttributesTableMetadata_create_12424346617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term135944 = new ArrayList();
        HashMap term135948 = new HashMap();
        term135942 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term135943 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term135942, term135942.getClass(), "columns", null);
        setField(term135943, term135943.getClass(), "constraints", term135944);
        setField(term135943, term135943.getClass(), "typedContraints", term135948);
        setField(term135942, term135942.getClass(), "constraints", term135943);
        setField(term135942, term135942.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[1];
        args[0] = term135942;
        callMethod(klass, "create", argTypes, null, args);
    }

};


