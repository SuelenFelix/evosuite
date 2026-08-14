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

public class AlphaVantageConnector_getBaseUrl_1781279485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32184;

    public AlphaVantageConnector_getBaseUrl_1781279485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32184 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term32184, term32184.getClass(), "BASE_URL", null);
        setField(term32184, term32184.getClass(), "apiKeyId", null);
        setIntField(term32184, term32184.getClass(), "timeOut", 0);
        setField(term32184, term32184.getClass(), "apiKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseUrl", argTypes, term32184, args);
    }

};


