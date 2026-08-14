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

public class WorkerAlphaVantageFOREXEID_init_7858189450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;

    public WorkerAlphaVantageFOREXEID_init_7858189450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term193, term193.getClass(), "BASE_URL", "RMFIsYGgne");
        setField(term193, term193.getClass(), "apiKeyId", "NRdvgJlhkX");
        setIntField(term193, term193.getClass(), "timeOut", -1922583790);
        setField(term193, term193.getClass(), "apiKey", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.update.WorkerAlphaVantageFOREXEID");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        argTypes[3] = Class.forName("data.source.external.database.influxdb.Influxdb");
        Object[] args = new Object[4];
        args[0] = "MjGYSRKTNF";
        args[1] = "hRNSzYYIrc";
        args[2] = term193;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


