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

public class MappedColumn_setWhereValue_194328818424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4662;

    public MappedColumn_setWhereValue_194328818424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4662 = newInstance(Class.forName("mil.nga.geopackage.db.MappedColumn"));
        setField(term4662, term4662.getClass(), "toColumn", null);
        setField(term4662, term4662.getClass(), "fromColumn", null);
        setField(term4662, term4662.getClass(), "defaultValue", null);
        setField(term4662, term4662.getClass(), "dataType", null);
        setField(term4662, term4662.getClass(), "constantValue", null);
        setField(term4662, term4662.getClass(), "whereValue", null);
        setField(term4662, term4662.getClass(), "whereOperator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.MappedColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhereValue", argTypes, term4662, args);
    }

};


