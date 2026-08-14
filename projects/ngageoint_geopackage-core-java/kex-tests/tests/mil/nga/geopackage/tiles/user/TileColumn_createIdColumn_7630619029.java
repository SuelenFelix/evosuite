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
import java.lang.Integer;

public class TileColumn_createIdColumn_7630619029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7439;
     Object term7445;

    public TileColumn_createIdColumn_7630619029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7439 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7439, term7439.getClass(), "index", 0);
        setField(term7439, term7439.getClass(), "name", null);
        setField(term7439, term7439.getClass(), "max", null);
        setBooleanField(term7439, term7439.getClass(), "notNull", false);
        setField(term7439, term7439.getClass(), "defaultValue", null);
        setBooleanField(term7439, term7439.getClass(), "primaryKey", false);
        setBooleanField(term7439, term7439.getClass(), "autoincrement", false);
        setBooleanField(term7439, term7439.getClass(), "unique", false);
        setField(term7439, term7439.getClass(), "type", null);
        setField(term7439, term7439.getClass(), "dataType", null);
        setField(term7439, term7439.getClass(), "constraints", null);
        setField(term7439, term7439.getClass(), "schema", null);
        term7445 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7445;
        callMethod(klass, "createIdColumn", argTypes, term7439, args);
    }

};


