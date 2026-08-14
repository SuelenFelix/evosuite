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

public class ExtendedRelation_getRelatedPrimaryColumn_68020175029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6713;

    public ExtendedRelation_getRelatedPrimaryColumn_68020175029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6713 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6713, term6713.getClass(), "id", 0L);
        setField(term6713, term6713.getClass(), "baseTableName", null);
        setField(term6713, term6713.getClass(), "basePrimaryColumn", null);
        setField(term6713, term6713.getClass(), "relatedTableName", null);
        setField(term6713, term6713.getClass(), "relatedPrimaryColumn", null);
        setField(term6713, term6713.getClass(), "relationName", null);
        setField(term6713, term6713.getClass(), "mappingTableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedPrimaryColumn", argTypes, term6713, args);
    }

};


