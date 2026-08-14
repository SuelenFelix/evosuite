package zowe.client.sdk.zosmfinfo.response;

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
import static zowe.client.sdk.zosmfinfo.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosmfSystemsResponse_getNumRows_13126180356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8732;

    public ZosmfSystemsResponse_getNumRows_13126180356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8732 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse"));
        setField(term8732, term8732.getClass(), "numRows", null);
        setField(term8732, term8732.getClass(), "definedSystems", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumRows", argTypes, term8732, args);
    }

};


