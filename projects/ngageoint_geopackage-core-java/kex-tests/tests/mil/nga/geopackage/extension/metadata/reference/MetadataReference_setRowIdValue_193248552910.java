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

public class MetadataReference_setRowIdValue_193248552910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4665;
     Object term4809;

    public MetadataReference_setRowIdValue_193248552910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4702 = new Long(-6573104506744284592L);
        Long term4807 = new Long(-4920224193275732920L);
        term4665 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term4704 = newInstance(Class.forName("java.util.Date"));
        Object term4706 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term4757 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term4665, term4665.getClass(), "referenceScope", "QXzGXbEXMu");
        setField(term4665, term4665.getClass(), "tableName", "qxSDVejjiY");
        setField(term4665, term4665.getClass(), "columnName", "xBsXSDjXYK");
        setField(term4665, term4665.getClass(), "rowIdValue", term4702);
        setLongField(term4704, term4704.getClass(), "fastTime", 1500721068023L);
        setField(term4704, term4704.getClass(), "cdate", null);
        setField(term4665, term4665.getClass(), "timestamp", term4704);
        setLongField(term4706, term4706.getClass(), "id", -4502405999831680926L);
        setField(term4706, term4706.getClass(), "scope", "sEnIVFtZuQ");
        setField(term4706, term4706.getClass(), "standardUri", "ZVecLZMLHF");
        setField(term4706, term4706.getClass(), "mimeType", "fztQhjqwdP");
        setField(term4706, term4706.getClass(), "metadata", "eVpkWxjuki");
        setField(term4665, term4665.getClass(), "metadata", term4706);
        setLongField(term4665, term4665.getClass(), "fileId", 1967728129628047933L);
        setLongField(term4757, term4757.getClass(), "id", 2120084523938730454L);
        setField(term4757, term4757.getClass(), "scope", "SJiQaLvSKv");
        setField(term4757, term4757.getClass(), "standardUri", "OEXDRUKcFl");
        setField(term4757, term4757.getClass(), "mimeType", "RYdKCNNMBR");
        setField(term4757, term4757.getClass(), "metadata", "yGtHPyvYiQ");
        setField(term4665, term4665.getClass(), "parentMetadata", term4757);
        setField(term4665, term4665.getClass(), "parentId", term4807);
        term4809 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4809;
        callMethod(klass, "setRowIdValue", argTypes, term4665, args);
    }

};


