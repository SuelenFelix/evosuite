package zowe.client.sdk.zosfiles.uss.response;

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
import static zowe.client.sdk.zosfiles.uss.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnixFileListResponse_getItems_208812178510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;

    public UnixFileListResponse_getItems_208812178510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse"));
        setField(term891, term891.getClass(), "jsonVersion", null);
        setField(term891, term891.getClass(), "returnedRows", null);
        setField(term891, term891.getClass(), "totalRows", null);
        setField(term891, term891.getClass(), "items", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term891, args);
    }

};


