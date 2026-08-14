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

public class WorkflowVariableDefinition_toString_60295752623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28053;

    public WorkflowVariableDefinition_toString_60295752623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28102 = new ArrayList();
        ((ArrayList) term28102).add("XNgNLbjmim");
        ((ArrayList) term28102).add("InNyZMCrst");
        ((ArrayList) term28102).add("llSJDzNeEq");
        ((ArrayList) term28102).add("YIDNFdhfGO");
        Integer term28154 = new Integer(-2095575670);
        Boolean term28180 = new Boolean(false);
        Integer term28182 = new Integer(1225272962);
        Integer term28196 = new Integer(1324040357);
        Boolean term28210 = new Boolean(false);
        Boolean term28224 = new Boolean(true);
        Boolean term28250 = new Boolean(true);
        term28053 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28053, term28053.getClass(), "name", "gCFzBxPZKw");
        setField(term28053, term28053.getClass(), "scope", "YNVbzJpOdk");
        setField(term28053, term28053.getClass(), "abstractInfo", "CjPfMVeNPm");
        setField(term28053, term28053.getClass(), "category", "TeqSJDWXQD");
        setField(term28053, term28053.getClass(), "choice", term28102);
        setField(term28053, term28053.getClass(), "decimalPlaces", term28154);
        setField(term28053, term28053.getClass(), "defaultValue", "adNbqunmox");
        setField(term28053, term28053.getClass(), "description", "ImSBmTIdsP");
        setField(term28053, term28053.getClass(), "exposeToUser", term28180);
        setField(term28053, term28053.getClass(), "maxLength", term28182);
        setField(term28053, term28053.getClass(), "maxValue", "KDKQhbiclt");
        setField(term28053, term28053.getClass(), "minLength", term28196);
        setField(term28053, term28053.getClass(), "minValue", "diWnDDpNWl");
        setField(term28053, term28053.getClass(), "promptAtCreate", term28210);
        setField(term28053, term28053.getClass(), "regularExpression", "jcrJhyEbDI");
        setField(term28053, term28053.getClass(), "requiredAtCreate", term28224);
        setField(term28053, term28053.getClass(), "type", "DHbGOjJfEz");
        setField(term28053, term28053.getClass(), "validationType", "OuyHNwADel");
        setField(term28053, term28053.getClass(), "valueMustBeChoice", term28250);
        setField(term28053, term28053.getClass(), "visibility", "shazlRAQrB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28053, args);
    }

};


