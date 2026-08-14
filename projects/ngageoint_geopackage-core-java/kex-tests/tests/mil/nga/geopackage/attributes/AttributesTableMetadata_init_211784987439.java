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

public class AttributesTableMetadata_init_211784987439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4059;
     Object term4061;
     Object term4064;

    public AttributesTableMetadata_init_211784987439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4059 = new Boolean(true);
        term4061 = new LinkedList();
        ArrayList term4065 = new ArrayList();
        HashMap term4069 = new HashMap();
        term4064 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4064, term4064.getClass(), "constraints", term4065);
        setField(term4064, term4064.getClass(), "typedContraints", term4069);
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
        args[0] = "fVdTcjgHdw";
        args[1] = "wwAwLLcLPp";
        args[2] = "nHpMKOmlpQ";
        args[3] = term4059;
        args[4] = term4061;
        args[5] = term4064;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


