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
import java.util.ArrayList;
import java.lang.Object;

public class VariableGetResponse_getSystemSymbolList_19076996822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public VariableGetResponse_getSystemSymbolList_19076996822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term280, term280.getClass(), "name", "");
        setField(term280, term280.getClass(), "value", "");
        setField(term280, term280.getClass(), "description", "");
        Object term284 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term284, term284.getClass(), "name", "");
        setField(term284, term284.getClass(), "value", "");
        setField(term284, term284.getClass(), "description", "");
        Object term288 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term288, term288.getClass(), "name", "");
        setField(term288, term288.getClass(), "value", "");
        setField(term288, term288.getClass(), "description", "");
        Object term292 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term292, term292.getClass(), "name", "");
        setField(term292, term292.getClass(), "value", "");
        setField(term292, term292.getClass(), "description", "");
        ArrayList term278 = new ArrayList();
        ((ArrayList) term278).add(term280);
        ((ArrayList) term278).add(term284);
        ((ArrayList) term278).add(term288);
        ((ArrayList) term278).add(term292);
        Object term300 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term300, term300.getClass(), "name", "");
        setField(term300, term300.getClass(), "value", "");
        setField(term300, term300.getClass(), "description", "");
        ArrayList term298 = new ArrayList();
        ((ArrayList) term298).add(term300);
        term277 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse"));
        setField(term277, term277.getClass(), "systemVariableList", term278);
        setField(term277, term277.getClass(), "systemSymbolList", term298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemSymbolList", argTypes, term277, args);
    }

};


