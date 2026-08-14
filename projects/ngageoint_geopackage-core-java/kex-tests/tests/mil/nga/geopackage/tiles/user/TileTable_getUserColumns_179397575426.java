package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileTable_getUserColumns_179397575426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5062;

    public TileTable_getUserColumns_179397575426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5062 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        setField(term5062, term5062.getClass(), "columns", null);
        setField(term5062, term5062.getClass(), "constraints", null);
        setField(term5062, term5062.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term5062, args);
    }

};


