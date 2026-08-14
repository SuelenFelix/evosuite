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

public class FeatureTileLinkKey_hashCode_26905140714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410;

    public FeatureTileLinkKey_hashCode_26905140714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLinkKey"));
        setField(term410, term410.getClass(), "featureTableName", null);
        setField(term410, term410.getClass(), "tileTableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLinkKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term410, args);
    }

};


