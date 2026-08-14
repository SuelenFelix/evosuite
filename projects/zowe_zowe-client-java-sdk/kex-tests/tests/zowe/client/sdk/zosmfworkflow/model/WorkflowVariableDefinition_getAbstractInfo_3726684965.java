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

public class WorkflowVariableDefinition_getAbstractInfo_3726684965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21353;

    public WorkflowVariableDefinition_getAbstractInfo_3726684965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21402 = new ArrayList();
        Integer term21406 = new Integer(-1339778481);
        Boolean term21432 = new Boolean(true);
        Integer term21434 = new Integer(1725571209);
        Integer term21448 = new Integer(-522618178);
        Boolean term21462 = new Boolean(false);
        Boolean term21476 = new Boolean(false);
        Boolean term21502 = new Boolean(true);
        term21353 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term21353, term21353.getClass(), "name", "SUIYUFtCCe");
        setField(term21353, term21353.getClass(), "scope", "eKCrPCkedw");
        setField(term21353, term21353.getClass(), "abstractInfo", "VAFSknHLsZ");
        setField(term21353, term21353.getClass(), "category", "MamzBtwhiz");
        setField(term21353, term21353.getClass(), "choice", term21402);
        setField(term21353, term21353.getClass(), "decimalPlaces", term21406);
        setField(term21353, term21353.getClass(), "defaultValue", "wVOypfVLsP");
        setField(term21353, term21353.getClass(), "description", "pEazBcUUWX");
        setField(term21353, term21353.getClass(), "exposeToUser", term21432);
        setField(term21353, term21353.getClass(), "maxLength", term21434);
        setField(term21353, term21353.getClass(), "maxValue", "nlvRWrTxvz");
        setField(term21353, term21353.getClass(), "minLength", term21448);
        setField(term21353, term21353.getClass(), "minValue", "isMKwgUmka");
        setField(term21353, term21353.getClass(), "promptAtCreate", term21462);
        setField(term21353, term21353.getClass(), "regularExpression", "pDIyzhDtTy");
        setField(term21353, term21353.getClass(), "requiredAtCreate", term21476);
        setField(term21353, term21353.getClass(), "type", "wXiUlhXQoC");
        setField(term21353, term21353.getClass(), "validationType", "gKhmgJzimH");
        setField(term21353, term21353.getClass(), "valueMustBeChoice", term21502);
        setField(term21353, term21353.getClass(), "visibility", "OzRiWLVXNx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbstractInfo", argTypes, term21353, args);
    }

};


