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

public class EODHistoricalDataConnector_getBaseUrl_18212129791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public EODHistoricalDataConnector_getBaseUrl_18212129791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector"));
        setField(term227, term227.getClass(), "BASE_URL", "hRNSzYYIrc");
        setField(term227, term227.getClass(), "apiKeyId", "RMFIsYGgne");
        setIntField(term227, term227.getClass(), "timeOut", 1162663216);
        setField(term227, term227.getClass(), "apiKey", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseUrl", argTypes, term227, args);
    }

};


