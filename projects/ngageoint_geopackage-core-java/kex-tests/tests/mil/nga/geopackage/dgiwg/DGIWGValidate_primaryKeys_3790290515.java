package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class DGIWGValidate_primaryKeys_3790290515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32328;

    public DGIWGValidate_primaryKeys_3790290515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32365 = new Long(2442117782898005296L);
        Long term32470 = new Long(6375119433582206027L);
        term32328 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term32367 = newInstance(Class.forName("java.util.Date"));
        Object term32369 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term32420 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term32328, term32328.getClass(), "referenceScope", "yQUDyOroXU");
        setField(term32328, term32328.getClass(), "tableName", "xweqkPdyJH");
        setField(term32328, term32328.getClass(), "columnName", "kwteHWzwcc");
        setField(term32328, term32328.getClass(), "rowIdValue", term32365);
        setLongField(term32367, term32367.getClass(), "fastTime", 1802995433545L);
        setField(term32367, term32367.getClass(), "cdate", null);
        setField(term32328, term32328.getClass(), "timestamp", term32367);
        setLongField(term32369, term32369.getClass(), "id", 6967924379644551255L);
        setField(term32369, term32369.getClass(), "scope", "uMsWXqNhln");
        setField(term32369, term32369.getClass(), "standardUri", "MAnhIPOtHL");
        setField(term32369, term32369.getClass(), "mimeType", "dikKjYjmRO");
        setField(term32369, term32369.getClass(), "metadata", "GJnnMDVnEP");
        setField(term32328, term32328.getClass(), "metadata", term32369);
        setLongField(term32328, term32328.getClass(), "fileId", -2813493605142626659L);
        setLongField(term32420, term32420.getClass(), "id", -8885298608300233488L);
        setField(term32420, term32420.getClass(), "scope", "zSMVllDpfk");
        setField(term32420, term32420.getClass(), "standardUri", "iptRXVDoYE");
        setField(term32420, term32420.getClass(), "mimeType", "kucsxnvbES");
        setField(term32420, term32420.getClass(), "metadata", "IdGzDFfcZf");
        setField(term32328, term32328.getClass(), "parentMetadata", term32420);
        setField(term32328, term32328.getClass(), "parentId", term32470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Object[] args = new Object[1];
        args[0] = term32328;
        callMethod(klass, "primaryKeys", argTypes, null, args);
    }

};


