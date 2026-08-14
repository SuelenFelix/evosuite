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

public class ExtendedRelation_setBaseTableName_4822726016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4953;

    public ExtendedRelation_setBaseTableName_4822726016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4953 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term4953, term4953.getClass(), "id", 4872422362414183754L);
        setField(term4953, term4953.getClass(), "baseTableName", "tsTGdgQYUL");
        setField(term4953, term4953.getClass(), "basePrimaryColumn", "TtGbVmKcnX");
        setField(term4953, term4953.getClass(), "relatedTableName", "GJVkUrCVdD");
        setField(term4953, term4953.getClass(), "relatedPrimaryColumn", "zNdorvdUgu");
        setField(term4953, term4953.getClass(), "relationName", "oPxuZbkYio");
        setField(term4953, term4953.getClass(), "mappingTableName", "vKitydDVnM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "urCiQnUFBM";
        callMethod(klass, "setBaseTableName", argTypes, term4953, args);
    }

};


