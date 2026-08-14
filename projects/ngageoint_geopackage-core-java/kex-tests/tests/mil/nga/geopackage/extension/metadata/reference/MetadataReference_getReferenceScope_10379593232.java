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

public class MetadataReference_getReferenceScope_10379593232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public MetadataReference_getReferenceScope_10379593232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2268 = new Long(-8257434502486459194L);
        Long term2373 = new Long(-8400487765614892086L);
        term2231 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term2270 = newInstance(Class.forName("java.util.Date"));
        Object term2272 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term2323 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term2231, term2231.getClass(), "referenceScope", "oVcInYnLWB");
        setField(term2231, term2231.getClass(), "tableName", "aJlieCFVtF");
        setField(term2231, term2231.getClass(), "columnName", "ZiaGIbnzTs");
        setField(term2231, term2231.getClass(), "rowIdValue", term2268);
        setLongField(term2270, term2270.getClass(), "fastTime", 1480438351369L);
        setField(term2270, term2270.getClass(), "cdate", null);
        setField(term2231, term2231.getClass(), "timestamp", term2270);
        setLongField(term2272, term2272.getClass(), "id", -8400487765614892086L);
        setField(term2272, term2272.getClass(), "scope", "tbcdzjIfER");
        setField(term2272, term2272.getClass(), "standardUri", "HyxfbSQYBe");
        setField(term2272, term2272.getClass(), "mimeType", "pCTimMblYc");
        setField(term2272, term2272.getClass(), "metadata", "hNxWaHcfhY");
        setField(term2231, term2231.getClass(), "metadata", term2272);
        setLongField(term2231, term2231.getClass(), "fileId", 5270370404989704783L);
        setLongField(term2323, term2323.getClass(), "id", 7411271909051562686L);
        setField(term2323, term2323.getClass(), "scope", "RkybSrpybU");
        setField(term2323, term2323.getClass(), "standardUri", "xOEqzGAmDU");
        setField(term2323, term2323.getClass(), "mimeType", "eZFUvlxvGV");
        setField(term2323, term2323.getClass(), "metadata", "BYqFIqCKAV");
        setField(term2231, term2231.getClass(), "parentMetadata", term2323);
        setField(term2231, term2231.getClass(), "parentId", term2373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferenceScope", argTypes, term2231, args);
    }

};


