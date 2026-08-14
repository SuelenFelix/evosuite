package zowe.client.sdk.teamconfig.model;

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
import static zowe.client.sdk.teamconfig.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class ConfigContainer_isAutoStore_20115561331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;

    public ConfigContainer_isAutoStore_20115561331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1082 = new HashMap();
        ArrayList term1087 = new ArrayList();
        ((ArrayList) term1087).add((Object)null);
        ((ArrayList) term1087).add((Object)null);
        ((ArrayList) term1087).add((Object)null);
        ((ArrayList) term1087).add((Object)null);
        ((ArrayList) term1087).add((Object)null);
        ((ArrayList) term1087).add((Object)null);
        ((ArrayList) term1087).add((Object)null);
        Object term1080 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1080, term1080.getClass(), "name", "");
        setField(term1080, term1080.getClass(), "properties", term1082);
        setField(term1080, term1080.getClass(), "profiles", term1087);
        HashMap term1092 = new HashMap();
        ArrayList term1097 = new ArrayList();
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        ((ArrayList) term1097).add((Object)null);
        Object term1090 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1090, term1090.getClass(), "name", "");
        setField(term1090, term1090.getClass(), "properties", term1092);
        setField(term1090, term1090.getClass(), "profiles", term1097);
        HashMap term1102 = new HashMap();
        ArrayList term1107 = new ArrayList();
        ((ArrayList) term1107).add((Object)null);
        ((ArrayList) term1107).add((Object)null);
        ((ArrayList) term1107).add((Object)null);
        ((ArrayList) term1107).add((Object)null);
        ((ArrayList) term1107).add((Object)null);
        Object term1100 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1100, term1100.getClass(), "name", "");
        setField(term1100, term1100.getClass(), "properties", term1102);
        setField(term1100, term1100.getClass(), "profiles", term1107);
        HashMap term1112 = new HashMap();
        ArrayList term1117 = new ArrayList();
        ((ArrayList) term1117).add((Object)null);
        ((ArrayList) term1117).add((Object)null);
        ((ArrayList) term1117).add((Object)null);
        ((ArrayList) term1117).add((Object)null);
        Object term1110 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1110, term1110.getClass(), "name", "");
        setField(term1110, term1110.getClass(), "properties", term1112);
        setField(term1110, term1110.getClass(), "profiles", term1117);
        ArrayList term1078 = new ArrayList();
        ((ArrayList) term1078).add(term1080);
        ((ArrayList) term1078).add(term1090);
        ((ArrayList) term1078).add(term1100);
        ((ArrayList) term1078).add(term1110);
        HashMap term1139 = new HashMap();
        ArrayList term1144 = new ArrayList();
        ((ArrayList) term1144).add((Object)null);
        ((ArrayList) term1144).add((Object)null);
        ((ArrayList) term1144).add((Object)null);
        ((ArrayList) term1144).add((Object)null);
        ((ArrayList) term1144).add((Object)null);
        ((ArrayList) term1144).add((Object)null);
        ((ArrayList) term1144).add((Object)null);
        Object term1136 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1136, term1136.getClass(), "name", "");
        setField(term1136, term1136.getClass(), "type", "");
        setField(term1136, term1136.getClass(), "properties", term1139);
        setField(term1136, term1136.getClass(), "secure", term1144);
        HashMap term1150 = new HashMap();
        ArrayList term1155 = new ArrayList();
        ((ArrayList) term1155).add((Object)null);
        ((ArrayList) term1155).add((Object)null);
        Object term1147 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1147, term1147.getClass(), "name", "");
        setField(term1147, term1147.getClass(), "type", "");
        setField(term1147, term1147.getClass(), "properties", term1150);
        setField(term1147, term1147.getClass(), "secure", term1155);
        HashMap term1161 = new HashMap();
        ArrayList term1166 = new ArrayList();
        Object term1158 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1158, term1158.getClass(), "name", "");
        setField(term1158, term1158.getClass(), "type", "");
        setField(term1158, term1158.getClass(), "properties", term1161);
        setField(term1158, term1158.getClass(), "secure", term1166);
        HashMap term1172 = new HashMap();
        ArrayList term1177 = new ArrayList();
        ((ArrayList) term1177).add((Object)null);
        Object term1169 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1169, term1169.getClass(), "name", "");
        setField(term1169, term1169.getClass(), "type", "");
        setField(term1169, term1169.getClass(), "properties", term1172);
        setField(term1169, term1169.getClass(), "secure", term1177);
        ArrayList term1134 = new ArrayList();
        ((ArrayList) term1134).add(term1136);
        ((ArrayList) term1134).add(term1147);
        ((ArrayList) term1134).add(term1158);
        ((ArrayList) term1134).add(term1169);
        HashMap term1182 = new HashMap();
        Boolean term1192 = new Boolean(false);
        term1077 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1077, term1077.getClass(), "partitions", term1078);
        setField(term1077, term1077.getClass(), "schema", "uPuCVuZYOI");
        setField(term1077, term1077.getClass(), "profiles", term1134);
        setField(term1077, term1077.getClass(), "defaults", term1182);
        setField(term1077, term1077.getClass(), "autoStore", term1192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAutoStore", argTypes, term1077, args);
    }

};


