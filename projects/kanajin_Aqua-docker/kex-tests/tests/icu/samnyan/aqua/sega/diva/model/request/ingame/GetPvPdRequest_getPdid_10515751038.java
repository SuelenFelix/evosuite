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

public class GetPvPdRequest_getPdid_10515751038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273091;

    public GetPvPdRequest_getPdid_10515751038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273091 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        setIntField(term273091, term273091.getClass(), "pd_id", 0);
        setIntField(term273091, term273091.getClass(), "difficulty", 0);
        setField(term273091, term273091.getClass(), "pd_pv_id_lst", null);
        setField(term273091, term273091.getClass(), "cmd", null);
        setField(term273091, term273091.getClass(), "req_id", null);
        setField(term273091, term273091.getClass(), "game_id", null);
        setField(term273091, term273091.getClass(), "r_ver", null);
        setField(term273091, term273091.getClass(), "kc_serial", null);
        setField(term273091, term273091.getClass(), "b_serial", null);
        setField(term273091, term273091.getClass(), "place_id", null);
        setField(term273091, term273091.getClass(), "time_stamp", null);
        setField(term273091, term273091.getClass(), "start_up_mode", null);
        setField(term273091, term273091.getClass(), "cmm_dly_mod", null);
        setField(term273091, term273091.getClass(), "cmm_dly_sec", null);
        setField(term273091, term273091.getClass(), "cmm_err_mod", null);
        setField(term273091, term273091.getClass(), "country_code", null);
        setField(term273091, term273091.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term273091, args);
    }

};


