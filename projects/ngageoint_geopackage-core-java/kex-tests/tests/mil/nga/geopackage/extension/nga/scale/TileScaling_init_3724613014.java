package mil.nga.geopackage.extension.nga.scale;

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
import static mil.nga.geopackage.extension.nga.scale.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TileScaling_init_3724613014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;

    public TileScaling_init_3724613014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1178 = new Long(4872422362414183754L);
        Long term1180 = new Long(6811161968424632369L);
        term1153 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term1153, term1153.getClass(), "tableName", "MuLcgQHgqz");
        setField(term1153, term1153.getClass(), "scalingType", "xxtlPwDYFs");
        setField(term1153, term1153.getClass(), "zoomIn", term1178);
        setField(term1153, term1153.getClass(), "zoomOut", term1180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Object[] args = new Object[1];
        args[0] = term1153;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


