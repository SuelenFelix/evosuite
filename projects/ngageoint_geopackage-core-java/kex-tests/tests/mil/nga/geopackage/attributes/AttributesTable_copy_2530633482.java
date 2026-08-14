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

public class AttributesTable_copy_2530633482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171559;

    public AttributesTable_copy_2530633482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171561 = new ArrayList();
        HashMap term171565 = new HashMap();
        term171559 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term171560 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term171559, term171559.getClass(), "columns", null);
        setField(term171560, term171560.getClass(), "constraints", term171561);
        setField(term171560, term171560.getClass(), "typedContraints", term171565);
        setField(term171559, term171559.getClass(), "constraints", term171560);
        setField(term171559, term171559.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term171559, args);
    }

};


