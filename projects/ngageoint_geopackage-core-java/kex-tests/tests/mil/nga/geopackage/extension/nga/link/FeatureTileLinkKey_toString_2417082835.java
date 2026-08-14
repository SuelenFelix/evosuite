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

public class FeatureTileLinkKey_toString_2417082835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public FeatureTileLinkKey_toString_2417082835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLinkKey"));
        setField(term269, term269.getClass(), "featureTableName", "MxlszYVzRf");
        setField(term269, term269.getClass(), "tileTableName", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.link.FeatureTileLinkKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term269, args);
    }

};


