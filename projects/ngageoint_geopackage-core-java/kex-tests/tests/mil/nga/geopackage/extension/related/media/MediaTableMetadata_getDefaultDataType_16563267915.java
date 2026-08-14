package mil.nga.geopackage.extension.related.media;

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
import static mil.nga.geopackage.extension.related.media.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class MediaTableMetadata_getDefaultDataType_16563267915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4019;

    public MediaTableMetadata_getDefaultDataType_16563267915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4081 = new ArrayList();
        ArrayList term4085 = new ArrayList();
        term4019 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term4019, term4019.getClass(), "tableName", "UKAReurpHG");
        setField(term4019, term4019.getClass(), "dataType", "WVRMUmrljA");
        setField(term4019, term4019.getClass(), "identifier", "NTlKJDDWlk");
        setField(term4019, term4019.getClass(), "description", "vOuMEpOQAg");
        setField(term4019, term4019.getClass(), "idColumnName", "SIODFGaQhr");
        setBooleanField(term4019, term4019.getClass(), "autoincrement", true);
        setField(term4019, term4019.getClass(), "additionalColumns", term4081);
        setField(term4019, term4019.getClass(), "columns", term4085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term4019, args);
    }

};


