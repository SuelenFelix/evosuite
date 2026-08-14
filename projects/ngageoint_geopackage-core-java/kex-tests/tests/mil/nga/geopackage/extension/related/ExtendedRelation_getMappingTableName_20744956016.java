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

public class ExtendedRelation_getMappingTableName_20744956016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6403;

    public ExtendedRelation_getMappingTableName_20744956016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6403 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6403, term6403.getClass(), "id", -316468845751588286L);
        setField(term6403, term6403.getClass(), "baseTableName", "mLwibAPEsa");
        setField(term6403, term6403.getClass(), "basePrimaryColumn", "zsWKWiTFuo");
        setField(term6403, term6403.getClass(), "relatedTableName", "UPUbwyHQKN");
        setField(term6403, term6403.getClass(), "relatedPrimaryColumn", "lgQkrXANyI");
        setField(term6403, term6403.getClass(), "relationName", "MeTmRZXErV");
        setField(term6403, term6403.getClass(), "mappingTableName", "jNxbVmoZgq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMappingTableName", argTypes, term6403, args);
    }

};


