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

public class UssGetInputData_getQueryCount_15762267055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9911;

    public UssGetInputData_getQueryCount_15762267055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9937 = new Integer(-616727354);
        term9911 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term9911, term9911.getClass(), "search", "MAcUBcBckh");
        setField(term9911, term9911.getClass(), "research", "oVgzLbrsFr");
        setBooleanField(term9911, term9911.getClass(), "insensitive", true);
        setField(term9911, term9911.getClass(), "maxreturnsize", term9937);
        setIntField(term9911, term9911.getClass(), "queryCount", -616727354);
        setBooleanField(term9911, term9911.getClass(), "binary", true);
        setField(term9911, term9911.getClass(), "recordsRange", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQueryCount", argTypes, term9911, args);
    }

};


