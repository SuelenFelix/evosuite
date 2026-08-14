package zowe.client.sdk.zosvariables.response;

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
import static zowe.client.sdk.zosvariables.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VariableGetResponse_getSystemSymbolList_19076996826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;

    public VariableGetResponse_getSystemSymbolList_19076996826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse"));
        setField(term348, term348.getClass(), "systemVariableList", null);
        setField(term348, term348.getClass(), "systemSymbolList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemSymbolList", argTypes, term348, args);
    }

};


