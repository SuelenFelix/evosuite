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
import java.lang.Object;

public class AlphaVantageConnector_getParameters_17450415413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32113;
     Object term32151;

    public AlphaVantageConnector_getParameters_17450415413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32113 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector"));
        setField(term32113, term32113.getClass(), "BASE_URL", "bWWfajKbEX");
        setField(term32113, term32113.getClass(), "apiKeyId", "cAPeiZHKGJ");
        setIntField(term32113, term32113.getClass(), "timeOut", 391863371);
        setField(term32113, term32113.getClass(), "apiKey", "LvJFtLBaxj");
        term32151 = (Object[]) newArray("data.source.external.financialdatavendors.parameters.APIParameters", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.AlphaVantageConnector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("data.source.external.financialdatavendors.parameters.APIParameters"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32151;
        callMethod(klass, "getParameters", argTypes, term32113, args);
    }

};


