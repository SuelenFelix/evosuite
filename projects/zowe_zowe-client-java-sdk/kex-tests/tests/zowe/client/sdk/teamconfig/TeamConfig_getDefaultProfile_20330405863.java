package zowe.client.sdk.teamconfig;

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
import static zowe.client.sdk.teamconfig.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class TeamConfig_getDefaultProfile_20330405863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5667;

    public TeamConfig_getDefaultProfile_20330405863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5721 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5721, term5721.getClass(), "name", null);
        setField(term5721, term5721.getClass(), "properties", null);
        setField(term5721, term5721.getClass(), "profiles", null);
        Object term5722 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5722, term5722.getClass(), "name", null);
        setField(term5722, term5722.getClass(), "properties", null);
        setField(term5722, term5722.getClass(), "profiles", null);
        Object term5723 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5723, term5723.getClass(), "name", null);
        setField(term5723, term5723.getClass(), "properties", null);
        setField(term5723, term5723.getClass(), "profiles", null);
        Object term5724 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5724, term5724.getClass(), "name", null);
        setField(term5724, term5724.getClass(), "properties", null);
        setField(term5724, term5724.getClass(), "profiles", null);
        Object term5725 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5725, term5725.getClass(), "name", null);
        setField(term5725, term5725.getClass(), "properties", null);
        setField(term5725, term5725.getClass(), "profiles", null);
        Object term5726 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5726, term5726.getClass(), "name", null);
        setField(term5726, term5726.getClass(), "properties", null);
        setField(term5726, term5726.getClass(), "profiles", null);
        ArrayList term5719 = new ArrayList();
        ((ArrayList) term5719).add(term5721);
        ((ArrayList) term5719).add(term5722);
        ((ArrayList) term5719).add(term5723);
        ((ArrayList) term5719).add(term5724);
        ((ArrayList) term5719).add(term5725);
        ((ArrayList) term5719).add(term5726);
        Object term5743 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5743, term5743.getClass(), "name", null);
        setField(term5743, term5743.getClass(), "type", null);
        setField(term5743, term5743.getClass(), "properties", null);
        setField(term5743, term5743.getClass(), "secure", null);
        Object term5744 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5744, term5744.getClass(), "name", null);
        setField(term5744, term5744.getClass(), "type", null);
        setField(term5744, term5744.getClass(), "properties", null);
        setField(term5744, term5744.getClass(), "secure", null);
        Object term5745 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5745, term5745.getClass(), "name", null);
        setField(term5745, term5745.getClass(), "type", null);
        setField(term5745, term5745.getClass(), "properties", null);
        setField(term5745, term5745.getClass(), "secure", null);
        Object term5746 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5746, term5746.getClass(), "name", null);
        setField(term5746, term5746.getClass(), "type", null);
        setField(term5746, term5746.getClass(), "properties", null);
        setField(term5746, term5746.getClass(), "secure", null);
        Object term5747 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5747, term5747.getClass(), "name", null);
        setField(term5747, term5747.getClass(), "type", null);
        setField(term5747, term5747.getClass(), "properties", null);
        setField(term5747, term5747.getClass(), "secure", null);
        Object term5748 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5748, term5748.getClass(), "name", null);
        setField(term5748, term5748.getClass(), "type", null);
        setField(term5748, term5748.getClass(), "properties", null);
        setField(term5748, term5748.getClass(), "secure", null);
        ArrayList term5741 = new ArrayList();
        ((ArrayList) term5741).add(term5743);
        ((ArrayList) term5741).add(term5744);
        ((ArrayList) term5741).add(term5744);
        ((ArrayList) term5741).add(term5745);
        ((ArrayList) term5741).add(term5746);
        ((ArrayList) term5741).add(term5747);
        ((ArrayList) term5741).add(term5744);
        ((ArrayList) term5741).add(term5748);
        ((ArrayList) term5741).add(term5743);
        HashMap term5751 = new HashMap();
        Boolean term5759 = new Boolean(false);
        term5667 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        Object term5668 = newInstance(Class.forName("zowe.client.sdk.teamconfig.service.KeyTarService"));
        Object term5669 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        Object term5718 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term5667, term5667.getClass(), "teamConfigService", null);
        setField(term5668, term5668.getClass(), "keyTar", null);
        setField(term5667, term5667.getClass(), "keyTarService", term5668);
        setField(term5669, term5669.getClass(), "location", "xtftXXMbem");
        setField(term5669, term5669.getClass(), "userName", "cudZvLMQon");
        setField(term5669, term5669.getClass(), "password", "lihXWlGDxk");
        setField(term5669, term5669.getClass(), "storeName", "JmcmxoGhIK");
        setField(term5667, term5667.getClass(), "keyTarConfig", term5669);
        setField(term5718, term5718.getClass(), "partitions", term5719);
        setField(term5718, term5718.getClass(), "schema", "TweMFhxNdj");
        setField(term5718, term5718.getClass(), "profiles", term5741);
        setField(term5718, term5718.getClass(), "defaults", term5751);
        setField(term5718, term5718.getClass(), "autoStore", term5759);
        setField(term5667, term5667.getClass(), "teamConfig", term5718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iCCsaLHohG";
        callMethod(klass, "getDefaultProfile", argTypes, term5667, args);
    }

};


