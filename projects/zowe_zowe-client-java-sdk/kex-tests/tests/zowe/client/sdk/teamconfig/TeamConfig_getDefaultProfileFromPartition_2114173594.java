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

public class TeamConfig_getDefaultProfileFromPartition_2114173594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5833;

    public TeamConfig_getDefaultProfileFromPartition_2114173594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5887 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5887, term5887.getClass(), "name", null);
        setField(term5887, term5887.getClass(), "properties", null);
        setField(term5887, term5887.getClass(), "profiles", null);
        Object term5888 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5888, term5888.getClass(), "name", null);
        setField(term5888, term5888.getClass(), "properties", null);
        setField(term5888, term5888.getClass(), "profiles", null);
        Object term5889 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5889, term5889.getClass(), "name", null);
        setField(term5889, term5889.getClass(), "properties", null);
        setField(term5889, term5889.getClass(), "profiles", null);
        Object term5890 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5890, term5890.getClass(), "name", null);
        setField(term5890, term5890.getClass(), "properties", null);
        setField(term5890, term5890.getClass(), "profiles", null);
        Object term5891 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5891, term5891.getClass(), "name", null);
        setField(term5891, term5891.getClass(), "properties", null);
        setField(term5891, term5891.getClass(), "profiles", null);
        Object term5892 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5892, term5892.getClass(), "name", null);
        setField(term5892, term5892.getClass(), "properties", null);
        setField(term5892, term5892.getClass(), "profiles", null);
        Object term5893 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5893, term5893.getClass(), "name", null);
        setField(term5893, term5893.getClass(), "properties", null);
        setField(term5893, term5893.getClass(), "profiles", null);
        ArrayList term5885 = new ArrayList();
        ((ArrayList) term5885).add(term5887);
        ((ArrayList) term5885).add(term5888);
        ((ArrayList) term5885).add(term5889);
        ((ArrayList) term5885).add(term5890);
        ((ArrayList) term5885).add(term5891);
        ((ArrayList) term5885).add(term5892);
        ((ArrayList) term5885).add(term5893);
        Object term5910 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5910, term5910.getClass(), "name", null);
        setField(term5910, term5910.getClass(), "type", null);
        setField(term5910, term5910.getClass(), "properties", null);
        setField(term5910, term5910.getClass(), "secure", null);
        Object term5911 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5911, term5911.getClass(), "name", null);
        setField(term5911, term5911.getClass(), "type", null);
        setField(term5911, term5911.getClass(), "properties", null);
        setField(term5911, term5911.getClass(), "secure", null);
        Object term5912 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5912, term5912.getClass(), "name", null);
        setField(term5912, term5912.getClass(), "type", null);
        setField(term5912, term5912.getClass(), "properties", null);
        setField(term5912, term5912.getClass(), "secure", null);
        Object term5913 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5913, term5913.getClass(), "name", null);
        setField(term5913, term5913.getClass(), "type", null);
        setField(term5913, term5913.getClass(), "properties", null);
        setField(term5913, term5913.getClass(), "secure", null);
        ArrayList term5908 = new ArrayList();
        ((ArrayList) term5908).add(term5910);
        ((ArrayList) term5908).add(term5911);
        ((ArrayList) term5908).add(term5911);
        ((ArrayList) term5908).add(term5912);
        ((ArrayList) term5908).add(term5913);
        ((ArrayList) term5908).add(term5913);
        HashMap term5916 = new HashMap();
        Boolean term5924 = new Boolean(false);
        term5833 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        Object term5834 = newInstance(Class.forName("zowe.client.sdk.teamconfig.service.KeyTarService"));
        Object term5835 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        Object term5884 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term5833, term5833.getClass(), "teamConfigService", null);
        setField(term5834, term5834.getClass(), "keyTar", null);
        setField(term5833, term5833.getClass(), "keyTarService", term5834);
        setField(term5835, term5835.getClass(), "location", "NJhGgctbdj");
        setField(term5835, term5835.getClass(), "userName", "MYWYUeLGOp");
        setField(term5835, term5835.getClass(), "password", "tsTGdgQYUL");
        setField(term5835, term5835.getClass(), "storeName", "TtGbVmKcnX");
        setField(term5833, term5833.getClass(), "keyTarConfig", term5835);
        setField(term5884, term5884.getClass(), "partitions", term5885);
        setField(term5884, term5884.getClass(), "schema", "CVRGEomOth");
        setField(term5884, term5884.getClass(), "profiles", term5908);
        setField(term5884, term5884.getClass(), "defaults", term5916);
        setField(term5884, term5884.getClass(), "autoStore", term5924);
        setField(term5833, term5833.getClass(), "teamConfig", term5884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "WPxXsahPRq";
        args[1] = "IENRuqmwUU";
        callMethod(klass, "getDefaultProfileFromPartition", argTypes, term5833, args);
    }

};


