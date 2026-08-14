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

public class MetadataReference_getMetadata_42663502713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5431;

    public MetadataReference_getMetadata_42663502713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5468 = new Long(7009926388951271268L);
        Long term5573 = new Long(-7672528020740371001L);
        term5431 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term5470 = newInstance(Class.forName("java.util.Date"));
        Object term5472 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term5523 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term5431, term5431.getClass(), "referenceScope", "VMeAzAHwZj");
        setField(term5431, term5431.getClass(), "tableName", "PznxWXsZME");
        setField(term5431, term5431.getClass(), "columnName", "ZzIujlwVsw");
        setField(term5431, term5431.getClass(), "rowIdValue", term5468);
        setLongField(term5470, term5470.getClass(), "fastTime", 1349069753960L);
        setField(term5470, term5470.getClass(), "cdate", null);
        setField(term5431, term5431.getClass(), "timestamp", term5470);
        setLongField(term5472, term5472.getClass(), "id", 6617340557564669657L);
        setField(term5472, term5472.getClass(), "scope", "LWyEaeIyAo");
        setField(term5472, term5472.getClass(), "standardUri", "yVMkkQhvmN");
        setField(term5472, term5472.getClass(), "mimeType", "mvrkADEgpp");
        setField(term5472, term5472.getClass(), "metadata", "pXOkjyeIRb");
        setField(term5431, term5431.getClass(), "metadata", term5472);
        setLongField(term5431, term5431.getClass(), "fileId", 1439298019805881866L);
        setLongField(term5523, term5523.getClass(), "id", -8708192233349544946L);
        setField(term5523, term5523.getClass(), "scope", "GgZWSjxjyE");
        setField(term5523, term5523.getClass(), "standardUri", "EeBVbzjcCI");
        setField(term5523, term5523.getClass(), "mimeType", "UfQtPRyWRC");
        setField(term5523, term5523.getClass(), "metadata", "FPvxVzzSvD");
        setField(term5431, term5431.getClass(), "parentMetadata", term5523);
        setField(term5431, term5431.getClass(), "parentId", term5573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetadata", argTypes, term5431, args);
    }

};


