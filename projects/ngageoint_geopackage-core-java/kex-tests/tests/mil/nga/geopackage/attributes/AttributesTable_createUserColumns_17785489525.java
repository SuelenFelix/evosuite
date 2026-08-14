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
import java.util.LinkedList;

public class AttributesTable_createUserColumns_17785489525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171592;
     Object term171603;

    public AttributesTable_createUserColumns_17785489525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171594 = new ArrayList();
        HashMap term171598 = new HashMap();
        term171592 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term171593 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term171592, term171592.getClass(), "columns", null);
        setField(term171593, term171593.getClass(), "constraints", term171594);
        setField(term171593, term171593.getClass(), "typedContraints", term171598);
        setField(term171592, term171592.getClass(), "constraints", term171593);
        setField(term171592, term171592.getClass(), "contents", null);
        term171603 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term171603;
        callMethod(klass, "createUserColumns", argTypes, term171592, args);
    }

};


