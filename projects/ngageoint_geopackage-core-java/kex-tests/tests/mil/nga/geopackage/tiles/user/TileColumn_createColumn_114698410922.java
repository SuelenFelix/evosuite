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

public class TileColumn_createColumn_114698410922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7198;

    public TileColumn_createColumn_114698410922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7198 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7198, term7198.getClass(), "index", 0);
        setField(term7198, term7198.getClass(), "name", null);
        setField(term7198, term7198.getClass(), "max", null);
        setBooleanField(term7198, term7198.getClass(), "notNull", false);
        setField(term7198, term7198.getClass(), "defaultValue", null);
        setBooleanField(term7198, term7198.getClass(), "primaryKey", false);
        setBooleanField(term7198, term7198.getClass(), "autoincrement", false);
        setBooleanField(term7198, term7198.getClass(), "unique", false);
        setField(term7198, term7198.getClass(), "type", null);
        setField(term7198, term7198.getClass(), "dataType", null);
        setField(term7198, term7198.getClass(), "constraints", null);
        setField(term7198, term7198.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.TableColumn");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createColumn", argTypes, term7198, args);
    }

};


