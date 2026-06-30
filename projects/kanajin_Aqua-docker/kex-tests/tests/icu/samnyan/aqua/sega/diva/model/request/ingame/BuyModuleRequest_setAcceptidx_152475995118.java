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

public class BuyModuleRequest_setAcceptidx_152475995118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258871;
     Object term258877;

    public BuyModuleRequest_setAcceptidx_152475995118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258871 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        setIntField(term258871, term258871.getClass(), "pd_id", 0);
        setIntField(term258871, term258871.getClass(), "accept_idx", 0);
        setIntField(term258871, term258871.getClass(), "start_idx", 0);
        setIntField(term258871, term258871.getClass(), "mdl_id", 0);
        setIntField(term258871, term258871.getClass(), "mdl_price", 0);
        setField(term258871, term258871.getClass(), "cmd", null);
        setField(term258871, term258871.getClass(), "req_id", null);
        setField(term258871, term258871.getClass(), "game_id", null);
        setField(term258871, term258871.getClass(), "r_ver", null);
        setField(term258871, term258871.getClass(), "kc_serial", null);
        setField(term258871, term258871.getClass(), "b_serial", null);
        setField(term258871, term258871.getClass(), "place_id", null);
        setField(term258871, term258871.getClass(), "time_stamp", null);
        setField(term258871, term258871.getClass(), "start_up_mode", null);
        setField(term258871, term258871.getClass(), "cmm_dly_mod", null);
        setField(term258871, term258871.getClass(), "cmm_dly_sec", null);
        setField(term258871, term258871.getClass(), "cmm_err_mod", null);
        setField(term258871, term258871.getClass(), "country_code", null);
        setField(term258871, term258871.getClass(), "region_code", null);
        term258877 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258877;
        callMethod(klass, "setAccept_idx", argTypes, term258871, args);
    }

};


