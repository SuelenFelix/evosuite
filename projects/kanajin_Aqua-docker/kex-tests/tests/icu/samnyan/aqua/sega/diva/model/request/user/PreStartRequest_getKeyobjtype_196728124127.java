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

public class PreStartRequest_getKeyobjtype_196728124127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20434;

    public PreStartRequest_getKeyobjtype_196728124127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20434 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20434, term20434.getClass(), "pmm", null);
        setField(term20434, term20434.getClass(), "idm", null);
        setField(term20434, term20434.getClass(), "mmgameid", null);
        setField(term20434, term20434.getClass(), "mmuid", null);
        setField(term20434, term20434.getClass(), "a_code", null);
        setIntField(term20434, term20434.getClass(), "aime_id", 0);
        setField(term20434, term20434.getClass(), "aime_a_code", null);
        setField(term20434, term20434.getClass(), "key_obj_type", null);
        setBooleanField(term20434, term20434.getClass(), "exec_vu", false);
        setField(term20434, term20434.getClass(), "cmd", null);
        setField(term20434, term20434.getClass(), "req_id", null);
        setField(term20434, term20434.getClass(), "game_id", null);
        setField(term20434, term20434.getClass(), "r_ver", null);
        setField(term20434, term20434.getClass(), "kc_serial", null);
        setField(term20434, term20434.getClass(), "b_serial", null);
        setField(term20434, term20434.getClass(), "place_id", null);
        setField(term20434, term20434.getClass(), "time_stamp", null);
        setField(term20434, term20434.getClass(), "start_up_mode", null);
        setField(term20434, term20434.getClass(), "cmm_dly_mod", null);
        setField(term20434, term20434.getClass(), "cmm_dly_sec", null);
        setField(term20434, term20434.getClass(), "cmm_err_mod", null);
        setField(term20434, term20434.getClass(), "country_code", null);
        setField(term20434, term20434.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey_obj_type", argTypes, term20434, args);
    }

};


