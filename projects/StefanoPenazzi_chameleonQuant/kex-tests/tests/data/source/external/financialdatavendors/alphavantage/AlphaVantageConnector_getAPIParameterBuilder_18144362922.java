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

public class AlphaVantageConnector_getAPIParameterBuilder_18144362922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32045;

    public AlphaVantageConnector_getAPIParameterBuilder_18144362922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32045 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term32045, term32045.getClass(), "BASE_URL", "idgaQsnJpQ");
        setField(term32045, term32045.getClass(), "apiKeyId", "VgZnGoIFwQ");
        setIntField(term32045, term32045.getClass(), "timeOut", 1484323161);
        setField(term32045, term32045.getClass(), "apiKey", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAPIParameterBuilder", argTypes, term32045, args);
    }

};


