package data.source.external.database.influxdb.utils.update;

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
import static data.source.external.database.influxdb.utils.update.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkerAlphaVantageStocksEOD_init_16685457820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616;

    public WorkerAlphaVantageStocksEOD_init_16685457820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term616, term616.getClass(), "BASE_URL", "dWRymuLBtr");
        setField(term616, term616.getClass(), "apiKeyId", "AijpHYOFuy");
        setIntField(term616, term616.getClass(), "timeOut", 1585847225);
        setField(term616, term616.getClass(), "apiKey", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.update.WorkerAlphaVantageStocksEOD");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        argTypes[3] = Class.forName("data.source.external.database.influxdb.Influxdb");
        Object[] args = new Object[4];
        args[0] = "TEParAifyi";
        args[1] = "OWDIEULEFu";
        args[2] = term616;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


