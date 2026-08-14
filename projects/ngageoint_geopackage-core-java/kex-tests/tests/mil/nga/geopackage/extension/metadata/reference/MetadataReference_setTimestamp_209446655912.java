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

public class MetadataReference_setTimestamp_209446655912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5175;
     Object term5319;

    public MetadataReference_setTimestamp_209446655912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5212 = new Long(-4365849114644724155L);
        Long term5317 = new Long(2486810210675247493L);
        term5175 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term5214 = newInstance(Class.forName("java.util.Date"));
        Object term5216 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term5267 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term5175, term5175.getClass(), "referenceScope", "JDaAnsVTGV");
        setField(term5175, term5175.getClass(), "tableName", "mLUZFTfjle");
        setField(term5175, term5175.getClass(), "columnName", "xIeFjkHkOe");
        setField(term5175, term5175.getClass(), "rowIdValue", term5212);
        setLongField(term5214, term5214.getClass(), "fastTime", 1589457921030L);
        setField(term5214, term5214.getClass(), "cdate", null);
        setField(term5175, term5175.getClass(), "timestamp", term5214);
        setLongField(term5216, term5216.getClass(), "id", -6823727938421990489L);
        setField(term5216, term5216.getClass(), "scope", "SdCKLMIYnX");
        setField(term5216, term5216.getClass(), "standardUri", "OJJtVNPyKZ");
        setField(term5216, term5216.getClass(), "mimeType", "AKNapTAfmD");
        setField(term5216, term5216.getClass(), "metadata", "xJgPlLxpgC");
        setField(term5175, term5175.getClass(), "metadata", term5216);
        setLongField(term5175, term5175.getClass(), "fileId", -484994522244390100L);
        setLongField(term5267, term5267.getClass(), "id", 1233889271256172047L);
        setField(term5267, term5267.getClass(), "scope", "EYtfuJaxiM");
        setField(term5267, term5267.getClass(), "standardUri", "gCWtLVKVVe");
        setField(term5267, term5267.getClass(), "mimeType", "fWKJoSoCwE");
        setField(term5267, term5267.getClass(), "metadata", "wfaXBpWAUH");
        setField(term5175, term5175.getClass(), "parentMetadata", term5267);
        setField(term5175, term5175.getClass(), "parentId", term5317);
        term5319 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5319, term5319.getClass(), "fastTime", 1745462962080L);
        setField(term5319, term5319.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term5319;
        callMethod(klass, "setTimestamp", argTypes, term5175, args);
    }

};


