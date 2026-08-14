package data.source.external.financialdatavendors.alphavantage;

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
import static data.source.external.financialdatavendors.alphavantage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AlphaVantageConnector_getParameters_17450415417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32188;

    public AlphaVantageConnector_getParameters_17450415417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32188 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term32188, term32188.getClass(), "BASE_URL", null);
        setField(term32188, term32188.getClass(), "apiKeyId", null);
        setIntField(term32188, term32188.getClass(), "timeOut", 0);
        setField(term32188, term32188.getClass(), "apiKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("data.source.external.financialdatavendors.parameters.APIParameters"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getParameters", argTypes, term32188, args);
    }

};


