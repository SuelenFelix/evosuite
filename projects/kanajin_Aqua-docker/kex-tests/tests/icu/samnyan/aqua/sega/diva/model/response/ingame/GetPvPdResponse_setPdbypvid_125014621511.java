package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetPvPdResponse_setPdbypvid_125014621511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65621;

    public GetPvPdResponse_setPdbypvid_125014621511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65621 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse"));
        setField(term65621, term65621.getClass(), "pd_by_pv_id", null);
        setField(term65621, term65621.getClass(), "pdddt_flg", null);
        setField(term65621, term65621.getClass(), "pdddt_tm", null);
        setField(term65621, term65621.getClass(), "cmd", null);
        setField(term65621, term65621.getClass(), "req_id", null);
        setField(term65621, term65621.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPd_by_pv_id", argTypes, term65621, args);
    }

};


