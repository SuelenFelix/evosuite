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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class ProfileDao_getUser_13767974215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2771;

    public ProfileDao_getUser_13767974215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2797 = new HashMap();
        ArrayList term2805 = new ArrayList();
        ((ArrayList) term2805).add("");
        ((ArrayList) term2805).add("");
        ((ArrayList) term2805).add("");
        ((ArrayList) term2805).add("");
        ((ArrayList) term2805).add("");
        ((ArrayList) term2805).add("");
        ((ArrayList) term2805).add("");
        term2771 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        Object term2772 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term2772, term2772.getClass(), "name", "LgXdqWrsLL");
        setField(term2772, term2772.getClass(), "type", "bbHWyibNmy");
        setField(term2772, term2772.getClass(), "properties", term2797);
        setField(term2772, term2772.getClass(), "secure", term2805);
        setField(term2771, term2771.getClass(), "profile", term2772);
        setField(term2771, term2771.getClass(), "user", "gZPZNkweEp");
        setField(term2771, term2771.getClass(), "password", "vfennwtmqe");
        setField(term2771, term2771.getClass(), "host", "zZxoNkohbw");
        setField(term2771, term2771.getClass(), "port", "DQrjPcLysX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term2771, args);
    }

};


