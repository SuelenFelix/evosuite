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

public class AttributesTable_getUserColumns_4956685664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171581;

    public AttributesTable_getUserColumns_4956685664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171583 = new ArrayList();
        HashMap term171587 = new HashMap();
        term171581 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term171582 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term171581, term171581.getClass(), "columns", null);
        setField(term171582, term171582.getClass(), "constraints", term171583);
        setField(term171582, term171582.getClass(), "typedContraints", term171587);
        setField(term171581, term171581.getClass(), "constraints", term171582);
        setField(term171581, term171581.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term171581, args);
    }

};


