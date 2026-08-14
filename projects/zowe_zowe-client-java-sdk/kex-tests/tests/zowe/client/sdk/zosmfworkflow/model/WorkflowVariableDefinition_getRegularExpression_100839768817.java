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

public class WorkflowVariableDefinition_getRegularExpression_100839768817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25717;

    public WorkflowVariableDefinition_getRegularExpression_100839768817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25766 = new ArrayList();
        Integer term25770 = new Integer(-817164822);
        Boolean term25796 = new Boolean(true);
        Integer term25798 = new Integer(-1016503459);
        Integer term25812 = new Integer(-1968847291);
        Boolean term25826 = new Boolean(true);
        Boolean term25840 = new Boolean(true);
        Boolean term25866 = new Boolean(false);
        term25717 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term25717, term25717.getClass(), "name", "QJuqwUQEyr");
        setField(term25717, term25717.getClass(), "scope", "qqUAzxxpNB");
        setField(term25717, term25717.getClass(), "abstractInfo", "WqaQxuPbzr");
        setField(term25717, term25717.getClass(), "category", "bjLZqJqmnv");
        setField(term25717, term25717.getClass(), "choice", term25766);
        setField(term25717, term25717.getClass(), "decimalPlaces", term25770);
        setField(term25717, term25717.getClass(), "defaultValue", "TPbMBzbcHs");
        setField(term25717, term25717.getClass(), "description", "spkDvqsOhJ");
        setField(term25717, term25717.getClass(), "exposeToUser", term25796);
        setField(term25717, term25717.getClass(), "maxLength", term25798);
        setField(term25717, term25717.getClass(), "maxValue", "faFVBESzWc");
        setField(term25717, term25717.getClass(), "minLength", term25812);
        setField(term25717, term25717.getClass(), "minValue", "baFwYJAfPz");
        setField(term25717, term25717.getClass(), "promptAtCreate", term25826);
        setField(term25717, term25717.getClass(), "regularExpression", "PxBSOwkatN");
        setField(term25717, term25717.getClass(), "requiredAtCreate", term25840);
        setField(term25717, term25717.getClass(), "type", "uKjlgaHcoc");
        setField(term25717, term25717.getClass(), "validationType", "ITJMSWaPGZ");
        setField(term25717, term25717.getClass(), "valueMustBeChoice", term25866);
        setField(term25717, term25717.getClass(), "visibility", "ivvEvcUacU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegularExpression", argTypes, term25717, args);
    }

};


