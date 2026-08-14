package data.source.external.financialdatavendors.eodhistoricaldatacom;

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
import static data.source.external.financialdatavendors.eodhistoricaldatacom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EODHistoricalDataConnector_getBaseUrl_18212129795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;

    public EODHistoricalDataConnector_getBaseUrl_18212129795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434 = newInstance(Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector"));
        setField(term434, term434.getClass(), "BASE_URL", null);
        setField(term434, term434.getClass(), "apiKeyId", null);
        setIntField(term434, term434.getClass(), "timeOut", 0);
        setField(term434, term434.getClass(), "apiKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseUrl", argTypes, term434, args);
    }

};


