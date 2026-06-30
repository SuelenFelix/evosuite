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

public class GetPvPdResponse_getPdddtflg_11326528012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65007;

    public GetPvPdResponse_getPdddtflg_11326528012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term65020 = new Boolean(false);
        term65007 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse"));
        setField(term65007, term65007.getClass(), "pd_by_pv_id", "VhnistEcCA");
        setField(term65007, term65007.getClass(), "pdddt_flg", term65020);
        setField(term65007, term65007.getClass(), "pdddt_tm", "hlPKLObFBU");
        setField(term65007, term65007.getClass(), "cmd", "oNGVAyjCob");
        setField(term65007, term65007.getClass(), "req_id", "lzqPLDonds");
        setField(term65007, term65007.getClass(), "stat", "gCFzBxPZKw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdddt_flg", argTypes, term65007, args);
    }

};


