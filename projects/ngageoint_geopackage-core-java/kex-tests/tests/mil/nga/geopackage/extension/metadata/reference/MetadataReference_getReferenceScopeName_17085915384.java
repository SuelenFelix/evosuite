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

public class MetadataReference_getReferenceScopeName_17085915384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3097;

    public MetadataReference_getReferenceScopeName_17085915384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3134 = new Long(4872422362414183754L);
        Long term3239 = new Long(6811161968424632369L);
        term3097 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term3136 = newInstance(Class.forName("java.util.Date"));
        Object term3138 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term3189 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term3097, term3097.getClass(), "referenceScope", "xrwlQZdwCp");
        setField(term3097, term3097.getClass(), "tableName", "IDCWpPLRkE");
        setField(term3097, term3097.getClass(), "columnName", "nyiiPDVjAc");
        setField(term3097, term3097.getClass(), "rowIdValue", term3134);
        setLongField(term3136, term3136.getClass(), "fastTime", 1606045635837L);
        setField(term3136, term3136.getClass(), "cdate", null);
        setField(term3097, term3097.getClass(), "timestamp", term3136);
        setLongField(term3138, term3138.getClass(), "id", 6967924379644551255L);
        setField(term3138, term3138.getClass(), "scope", "aKnKipADSo");
        setField(term3138, term3138.getClass(), "standardUri", "wSQxaModmm");
        setField(term3138, term3138.getClass(), "mimeType", "UlajhuVLaP");
        setField(term3138, term3138.getClass(), "metadata", "gGSMzuGICf");
        setField(term3097, term3097.getClass(), "metadata", term3138);
        setLongField(term3097, term3097.getClass(), "fileId", -2813493605142626659L);
        setLongField(term3189, term3189.getClass(), "id", -8885298608300233488L);
        setField(term3189, term3189.getClass(), "scope", "hxCBltsObl");
        setField(term3189, term3189.getClass(), "standardUri", "BndsHwAFMv");
        setField(term3189, term3189.getClass(), "mimeType", "GzFkzHGYFt");
        setField(term3189, term3189.getClass(), "metadata", "tShwQLRGNe");
        setField(term3097, term3097.getClass(), "parentMetadata", term3189);
        setField(term3097, term3097.getClass(), "parentId", term3239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferenceScopeName", argTypes, term3097, args);
    }

};


