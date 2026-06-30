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

public class PreStartRequest_getAcode_107766721624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20425;

    public PreStartRequest_getAcode_107766721624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20425 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20425, term20425.getClass(), "pmm", null);
        setField(term20425, term20425.getClass(), "idm", null);
        setField(term20425, term20425.getClass(), "mmgameid", null);
        setField(term20425, term20425.getClass(), "mmuid", null);
        setField(term20425, term20425.getClass(), "a_code", null);
        setIntField(term20425, term20425.getClass(), "aime_id", 0);
        setField(term20425, term20425.getClass(), "aime_a_code", null);
        setField(term20425, term20425.getClass(), "key_obj_type", null);
        setBooleanField(term20425, term20425.getClass(), "exec_vu", false);
        setField(term20425, term20425.getClass(), "cmd", null);
        setField(term20425, term20425.getClass(), "req_id", null);
        setField(term20425, term20425.getClass(), "game_id", null);
        setField(term20425, term20425.getClass(), "r_ver", null);
        setField(term20425, term20425.getClass(), "kc_serial", null);
        setField(term20425, term20425.getClass(), "b_serial", null);
        setField(term20425, term20425.getClass(), "place_id", null);
        setField(term20425, term20425.getClass(), "time_stamp", null);
        setField(term20425, term20425.getClass(), "start_up_mode", null);
        setField(term20425, term20425.getClass(), "cmm_dly_mod", null);
        setField(term20425, term20425.getClass(), "cmm_dly_sec", null);
        setField(term20425, term20425.getClass(), "cmm_err_mod", null);
        setField(term20425, term20425.getClass(), "country_code", null);
        setField(term20425, term20425.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getA_code", argTypes, term20425, args);
    }

};


