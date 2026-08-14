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

public class WorkflowVariableDefinition_getCategory_1732001626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21636;

    public WorkflowVariableDefinition_getCategory_1732001626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21685 = new ArrayList();
        ((ArrayList) term21685).add("LONFjqAsUp");
        Integer term21701 = new Integer(1134449235);
        Boolean term21727 = new Boolean(true);
        Integer term21729 = new Integer(-883034806);
        Integer term21743 = new Integer(1585847225);
        Boolean term21757 = new Boolean(true);
        Boolean term21771 = new Boolean(true);
        Boolean term21797 = new Boolean(false);
        term21636 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term21636, term21636.getClass(), "name", "pktmgYsknu");
        setField(term21636, term21636.getClass(), "scope", "SsMHzYNeji");
        setField(term21636, term21636.getClass(), "abstractInfo", "wzAFLFdaEQ");
        setField(term21636, term21636.getClass(), "category", "IcbBNUXJqX");
        setField(term21636, term21636.getClass(), "choice", term21685);
        setField(term21636, term21636.getClass(), "decimalPlaces", term21701);
        setField(term21636, term21636.getClass(), "defaultValue", "tAhydlbSMf");
        setField(term21636, term21636.getClass(), "description", "wNYtcPFyIe");
        setField(term21636, term21636.getClass(), "exposeToUser", term21727);
        setField(term21636, term21636.getClass(), "maxLength", term21729);
        setField(term21636, term21636.getClass(), "maxValue", "tlIqgTUSQw");
        setField(term21636, term21636.getClass(), "minLength", term21743);
        setField(term21636, term21636.getClass(), "minValue", "UvweyXjDhG");
        setField(term21636, term21636.getClass(), "promptAtCreate", term21757);
        setField(term21636, term21636.getClass(), "regularExpression", "wnoVhNwdJy");
        setField(term21636, term21636.getClass(), "requiredAtCreate", term21771);
        setField(term21636, term21636.getClass(), "type", "uQGMBLrmAj");
        setField(term21636, term21636.getClass(), "validationType", "vNFaheDeBv");
        setField(term21636, term21636.getClass(), "valueMustBeChoice", term21797);
        setField(term21636, term21636.getClass(), "visibility", "CiPMRxGoHO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term21636, args);
    }

};


