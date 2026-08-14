package mil.nga.geopackage.extension.metadata;

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
import static mil.nga.geopackage.extension.metadata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Metadata_getStandardUri_6052521148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2806;

    public Metadata_getStandardUri_6052521148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2806 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term2806, term2806.getClass(), "id", -7237588299778557629L);
        setField(term2806, term2806.getClass(), "scope", "TEParAifyi");
        setField(term2806, term2806.getClass(), "standardUri", "OWDIEULEFu");
        setField(term2806, term2806.getClass(), "mimeType", "dWRymuLBtr");
        setField(term2806, term2806.getClass(), "metadata", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardUri", argTypes, term2806, args);
    }

};


