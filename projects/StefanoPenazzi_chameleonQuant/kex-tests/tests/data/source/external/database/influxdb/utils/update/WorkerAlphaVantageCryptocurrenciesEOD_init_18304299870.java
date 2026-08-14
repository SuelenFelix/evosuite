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

public class WorkerAlphaVantageCryptocurrenciesEOD_init_18304299870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;

    public WorkerAlphaVantageCryptocurrenciesEOD_init_18304299870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term81, term81.getClass(), "BASE_URL", "jJCZpVmanW");
        setField(term81, term81.getClass(), "apiKeyId", "EGtDIRbSSb");
        setIntField(term81, term81.getClass(), "timeOut", 391863371);
        setField(term81, term81.getClass(), "apiKey", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.update.WorkerAlphaVantageCryptocurrenciesEOD");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        argTypes[3] = Class.forName("data.source.external.database.influxdb.Influxdb");
        Object[] args = new Object[4];
        args[0] = "MuLcgQHgqz";
        args[1] = "xxtlPwDYFs";
        args[2] = term81;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


