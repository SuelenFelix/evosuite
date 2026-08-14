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

public class ExtendedRelation_getBasePrimaryColumn_13528892567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5109;

    public ExtendedRelation_getBasePrimaryColumn_13528892567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5109 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5109, term5109.getClass(), "id", 6811161968424632369L);
        setField(term5109, term5109.getClass(), "baseTableName", "EKjQdtKxAM");
        setField(term5109, term5109.getClass(), "basePrimaryColumn", "TXZAIPQJHt");
        setField(term5109, term5109.getClass(), "relatedTableName", "DIbeDHICho");
        setField(term5109, term5109.getClass(), "relatedPrimaryColumn", "dJGPlmSRnz");
        setField(term5109, term5109.getClass(), "relationName", "DPskuFUobI");
        setField(term5109, term5109.getClass(), "mappingTableName", "wBGfLpNNiZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBasePrimaryColumn", argTypes, term5109, args);
    }

};


