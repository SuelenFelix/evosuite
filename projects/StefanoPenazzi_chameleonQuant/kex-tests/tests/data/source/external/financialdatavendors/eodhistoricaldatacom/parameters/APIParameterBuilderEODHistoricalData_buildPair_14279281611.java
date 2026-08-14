package data.source.external.financialdatavendors.eodhistoricaldatacom.parameters;

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
import static data.source.external.financialdatavendors.eodhistoricaldatacom.parameters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class APIParameterBuilderEODHistoricalData_buildPair_14279281611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public APIParameterBuilderEODHistoricalData_buildPair_14279281611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.parameters.APIParameterBuilderEODHistoricalData"));
        Object term142 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term143 = (byte[]) newByteArray(16);
        setField(term142, term142.getClass(), "value", term143);
        setByteField(term142, term142.getClass(), "coder", (byte) 0);
        setIntField(term142, term142.getClass(), "count", 0);
        setField(term141, term141.getClass(), "urlBuilder", term142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.eodhistoricaldatacom.parameters.APIParameterBuilderEODHistoricalData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = "MjGYSRKTNF";
        callMethod(klass, "buildPair", argTypes, term141, args);
    }

};


