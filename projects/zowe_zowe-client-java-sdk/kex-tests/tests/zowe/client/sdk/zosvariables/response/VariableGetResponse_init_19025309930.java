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
import java.util.LinkedList;
import java.lang.Object;

public class VariableGetResponse_init_19025309930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term88;

    public VariableGetResponse_init_19025309930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "value", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "description", "MuLcgQHgqz");
        Object term42 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term42, term42.getClass(), "name", "");
        setField(term42, term42.getClass(), "value", "");
        setField(term42, term42.getClass(), "description", "");
        Object term47 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term47, term47.getClass(), "name", null);
        setField(term47, term47.getClass(), "value", null);
        setField(term47, term47.getClass(), "description", null);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term42);
        ((LinkedList) term1).add(term47);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        Object term91 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term91, term91.getClass(), "name", "aJlieCFVtF");
        setField(term91, term91.getClass(), "value", "ZiaGIbnzTs");
        setField(term91, term91.getClass(), "description", "tbcdzjIfER");
        Object term129 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term129, term129.getClass(), "name", "");
        setField(term129, term129.getClass(), "value", "");
        setField(term129, term129.getClass(), "description", "");
        Object term134 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term134, term134.getClass(), "name", null);
        setField(term134, term134.getClass(), "value", null);
        setField(term134, term134.getClass(), "description", null);
        term88 = new LinkedList();
        ((LinkedList) term88).add(term91);
        ((LinkedList) term88).add(term129);
        ((LinkedList) term88).add(term134);
        ((LinkedList) term88).add((Object)null);
        ((LinkedList) term88).add((Object)null);
        ((LinkedList) term88).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.response.VariableGetResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term88;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


