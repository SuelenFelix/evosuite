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

public class ExtendedRelation_getId_19356366592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4415;

    public ExtendedRelation_getId_19356366592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4415 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term4415, term4415.getClass(), "id", 6375119433582206027L);
        setField(term4415, term4415.getClass(), "baseTableName", "WVbxuoDBcn");
        setField(term4415, term4415.getClass(), "basePrimaryColumn", "pvDEABOxLt");
        setField(term4415, term4415.getClass(), "relatedTableName", "beAMpkroCQ");
        setField(term4415, term4415.getClass(), "relatedPrimaryColumn", "uSUvKAyuvd");
        setField(term4415, term4415.getClass(), "relationName", "onQLVONGuf");
        setField(term4415, term4415.getClass(), "mappingTableName", "SOrEHbcbmn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4415, args);
    }

};


