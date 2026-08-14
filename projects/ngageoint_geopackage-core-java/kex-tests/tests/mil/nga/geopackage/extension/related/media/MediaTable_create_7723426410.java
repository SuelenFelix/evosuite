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

public class MediaTable_create_7723426410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1273;

    public MediaTable_create_7723426410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1335 = new ArrayList();
        ArrayList term1339 = new ArrayList();
        term1273 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term1273, term1273.getClass(), "tableName", "pXOkjyeIRb");
        setField(term1273, term1273.getClass(), "dataType", "GgZWSjxjyE");
        setField(term1273, term1273.getClass(), "identifier", "EeBVbzjcCI");
        setField(term1273, term1273.getClass(), "description", "UfQtPRyWRC");
        setField(term1273, term1273.getClass(), "idColumnName", "FPvxVzzSvD");
        setBooleanField(term1273, term1273.getClass(), "autoincrement", true);
        setField(term1273, term1273.getClass(), "additionalColumns", term1335);
        setField(term1273, term1273.getClass(), "columns", term1339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Object[] args = new Object[1];
        args[0] = term1273;
        callMethod(klass, "create", argTypes, null, args);
    }

};


