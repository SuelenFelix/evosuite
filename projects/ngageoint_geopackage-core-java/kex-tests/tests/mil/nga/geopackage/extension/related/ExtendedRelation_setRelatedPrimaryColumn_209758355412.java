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

public class ExtendedRelation_setRelatedPrimaryColumn_209758355412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5823;

    public ExtendedRelation_setRelatedPrimaryColumn_209758355412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5823 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5823, term5823.getClass(), "id", -4325723315152823407L);
        setField(term5823, term5823.getClass(), "baseTableName", "pumvwBWvpy");
        setField(term5823, term5823.getClass(), "basePrimaryColumn", "HwLHeGLyhe");
        setField(term5823, term5823.getClass(), "relatedTableName", "RDnkgWkcbz");
        setField(term5823, term5823.getClass(), "relatedPrimaryColumn", "IBpaxltauX");
        setField(term5823, term5823.getClass(), "relationName", "hePqROaplw");
        setField(term5823, term5823.getClass(), "mappingTableName", "PJcSNDruWd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VVNNlAePXF";
        callMethod(klass, "setRelatedPrimaryColumn", argTypes, term5823, args);
    }

};


