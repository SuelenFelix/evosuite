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

public class VariableGetResponse_toString_14755674303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;

    public VariableGetResponse_toString_14755674303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term309 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term309, term309.getClass(), "name", "");
        setField(term309, term309.getClass(), "value", "");
        setField(term309, term309.getClass(), "description", "");
        Object term313 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term313, term313.getClass(), "name", "");
        setField(term313, term313.getClass(), "value", "");
        setField(term313, term313.getClass(), "description", "");
        Object term317 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term317, term317.getClass(), "name", "");
        setField(term317, term317.getClass(), "value", "");
        setField(term317, term317.getClass(), "description", "");
        Object term321 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term321, term321.getClass(), "name", "");
        setField(term321, term321.getClass(), "value", "");
        setField(term321, term321.getClass(), "description", "");
        Object term325 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term325, term325.getClass(), "name", "");
        setField(term325, term325.getClass(), "value", "");
        setField(term325, term325.getClass(), "description", "");
        Object term329 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term329, term329.getClass(), "name", "");
        setField(term329, term329.getClass(), "value", "");
        setField(term329, term329.getClass(), "description", "");
        ArrayList term307 = new ArrayList();
        ((ArrayList) term307).add(term309);
        ((ArrayList) term307).add(term313);
        ((ArrayList) term307).add(term317);
        ((ArrayList) term307).add(term321);
        ((ArrayList) term307).add(term325);
        ((ArrayList) term307).add(term329);
        Object term337 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term337, term337.getClass(), "name", "");
        setField(term337, term337.getClass(), "value", "");
        setField(term337, term337.getClass(), "description", "");
        Object term341 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term341, term341.getClass(), "name", "");
        setField(term341, term341.getClass(), "value", "");
        setField(term341, term341.getClass(), "description", "");
        ArrayList term335 = new ArrayList();
        ((ArrayList) term335).add(term337);
        ((ArrayList) term335).add(term341);
        term306 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse"));
        setField(term306, term306.getClass(), "systemVariableList", term307);
        setField(term306, term306.getClass(), "systemSymbolList", term335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term306, args);
    }

};


