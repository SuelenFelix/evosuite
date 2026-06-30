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

public class PreStartRequest_getAimeid_181074696225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20428;

    public PreStartRequest_getAimeid_181074696225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20428 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20428, term20428.getClass(), "pmm", null);
        setField(term20428, term20428.getClass(), "idm", null);
        setField(term20428, term20428.getClass(), "mmgameid", null);
        setField(term20428, term20428.getClass(), "mmuid", null);
        setField(term20428, term20428.getClass(), "a_code", null);
        setIntField(term20428, term20428.getClass(), "aime_id", 0);
        setField(term20428, term20428.getClass(), "aime_a_code", null);
        setField(term20428, term20428.getClass(), "key_obj_type", null);
        setBooleanField(term20428, term20428.getClass(), "exec_vu", false);
        setField(term20428, term20428.getClass(), "cmd", null);
        setField(term20428, term20428.getClass(), "req_id", null);
        setField(term20428, term20428.getClass(), "game_id", null);
        setField(term20428, term20428.getClass(), "r_ver", null);
        setField(term20428, term20428.getClass(), "kc_serial", null);
        setField(term20428, term20428.getClass(), "b_serial", null);
        setField(term20428, term20428.getClass(), "place_id", null);
        setField(term20428, term20428.getClass(), "time_stamp", null);
        setField(term20428, term20428.getClass(), "start_up_mode", null);
        setField(term20428, term20428.getClass(), "cmm_dly_mod", null);
        setField(term20428, term20428.getClass(), "cmm_dly_sec", null);
        setField(term20428, term20428.getClass(), "cmm_err_mod", null);
        setField(term20428, term20428.getClass(), "country_code", null);
        setField(term20428, term20428.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term20428, args);
    }

};


