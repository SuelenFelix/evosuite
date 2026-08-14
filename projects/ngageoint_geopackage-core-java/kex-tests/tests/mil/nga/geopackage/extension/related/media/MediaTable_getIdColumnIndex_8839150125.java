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

public class MediaTable_getIdColumnIndex_8839150125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;

    public MediaTable_getIdColumnIndex_8839150125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2149 = new ArrayList();
        HashMap term2153 = new HashMap();
        term2123 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term2148 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2123, term2123.getClass(), "relationName", "dJGPlmSRnz");
        setField(term2123, term2123.getClass(), "dataType", "DPskuFUobI");
        setField(term2123, term2123.getClass(), "columns", null);
        setField(term2148, term2148.getClass(), "constraints", term2149);
        setField(term2148, term2148.getClass(), "typedContraints", term2153);
        setField(term2123, term2123.getClass(), "constraints", term2148);
        setField(term2123, term2123.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumnIndex", argTypes, term2123, args);
    }

};


