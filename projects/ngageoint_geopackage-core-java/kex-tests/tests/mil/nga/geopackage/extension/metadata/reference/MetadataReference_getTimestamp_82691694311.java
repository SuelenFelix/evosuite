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

public class MetadataReference_getTimestamp_82691694311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4921;

    public MetadataReference_getTimestamp_82691694311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4958 = new Long(-2585684163342970173L);
        Long term5063 = new Long(8059786003080744426L);
        term4921 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term4960 = newInstance(Class.forName("java.util.Date"));
        Object term4962 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term5013 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term4921, term4921.getClass(), "referenceScope", "MvRIxilFMJ");
        setField(term4921, term4921.getClass(), "tableName", "iNwOJRBEjp");
        setField(term4921, term4921.getClass(), "columnName", "XylxrMBraH");
        setField(term4921, term4921.getClass(), "rowIdValue", term4958);
        setLongField(term4960, term4960.getClass(), "fastTime", 1797203628025L);
        setField(term4960, term4960.getClass(), "cdate", null);
        setField(term4921, term4921.getClass(), "timestamp", term4960);
        setLongField(term4962, term4962.getClass(), "id", 6855071767938501807L);
        setField(term4962, term4962.getClass(), "scope", "pORebkoRdD");
        setField(term4962, term4962.getClass(), "standardUri", "mXGCWJDOqA");
        setField(term4962, term4962.getClass(), "mimeType", "dpNsDgfPso");
        setField(term4962, term4962.getClass(), "metadata", "hCWPJQKpdc");
        setField(term4921, term4921.getClass(), "metadata", term4962);
        setLongField(term4921, term4921.getClass(), "fileId", -5892135042702373494L);
        setLongField(term5013, term5013.getClass(), "id", 5262507301787091109L);
        setField(term5013, term5013.getClass(), "scope", "WzMEhMXkKx");
        setField(term5013, term5013.getClass(), "standardUri", "XOiDvlDhdc");
        setField(term5013, term5013.getClass(), "mimeType", "AdxvLJhNLe");
        setField(term5013, term5013.getClass(), "metadata", "lHfTrWKMPk");
        setField(term4921, term4921.getClass(), "parentMetadata", term5013);
        setField(term4921, term4921.getClass(), "parentId", term5063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term4921, args);
    }

};


