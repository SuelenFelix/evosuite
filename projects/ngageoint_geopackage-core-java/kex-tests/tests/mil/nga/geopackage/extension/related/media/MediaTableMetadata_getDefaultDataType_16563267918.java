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

public class MediaTableMetadata_getDefaultDataType_16563267918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34355;

    public MediaTableMetadata_getDefaultDataType_16563267918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34417 = new ArrayList();
        ArrayList term34421 = new ArrayList();
        term34355 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term34355, term34355.getClass(), "tableName", "CURQCMkqbZ");
        setField(term34355, term34355.getClass(), "dataType", "VZwkkQktrm");
        setField(term34355, term34355.getClass(), "identifier", "wIuJvIvEMb");
        setField(term34355, term34355.getClass(), "description", "EyojsbSjWT");
        setField(term34355, term34355.getClass(), "idColumnName", "szGicGyWDL");
        setBooleanField(term34355, term34355.getClass(), "autoincrement", true);
        setField(term34355, term34355.getClass(), "additionalColumns", term34417);
        setField(term34355, term34355.getClass(), "columns", term34421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term34355, args);
    }

};


