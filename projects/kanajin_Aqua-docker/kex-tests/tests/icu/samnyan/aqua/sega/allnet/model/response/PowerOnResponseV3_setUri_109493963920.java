package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV3_setUri_109493963920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7523;

    public PowerOnResponseV3_setUri_109493963920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7523 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term7523, term7523.getClass(), "stat", -6029667);
        setField(term7523, term7523.getClass(), "uri", "fzeqPnzpnt");
        setField(term7523, term7523.getClass(), "host", "RxbhrFBjkO");
        setField(term7523, term7523.getClass(), "place_id", "aanyiAOJCl");
        setField(term7523, term7523.getClass(), "name", "VDokbsCuqq");
        setField(term7523, term7523.getClass(), "nickname", "xClUIcPECX");
        setField(term7523, term7523.getClass(), "region0", "avhRaGZaBF");
        setField(term7523, term7523.getClass(), "region_name0", "JkgoRtImdE");
        setField(term7523, term7523.getClass(), "region_name1", "qFGKIJjlmV");
        setField(term7523, term7523.getClass(), "region_name2", "IHqvyhMtuM");
        setField(term7523, term7523.getClass(), "region_name3", "dAldIGYAXV");
        setField(term7523, term7523.getClass(), "country", "mLwibAPEsa");
        setField(term7523, term7523.getClass(), "allnet_id", "zsWKWiTFuo");
        setField(term7523, term7523.getClass(), "client_timezone", "UPUbwyHQKN");
        setField(term7523, term7523.getClass(), "utc_time", "lgQkrXANyI");
        setField(term7523, term7523.getClass(), "setting", "MeTmRZXErV");
        setField(term7523, term7523.getClass(), "res_ver", "jNxbVmoZgq");
        setField(term7523, term7523.getClass(), "token", "PvmBHIXaMY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hulYxtowxw";
        callMethod(klass, "setUri", argTypes, term7523, args);
    }

};


