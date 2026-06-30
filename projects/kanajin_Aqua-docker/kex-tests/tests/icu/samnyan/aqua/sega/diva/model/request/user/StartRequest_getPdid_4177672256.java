package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartRequest_getPdid_4177672256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9403;

    public StartRequest_getPdid_4177672256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9403 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        setIntField(term9403, term9403.getClass(), "pd_id", 0);
        setIntField(term9403, term9403.getClass(), "accept_idx", 0);
        setField(term9403, term9403.getClass(), "cmd", null);
        setField(term9403, term9403.getClass(), "req_id", null);
        setField(term9403, term9403.getClass(), "game_id", null);
        setField(term9403, term9403.getClass(), "r_ver", null);
        setField(term9403, term9403.getClass(), "kc_serial", null);
        setField(term9403, term9403.getClass(), "b_serial", null);
        setField(term9403, term9403.getClass(), "place_id", null);
        setField(term9403, term9403.getClass(), "time_stamp", null);
        setField(term9403, term9403.getClass(), "start_up_mode", null);
        setField(term9403, term9403.getClass(), "cmm_dly_mod", null);
        setField(term9403, term9403.getClass(), "cmm_dly_sec", null);
        setField(term9403, term9403.getClass(), "cmm_err_mod", null);
        setField(term9403, term9403.getClass(), "country_code", null);
        setField(term9403, term9403.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term9403, args);
    }

};


