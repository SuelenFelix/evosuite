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

public class ExtendedRelation_getRelationName_33398746013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5979;

    public ExtendedRelation_getRelationName_33398746013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5979 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5979, term5979.getClass(), "id", 2535595959091595249L);
        setField(term5979, term5979.getClass(), "baseTableName", "jnwVnmKAFv");
        setField(term5979, term5979.getClass(), "basePrimaryColumn", "TXyHhqeCjR");
        setField(term5979, term5979.getClass(), "relatedTableName", "lZIgPZPgTu");
        setField(term5979, term5979.getClass(), "relatedPrimaryColumn", "iuCxnHGMoW");
        setField(term5979, term5979.getClass(), "relationName", "GPSEWEDSTo");
        setField(term5979, term5979.getClass(), "mappingTableName", "RCOqfVsRHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelationName", argTypes, term5979, args);
    }

};


