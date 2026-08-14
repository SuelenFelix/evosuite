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

public class ExtendedRelation_getRelationType_51727883614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6113;

    public ExtendedRelation_getRelationType_51727883614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6113 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6113, term6113.getClass(), "id", -5476826692763582090L);
        setField(term6113, term6113.getClass(), "baseTableName", "TSyCeEZPaT");
        setField(term6113, term6113.getClass(), "basePrimaryColumn", "JeZFtaqkzW");
        setField(term6113, term6113.getClass(), "relatedTableName", "vOVuNSCCLe");
        setField(term6113, term6113.getClass(), "relatedPrimaryColumn", "fzeqPnzpnt");
        setField(term6113, term6113.getClass(), "relationName", "RxbhrFBjkO");
        setField(term6113, term6113.getClass(), "mappingTableName", "aanyiAOJCl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelationType", argTypes, term6113, args);
    }

};


