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

public class WorkflowVariableDefinition_getValueMustBeChoice_166194115121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27311;

    public WorkflowVariableDefinition_getValueMustBeChoice_166194115121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27360 = new ArrayList();
        ((ArrayList) term27360).add("reGIMbnrGF");
        ((ArrayList) term27360).add("yquSngBHqd");
        ((ArrayList) term27360).add("ZSdaJkZZPm");
        Integer term27400 = new Integer(-184153539);
        Boolean term27426 = new Boolean(true);
        Integer term27428 = new Integer(493620644);
        Integer term27442 = new Integer(1328271830);
        Boolean term27456 = new Boolean(false);
        Boolean term27470 = new Boolean(true);
        Boolean term27496 = new Boolean(false);
        term27311 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term27311, term27311.getClass(), "name", "GerBZdiruT");
        setField(term27311, term27311.getClass(), "scope", "VzkPDPPGQl");
        setField(term27311, term27311.getClass(), "abstractInfo", "iojOXjfZFr");
        setField(term27311, term27311.getClass(), "category", "yyrkuIYJKj");
        setField(term27311, term27311.getClass(), "choice", term27360);
        setField(term27311, term27311.getClass(), "decimalPlaces", term27400);
        setField(term27311, term27311.getClass(), "defaultValue", "ICnzwgujDT");
        setField(term27311, term27311.getClass(), "description", "RfDgUkIYjW");
        setField(term27311, term27311.getClass(), "exposeToUser", term27426);
        setField(term27311, term27311.getClass(), "maxLength", term27428);
        setField(term27311, term27311.getClass(), "maxValue", "QnZKCwkmMh");
        setField(term27311, term27311.getClass(), "minLength", term27442);
        setField(term27311, term27311.getClass(), "minValue", "RVQbteztJx");
        setField(term27311, term27311.getClass(), "promptAtCreate", term27456);
        setField(term27311, term27311.getClass(), "regularExpression", "yjmUdvwSdd");
        setField(term27311, term27311.getClass(), "requiredAtCreate", term27470);
        setField(term27311, term27311.getClass(), "type", "COsGswsrtI");
        setField(term27311, term27311.getClass(), "validationType", "ebUWnoVDmk");
        setField(term27311, term27311.getClass(), "valueMustBeChoice", term27496);
        setField(term27311, term27311.getClass(), "visibility", "wCcojFgWKb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValueMustBeChoice", argTypes, term27311, args);
    }

};


