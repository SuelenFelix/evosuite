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

public class MetadataReference_getParentMetadata_205043887716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6283;

    public MetadataReference_getParentMetadata_205043887716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6320 = new Long(-5892135042702373494L);
        Long term6425 = new Long(5262507301787091109L);
        term6283 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term6322 = newInstance(Class.forName("java.util.Date"));
        Object term6324 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term6375 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term6283, term6283.getClass(), "referenceScope", "xtftXXMbem");
        setField(term6283, term6283.getClass(), "tableName", "cudZvLMQon");
        setField(term6283, term6283.getClass(), "columnName", "lihXWlGDxk");
        setField(term6283, term6283.getClass(), "rowIdValue", term6320);
        setLongField(term6322, term6322.getClass(), "fastTime", 1882638884364L);
        setField(term6322, term6322.getClass(), "cdate", null);
        setField(term6283, term6283.getClass(), "timestamp", term6322);
        setLongField(term6324, term6324.getClass(), "id", -2170847986967241072L);
        setField(term6324, term6324.getClass(), "scope", "JmcmxoGhIK");
        setField(term6324, term6324.getClass(), "standardUri", "jXzmYyrnnT");
        setField(term6324, term6324.getClass(), "mimeType", "igCAtimmYB");
        setField(term6324, term6324.getClass(), "metadata", "DyiXbeYIaN");
        setField(term6283, term6283.getClass(), "metadata", term6324);
        setLongField(term6283, term6283.getClass(), "fileId", 4044358158040652353L);
        setLongField(term6375, term6375.getClass(), "id", -4443169559037975007L);
        setField(term6375, term6375.getClass(), "scope", "VGizxZnyHX");
        setField(term6375, term6375.getClass(), "standardUri", "kVEZMHmRtR");
        setField(term6375, term6375.getClass(), "mimeType", "ekxGuOYIwi");
        setField(term6375, term6375.getClass(), "metadata", "RbVQXSpxXy");
        setField(term6283, term6283.getClass(), "parentMetadata", term6375);
        setField(term6283, term6283.getClass(), "parentId", term6425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentMetadata", argTypes, term6283, args);
    }

};


