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

public class MediaTable_getContentTypeColumnIndex_126621599928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7563;

    public MediaTable_getContentTypeColumnIndex_126621599928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7589 = new ArrayList();
        HashMap term7593 = new HashMap();
        term7563 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term7588 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7563, term7563.getClass(), "relationName", "OGQsfjmReM");
        setField(term7563, term7563.getClass(), "dataType", "YsUtbngnRO");
        setField(term7563, term7563.getClass(), "columns", null);
        setField(term7588, term7588.getClass(), "constraints", term7589);
        setField(term7588, term7588.getClass(), "typedContraints", term7593);
        setField(term7563, term7563.getClass(), "constraints", term7588);
        setField(term7563, term7563.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentTypeColumnIndex", argTypes, term7563, args);
    }

};


