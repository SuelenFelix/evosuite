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

public class GetPvPdResponse_getPdddttm_17904362363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65120;

    public GetPvPdResponse_getPdddttm_17904362363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term65133 = new Boolean(false);
        term65120 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse"));
        setField(term65120, term65120.getClass(), "pd_by_pv_id", "YNVbzJpOdk");
        setField(term65120, term65120.getClass(), "pdddt_flg", term65133);
        setField(term65120, term65120.getClass(), "pdddt_tm", "CjPfMVeNPm");
        setField(term65120, term65120.getClass(), "cmd", "TeqSJDWXQD");
        setField(term65120, term65120.getClass(), "req_id", "XNgNLbjmim");
        setField(term65120, term65120.getClass(), "stat", "InNyZMCrst");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdddt_tm", argTypes, term65120, args);
    }

};


