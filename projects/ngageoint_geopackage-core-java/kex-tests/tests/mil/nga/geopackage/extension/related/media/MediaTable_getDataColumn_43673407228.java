package mil.nga.geopackage.extension.related.media;

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
import static mil.nga.geopackage.extension.related.media.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MediaTable_getDataColumn_43673407228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;

    public MediaTable_getDataColumn_43673407228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2314 = new ArrayList();
        HashMap term2318 = new HashMap();
        term2288 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term2313 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2288, term2288.getClass(), "relationName", "qnvxzwuGKX");
        setField(term2288, term2288.getClass(), "dataType", "EdPAvpluZg");
        setField(term2288, term2288.getClass(), "columns", null);
        setField(term2313, term2313.getClass(), "constraints", term2314);
        setField(term2313, term2313.getClass(), "typedContraints", term2318);
        setField(term2288, term2288.getClass(), "constraints", term2313);
        setField(term2288, term2288.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataColumn", argTypes, term2288, args);
    }

};


