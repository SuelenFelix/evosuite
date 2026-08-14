package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GriddedTile_getMean_51155650316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public GriddedTile_getMean_51155650316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term693 = new Double(0.13246999699526574);
        Double term695 = new Double(0.9126850255993704);
        Double term697 = new Double(0.11179067076100713);
        Double term699 = new Double(0.5306473989087822);
        term676 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term676, term676.getClass(), "id", -5892135042702373494L);
        setField(term676, term676.getClass(), "contents", null);
        setField(term676, term676.getClass(), "tableName", "aJlieCFVtF");
        setLongField(term676, term676.getClass(), "tableId", 5262507301787091109L);
        setDoubleField(term676, term676.getClass(), "scale", 1.0);
        setDoubleField(term676, term676.getClass(), "offset", 0.7332741045694002);
        setField(term676, term676.getClass(), "min", term693);
        setField(term676, term676.getClass(), "max", term695);
        setField(term676, term676.getClass(), "mean", term697);
        setField(term676, term676.getClass(), "standardDeviation", term699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMean", argTypes, term676, args);
    }

};


