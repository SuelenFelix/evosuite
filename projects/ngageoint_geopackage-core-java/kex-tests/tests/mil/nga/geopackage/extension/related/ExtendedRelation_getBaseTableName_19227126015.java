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

public class ExtendedRelation_getBaseTableName_19227126015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4819;

    public ExtendedRelation_getBaseTableName_19227126015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4819 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term4819, term4819.getClass(), "id", 7411271909051562686L);
        setField(term4819, term4819.getClass(), "baseTableName", "TweMFhxNdj");
        setField(term4819, term4819.getClass(), "basePrimaryColumn", "NBrvVzvQHe");
        setField(term4819, term4819.getClass(), "relatedTableName", "FjOiNAfBOc");
        setField(term4819, term4819.getClass(), "relatedPrimaryColumn", "iCCsaLHohG");
        setField(term4819, term4819.getClass(), "relationName", "NJhGgctbdj");
        setField(term4819, term4819.getClass(), "mappingTableName", "MYWYUeLGOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseTableName", argTypes, term4819, args);
    }

};


