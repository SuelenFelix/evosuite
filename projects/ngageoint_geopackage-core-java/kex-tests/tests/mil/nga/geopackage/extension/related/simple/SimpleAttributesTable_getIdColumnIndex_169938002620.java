package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAttributesTable_getIdColumnIndex_169938002620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;

    public SimpleAttributesTable_getIdColumnIndex_169938002620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term507 = new ArrayList();
        HashMap term511 = new HashMap();
        term481 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        Object term506 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term481, term481.getClass(), "relationName", "pCTimMblYc");
        setField(term481, term481.getClass(), "dataType", "hNxWaHcfhY");
        setField(term481, term481.getClass(), "columns", null);
        setField(term506, term506.getClass(), "constraints", term507);
        setField(term506, term506.getClass(), "typedContraints", term511);
        setField(term481, term481.getClass(), "constraints", term506);
        setField(term481, term481.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumnIndex", argTypes, term481, args);
    }

};


