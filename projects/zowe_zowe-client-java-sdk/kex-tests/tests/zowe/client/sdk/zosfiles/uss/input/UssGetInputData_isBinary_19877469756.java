package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UssGetInputData_isBinary_19877469756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9983;

    public UssGetInputData_isBinary_19877469756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10009 = new Integer(-1955890973);
        term9983 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term9983, term9983.getClass(), "search", "OWKQODBLzb");
        setField(term9983, term9983.getClass(), "research", "wGmYcqUkgE");
        setBooleanField(term9983, term9983.getClass(), "insensitive", false);
        setField(term9983, term9983.getClass(), "maxreturnsize", term10009);
        setIntField(term9983, term9983.getClass(), "queryCount", -1955890973);
        setBooleanField(term9983, term9983.getClass(), "binary", true);
        setField(term9983, term9983.getClass(), "recordsRange", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBinary", argTypes, term9983, args);
    }

};


