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

public class ProfileDao_getHost_17522514721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165;

    public ProfileDao_getHost_17522514721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2191 = new HashMap();
        ArrayList term2199 = new ArrayList();
        ((ArrayList) term2199).add("");
        ((ArrayList) term2199).add("");
        ((ArrayList) term2199).add("");
        ((ArrayList) term2199).add("");
        ((ArrayList) term2199).add("");
        ((ArrayList) term2199).add("");
        term2165 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        Object term2166 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term2166, term2166.getClass(), "name", "Bcivwcjece");
        setField(term2166, term2166.getClass(), "type", "QTefjRuiez");
        setField(term2166, term2166.getClass(), "properties", term2191);
        setField(term2166, term2166.getClass(), "secure", term2199);
        setField(term2165, term2165.getClass(), "profile", term2166);
        setField(term2165, term2165.getClass(), "user", "DRhkpDneCC");
        setField(term2165, term2165.getClass(), "password", "vuIJRrypuA");
        setField(term2165, term2165.getClass(), "host", "AxfSZmaiyA");
        setField(term2165, term2165.getClass(), "port", "lBpveIKbea");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term2165, args);
    }

};


