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
import java.lang.Integer;

public class MediaTable_createRequiredColumns_147254009338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2470;
     Object term2471;

    public MediaTable_createRequiredColumns_147254009338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2470 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term2470, term2470.getClass(), "relationName", null);
        setField(term2470, term2470.getClass(), "dataType", null);
        setField(term2470, term2470.getClass(), "columns", null);
        setField(term2470, term2470.getClass(), "constraints", null);
        setField(term2470, term2470.getClass(), "contents", null);
        term2471 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2471;
        args[1] = null;
        callMethod(klass, "createRequiredColumns", argTypes, term2470, args);
    }

};


