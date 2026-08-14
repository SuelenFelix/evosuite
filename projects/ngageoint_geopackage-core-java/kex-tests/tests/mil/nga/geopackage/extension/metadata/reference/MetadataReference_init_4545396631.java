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

public class MetadataReference_init_4545396631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1977;

    public MetadataReference_init_4545396631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2014 = new Long(2442117782898005296L);
        Long term2119 = new Long(6375119433582206027L);
        term1977 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term2016 = newInstance(Class.forName("java.util.Date"));
        Object term2018 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term2069 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term1977, term1977.getClass(), "referenceScope", "xxtlPwDYFs");
        setField(term1977, term1977.getClass(), "tableName", "jJCZpVmanW");
        setField(term1977, term1977.getClass(), "columnName", "EGtDIRbSSb");
        setField(term1977, term1977.getClass(), "rowIdValue", term2014);
        setLongField(term2016, term2016.getClass(), "fastTime", 1345871412244L);
        setField(term2016, term2016.getClass(), "cdate", null);
        setField(term1977, term1977.getClass(), "timestamp", term2016);
        setLongField(term2018, term2018.getClass(), "id", 2442117782898005296L);
        setField(term2018, term2018.getClass(), "scope", "SzjVpOQTyS");
        setField(term2018, term2018.getClass(), "standardUri", "MjGYSRKTNF");
        setField(term2018, term2018.getClass(), "mimeType", "hRNSzYYIrc");
        setField(term2018, term2018.getClass(), "metadata", "RMFIsYGgne");
        setField(term1977, term1977.getClass(), "metadata", term2018);
        setLongField(term1977, term1977.getClass(), "fileId", 6375119433582206027L);
        setLongField(term2069, term2069.getClass(), "id", -8257434502486459194L);
        setField(term2069, term2069.getClass(), "scope", "NRdvgJlhkX");
        setField(term2069, term2069.getClass(), "standardUri", "uuaPigETmJ");
        setField(term2069, term2069.getClass(), "mimeType", "MxlszYVzRf");
        setField(term2069, term2069.getClass(), "metadata", "LQFpaHEwXR");
        setField(term1977, term1977.getClass(), "parentMetadata", term2069);
        setField(term1977, term1977.getClass(), "parentId", term2119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Object[] args = new Object[1];
        args[0] = term1977;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


