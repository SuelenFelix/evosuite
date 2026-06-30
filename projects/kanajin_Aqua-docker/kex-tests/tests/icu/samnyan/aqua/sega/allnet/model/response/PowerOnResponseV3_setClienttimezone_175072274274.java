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

public class PowerOnResponseV3_setClienttimezone_175072274274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15861;

    public PowerOnResponseV3_setClienttimezone_175072274274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15861 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term15861, term15861.getClass(), "stat", 0);
        setField(term15861, term15861.getClass(), "uri", null);
        setField(term15861, term15861.getClass(), "host", null);
        setField(term15861, term15861.getClass(), "place_id", null);
        setField(term15861, term15861.getClass(), "name", null);
        setField(term15861, term15861.getClass(), "nickname", null);
        setField(term15861, term15861.getClass(), "region0", null);
        setField(term15861, term15861.getClass(), "region_name0", null);
        setField(term15861, term15861.getClass(), "region_name1", null);
        setField(term15861, term15861.getClass(), "region_name2", null);
        setField(term15861, term15861.getClass(), "region_name3", null);
        setField(term15861, term15861.getClass(), "country", null);
        setField(term15861, term15861.getClass(), "allnet_id", null);
        setField(term15861, term15861.getClass(), "client_timezone", null);
        setField(term15861, term15861.getClass(), "utc_time", null);
        setField(term15861, term15861.getClass(), "setting", null);
        setField(term15861, term15861.getClass(), "res_ver", null);
        setField(term15861, term15861.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClient_timezone", argTypes, term15861, args);
    }

};


