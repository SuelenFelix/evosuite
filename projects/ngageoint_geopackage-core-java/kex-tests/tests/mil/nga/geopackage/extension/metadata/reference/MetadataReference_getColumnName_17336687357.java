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

public class MetadataReference_getColumnName_17336687357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3881;

    public MetadataReference_getColumnName_17336687357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3918 = new Long(-4325723315152823407L);
        Long term4023 = new Long(2535595959091595249L);
        term3881 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term3920 = newInstance(Class.forName("java.util.Date"));
        Object term3922 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term3973 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term3881, term3881.getClass(), "referenceScope", "whBvTVIIlC");
        setField(term3881, term3881.getClass(), "tableName", "IgRJUzaCwW");
        setField(term3881, term3881.getClass(), "columnName", "JUmudUmaaV");
        setField(term3881, term3881.getClass(), "rowIdValue", term3918);
        setLongField(term3920, term3920.getClass(), "fastTime", 1429023851389L);
        setField(term3920, term3920.getClass(), "cdate", null);
        setField(term3881, term3881.getClass(), "timestamp", term3920);
        setLongField(term3922, term3922.getClass(), "id", -6573104506744284592L);
        setField(term3922, term3922.getClass(), "scope", "KoyGrUJeJW");
        setField(term3922, term3922.getClass(), "standardUri", "HqBOwkVqjD");
        setField(term3922, term3922.getClass(), "mimeType", "MAcUBcBckh");
        setField(term3922, term3922.getClass(), "metadata", "oVgzLbrsFr");
        setField(term3881, term3881.getClass(), "metadata", term3922);
        setLongField(term3881, term3881.getClass(), "fileId", -4920224193275732920L);
        setLongField(term3973, term3973.getClass(), "id", 8428634514691209827L);
        setField(term3973, term3973.getClass(), "scope", "vQVyKLdtaz");
        setField(term3973, term3973.getClass(), "standardUri", "OWKQODBLzb");
        setField(term3973, term3973.getClass(), "mimeType", "wGmYcqUkgE");
        setField(term3973, term3973.getClass(), "metadata", "idgaQsnJpQ");
        setField(term3881, term3881.getClass(), "parentMetadata", term3973);
        setField(term3881, term3881.getClass(), "parentId", term4023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumnName", argTypes, term3881, args);
    }

};


