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

public class MediaTable_getContentTypeColumnIndex_126621599929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2343;

    public MediaTable_getContentTypeColumnIndex_126621599929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2369 = new ArrayList();
        HashMap term2373 = new HashMap();
        term2343 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term2368 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2343, term2343.getClass(), "relationName", "DzHVBMqWtE");
        setField(term2343, term2343.getClass(), "dataType", "THZSpzBRYP");
        setField(term2343, term2343.getClass(), "columns", null);
        setField(term2368, term2368.getClass(), "constraints", term2369);
        setField(term2368, term2368.getClass(), "typedContraints", term2373);
        setField(term2343, term2343.getClass(), "constraints", term2368);
        setField(term2343, term2343.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentTypeColumnIndex", argTypes, term2343, args);
    }

};


