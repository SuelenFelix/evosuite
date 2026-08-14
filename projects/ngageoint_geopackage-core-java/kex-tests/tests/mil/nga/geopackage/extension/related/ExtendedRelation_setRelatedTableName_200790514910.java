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

public class ExtendedRelation_setRelatedTableName_200790514910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5533;

    public ExtendedRelation_setRelatedTableName_200790514910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5533 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term5533, term5533.getClass(), "id", -2813493605142626659L);
        setField(term5533, term5533.getClass(), "baseTableName", "OeQLvhVERT");
        setField(term5533, term5533.getClass(), "basePrimaryColumn", "IlvgFINwIa");
        setField(term5533, term5533.getClass(), "relatedTableName", "GEJABPlHSI");
        setField(term5533, term5533.getClass(), "relatedPrimaryColumn", "aQFUvuaYxd");
        setField(term5533, term5533.getClass(), "relationName", "zNFLXMifnS");
        setField(term5533, term5533.getClass(), "mappingTableName", "HHQcYMSBVc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wdoqITnaAP";
        callMethod(klass, "setRelatedTableName", argTypes, term5533, args);
    }

};


