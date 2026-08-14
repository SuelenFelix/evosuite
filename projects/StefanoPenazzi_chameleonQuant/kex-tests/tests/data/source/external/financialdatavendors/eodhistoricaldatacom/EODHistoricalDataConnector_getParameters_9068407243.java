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
import java.lang.Object;

public class EODHistoricalDataConnector_getParameters_9068407243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;
     Object term401;

    public EODHistoricalDataConnector_getParameters_9068407243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector"));
        setField(term363, term363.getClass(), "BASE_URL", "oVcInYnLWB");
        setField(term363, term363.getClass(), "apiKeyId", "aJlieCFVtF");
        setIntField(term363, term363.getClass(), "timeOut", 391863371);
        setField(term363, term363.getClass(), "apiKey", "ZiaGIbnzTs");
        term401 = (Object[]) newArray("data.source.external.financialdatavendors.parameters.APIParameters", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("data.source.external.financialdatavendors.parameters.APIParameters"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term401;
        callMethod(klass, "getParameters", argTypes, term363, args);
    }

};


