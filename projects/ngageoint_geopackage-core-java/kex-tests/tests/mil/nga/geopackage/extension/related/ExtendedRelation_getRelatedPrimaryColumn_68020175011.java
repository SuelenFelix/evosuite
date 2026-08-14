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

public class ExtendedRelation_getRelatedPrimaryColumn_68020175011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5689;

    public ExtendedRelation_getRelatedPrimaryColumn_68020175011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5689 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5689, term5689.getClass(), "id", -8885298608300233488L);
        setField(term5689, term5689.getClass(), "baseTableName", "rIPMBcrNqB");
        setField(term5689, term5689.getClass(), "basePrimaryColumn", "UDaboHZHhz");
        setField(term5689, term5689.getClass(), "relatedTableName", "nRvKihUSPj");
        setField(term5689, term5689.getClass(), "relatedPrimaryColumn", "BbNeQJpYPr");
        setField(term5689, term5689.getClass(), "relationName", "riMtzCoxNj");
        setField(term5689, term5689.getClass(), "mappingTableName", "YAXkVjQZcV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedPrimaryColumn", argTypes, term5689, args);
    }

};


