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

public class WorkflowVariableDefinition_getMinValue_188715779315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24843;

    public WorkflowVariableDefinition_getMinValue_188715779315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24892 = new ArrayList();
        ((ArrayList) term24892).add("zQtuUgUIjK");
        ((ArrayList) term24892).add("VBeGRjPsPN");
        ((ArrayList) term24892).add("pZrAdSHQIs");
        ((ArrayList) term24892).add("XTOiucaEva");
        ((ArrayList) term24892).add("JMekRNxFMU");
        ((ArrayList) term24892).add("LBNEEquiet");
        ((ArrayList) term24892).add("cBMdxJirJj");
        ((ArrayList) term24892).add("kVnxgkemHF");
        Integer term24992 = new Integer(679763016);
        Boolean term25018 = new Boolean(false);
        Integer term25020 = new Integer(1962444399);
        Integer term25034 = new Integer(767834723);
        Boolean term25048 = new Boolean(true);
        Boolean term25062 = new Boolean(true);
        Boolean term25088 = new Boolean(true);
        term24843 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term24843, term24843.getClass(), "name", "iualVLfDmL");
        setField(term24843, term24843.getClass(), "scope", "bhEFtkUvDw");
        setField(term24843, term24843.getClass(), "abstractInfo", "ZmbknwMIBa");
        setField(term24843, term24843.getClass(), "category", "UiRmBTpDTp");
        setField(term24843, term24843.getClass(), "choice", term24892);
        setField(term24843, term24843.getClass(), "decimalPlaces", term24992);
        setField(term24843, term24843.getClass(), "defaultValue", "JUQnEoujef");
        setField(term24843, term24843.getClass(), "description", "riXARUiigm");
        setField(term24843, term24843.getClass(), "exposeToUser", term25018);
        setField(term24843, term24843.getClass(), "maxLength", term25020);
        setField(term24843, term24843.getClass(), "maxValue", "RbXhBDZbRT");
        setField(term24843, term24843.getClass(), "minLength", term25034);
        setField(term24843, term24843.getClass(), "minValue", "QDaTqkWnGj");
        setField(term24843, term24843.getClass(), "promptAtCreate", term25048);
        setField(term24843, term24843.getClass(), "regularExpression", "vNObzQvzxo");
        setField(term24843, term24843.getClass(), "requiredAtCreate", term25062);
        setField(term24843, term24843.getClass(), "type", "uyuWzXeJvn");
        setField(term24843, term24843.getClass(), "validationType", "jvQHxWAYDO");
        setField(term24843, term24843.getClass(), "valueMustBeChoice", term25088);
        setField(term24843, term24843.getClass(), "visibility", "mntnLPfhte");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinValue", argTypes, term24843, args);
    }

};


