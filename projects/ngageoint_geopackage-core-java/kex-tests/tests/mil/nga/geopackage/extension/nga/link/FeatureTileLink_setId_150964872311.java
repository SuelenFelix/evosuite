package mil.nga.geopackage.extension.nga.link;

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
import static mil.nga.geopackage.extension.nga.link.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FeatureTileLink_setId_150964872311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823;

    public FeatureTileLink_setId_150964872311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLink"));
        setField(term823, term823.getClass(), "featureTableName", null);
        setField(term823, term823.getClass(), "tileTableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLink");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLinkKey");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term823, args);
    }

};


