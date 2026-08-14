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

public class MediaTableMetadata_create_88694773916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84585;

    public MediaTableMetadata_create_88694773916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84585 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term84585, term84585.getClass(), "tableName", null);
        setField(term84585, term84585.getClass(), "dataType", null);
        setField(term84585, term84585.getClass(), "identifier", null);
        setField(term84585, term84585.getClass(), "description", null);
        setField(term84585, term84585.getClass(), "idColumnName", null);
        setBooleanField(term84585, term84585.getClass(), "autoincrement", false);
        setField(term84585, term84585.getClass(), "additionalColumns", null);
        setField(term84585, term84585.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term84585, args);
    }

};


