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

public class MediaTable_getContentTypeColumn_112400728529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7618;

    public MediaTable_getContentTypeColumn_112400728529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7644 = new ArrayList();
        HashMap term7648 = new HashMap();
        term7618 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term7643 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7618, term7618.getClass(), "relationName", "JisaWUxcNb");
        setField(term7618, term7618.getClass(), "dataType", "NxgmYPzWCI");
        setField(term7618, term7618.getClass(), "columns", null);
        setField(term7643, term7643.getClass(), "constraints", term7644);
        setField(term7643, term7643.getClass(), "typedContraints", term7648);
        setField(term7618, term7618.getClass(), "constraints", term7643);
        setField(term7618, term7618.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentTypeColumn", argTypes, term7618, args);
    }

};


