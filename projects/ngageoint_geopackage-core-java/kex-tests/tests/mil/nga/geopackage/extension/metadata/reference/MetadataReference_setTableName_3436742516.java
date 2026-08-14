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

public class MetadataReference_setTableName_3436742516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3605;

    public MetadataReference_setTableName_3436742516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3642 = new Long(-2813493605142626659L);
        Long term3747 = new Long(-8885298608300233488L);
        term3605 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term3644 = newInstance(Class.forName("java.util.Date"));
        Object term3646 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term3697 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term3605, term3605.getClass(), "referenceScope", "ytSBIKXogI");
        setField(term3605, term3605.getClass(), "tableName", "nHXjMycHlU");
        setField(term3605, term3605.getClass(), "columnName", "ieCtQFdkii");
        setField(term3605, term3605.getClass(), "rowIdValue", term3642);
        setLongField(term3644, term3644.getClass(), "fastTime", 1515890130018L);
        setField(term3644, term3644.getClass(), "cdate", null);
        setField(term3605, term3605.getClass(), "timestamp", term3644);
        setLongField(term3646, term3646.getClass(), "id", -872011222785455006L);
        setField(term3646, term3646.getClass(), "scope", "dEnhdmILtU");
        setField(term3646, term3646.getClass(), "standardUri", "hoicvmsovO");
        setField(term3646, term3646.getClass(), "mimeType", "eqJfYWRaEL");
        setField(term3646, term3646.getClass(), "metadata", "fhkbdRViHi");
        setField(term3605, term3605.getClass(), "metadata", term3646);
        setLongField(term3605, term3605.getClass(), "fileId", -316468845751588286L);
        setLongField(term3697, term3697.getClass(), "id", 5127676408959197577L);
        setField(term3697, term3697.getClass(), "scope", "uWHnvSvaPl");
        setField(term3697, term3697.getClass(), "standardUri", "kBdSllIBVz");
        setField(term3697, term3697.getClass(), "mimeType", "TJmVBGfTML");
        setField(term3697, term3697.getClass(), "metadata", "tPlsykYBqO");
        setField(term3605, term3605.getClass(), "parentMetadata", term3697);
        setField(term3605, term3605.getClass(), "parentId", term3747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        callMethod(klass, "setTableName", argTypes, term3605, args);
    }

};


