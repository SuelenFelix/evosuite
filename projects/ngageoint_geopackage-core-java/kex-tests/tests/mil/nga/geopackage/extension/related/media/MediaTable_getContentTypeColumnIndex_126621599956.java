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

public class MediaTable_getContentTypeColumnIndex_126621599956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2505;

    public MediaTable_getContentTypeColumnIndex_126621599956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2505 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term2505, term2505.getClass(), "relationName", null);
        setField(term2505, term2505.getClass(), "dataType", null);
        setField(term2505, term2505.getClass(), "columns", null);
        setField(term2505, term2505.getClass(), "constraints", null);
        setField(term2505, term2505.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentTypeColumnIndex", argTypes, term2505, args);
    }

};


