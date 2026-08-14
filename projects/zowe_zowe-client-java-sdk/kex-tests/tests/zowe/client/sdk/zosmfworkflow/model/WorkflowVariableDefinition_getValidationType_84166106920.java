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

public class WorkflowVariableDefinition_getValidationType_84166106920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26830;

    public WorkflowVariableDefinition_getValidationType_84166106920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26879 = new ArrayList();
        ((ArrayList) term26879).add("TLlyjzxJUz");
        ((ArrayList) term26879).add("YclIWGPKZY");
        ((ArrayList) term26879).add("gChBjLUhbg");
        ((ArrayList) term26879).add("enWkULOykY");
        ((ArrayList) term26879).add("BPdcafiAQX");
        ((ArrayList) term26879).add("GvmOxwMrOk");
        ((ArrayList) term26879).add("WXUKmhwFsK");
        ((ArrayList) term26879).add("OcfokBTzZZ");
        ((ArrayList) term26879).add("zeBhlhyhkL");
        Integer term26991 = new Integer(-1048298087);
        Boolean term27017 = new Boolean(true);
        Integer term27019 = new Integer(292681826);
        Integer term27033 = new Integer(458147407);
        Boolean term27047 = new Boolean(true);
        Boolean term27061 = new Boolean(false);
        Boolean term27087 = new Boolean(false);
        term26830 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term26830, term26830.getClass(), "name", "nvXqvMSAjc");
        setField(term26830, term26830.getClass(), "scope", "agbhgbQisl");
        setField(term26830, term26830.getClass(), "abstractInfo", "EZvlAVCXCm");
        setField(term26830, term26830.getClass(), "category", "axtbmWOSRY");
        setField(term26830, term26830.getClass(), "choice", term26879);
        setField(term26830, term26830.getClass(), "decimalPlaces", term26991);
        setField(term26830, term26830.getClass(), "defaultValue", "PxinRhWgwT");
        setField(term26830, term26830.getClass(), "description", "pZcEKUNIXL");
        setField(term26830, term26830.getClass(), "exposeToUser", term27017);
        setField(term26830, term26830.getClass(), "maxLength", term27019);
        setField(term26830, term26830.getClass(), "maxValue", "QbRtvZIDtW");
        setField(term26830, term26830.getClass(), "minLength", term27033);
        setField(term26830, term26830.getClass(), "minValue", "fbsmDvjMqr");
        setField(term26830, term26830.getClass(), "promptAtCreate", term27047);
        setField(term26830, term26830.getClass(), "regularExpression", "tycssGWZvU");
        setField(term26830, term26830.getClass(), "requiredAtCreate", term27061);
        setField(term26830, term26830.getClass(), "type", "jcvrILwbgt");
        setField(term26830, term26830.getClass(), "validationType", "AphrAHzPMC");
        setField(term26830, term26830.getClass(), "valueMustBeChoice", term27087);
        setField(term26830, term26830.getClass(), "visibility", "iwismCnYjB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValidationType", argTypes, term26830, args);
    }

};


