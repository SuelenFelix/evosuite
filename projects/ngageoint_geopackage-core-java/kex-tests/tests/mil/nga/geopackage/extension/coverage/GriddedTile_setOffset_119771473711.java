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

public class GriddedTile_setOffset_119771473711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term520;

    public GriddedTile_setOffset_119771473711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term512 = new Double(0.22651340641904605);
        Double term514 = new Double(0.8878841294187743);
        Double term516 = new Double(0.6588948704887806);
        Double term518 = new Double(0.6397214730945112);
        term495 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term495, term495.getClass(), "id", -2585684163342970173L);
        setField(term495, term495.getClass(), "contents", null);
        setField(term495, term495.getClass(), "tableName", "NRdvgJlhkX");
        setLongField(term495, term495.getClass(), "tableId", 8059786003080744426L);
        setDoubleField(term495, term495.getClass(), "scale", 1.0);
        setDoubleField(term495, term495.getClass(), "offset", 0.1374549299694151);
        setField(term495, term495.getClass(), "min", term512);
        setField(term495, term495.getClass(), "max", term514);
        setField(term495, term495.getClass(), "mean", term516);
        setField(term495, term495.getClass(), "standardDeviation", term518);
        term520 = new Double(0.7031006357544823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term520;
        callMethod(klass, "setOffset", argTypes, term495, args);
    }

};


