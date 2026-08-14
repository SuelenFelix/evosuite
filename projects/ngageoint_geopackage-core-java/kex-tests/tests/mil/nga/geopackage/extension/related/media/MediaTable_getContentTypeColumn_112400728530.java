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

public class MediaTable_getContentTypeColumn_112400728530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2398;

    public MediaTable_getContentTypeColumn_112400728530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2424 = new ArrayList();
        HashMap term2428 = new HashMap();
        term2398 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term2423 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2398, term2398.getClass(), "relationName", "ZfBIVGBQOE");
        setField(term2398, term2398.getClass(), "dataType", "QSrDQfEsTR");
        setField(term2398, term2398.getClass(), "columns", null);
        setField(term2423, term2423.getClass(), "constraints", term2424);
        setField(term2423, term2423.getClass(), "typedContraints", term2428);
        setField(term2398, term2398.getClass(), "constraints", term2423);
        setField(term2398, term2398.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentTypeColumn", argTypes, term2398, args);
    }

};


