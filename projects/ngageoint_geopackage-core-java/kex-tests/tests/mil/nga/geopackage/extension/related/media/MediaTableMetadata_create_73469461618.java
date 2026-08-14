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

public class MediaTableMetadata_create_73469461618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4261;

    public MediaTableMetadata_create_73469461618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4261 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term4261, term4261.getClass(), "tableName", null);
        setField(term4261, term4261.getClass(), "dataType", null);
        setField(term4261, term4261.getClass(), "identifier", null);
        setField(term4261, term4261.getClass(), "description", null);
        setField(term4261, term4261.getClass(), "idColumnName", null);
        setBooleanField(term4261, term4261.getClass(), "autoincrement", false);
        setField(term4261, term4261.getClass(), "additionalColumns", null);
        setField(term4261, term4261.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term4261, args);
    }

};


