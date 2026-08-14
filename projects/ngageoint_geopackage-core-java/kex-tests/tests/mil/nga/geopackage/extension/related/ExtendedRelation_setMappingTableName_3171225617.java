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

public class ExtendedRelation_setMappingTableName_3171225617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6537;

    public ExtendedRelation_setMappingTableName_3171225617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6537 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term6537, term6537.getClass(), "id", 5127676408959197577L);
        setField(term6537, term6537.getClass(), "baseTableName", "PvmBHIXaMY");
        setField(term6537, term6537.getClass(), "basePrimaryColumn", "hulYxtowxw");
        setField(term6537, term6537.getClass(), "relatedTableName", "GNEmuHPNcU");
        setField(term6537, term6537.getClass(), "relatedPrimaryColumn", "IoSfuKDFRe");
        setField(term6537, term6537.getClass(), "relationName", "AWYyZiNfsm");
        setField(term6537, term6537.getClass(), "mappingTableName", "ITRRYiuDwH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "llRfwANcVF";
        callMethod(klass, "setMappingTableName", argTypes, term6537, args);
    }

};


