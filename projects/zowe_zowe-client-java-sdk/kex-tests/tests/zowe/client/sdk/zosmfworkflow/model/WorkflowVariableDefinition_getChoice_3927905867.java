package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class WorkflowVariableDefinition_getChoice_3927905867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21941;

    public WorkflowVariableDefinition_getChoice_3927905867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21990 = new ArrayList();
        ((ArrayList) term21990).add("bXInWdOeyi");
        ((ArrayList) term21990).add("HdwopulXkf");
        ((ArrayList) term21990).add("FuCKfgAhpC");
        Integer term22030 = new Integer(597278769);
        Boolean term22056 = new Boolean(false);
        Integer term22058 = new Integer(-1685132342);
        Integer term22072 = new Integer(-1456670397);
        Boolean term22086 = new Boolean(false);
        Boolean term22100 = new Boolean(true);
        Boolean term22126 = new Boolean(false);
        term21941 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term21941, term21941.getClass(), "name", "LauKpKmenw");
        setField(term21941, term21941.getClass(), "scope", "TydzbTXvbY");
        setField(term21941, term21941.getClass(), "abstractInfo", "yNogNNecFu");
        setField(term21941, term21941.getClass(), "category", "tcaaotqgDF");
        setField(term21941, term21941.getClass(), "choice", term21990);
        setField(term21941, term21941.getClass(), "decimalPlaces", term22030);
        setField(term21941, term21941.getClass(), "defaultValue", "gqMysJhxfA");
        setField(term21941, term21941.getClass(), "description", "HtLEppUqzI");
        setField(term21941, term21941.getClass(), "exposeToUser", term22056);
        setField(term21941, term21941.getClass(), "maxLength", term22058);
        setField(term21941, term21941.getClass(), "maxValue", "bVlRrMQeRY");
        setField(term21941, term21941.getClass(), "minLength", term22072);
        setField(term21941, term21941.getClass(), "minValue", "SXaXhlzAIB");
        setField(term21941, term21941.getClass(), "promptAtCreate", term22086);
        setField(term21941, term21941.getClass(), "regularExpression", "UPVTXSXUNh");
        setField(term21941, term21941.getClass(), "requiredAtCreate", term22100);
        setField(term21941, term21941.getClass(), "type", "cjCXbXuiFn");
        setField(term21941, term21941.getClass(), "validationType", "fhdhDeWdoi");
        setField(term21941, term21941.getClass(), "valueMustBeChoice", term22126);
        setField(term21941, term21941.getClass(), "visibility", "FqrcltWSUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChoice", argTypes, term21941, args);
    }

};


