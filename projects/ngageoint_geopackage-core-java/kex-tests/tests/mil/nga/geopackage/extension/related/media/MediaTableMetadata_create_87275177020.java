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
import java.lang.Boolean;

public class MediaTableMetadata_create_87275177020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84595;
     Object term84597;

    public MediaTableMetadata_create_87275177020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84595 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term84595, term84595.getClass(), "tableName", null);
        setField(term84595, term84595.getClass(), "dataType", null);
        setField(term84595, term84595.getClass(), "identifier", null);
        setField(term84595, term84595.getClass(), "description", null);
        setField(term84595, term84595.getClass(), "idColumnName", null);
        setBooleanField(term84595, term84595.getClass(), "autoincrement", false);
        setField(term84595, term84595.getClass(), "additionalColumns", null);
        setField(term84595, term84595.getClass(), "columns", null);
        term84597 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term84597;
        args[2] = null;
        callMethod(klass, "create", argTypes, term84595, args);
    }

};


