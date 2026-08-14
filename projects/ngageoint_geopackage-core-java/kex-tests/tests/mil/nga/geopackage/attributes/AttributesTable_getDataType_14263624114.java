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

public class AttributesTable_getDataType_14263624114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5055;

    public AttributesTable_getDataType_14263624114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5057 = new ArrayList();
        HashMap term5061 = new HashMap();
        term5055 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term5056 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5055, term5055.getClass(), "columns", null);
        setField(term5056, term5056.getClass(), "constraints", term5057);
        setField(term5056, term5056.getClass(), "typedContraints", term5061);
        setField(term5055, term5055.getClass(), "constraints", term5056);
        setField(term5055, term5055.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term5055, args);
    }

};


