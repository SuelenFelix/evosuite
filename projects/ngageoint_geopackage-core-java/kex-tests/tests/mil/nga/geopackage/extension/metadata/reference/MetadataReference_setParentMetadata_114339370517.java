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

public class MetadataReference_setParentMetadata_114339370517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6537;
     Object term6681;

    public MetadataReference_setParentMetadata_114339370517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6574 = new Long(-6823727938421990489L);
        Long term6679 = new Long(-484994522244390100L);
        term6537 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term6576 = newInstance(Class.forName("java.util.Date"));
        Object term6578 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term6629 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term6537, term6537.getClass(), "referenceScope", "YpJbIgJWWv");
        setField(term6537, term6537.getClass(), "tableName", "JppkknKVOw");
        setField(term6537, term6537.getClass(), "columnName", "iljANwuEjk");
        setField(term6537, term6537.getClass(), "rowIdValue", term6574);
        setLongField(term6576, term6576.getClass(), "fastTime", 1437757323580L);
        setField(term6576, term6576.getClass(), "cdate", null);
        setField(term6537, term6537.getClass(), "timestamp", term6576);
        setLongField(term6578, term6578.getClass(), "id", -3842548265506930260L);
        setField(term6578, term6578.getClass(), "scope", "kNqaJKIATy");
        setField(term6578, term6578.getClass(), "standardUri", "vKQukfbJUd");
        setField(term6578, term6578.getClass(), "mimeType", "lFRJFUMVbx");
        setField(term6578, term6578.getClass(), "metadata", "sZdUNdggUW");
        setField(term6537, term6537.getClass(), "metadata", term6578);
        setLongField(term6537, term6537.getClass(), "fileId", -5788180182343976541L);
        setLongField(term6629, term6629.getClass(), "id", 2936323121573284007L);
        setField(term6629, term6629.getClass(), "scope", "OqbwYQfvAe");
        setField(term6629, term6629.getClass(), "standardUri", "tRxZafjqIx");
        setField(term6629, term6629.getClass(), "mimeType", "DhjNLmRMCu");
        setField(term6629, term6629.getClass(), "metadata", "PgPzMSEjjX");
        setField(term6537, term6537.getClass(), "parentMetadata", term6629);
        setField(term6537, term6537.getClass(), "parentId", term6679);
        term6681 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term6681, term6681.getClass(), "id", -1154553077993834885L);
        setField(term6681, term6681.getClass(), "scope", "wzsPSPcRdj");
        setField(term6681, term6681.getClass(), "standardUri", "kGMQdqJYyB");
        setField(term6681, term6681.getClass(), "mimeType", "XJJNClzHRf");
        setField(term6681, term6681.getClass(), "metadata", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Object[] args = new Object[1];
        args[0] = term6681;
        callMethod(klass, "setParentMetadata", argTypes, term6537, args);
    }

};


