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

public class MetadataReference_setTimestamp_209446655931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7155;

    public MetadataReference_setTimestamp_209446655931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7155 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        setField(term7155, term7155.getClass(), "referenceScope", null);
        setField(term7155, term7155.getClass(), "tableName", null);
        setField(term7155, term7155.getClass(), "columnName", null);
        setField(term7155, term7155.getClass(), "rowIdValue", null);
        setField(term7155, term7155.getClass(), "timestamp", null);
        setField(term7155, term7155.getClass(), "metadata", null);
        setLongField(term7155, term7155.getClass(), "fileId", 0L);
        setField(term7155, term7155.getClass(), "parentMetadata", null);
        setField(term7155, term7155.getClass(), "parentId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTimestamp", argTypes, term7155, args);
    }

};


