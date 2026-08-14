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

public class UssGetInputData_getMaxReturnSize_2415733784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9839;

    public UssGetInputData_getMaxReturnSize_2415733784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9865 = new Integer(-1922583790);
        term9839 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term9839, term9839.getClass(), "search", "JUmudUmaaV");
        setField(term9839, term9839.getClass(), "research", "KoyGrUJeJW");
        setBooleanField(term9839, term9839.getClass(), "insensitive", false);
        setField(term9839, term9839.getClass(), "maxreturnsize", term9865);
        setIntField(term9839, term9839.getClass(), "queryCount", -1922583790);
        setBooleanField(term9839, term9839.getClass(), "binary", true);
        setField(term9839, term9839.getClass(), "recordsRange", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxReturnSize", argTypes, term9839, args);
    }

};


