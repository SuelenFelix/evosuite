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

public class TileColumn_copy_126569870826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7419;

    public TileColumn_copy_126569870826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7419 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7419, term7419.getClass(), "index", 0);
        setField(term7419, term7419.getClass(), "name", null);
        setField(term7419, term7419.getClass(), "max", null);
        setBooleanField(term7419, term7419.getClass(), "notNull", false);
        setField(term7419, term7419.getClass(), "defaultValue", null);
        setBooleanField(term7419, term7419.getClass(), "primaryKey", false);
        setBooleanField(term7419, term7419.getClass(), "autoincrement", false);
        setBooleanField(term7419, term7419.getClass(), "unique", false);
        setField(term7419, term7419.getClass(), "type", null);
        setField(term7419, term7419.getClass(), "dataType", null);
        setField(term7419, term7419.getClass(), "constraints", null);
        setField(term7419, term7419.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term7419, args);
    }

};


