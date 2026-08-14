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

public class MappedColumn_getConstantValue_127817273918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4363;

    public MappedColumn_getConstantValue_127817273918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4363 = newInstance(Class.forName("mil.nga.geopackage.db.MappedColumn"));
        setField(term4363, term4363.getClass(), "toColumn", null);
        setField(term4363, term4363.getClass(), "fromColumn", null);
        setField(term4363, term4363.getClass(), "defaultValue", null);
        setField(term4363, term4363.getClass(), "dataType", null);
        setField(term4363, term4363.getClass(), "constantValue", null);
        setField(term4363, term4363.getClass(), "whereValue", null);
        setField(term4363, term4363.getClass(), "whereOperator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.MappedColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstantValue", argTypes, term4363, args);
    }

};


