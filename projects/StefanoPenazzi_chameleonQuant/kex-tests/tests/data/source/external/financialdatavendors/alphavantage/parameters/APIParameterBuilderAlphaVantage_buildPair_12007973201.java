package data.source.external.financialdatavendors.alphavantage.parameters;

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
import static data.source.external.financialdatavendors.alphavantage.parameters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class APIParameterBuilderAlphaVantage_buildPair_12007973201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21845;

    public APIParameterBuilderAlphaVantage_buildPair_12007973201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21845 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.parameters.APIParameterBuilderAlphaVantage"));
        Object term21846 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term21847 = (byte[]) newByteArray(16);
        setField(term21846, term21846.getClass(), "value", term21847);
        setByteField(term21846, term21846.getClass(), "coder", (byte) 0);
        setIntField(term21846, term21846.getClass(), "count", 0);
        setField(term21845, term21845.getClass(), "urlBuilder", term21846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.parameters.APIParameterBuilderAlphaVantage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "BYqFIqCKAV";
        args[1] = "vrQLuWIDJX";
        callMethod(klass, "buildPair", argTypes, term21845, args);
    }

};


