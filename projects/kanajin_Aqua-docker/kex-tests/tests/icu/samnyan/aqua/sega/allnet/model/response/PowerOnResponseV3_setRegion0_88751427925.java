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

public class PowerOnResponseV3_setRegion0_88751427925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9513;

    public PowerOnResponseV3_setRegion0_88751427925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9513 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term9513, term9513.getClass(), "stat", 590364439);
        setField(term9513, term9513.getClass(), "uri", "dwlZSxlXOo");
        setField(term9513, term9513.getClass(), "host", "lKrEAkypza");
        setField(term9513, term9513.getClass(), "place_id", "KtuuNAqGCQ");
        setField(term9513, term9513.getClass(), "name", "OGQsfjmReM");
        setField(term9513, term9513.getClass(), "nickname", "YsUtbngnRO");
        setField(term9513, term9513.getClass(), "region0", "JisaWUxcNb");
        setField(term9513, term9513.getClass(), "region_name0", "NxgmYPzWCI");
        setField(term9513, term9513.getClass(), "region_name1", "SqjyKmayBx");
        setField(term9513, term9513.getClass(), "region_name2", "XjDhvToxJy");
        setField(term9513, term9513.getClass(), "region_name3", "nxSTJflLQy");
        setField(term9513, term9513.getClass(), "country", "FlHzxEfFzI");
        setField(term9513, term9513.getClass(), "allnet_id", "aSATgQUpoe");
        setField(term9513, term9513.getClass(), "client_timezone", "VkPSXewZfB");
        setField(term9513, term9513.getClass(), "utc_time", "ubodzJoMGW");
        setField(term9513, term9513.getClass(), "setting", "weddIktxOA");
        setField(term9513, term9513.getClass(), "res_ver", "uSlMeISsDD");
        setField(term9513, term9513.getClass(), "token", "WdCiTDUKqn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PSizQDoxxe";
        callMethod(klass, "setRegion0", argTypes, term9513, args);
    }

};


