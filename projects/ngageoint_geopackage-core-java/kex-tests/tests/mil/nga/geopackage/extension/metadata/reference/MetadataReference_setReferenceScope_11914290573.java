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
import java.lang.String;

public class MetadataReference_setReferenceScope_11914290573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2485;
     Object enum5;

    public MetadataReference_setReferenceScope_11914290573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2522 = new Long(5270370404989704783L);
        Long term2627 = new Long(7411271909051562686L);
        term2485 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term2524 = newInstance(Class.forName("java.util.Date"));
        Object term2526 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term2577 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term2485, term2485.getClass(), "referenceScope", "vrQLuWIDJX");
        setField(term2485, term2485.getClass(), "tableName", "flxyYxBRtu");
        setField(term2485, term2485.getClass(), "columnName", "OclPbYPkcH");
        setField(term2485, term2485.getClass(), "rowIdValue", term2522);
        setLongField(term2524, term2524.getClass(), "fastTime", 1610940182830L);
        setField(term2524, term2524.getClass(), "cdate", null);
        setField(term2485, term2485.getClass(), "timestamp", term2524);
        setLongField(term2526, term2526.getClass(), "id", 4872422362414183754L);
        setField(term2526, term2526.getClass(), "scope", "IoAlmYsBwc");
        setField(term2526, term2526.getClass(), "standardUri", "TEParAifyi");
        setField(term2526, term2526.getClass(), "mimeType", "OWDIEULEFu");
        setField(term2526, term2526.getClass(), "metadata", "dWRymuLBtr");
        setField(term2485, term2485.getClass(), "metadata", term2526);
        setLongField(term2485, term2485.getClass(), "fileId", 6811161968424632369L);
        setLongField(term2577, term2577.getClass(), "id", -7237588299778557629L);
        setField(term2577, term2577.getClass(), "scope", "AijpHYOFuy");
        setField(term2577, term2577.getClass(), "standardUri", "SbAoxhfrkn");
        setField(term2577, term2577.getClass(), "mimeType", "kuTXqwMtDB");
        setField(term2577, term2577.getClass(), "metadata", "Ghbwtircqb");
        setField(term2485, term2485.getClass(), "parentMetadata", term2577);
        setField(term2485, term2485.getClass(), "parentId", term2627);
        Class<? extends Object> term2752 = Class.forName((String) "mil.nga.geopackage.extension.metadata.reference.ReferenceScopeType");
        Field term2751 = ((Class) term2752).getDeclaredField((String) "ROW");
        ((Field) term2751).setAccessible(true);
        enum5 = ((Field) term2751).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.reference.ReferenceScopeType");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "setReferenceScope", argTypes, term2485, args);
    }

};


