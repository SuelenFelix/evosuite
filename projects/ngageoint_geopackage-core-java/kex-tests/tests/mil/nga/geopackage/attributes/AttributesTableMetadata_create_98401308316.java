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

public class AttributesTableMetadata_create_98401308316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2223;

    public AttributesTableMetadata_create_98401308316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2237 = new ArrayList();
        HashMap term2242 = new HashMap();
        term2223 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term2236 = (Object[]) newArray("java.lang.String", 0);
        setField(term2223, term2223.getClass(), "tableName", "NnpwZBUTvx");
        setField(term2223, term2223.getClass(), "columnNames", term2236);
        setField(term2223, term2223.getClass(), "columns", term2237);
        setBooleanField(term2223, term2223.getClass(), "custom", false);
        setField(term2223, term2223.getClass(), "nameToIndex", term2242);
        setIntField(term2223, term2223.getClass(), "pkIndex", -203030934);
        setBooleanField(term2223, term2223.getClass(), "pkModifiable", true);
        setBooleanField(term2223, term2223.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[1];
        args[0] = term2223;
        callMethod(klass, "create", argTypes, null, args);
    }

};


