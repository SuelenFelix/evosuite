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

public class BuyModuleRequest_setMdlid_164557092820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258887;
     Object term258893;

    public BuyModuleRequest_setMdlid_164557092820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258887 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        setIntField(term258887, term258887.getClass(), "pd_id", 0);
        setIntField(term258887, term258887.getClass(), "accept_idx", 0);
        setIntField(term258887, term258887.getClass(), "start_idx", 0);
        setIntField(term258887, term258887.getClass(), "mdl_id", 0);
        setIntField(term258887, term258887.getClass(), "mdl_price", 0);
        setField(term258887, term258887.getClass(), "cmd", null);
        setField(term258887, term258887.getClass(), "req_id", null);
        setField(term258887, term258887.getClass(), "game_id", null);
        setField(term258887, term258887.getClass(), "r_ver", null);
        setField(term258887, term258887.getClass(), "kc_serial", null);
        setField(term258887, term258887.getClass(), "b_serial", null);
        setField(term258887, term258887.getClass(), "place_id", null);
        setField(term258887, term258887.getClass(), "time_stamp", null);
        setField(term258887, term258887.getClass(), "start_up_mode", null);
        setField(term258887, term258887.getClass(), "cmm_dly_mod", null);
        setField(term258887, term258887.getClass(), "cmm_dly_sec", null);
        setField(term258887, term258887.getClass(), "cmm_err_mod", null);
        setField(term258887, term258887.getClass(), "country_code", null);
        setField(term258887, term258887.getClass(), "region_code", null);
        term258893 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258893;
        callMethod(klass, "setMdl_id", argTypes, term258887, args);
    }

};


