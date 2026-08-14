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

public class MediaTableMetadata_create_88694773920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34595;

    public MediaTableMetadata_create_88694773920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34595 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term34595, term34595.getClass(), "tableName", null);
        setField(term34595, term34595.getClass(), "dataType", null);
        setField(term34595, term34595.getClass(), "identifier", null);
        setField(term34595, term34595.getClass(), "description", null);
        setField(term34595, term34595.getClass(), "idColumnName", null);
        setBooleanField(term34595, term34595.getClass(), "autoincrement", false);
        setField(term34595, term34595.getClass(), "additionalColumns", null);
        setField(term34595, term34595.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term34595, args);
    }

};


