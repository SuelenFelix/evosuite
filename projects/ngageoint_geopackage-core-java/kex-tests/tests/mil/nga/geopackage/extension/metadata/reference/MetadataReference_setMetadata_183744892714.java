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

public class MetadataReference_setMetadata_183744892714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5685;
     Object term5829;

    public MetadataReference_setMetadata_183744892714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5722 = new Long(-4502405999831680926L);
        Long term5827 = new Long(1967728129628047933L);
        term5685 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term5724 = newInstance(Class.forName("java.util.Date"));
        Object term5726 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term5777 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term5685, term5685.getClass(), "referenceScope", "WHcwFgsGFC");
        setField(term5685, term5685.getClass(), "tableName", "HzqpegHiRq");
        setField(term5685, term5685.getClass(), "columnName", "jwsfVjMoJT");
        setField(term5685, term5685.getClass(), "rowIdValue", term5722);
        setLongField(term5724, term5724.getClass(), "fastTime", 1706078172457L);
        setField(term5724, term5724.getClass(), "cdate", null);
        setField(term5685, term5685.getClass(), "timestamp", term5724);
        setLongField(term5726, term5726.getClass(), "id", 5907001541142728739L);
        setField(term5726, term5726.getClass(), "scope", "ZfdXfCCFDf");
        setField(term5726, term5726.getClass(), "standardUri", "MwwjNtdOFT");
        setField(term5726, term5726.getClass(), "mimeType", "VYkqXKVlAJ");
        setField(term5726, term5726.getClass(), "metadata", "XkIoWJRNwN");
        setField(term5685, term5685.getClass(), "metadata", term5726);
        setLongField(term5685, term5685.getClass(), "fileId", 4178434741742309755L);
        setLongField(term5777, term5777.getClass(), "id", -2068172595987555756L);
        setField(term5777, term5777.getClass(), "scope", "aNWLJdrZMq");
        setField(term5777, term5777.getClass(), "standardUri", "HHmNoYxIGj");
        setField(term5777, term5777.getClass(), "mimeType", "PtirvZmsGt");
        setField(term5777, term5777.getClass(), "metadata", "HWkpTmtlrc");
        setField(term5685, term5685.getClass(), "parentMetadata", term5777);
        setField(term5685, term5685.getClass(), "parentId", term5827);
        term5829 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term5829, term5829.getClass(), "id", -6292278961887936280L);
        setField(term5829, term5829.getClass(), "scope", "hMmaoREuCK");
        setField(term5829, term5829.getClass(), "standardUri", "VeDtgDzGAN");
        setField(term5829, term5829.getClass(), "mimeType", "aWYOWZFyaX");
        setField(term5829, term5829.getClass(), "metadata", "BRIVNtfUWU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Object[] args = new Object[1];
        args[0] = term5829;
        callMethod(klass, "setMetadata", argTypes, term5685, args);
    }

};


