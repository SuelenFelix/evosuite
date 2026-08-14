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

public class ExtendedRelation_setBasePrimaryColumn_18947326968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5243;

    public ExtendedRelation_setBasePrimaryColumn_18947326968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5243 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5243, term5243.getClass(), "id", -7237588299778557629L);
        setField(term5243, term5243.getClass(), "baseTableName", "yUGCjlqgJE");
        setField(term5243, term5243.getClass(), "basePrimaryColumn", "PXdVZyoJyC");
        setField(term5243, term5243.getClass(), "relatedTableName", "vLerpqavFM");
        setField(term5243, term5243.getClass(), "relatedPrimaryColumn", "qnvxzwuGKX");
        setField(term5243, term5243.getClass(), "relationName", "EdPAvpluZg");
        setField(term5243, term5243.getClass(), "mappingTableName", "DzHVBMqWtE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "THZSpzBRYP";
        callMethod(klass, "setBasePrimaryColumn", argTypes, term5243, args);
    }

};


