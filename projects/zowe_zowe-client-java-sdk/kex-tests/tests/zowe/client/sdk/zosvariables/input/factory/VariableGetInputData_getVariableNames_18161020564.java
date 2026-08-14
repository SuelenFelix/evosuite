package zowe.client.sdk.zosvariables.input.factory;

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
import static zowe.client.sdk.zosvariables.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class VariableGetInputData_getVariableNames_18161020564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1725;

    public VariableGetInputData_getVariableNames_18161020564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1751 = new ArrayList();
        ((ArrayList) term1751).add("flxyYxBRtu");
        Class<? extends Object> term1816 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term1815 = ((Class) term1816).getDeclaredField((String) "SYMBOL");
        ((Field) term1815).setAccessible(true);
        Object enum4 = ((Field) term1815).get((Object) null);
        term1725 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData"));
        setField(term1725, term1725.getClass(), "sysplexName", "BYqFIqCKAV");
        setField(term1725, term1725.getClass(), "systemName", "vrQLuWIDJX");
        setBooleanField(term1725, term1725.getClass(), "local", true);
        setField(term1725, term1725.getClass(), "variableNames", term1751);
        setField(term1725, term1725.getClass(), "variableType", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariableNames", argTypes, term1725, args);
    }

};


