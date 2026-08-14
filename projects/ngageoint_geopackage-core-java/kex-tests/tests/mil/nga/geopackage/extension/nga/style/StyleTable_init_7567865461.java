package mil.nga.geopackage.extension.nga.style;

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
import static mil.nga.geopackage.extension.nga.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class StyleTable_init_7567865461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4335;

    public StyleTable_init_7567865461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4337 = new ArrayList();
        HashMap term4341 = new HashMap();
        term4335 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term4336 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4335, term4335.getClass(), "columns", null);
        setField(term4336, term4336.getClass(), "constraints", term4337);
        setField(term4336, term4336.getClass(), "typedContraints", term4341);
        setField(term4335, term4335.getClass(), "constraints", term4336);
        setField(term4335, term4335.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[1];
        args[0] = term4335;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


