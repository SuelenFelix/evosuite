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

public class VariableGetResponse_getSystemVariableList_1641647421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240;

    public VariableGetResponse_getSystemVariableList_1641647421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term243 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term243, term243.getClass(), "name", "");
        setField(term243, term243.getClass(), "value", "");
        setField(term243, term243.getClass(), "description", "");
        Object term247 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term247, term247.getClass(), "name", "");
        setField(term247, term247.getClass(), "value", "");
        setField(term247, term247.getClass(), "description", "");
        Object term251 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term251, term251.getClass(), "name", "");
        setField(term251, term251.getClass(), "value", "");
        setField(term251, term251.getClass(), "description", "");
        Object term255 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term255, term255.getClass(), "name", "");
        setField(term255, term255.getClass(), "value", "");
        setField(term255, term255.getClass(), "description", "");
        ArrayList term241 = new ArrayList();
        ((ArrayList) term241).add(term243);
        ((ArrayList) term241).add(term247);
        ((ArrayList) term241).add(term251);
        ((ArrayList) term241).add(term255);
        Object term263 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term263, term263.getClass(), "name", "");
        setField(term263, term263.getClass(), "value", "");
        setField(term263, term263.getClass(), "description", "");
        Object term267 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term267, term267.getClass(), "name", "");
        setField(term267, term267.getClass(), "value", "");
        setField(term267, term267.getClass(), "description", "");
        Object term271 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term271, term271.getClass(), "name", "");
        setField(term271, term271.getClass(), "value", "");
        setField(term271, term271.getClass(), "description", "");
        ArrayList term261 = new ArrayList();
        ((ArrayList) term261).add(term263);
        ((ArrayList) term261).add(term267);
        ((ArrayList) term261).add(term271);
        term240 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse"));
        setField(term240, term240.getClass(), "systemVariableList", term241);
        setField(term240, term240.getClass(), "systemSymbolList", term261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemVariableList", argTypes, term240, args);
    }

};


