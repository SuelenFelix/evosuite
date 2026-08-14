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

public class WorkflowVariableDefinition_getPromptAtCreate_18556227016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25302;

    public WorkflowVariableDefinition_getPromptAtCreate_18556227016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25351 = new ArrayList();
        ((ArrayList) term25351).add("gzqokHWvLu");
        ((ArrayList) term25351).add("ANCcRsABGP");
        ((ArrayList) term25351).add("MBadwVIvwu");
        ((ArrayList) term25351).add("zTMIjtwMQL");
        ((ArrayList) term25351).add("cjJhlsbSLZ");
        ((ArrayList) term25351).add("BvcBilSFZf");
        Integer term25427 = new Integer(-602026508);
        Boolean term25453 = new Boolean(true);
        Integer term25455 = new Integer(-157887805);
        Integer term25469 = new Integer(1876565163);
        Boolean term25483 = new Boolean(true);
        Boolean term25497 = new Boolean(true);
        Boolean term25523 = new Boolean(true);
        term25302 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term25302, term25302.getClass(), "name", "rIKLUjcdnZ");
        setField(term25302, term25302.getClass(), "scope", "MQaKKukkYD");
        setField(term25302, term25302.getClass(), "abstractInfo", "ThGyaiqnHq");
        setField(term25302, term25302.getClass(), "category", "AtEuOtHJrK");
        setField(term25302, term25302.getClass(), "choice", term25351);
        setField(term25302, term25302.getClass(), "decimalPlaces", term25427);
        setField(term25302, term25302.getClass(), "defaultValue", "ppUmoMssug");
        setField(term25302, term25302.getClass(), "description", "FcponInvBb");
        setField(term25302, term25302.getClass(), "exposeToUser", term25453);
        setField(term25302, term25302.getClass(), "maxLength", term25455);
        setField(term25302, term25302.getClass(), "maxValue", "IFOOxmFxbX");
        setField(term25302, term25302.getClass(), "minLength", term25469);
        setField(term25302, term25302.getClass(), "minValue", "aDEuPKrSZt");
        setField(term25302, term25302.getClass(), "promptAtCreate", term25483);
        setField(term25302, term25302.getClass(), "regularExpression", "aDhkmoCCUK");
        setField(term25302, term25302.getClass(), "requiredAtCreate", term25497);
        setField(term25302, term25302.getClass(), "type", "ibnuoVVkVm");
        setField(term25302, term25302.getClass(), "validationType", "mXVgkxjTjD");
        setField(term25302, term25302.getClass(), "valueMustBeChoice", term25523);
        setField(term25302, term25302.getClass(), "visibility", "qodBmKUkev");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPromptAtCreate", argTypes, term25302, args);
    }

};


