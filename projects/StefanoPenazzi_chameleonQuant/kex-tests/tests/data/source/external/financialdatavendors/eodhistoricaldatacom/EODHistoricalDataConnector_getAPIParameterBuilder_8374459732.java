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

public class EODHistoricalDataConnector_getAPIParameterBuilder_8374459732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public EODHistoricalDataConnector_getAPIParameterBuilder_8374459732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = newInstance(Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector"));
        setField(term295, term295.getClass(), "BASE_URL", "uuaPigETmJ");
        setField(term295, term295.getClass(), "apiKeyId", "MxlszYVzRf");
        setIntField(term295, term295.getClass(), "timeOut", 1484323161);
        setField(term295, term295.getClass(), "apiKey", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.EODHistoricalDataConnector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAPIParameterBuilder", argTypes, term295, args);
    }

};


