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

public class SimpleAttributesTable_getIdColumnIndex_169938002622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13222;

    public SimpleAttributesTable_getIdColumnIndex_169938002622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13248 = new ArrayList();
        HashMap term13252 = new HashMap();
        term13222 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        Object term13247 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term13222, term13222.getClass(), "relationName", "lJoltmsadS");
        setField(term13222, term13222.getClass(), "dataType", "mvfDtZNEHr");
        setField(term13222, term13222.getClass(), "columns", null);
        setField(term13247, term13247.getClass(), "constraints", term13248);
        setField(term13247, term13247.getClass(), "typedContraints", term13252);
        setField(term13222, term13222.getClass(), "constraints", term13247);
        setField(term13222, term13222.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumnIndex", argTypes, term13222, args);
    }

};


