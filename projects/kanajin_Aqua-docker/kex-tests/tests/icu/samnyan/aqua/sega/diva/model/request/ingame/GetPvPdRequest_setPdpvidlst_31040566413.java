package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetPvPdRequest_setPdpvidlst_31040566413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273110;

    public GetPvPdRequest_setPdpvidlst_31040566413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273110 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        setIntField(term273110, term273110.getClass(), "pd_id", 0);
        setIntField(term273110, term273110.getClass(), "difficulty", 0);
        setField(term273110, term273110.getClass(), "pd_pv_id_lst", null);
        setField(term273110, term273110.getClass(), "cmd", null);
        setField(term273110, term273110.getClass(), "req_id", null);
        setField(term273110, term273110.getClass(), "game_id", null);
        setField(term273110, term273110.getClass(), "r_ver", null);
        setField(term273110, term273110.getClass(), "kc_serial", null);
        setField(term273110, term273110.getClass(), "b_serial", null);
        setField(term273110, term273110.getClass(), "place_id", null);
        setField(term273110, term273110.getClass(), "time_stamp", null);
        setField(term273110, term273110.getClass(), "start_up_mode", null);
        setField(term273110, term273110.getClass(), "cmm_dly_mod", null);
        setField(term273110, term273110.getClass(), "cmm_dly_sec", null);
        setField(term273110, term273110.getClass(), "cmm_err_mod", null);
        setField(term273110, term273110.getClass(), "country_code", null);
        setField(term273110, term273110.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPd_pv_id_lst", argTypes, term273110, args);
    }

};


