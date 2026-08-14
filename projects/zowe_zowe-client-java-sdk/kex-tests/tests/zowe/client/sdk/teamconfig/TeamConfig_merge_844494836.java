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

public class TeamConfig_merge_844494836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6283;
     Object term6377;
     Object term6488;

    public TeamConfig_merge_844494836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6337 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6337, term6337.getClass(), "name", null);
        setField(term6337, term6337.getClass(), "properties", null);
        setField(term6337, term6337.getClass(), "profiles", null);
        Object term6338 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6338, term6338.getClass(), "name", null);
        setField(term6338, term6338.getClass(), "properties", null);
        setField(term6338, term6338.getClass(), "profiles", null);
        Object term6339 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6339, term6339.getClass(), "name", null);
        setField(term6339, term6339.getClass(), "properties", null);
        setField(term6339, term6339.getClass(), "profiles", null);
        Object term6340 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6340, term6340.getClass(), "name", null);
        setField(term6340, term6340.getClass(), "properties", null);
        setField(term6340, term6340.getClass(), "profiles", null);
        Object term6341 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6341, term6341.getClass(), "name", null);
        setField(term6341, term6341.getClass(), "properties", null);
        setField(term6341, term6341.getClass(), "profiles", null);
        Object term6342 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6342, term6342.getClass(), "name", null);
        setField(term6342, term6342.getClass(), "properties", null);
        setField(term6342, term6342.getClass(), "profiles", null);
        Object term6343 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6343, term6343.getClass(), "name", null);
        setField(term6343, term6343.getClass(), "properties", null);
        setField(term6343, term6343.getClass(), "profiles", null);
        Object term6344 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6344, term6344.getClass(), "name", null);
        setField(term6344, term6344.getClass(), "properties", null);
        setField(term6344, term6344.getClass(), "profiles", null);
        ArrayList term6335 = new ArrayList();
        ((ArrayList) term6335).add(term6337);
        ((ArrayList) term6335).add(term6338);
        ((ArrayList) term6335).add(term6339);
        ((ArrayList) term6335).add(term6340);
        ((ArrayList) term6335).add(term6341);
        ((ArrayList) term6335).add(term6342);
        ((ArrayList) term6335).add(term6343);
        ((ArrayList) term6335).add(term6344);
        Object term6361 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6361, term6361.getClass(), "name", null);
        setField(term6361, term6361.getClass(), "type", null);
        setField(term6361, term6361.getClass(), "properties", null);
        setField(term6361, term6361.getClass(), "secure", null);
        Object term6362 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6362, term6362.getClass(), "name", null);
        setField(term6362, term6362.getClass(), "type", null);
        setField(term6362, term6362.getClass(), "properties", null);
        setField(term6362, term6362.getClass(), "secure", null);
        Object term6363 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6363, term6363.getClass(), "name", null);
        setField(term6363, term6363.getClass(), "type", null);
        setField(term6363, term6363.getClass(), "properties", null);
        setField(term6363, term6363.getClass(), "secure", null);
        Object term6364 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6364, term6364.getClass(), "name", null);
        setField(term6364, term6364.getClass(), "type", null);
        setField(term6364, term6364.getClass(), "properties", null);
        setField(term6364, term6364.getClass(), "secure", null);
        ArrayList term6359 = new ArrayList();
        ((ArrayList) term6359).add(term6361);
        ((ArrayList) term6359).add(term6362);
        ((ArrayList) term6359).add(term6362);
        ((ArrayList) term6359).add(term6363);
        ((ArrayList) term6359).add(term6364);
        HashMap term6367 = new HashMap();
        Boolean term6375 = new Boolean(true);
        term6283 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        Object term6284 = newInstance(Class.forName("zowe.client.sdk.teamconfig.service.KeyTarService"));
        Object term6285 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        Object term6334 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term6283, term6283.getClass(), "teamConfigService", null);
        setField(term6284, term6284.getClass(), "keyTar", null);
        setField(term6283, term6283.getClass(), "keyTarService", term6284);
        setField(term6285, term6285.getClass(), "location", "rsumfoDNHa");
        setField(term6285, term6285.getClass(), "userName", "ceCWHUTQUM");
        setField(term6285, term6285.getClass(), "password", "LrqwfrKKtS");
        setField(term6285, term6285.getClass(), "storeName", "ZUdnQXfzCI");
        setField(term6283, term6283.getClass(), "keyTarConfig", term6285);
        setField(term6334, term6334.getClass(), "partitions", term6335);
        setField(term6334, term6334.getClass(), "schema", "njvnWFTMxN");
        setField(term6334, term6334.getClass(), "profiles", term6359);
        setField(term6334, term6334.getClass(), "defaults", term6367);
        setField(term6334, term6334.getClass(), "autoStore", term6375);
        setField(term6283, term6283.getClass(), "teamConfig", term6334);
        HashMap term6402 = new HashMap();
        ArrayList term6412 = new ArrayList();
        ((ArrayList) term6412).add("MpJsPKLTIU");
        ((ArrayList) term6412).add("IiNCZfdouL");
        ((ArrayList) term6412).add("AhOHzCsHKW");
        ((ArrayList) term6412).add("UqgLPaaAHi");
        ((ArrayList) term6412).add("xypryEkUPF");
        ((ArrayList) term6412).add("zyZTzHNjQr");
        term6377 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6377, term6377.getClass(), "name", "PtIjKpiSix");
        setField(term6377, term6377.getClass(), "type", "NZdTuwSCIM");
        setField(term6377, term6377.getClass(), "properties", term6402);
        setField(term6377, term6377.getClass(), "secure", term6412);
        HashMap term6513 = new HashMap();
        ArrayList term6523 = new ArrayList();
        ((ArrayList) term6523).add("EAIAAStlTz");
        ((ArrayList) term6523).add("yIWXcOQTgy");
        ((ArrayList) term6523).add("xAWekqanqc");
        term6488 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6488, term6488.getClass(), "name", "YSrFKQQwXE");
        setField(term6488, term6488.getClass(), "type", "qxhOsmyyjm");
        setField(term6488, term6488.getClass(), "properties", term6513);
        setField(term6488, term6488.getClass(), "secure", term6523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        argTypes[1] = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Object[] args = new Object[2];
        args[0] = term6377;
        args[1] = term6488;
        callMethod(klass, "merge", argTypes, term6283, args);
    }

};


