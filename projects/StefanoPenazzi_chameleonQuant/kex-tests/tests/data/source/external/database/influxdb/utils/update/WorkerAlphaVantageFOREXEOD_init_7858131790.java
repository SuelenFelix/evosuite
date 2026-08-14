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

public class WorkerAlphaVantageFOREXEOD_init_7858131790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728;

    public WorkerAlphaVantageFOREXEOD_init_7858131790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term728, term728.getClass(), "BASE_URL", "xrwlQZdwCp");
        setField(term728, term728.getClass(), "apiKeyId", "IDCWpPLRkE");
        setIntField(term728, term728.getClass(), "timeOut", 597278769);
        setField(term728, term728.getClass(), "apiKey", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.update.WorkerAlphaVantageFOREXEOD");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        argTypes[3] = Class.forName("data.source.external.database.influxdb.Influxdb");
        Object[] args = new Object[4];
        args[0] = "kuTXqwMtDB";
        args[1] = "Ghbwtircqb";
        args[2] = term728;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


