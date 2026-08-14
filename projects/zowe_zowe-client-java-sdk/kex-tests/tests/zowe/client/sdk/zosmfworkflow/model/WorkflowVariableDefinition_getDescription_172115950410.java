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

public class WorkflowVariableDefinition_getDescription_172115950410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23054;

    public WorkflowVariableDefinition_getDescription_172115950410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23103 = new ArrayList();
        ((ArrayList) term23103).add("vSbbcByIuA");
        ((ArrayList) term23103).add("QSvdWzkkPx");
        ((ArrayList) term23103).add("vStdEtWvae");
        ((ArrayList) term23103).add("iApJWgnQkP");
        Integer term23155 = new Integer(-1007160944);
        Boolean term23181 = new Boolean(false);
        Integer term23183 = new Integer(1135664017);
        Integer term23197 = new Integer(590364439);
        Boolean term23211 = new Boolean(false);
        Boolean term23225 = new Boolean(true);
        Boolean term23251 = new Boolean(false);
        term23054 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term23054, term23054.getClass(), "name", "OoXopVvpwr");
        setField(term23054, term23054.getClass(), "scope", "lwwreKJCFL");
        setField(term23054, term23054.getClass(), "abstractInfo", "PWBggYjpOQ");
        setField(term23054, term23054.getClass(), "category", "FDzNpfjYDI");
        setField(term23054, term23054.getClass(), "choice", term23103);
        setField(term23054, term23054.getClass(), "decimalPlaces", term23155);
        setField(term23054, term23054.getClass(), "defaultValue", "kHKzzYJxiP");
        setField(term23054, term23054.getClass(), "description", "INFnBrMIka");
        setField(term23054, term23054.getClass(), "exposeToUser", term23181);
        setField(term23054, term23054.getClass(), "maxLength", term23183);
        setField(term23054, term23054.getClass(), "maxValue", "EwmpEgdvZs");
        setField(term23054, term23054.getClass(), "minLength", term23197);
        setField(term23054, term23054.getClass(), "minValue", "vRjHouXWLC");
        setField(term23054, term23054.getClass(), "promptAtCreate", term23211);
        setField(term23054, term23054.getClass(), "regularExpression", "XghDInkWEe");
        setField(term23054, term23054.getClass(), "requiredAtCreate", term23225);
        setField(term23054, term23054.getClass(), "type", "zPDuGbsYGT");
        setField(term23054, term23054.getClass(), "validationType", "apnNoBOovC");
        setField(term23054, term23054.getClass(), "valueMustBeChoice", term23251);
        setField(term23054, term23054.getClass(), "visibility", "SyGIHWAumE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term23054, args);
    }

};


