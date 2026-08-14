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

public class MediaTable_getIdColumn_202894807326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2178;

    public MediaTable_getIdColumn_202894807326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2204 = new ArrayList();
        HashMap term2208 = new HashMap();
        term2178 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term2203 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2178, term2178.getClass(), "relationName", "wBGfLpNNiZ");
        setField(term2178, term2178.getClass(), "dataType", "yUGCjlqgJE");
        setField(term2178, term2178.getClass(), "columns", null);
        setField(term2203, term2203.getClass(), "constraints", term2204);
        setField(term2203, term2203.getClass(), "typedContraints", term2208);
        setField(term2178, term2178.getClass(), "constraints", term2203);
        setField(term2178, term2178.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumn", argTypes, term2178, args);
    }

};


