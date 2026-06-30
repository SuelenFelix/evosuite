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
import java.lang.Integer;

public class GetPvPdRequest_setDifficulty_160888252412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273105;
     Object term273108;

    public GetPvPdRequest_setDifficulty_160888252412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273105 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        setIntField(term273105, term273105.getClass(), "pd_id", 0);
        setIntField(term273105, term273105.getClass(), "difficulty", 0);
        setField(term273105, term273105.getClass(), "pd_pv_id_lst", null);
        setField(term273105, term273105.getClass(), "cmd", null);
        setField(term273105, term273105.getClass(), "req_id", null);
        setField(term273105, term273105.getClass(), "game_id", null);
        setField(term273105, term273105.getClass(), "r_ver", null);
        setField(term273105, term273105.getClass(), "kc_serial", null);
        setField(term273105, term273105.getClass(), "b_serial", null);
        setField(term273105, term273105.getClass(), "place_id", null);
        setField(term273105, term273105.getClass(), "time_stamp", null);
        setField(term273105, term273105.getClass(), "start_up_mode", null);
        setField(term273105, term273105.getClass(), "cmm_dly_mod", null);
        setField(term273105, term273105.getClass(), "cmm_dly_sec", null);
        setField(term273105, term273105.getClass(), "cmm_err_mod", null);
        setField(term273105, term273105.getClass(), "country_code", null);
        setField(term273105, term273105.getClass(), "region_code", null);
        term273108 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term273108;
        callMethod(klass, "setDifficulty", argTypes, term273105, args);
    }

};


