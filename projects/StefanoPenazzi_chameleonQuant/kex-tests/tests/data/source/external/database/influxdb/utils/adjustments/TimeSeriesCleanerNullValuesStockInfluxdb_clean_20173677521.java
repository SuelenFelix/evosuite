package data.source.external.database.influxdb.utils.adjustments;

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
import static data.source.external.database.influxdb.utils.adjustments.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeSeriesCleanerNullValuesStockInfluxdb_clean_20173677521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TimeSeriesCleanerNullValuesStockInfluxdb_clean_20173677521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("data.source.external.database.influxdb.utils.adjustments.TimeSeriesCleanerNullValuesStockInfluxdb"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.adjustments.TimeSeriesCleanerNullValuesStockInfluxdb");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.TimeSeriesDataStructureI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clean", argTypes, term1, args);
    }

};


