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
import java.lang.Boolean;

public class GetPvPdResponse_setPdddtflg_16514418595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65368;
     Object term65431;

    public GetPvPdResponse_setPdddtflg_16514418595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term65381 = new Boolean(true);
        term65368 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse"));
        setField(term65368, term65368.getClass(), "pd_by_pv_id", "jcrJhyEbDI");
        setField(term65368, term65368.getClass(), "pdddt_flg", term65381);
        setField(term65368, term65368.getClass(), "pdddt_tm", "DHbGOjJfEz");
        setField(term65368, term65368.getClass(), "cmd", "OuyHNwADel");
        setField(term65368, term65368.getClass(), "req_id", "shazlRAQrB");
        setField(term65368, term65368.getClass(), "stat", "PNJdNWkxgW");
        term65431 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term65431;
        callMethod(klass, "setPdddt_flg", argTypes, term65368, args);
    }

};


