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

public class ProfileDao_toString_4618412826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;

    public ProfileDao_toString_4618412826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2950 = new HashMap();
        ArrayList term2958 = new ArrayList();
        term2924 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        Object term2925 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term2925, term2925.getClass(), "name", "VWPFyrpmmb");
        setField(term2925, term2925.getClass(), "type", "gYYKrIeThw");
        setField(term2925, term2925.getClass(), "properties", term2950);
        setField(term2925, term2925.getClass(), "secure", term2958);
        setField(term2924, term2924.getClass(), "profile", term2925);
        setField(term2924, term2924.getClass(), "user", "qMKmSzOQXg");
        setField(term2924, term2924.getClass(), "password", "CURQCMkqbZ");
        setField(term2924, term2924.getClass(), "host", "VZwkkQktrm");
        setField(term2924, term2924.getClass(), "port", "wIuJvIvEMb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2924, args);
    }

};


