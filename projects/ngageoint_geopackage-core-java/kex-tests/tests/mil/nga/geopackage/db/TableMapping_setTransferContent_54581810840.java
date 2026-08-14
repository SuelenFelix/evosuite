package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TableMapping_setTransferContent_54581810840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10566;
     Object term10568;

    public TableMapping_setTransferContent_54581810840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10566 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10566, term10566.getClass(), "fromTable", null);
        setField(term10566, term10566.getClass(), "toTable", null);
        setBooleanField(term10566, term10566.getClass(), "transferContent", false);
        setField(term10566, term10566.getClass(), "columns", null);
        setField(term10566, term10566.getClass(), "droppedColumns", null);
        setField(term10566, term10566.getClass(), "where", null);
        term10568 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10568;
        callMethod(klass, "setTransferContent", argTypes, term10566, args);
    }

};


