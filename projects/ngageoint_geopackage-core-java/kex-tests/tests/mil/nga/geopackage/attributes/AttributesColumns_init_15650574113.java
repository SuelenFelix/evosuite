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

public class AttributesColumns_init_15650574113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5514;

    public AttributesColumns_init_15650574113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5576 = new ArrayList();
        HashMap term5581 = new HashMap();
        term5514 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term5527 = (Object[]) newArray("java.lang.String", 4);
        setField(term5514, term5514.getClass(), "tableName", "IiNCZfdouL");
        setElement(term5527, 0, "AhOHzCsHKW");
        setElement(term5527, 1, "UqgLPaaAHi");
        setElement(term5527, 2, "xypryEkUPF");
        setElement(term5527, 3, "zyZTzHNjQr");
        setField(term5514, term5514.getClass(), "columnNames", term5527);
        setField(term5514, term5514.getClass(), "columns", term5576);
        setBooleanField(term5514, term5514.getClass(), "custom", true);
        setField(term5514, term5514.getClass(), "nameToIndex", term5581);
        setIntField(term5514, term5514.getClass(), "pkIndex", 1551099402);
        setBooleanField(term5514, term5514.getClass(), "pkModifiable", true);
        setBooleanField(term5514, term5514.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[1];
        args[0] = term5514;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


