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

public class GetPvPdResponse_setPdddttm_9181886206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65483;

    public GetPvPdResponse_setPdddttm_9181886206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term65496 = new Boolean(true);
        term65483 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse"));
        setField(term65483, term65483.getClass(), "pd_by_pv_id", "aCTJvzQZSQ");
        setField(term65483, term65483.getClass(), "pdddt_flg", term65496);
        setField(term65483, term65483.getClass(), "pdddt_tm", "hcvedmWnmW");
        setField(term65483, term65483.getClass(), "cmd", "rBZaHWidIS");
        setField(term65483, term65483.getClass(), "req_id", "xneQCADwGB");
        setField(term65483, term65483.getClass(), "stat", "luSCmxphxi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OGEDwuJhjV";
        callMethod(klass, "setPdddt_tm", argTypes, term65483, args);
    }

};


