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

public class MappedColumn_setWhereOperator_163283848327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4808;

    public MappedColumn_setWhereOperator_163283848327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4808 = newInstance(Class.forName("mil.nga.geopackage.db.MappedColumn"));
        setField(term4808, term4808.getClass(), "toColumn", null);
        setField(term4808, term4808.getClass(), "fromColumn", null);
        setField(term4808, term4808.getClass(), "defaultValue", null);
        setField(term4808, term4808.getClass(), "dataType", null);
        setField(term4808, term4808.getClass(), "constantValue", null);
        setField(term4808, term4808.getClass(), "whereValue", null);
        setField(term4808, term4808.getClass(), "whereOperator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.MappedColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhereOperator", argTypes, term4808, args);
    }

};


