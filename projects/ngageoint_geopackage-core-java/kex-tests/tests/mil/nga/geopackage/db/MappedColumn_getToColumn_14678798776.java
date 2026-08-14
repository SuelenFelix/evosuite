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

public class MappedColumn_getToColumn_14678798776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794;

    public MappedColumn_getToColumn_14678798776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3794 = newInstance(Class.forName("mil.nga.geopackage.db.MappedColumn"));
        setField(term3794, term3794.getClass(), "toColumn", null);
        setField(term3794, term3794.getClass(), "fromColumn", null);
        setField(term3794, term3794.getClass(), "defaultValue", null);
        setField(term3794, term3794.getClass(), "dataType", null);
        setField(term3794, term3794.getClass(), "constantValue", null);
        setField(term3794, term3794.getClass(), "whereValue", null);
        setField(term3794, term3794.getClass(), "whereOperator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.MappedColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToColumn", argTypes, term3794, args);
    }

};


