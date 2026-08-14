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

public class MetadataReference_getFileId_15136590415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6029;

    public MetadataReference_getFileId_15136590415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6066 = new Long(2120084523938730454L);
        Long term6171 = new Long(6855071767938501807L);
        term6029 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term6068 = newInstance(Class.forName("java.util.Date"));
        Object term6070 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term6121 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term6029, term6029.getClass(), "referenceScope", "DbiCVtPPCT");
        setField(term6029, term6029.getClass(), "tableName", "WzFopsaDuG");
        setField(term6029, term6029.getClass(), "columnName", "PapWxkhEWe");
        setField(term6029, term6029.getClass(), "rowIdValue", term6066);
        setLongField(term6068, term6068.getClass(), "fastTime", 1863631094992L);
        setField(term6068, term6068.getClass(), "cdate", null);
        setField(term6029, term6029.getClass(), "timestamp", term6068);
        setLongField(term6070, term6070.getClass(), "id", -6645965768855543712L);
        setField(term6070, term6070.getClass(), "scope", "smnHEqRFRx");
        setField(term6070, term6070.getClass(), "standardUri", "XYtryyobou");
        setField(term6070, term6070.getClass(), "mimeType", "OYbzXylRWW");
        setField(term6070, term6070.getClass(), "metadata", "DSNsTGYXDF");
        setField(term6029, term6029.getClass(), "metadata", term6070);
        setLongField(term6029, term6029.getClass(), "fileId", 4784595517102746672L);
        setLongField(term6121, term6121.getClass(), "id", -7612550318181586304L);
        setField(term6121, term6121.getClass(), "scope", "sQvGcVjdEx");
        setField(term6121, term6121.getClass(), "standardUri", "rLHAoqXgPh");
        setField(term6121, term6121.getClass(), "mimeType", "zUlRdimJtU");
        setField(term6121, term6121.getClass(), "metadata", "vwbEQQNQrx");
        setField(term6029, term6029.getClass(), "parentMetadata", term6121);
        setField(term6029, term6029.getClass(), "parentId", term6171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileId", argTypes, term6029, args);
    }

};


