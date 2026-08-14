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
import java.lang.Long;

public class ExtendedRelation_setId_29559284321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6695;
     Object term6697;

    public ExtendedRelation_setId_29559284321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6695 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6695, term6695.getClass(), "id", 0L);
        setField(term6695, term6695.getClass(), "baseTableName", null);
        setField(term6695, term6695.getClass(), "basePrimaryColumn", null);
        setField(term6695, term6695.getClass(), "relatedTableName", null);
        setField(term6695, term6695.getClass(), "relatedPrimaryColumn", null);
        setField(term6695, term6695.getClass(), "relationName", null);
        setField(term6695, term6695.getClass(), "mappingTableName", null);
        term6697 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6697;
        callMethod(klass, "setId", argTypes, term6695, args);
    }

};


