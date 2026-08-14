package mil.nga.geopackage.extension.metadata.reference;

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
import static mil.nga.geopackage.extension.metadata.reference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class MetadataReference_getRowIdValue_3530867159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4411;

    public MetadataReference_getRowIdValue_3530867159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4448 = new Long(-316468845751588286L);
        Long term4553 = new Long(5127676408959197577L);
        term4411 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term4450 = newInstance(Class.forName("java.util.Date"));
        Object term4452 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term4503 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term4411, term4411.getClass(), "referenceScope", "JqXGgAhZPl");
        setField(term4411, term4411.getClass(), "tableName", "jiKYgYHqIS");
        setField(term4411, term4411.getClass(), "columnName", "DfISiziTgG");
        setField(term4411, term4411.getClass(), "rowIdValue", term4448);
        setLongField(term4450, term4450.getClass(), "fastTime", 1645834034896L);
        setField(term4450, term4450.getClass(), "cdate", null);
        setField(term4411, term4411.getClass(), "timestamp", term4450);
        setLongField(term4452, term4452.getClass(), "id", 2486810210675247493L);
        setField(term4452, term4452.getClass(), "scope", "XqgfKFvPSD");
        setField(term4452, term4452.getClass(), "standardUri", "JiVRgTZvKc");
        setField(term4452, term4452.getClass(), "mimeType", "XPKmummaqg");
        setField(term4452, term4452.getClass(), "metadata", "BKLfkLiZTH");
        setField(term4411, term4411.getClass(), "metadata", term4452);
        setLongField(term4411, term4411.getClass(), "fileId", 7009926388951271268L);
        setLongField(term4503, term4503.getClass(), "id", -7672528020740371001L);
        setField(term4503, term4503.getClass(), "scope", "SPpkrGcPRr");
        setField(term4503, term4503.getClass(), "standardUri", "sEccwbJKYE");
        setField(term4503, term4503.getClass(), "mimeType", "AWRooQKkdW");
        setField(term4503, term4503.getClass(), "metadata", "vjxIhXHxGR");
        setField(term4411, term4411.getClass(), "parentMetadata", term4503);
        setField(term4411, term4411.getClass(), "parentId", term4553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowIdValue", argTypes, term4411, args);
    }

};


