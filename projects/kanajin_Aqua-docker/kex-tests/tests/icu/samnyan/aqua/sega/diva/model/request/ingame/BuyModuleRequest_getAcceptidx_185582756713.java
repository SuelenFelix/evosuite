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

public class BuyModuleRequest_getAcceptidx_185582756713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258839;

    public BuyModuleRequest_getAcceptidx_185582756713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258839 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        setIntField(term258839, term258839.getClass(), "pd_id", 0);
        setIntField(term258839, term258839.getClass(), "accept_idx", 0);
        setIntField(term258839, term258839.getClass(), "start_idx", 0);
        setIntField(term258839, term258839.getClass(), "mdl_id", 0);
        setIntField(term258839, term258839.getClass(), "mdl_price", 0);
        setField(term258839, term258839.getClass(), "cmd", null);
        setField(term258839, term258839.getClass(), "req_id", null);
        setField(term258839, term258839.getClass(), "game_id", null);
        setField(term258839, term258839.getClass(), "r_ver", null);
        setField(term258839, term258839.getClass(), "kc_serial", null);
        setField(term258839, term258839.getClass(), "b_serial", null);
        setField(term258839, term258839.getClass(), "place_id", null);
        setField(term258839, term258839.getClass(), "time_stamp", null);
        setField(term258839, term258839.getClass(), "start_up_mode", null);
        setField(term258839, term258839.getClass(), "cmm_dly_mod", null);
        setField(term258839, term258839.getClass(), "cmm_dly_sec", null);
        setField(term258839, term258839.getClass(), "cmm_err_mod", null);
        setField(term258839, term258839.getClass(), "country_code", null);
        setField(term258839, term258839.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term258839, args);
    }

};


