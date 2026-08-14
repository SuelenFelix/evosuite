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

public class MediaTableMetadata_create_46206915218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84589;
     Object term84591;

    public MediaTableMetadata_create_46206915218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84589 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term84589, term84589.getClass(), "tableName", null);
        setField(term84589, term84589.getClass(), "dataType", null);
        setField(term84589, term84589.getClass(), "identifier", null);
        setField(term84589, term84589.getClass(), "description", null);
        setField(term84589, term84589.getClass(), "idColumnName", null);
        setBooleanField(term84589, term84589.getClass(), "autoincrement", false);
        setField(term84589, term84589.getClass(), "additionalColumns", null);
        setField(term84589, term84589.getClass(), "columns", null);
        term84591 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term84591;
        callMethod(klass, "create", argTypes, term84589, args);
    }

};


