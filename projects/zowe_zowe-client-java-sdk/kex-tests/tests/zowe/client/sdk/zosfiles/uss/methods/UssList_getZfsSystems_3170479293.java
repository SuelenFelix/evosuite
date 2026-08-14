package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UssList_getZfsSystems_3170479293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5357;
     Object term5358;

    public UssList_getZfsSystems_3170479293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5357 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssList"));
        setField(term5357, term5357.getClass(), "connection", null);
        setField(term5357, term5357.getClass(), "request", null);
        Integer term5359 = new Integer(-1339778481);
        term5358 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData"));
        setField(term5358, term5358.getClass(), "maxLength", term5359);
        setField(term5358, term5358.getClass(), "path", "tPlsykYBqO");
        setField(term5358, term5358.getClass(), "fsname", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData");
        Object[] args = new Object[1];
        args[0] = term5358;
        callMethod(klass, "getZfsSystems", argTypes, term5357, args);
    }

};


