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

public class MetadataReference_getTableName_1809168115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3351;

    public MetadataReference_getTableName_1809168115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3388 = new Long(-7237588299778557629L);
        Long term3493 = new Long(6967924379644551255L);
        term3351 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term3390 = newInstance(Class.forName("java.util.Date"));
        Object term3392 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term3443 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term3351, term3351.getClass(), "referenceScope", "LvtrsXUliU");
        setField(term3351, term3351.getClass(), "tableName", "xLbjWUgOIL");
        setField(term3351, term3351.getClass(), "columnName", "jDtqGUpnZN");
        setField(term3351, term3351.getClass(), "rowIdValue", term3388);
        setLongField(term3390, term3390.getClass(), "fastTime", 1442639565302L);
        setField(term3390, term3390.getClass(), "cdate", null);
        setField(term3351, term3351.getClass(), "timestamp", term3390);
        setLongField(term3392, term3392.getClass(), "id", -4325723315152823407L);
        setField(term3392, term3392.getClass(), "scope", "nGKItKLYNC");
        setField(term3392, term3392.getClass(), "standardUri", "UiUYnPrcCi");
        setField(term3392, term3392.getClass(), "mimeType", "UoYtihxVaS");
        setField(term3392, term3392.getClass(), "metadata", "JDswTTCZHV");
        setField(term3351, term3351.getClass(), "metadata", term3392);
        setLongField(term3351, term3351.getClass(), "fileId", 2535595959091595249L);
        setLongField(term3443, term3443.getClass(), "id", -5476826692763582090L);
        setField(term3443, term3443.getClass(), "scope", "onpbIeEKoi");
        setField(term3443, term3443.getClass(), "standardUri", "YRHGsAkhxb");
        setField(term3443, term3443.getClass(), "mimeType", "ffYhPOzlUs");
        setField(term3443, term3443.getClass(), "metadata", "MLqYREekMl");
        setField(term3351, term3351.getClass(), "parentMetadata", term3443);
        setField(term3351, term3351.getClass(), "parentId", term3493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term3351, args);
    }

};


