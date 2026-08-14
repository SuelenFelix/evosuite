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

public class ExtendedRelation_setRelationName_132832828415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6247;

    public ExtendedRelation_setRelationName_132832828415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6247 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6247, term6247.getClass(), "id", -872011222785455006L);
        setField(term6247, term6247.getClass(), "baseTableName", "VDokbsCuqq");
        setField(term6247, term6247.getClass(), "basePrimaryColumn", "xClUIcPECX");
        setField(term6247, term6247.getClass(), "relatedTableName", "avhRaGZaBF");
        setField(term6247, term6247.getClass(), "relatedPrimaryColumn", "JkgoRtImdE");
        setField(term6247, term6247.getClass(), "relationName", "qFGKIJjlmV");
        setField(term6247, term6247.getClass(), "mappingTableName", "IHqvyhMtuM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dAldIGYAXV";
        callMethod(klass, "setRelationName", argTypes, term6247, args);
    }

};


