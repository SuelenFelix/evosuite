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

public class AttributesColumns_init_15650574112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183244;

    public AttributesColumns_init_15650574112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term183306 = new ArrayList();
        HashMap term183311 = new HashMap();
        term183244 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term183257 = (Object[]) newArray("java.lang.String", 4);
        setField(term183244, term183244.getClass(), "tableName", "QHAkxVuuIr");
        setElement(term183257, 0, "OhJSELmFDf");
        setElement(term183257, 1, "WjtvlnduZO");
        setElement(term183257, 2, "EccuEVvNyG");
        setElement(term183257, 3, "kqWUPOtRYQ");
        setField(term183244, term183244.getClass(), "columnNames", term183257);
        setField(term183244, term183244.getClass(), "columns", term183306);
        setBooleanField(term183244, term183244.getClass(), "custom", false);
        setField(term183244, term183244.getClass(), "nameToIndex", term183311);
        setIntField(term183244, term183244.getClass(), "pkIndex", 401512128);
        setBooleanField(term183244, term183244.getClass(), "pkModifiable", true);
        setBooleanField(term183244, term183244.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[1];
        args[0] = term183244;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


