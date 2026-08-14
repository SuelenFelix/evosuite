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

public class AttributesTable_init_1544818231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171548;

    public AttributesTable_init_1544818231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171550 = new ArrayList();
        HashMap term171554 = new HashMap();
        term171548 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term171549 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term171548, term171548.getClass(), "columns", null);
        setField(term171549, term171549.getClass(), "constraints", term171550);
        setField(term171549, term171549.getClass(), "typedContraints", term171554);
        setField(term171548, term171548.getClass(), "constraints", term171549);
        setField(term171548, term171548.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[1];
        args[0] = term171548;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


