package mil.nga.geopackage.extension.related;

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
import static mil.nga.geopackage.extension.related.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExtendedRelation_setBasePrimaryColumn_189473269626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6707;

    public ExtendedRelation_setBasePrimaryColumn_189473269626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6707 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6707, term6707.getClass(), "id", 0L);
        setField(term6707, term6707.getClass(), "baseTableName", null);
        setField(term6707, term6707.getClass(), "basePrimaryColumn", null);
        setField(term6707, term6707.getClass(), "relatedTableName", null);
        setField(term6707, term6707.getClass(), "relatedPrimaryColumn", null);
        setField(term6707, term6707.getClass(), "relationName", null);
        setField(term6707, term6707.getClass(), "mappingTableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBasePrimaryColumn", argTypes, term6707, args);
    }

};


