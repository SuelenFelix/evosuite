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

public class UssGetInputData_getResearch_5625410932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9695;

    public UssGetInputData_getResearch_5625410932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9721 = new Integer(1484323161);
        term9695 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term9695, term9695.getClass(), "search", "kBdSllIBVz");
        setField(term9695, term9695.getClass(), "research", "TJmVBGfTML");
        setBooleanField(term9695, term9695.getClass(), "insensitive", false);
        setField(term9695, term9695.getClass(), "maxreturnsize", term9721);
        setIntField(term9695, term9695.getClass(), "queryCount", 1484323161);
        setBooleanField(term9695, term9695.getClass(), "binary", false);
        setField(term9695, term9695.getClass(), "recordsRange", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearch", argTypes, term9695, args);
    }

};


