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

public class MetadataReference_getParentId_183295800218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6881;

    public MetadataReference_getParentId_183295800218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6918 = new Long(1233889271256172047L);
        Long term7023 = new Long(6617340557564669657L);
        term6881 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term6920 = newInstance(Class.forName("java.util.Date"));
        Object term6922 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term6973 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term6881, term6881.getClass(), "referenceScope", "iikZEapDlu");
        setField(term6881, term6881.getClass(), "tableName", "nhoHrZfnIN");
        setField(term6881, term6881.getClass(), "columnName", "ZkMALXpEAZ");
        setField(term6881, term6881.getClass(), "rowIdValue", term6918);
        setLongField(term6920, term6920.getClass(), "fastTime", 1668569229825L);
        setField(term6920, term6920.getClass(), "cdate", null);
        setField(term6881, term6881.getClass(), "timestamp", term6920);
        setLongField(term6922, term6922.getClass(), "id", -2850532706972744550L);
        setField(term6922, term6922.getClass(), "scope", "tXfQjSqDzN");
        setField(term6922, term6922.getClass(), "standardUri", "BjugTaMcxJ");
        setField(term6922, term6922.getClass(), "mimeType", "vGiuZVPJNH");
        setField(term6922, term6922.getClass(), "metadata", "tlzpzIjMib");
        setField(term6881, term6881.getClass(), "metadata", term6922);
        setLongField(term6881, term6881.getClass(), "fileId", -2644215923136513282L);
        setLongField(term6973, term6973.getClass(), "id", -1468719814009985452L);
        setField(term6973, term6973.getClass(), "scope", "AZdLeSugwv");
        setField(term6973, term6973.getClass(), "standardUri", "RMsXuyzKJV");
        setField(term6973, term6973.getClass(), "mimeType", "FwPbDZcHmB");
        setField(term6973, term6973.getClass(), "metadata", "hOncybyCAH");
        setField(term6881, term6881.getClass(), "parentMetadata", term6973);
        setField(term6881, term6881.getClass(), "parentId", term7023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term6881, args);
    }

};


