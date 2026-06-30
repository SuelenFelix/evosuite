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

public class PreStartRequest_setAimeacode_61819794935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20460;

    public PreStartRequest_setAimeacode_61819794935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20460 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20460, term20460.getClass(), "pmm", null);
        setField(term20460, term20460.getClass(), "idm", null);
        setField(term20460, term20460.getClass(), "mmgameid", null);
        setField(term20460, term20460.getClass(), "mmuid", null);
        setField(term20460, term20460.getClass(), "a_code", null);
        setIntField(term20460, term20460.getClass(), "aime_id", 0);
        setField(term20460, term20460.getClass(), "aime_a_code", null);
        setField(term20460, term20460.getClass(), "key_obj_type", null);
        setBooleanField(term20460, term20460.getClass(), "exec_vu", false);
        setField(term20460, term20460.getClass(), "cmd", null);
        setField(term20460, term20460.getClass(), "req_id", null);
        setField(term20460, term20460.getClass(), "game_id", null);
        setField(term20460, term20460.getClass(), "r_ver", null);
        setField(term20460, term20460.getClass(), "kc_serial", null);
        setField(term20460, term20460.getClass(), "b_serial", null);
        setField(term20460, term20460.getClass(), "place_id", null);
        setField(term20460, term20460.getClass(), "time_stamp", null);
        setField(term20460, term20460.getClass(), "start_up_mode", null);
        setField(term20460, term20460.getClass(), "cmm_dly_mod", null);
        setField(term20460, term20460.getClass(), "cmm_dly_sec", null);
        setField(term20460, term20460.getClass(), "cmm_err_mod", null);
        setField(term20460, term20460.getClass(), "country_code", null);
        setField(term20460, term20460.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAime_a_code", argTypes, term20460, args);
    }

};


