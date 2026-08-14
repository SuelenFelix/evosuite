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

public class WorkflowVariableDefinition_getDefaultValue_7716976809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22683;

    public WorkflowVariableDefinition_getDefaultValue_7716976809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22732 = new ArrayList();
        ((ArrayList) term22732).add("DqrZwuHriF");
        ((ArrayList) term22732).add("daaMmTkwOR");
        ((ArrayList) term22732).add("WfJKDOFrUv");
        ((ArrayList) term22732).add("CbwfWaINrF");
        Integer term22784 = new Integer(-6029667);
        Boolean term22810 = new Boolean(false);
        Integer term22812 = new Integer(-2068769794);
        Integer term22826 = new Integer(-117576464);
        Boolean term22840 = new Boolean(true);
        Boolean term22854 = new Boolean(false);
        Boolean term22880 = new Boolean(true);
        term22683 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term22683, term22683.getClass(), "name", "jPPOVoAOLQ");
        setField(term22683, term22683.getClass(), "scope", "kZKzEkUFFI");
        setField(term22683, term22683.getClass(), "abstractInfo", "dnYvoLZjCf");
        setField(term22683, term22683.getClass(), "category", "ZsvLlzqETk");
        setField(term22683, term22683.getClass(), "choice", term22732);
        setField(term22683, term22683.getClass(), "decimalPlaces", term22784);
        setField(term22683, term22683.getClass(), "defaultValue", "AVCzSfXhGU");
        setField(term22683, term22683.getClass(), "description", "nTUCmQGFDE");
        setField(term22683, term22683.getClass(), "exposeToUser", term22810);
        setField(term22683, term22683.getClass(), "maxLength", term22812);
        setField(term22683, term22683.getClass(), "maxValue", "rfFTBanxEx");
        setField(term22683, term22683.getClass(), "minLength", term22826);
        setField(term22683, term22683.getClass(), "minValue", "MQJTCGewxT");
        setField(term22683, term22683.getClass(), "promptAtCreate", term22840);
        setField(term22683, term22683.getClass(), "regularExpression", "DRdgywxCcP");
        setField(term22683, term22683.getClass(), "requiredAtCreate", term22854);
        setField(term22683, term22683.getClass(), "type", "uelmUHzwnS");
        setField(term22683, term22683.getClass(), "validationType", "iKuSKqVzvy");
        setField(term22683, term22683.getClass(), "valueMustBeChoice", term22880);
        setField(term22683, term22683.getClass(), "visibility", "SgyGAlytLF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultValue", argTypes, term22683, args);
    }

};


