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

public class ExtendedRelation_init_11264168191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4281;

    public ExtendedRelation_init_11264168191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4281 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term4281, term4281.getClass(), "id", 2442117782898005296L);
        setField(term4281, term4281.getClass(), "baseTableName", "doQLHkjpNm");
        setField(term4281, term4281.getClass(), "basePrimaryColumn", "lCyLIcSuom");
        setField(term4281, term4281.getClass(), "relatedTableName", "CGOpQSZZwI");
        setField(term4281, term4281.getClass(), "relatedPrimaryColumn", "ypEdrstygY");
        setField(term4281, term4281.getClass(), "relationName", "sNQFlATEeQ");
        setField(term4281, term4281.getClass(), "mappingTableName", "ZKMLioamsY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Object[] args = new Object[1];
        args[0] = term4281;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


