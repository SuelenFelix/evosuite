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

public class AttributesTable_getDataType_14263624113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171570;

    public AttributesTable_getDataType_14263624113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171572 = new ArrayList();
        HashMap term171576 = new HashMap();
        term171570 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term171571 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term171570, term171570.getClass(), "columns", null);
        setField(term171571, term171571.getClass(), "constraints", term171572);
        setField(term171571, term171571.getClass(), "typedContraints", term171576);
        setField(term171570, term171570.getClass(), "constraints", term171571);
        setField(term171570, term171570.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term171570, args);
    }

};


