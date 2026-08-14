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

public class WorkflowVariableDefinition_getRequiredAtCreate_171147529318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26000;

    public WorkflowVariableDefinition_getRequiredAtCreate_171147529318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26049 = new ArrayList();
        ((ArrayList) term26049).add("HHAcgDPghN");
        ((ArrayList) term26049).add("GzmFcFoYft");
        ((ArrayList) term26049).add("LYRdIFgbgt");
        ((ArrayList) term26049).add("NiKeRXajei");
        ((ArrayList) term26049).add("fDNtdfDzQh");
        ((ArrayList) term26049).add("VbIydgisyZ");
        ((ArrayList) term26049).add("vigaMWRpCA");
        ((ArrayList) term26049).add("sgVVVUpnau");
        ((ArrayList) term26049).add("xwVTgDhNdW");
        Integer term26161 = new Integer(579005622);
        Boolean term26187 = new Boolean(true);
        Integer term26189 = new Integer(-14890619);
        Integer term26203 = new Integer(1632125673);
        Boolean term26217 = new Boolean(false);
        Boolean term26231 = new Boolean(true);
        Boolean term26257 = new Boolean(true);
        term26000 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term26000, term26000.getClass(), "name", "gbSukHPGfP");
        setField(term26000, term26000.getClass(), "scope", "jEDnJjwhoo");
        setField(term26000, term26000.getClass(), "abstractInfo", "TkTHRRicKc");
        setField(term26000, term26000.getClass(), "category", "xwBoTnuoQg");
        setField(term26000, term26000.getClass(), "choice", term26049);
        setField(term26000, term26000.getClass(), "decimalPlaces", term26161);
        setField(term26000, term26000.getClass(), "defaultValue", "ruqGjVRVlD");
        setField(term26000, term26000.getClass(), "description", "oeoFYkQLVk");
        setField(term26000, term26000.getClass(), "exposeToUser", term26187);
        setField(term26000, term26000.getClass(), "maxLength", term26189);
        setField(term26000, term26000.getClass(), "maxValue", "fibZqjUmdU");
        setField(term26000, term26000.getClass(), "minLength", term26203);
        setField(term26000, term26000.getClass(), "minValue", "DvLIPKnbCV");
        setField(term26000, term26000.getClass(), "promptAtCreate", term26217);
        setField(term26000, term26000.getClass(), "regularExpression", "QwAMZyCIhS");
        setField(term26000, term26000.getClass(), "requiredAtCreate", term26231);
        setField(term26000, term26000.getClass(), "type", "TnLDXZoBoo");
        setField(term26000, term26000.getClass(), "validationType", "RQTElJrtwb");
        setField(term26000, term26000.getClass(), "valueMustBeChoice", term26257);
        setField(term26000, term26000.getClass(), "visibility", "hFvoVHxToy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredAtCreate", argTypes, term26000, args);
    }

};


