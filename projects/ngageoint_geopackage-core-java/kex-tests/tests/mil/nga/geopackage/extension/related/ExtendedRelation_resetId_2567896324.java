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

public class ExtendedRelation_resetId_2567896324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4685;

    public ExtendedRelation_resetId_2567896324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4685 = newInstance(Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation"));
        setLongField(term4685, term4685.getClass(), "id", 5270370404989704783L);
        setField(term4685, term4685.getClass(), "baseTableName", "NHbOFFjyVK");
        setField(term4685, term4685.getClass(), "basePrimaryColumn", "zaloBqlrSo");
        setField(term4685, term4685.getClass(), "relatedTableName", "vvoLrMGCoN");
        setField(term4685, term4685.getClass(), "relatedPrimaryColumn", "pXdglvyrQe");
        setField(term4685, term4685.getClass(), "relationName", "OcfNzHYdki");
        setField(term4685, term4685.getClass(), "mappingTableName", "uPuCVuZYOI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.ExtendedRelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term4685, args);
    }

};


