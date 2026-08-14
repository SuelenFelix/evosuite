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

public class MediaTable_createRequiredColumns_147254009337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7690;
     Object term7691;

    public MediaTable_createRequiredColumns_147254009337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7690 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term7690, term7690.getClass(), "relationName", null);
        setField(term7690, term7690.getClass(), "dataType", null);
        setField(term7690, term7690.getClass(), "columns", null);
        setField(term7690, term7690.getClass(), "constraints", null);
        setField(term7690, term7690.getClass(), "contents", null);
        term7691 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term7691;
        args[1] = null;
        callMethod(klass, "createRequiredColumns", argTypes, term7690, args);
    }

};


