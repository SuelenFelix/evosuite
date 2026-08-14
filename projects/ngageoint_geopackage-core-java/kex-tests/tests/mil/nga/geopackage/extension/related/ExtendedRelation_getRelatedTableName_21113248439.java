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

public class ExtendedRelation_getRelatedTableName_21113248439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5399;

    public ExtendedRelation_getRelatedTableName_21113248439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5399 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5399, term5399.getClass(), "id", 6967924379644551255L);
        setField(term5399, term5399.getClass(), "baseTableName", "ZfBIVGBQOE");
        setField(term5399, term5399.getClass(), "basePrimaryColumn", "QSrDQfEsTR");
        setField(term5399, term5399.getClass(), "relatedTableName", "PsqusYmejD");
        setField(term5399, term5399.getClass(), "relatedPrimaryColumn", "NTWMiBEaDF");
        setField(term5399, term5399.getClass(), "relationName", "SPBstwKFVr");
        setField(term5399, term5399.getClass(), "mappingTableName", "WxYUTuqmIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedTableName", argTypes, term5399, args);
    }

};


