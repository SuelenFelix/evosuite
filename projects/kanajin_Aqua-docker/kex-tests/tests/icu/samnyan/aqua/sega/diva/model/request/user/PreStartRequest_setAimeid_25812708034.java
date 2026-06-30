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
import java.lang.Integer;

public class PreStartRequest_setAimeid_25812708034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20455;
     Object term20458;

    public PreStartRequest_setAimeid_25812708034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20455 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20455, term20455.getClass(), "pmm", null);
        setField(term20455, term20455.getClass(), "idm", null);
        setField(term20455, term20455.getClass(), "mmgameid", null);
        setField(term20455, term20455.getClass(), "mmuid", null);
        setField(term20455, term20455.getClass(), "a_code", null);
        setIntField(term20455, term20455.getClass(), "aime_id", 0);
        setField(term20455, term20455.getClass(), "aime_a_code", null);
        setField(term20455, term20455.getClass(), "key_obj_type", null);
        setBooleanField(term20455, term20455.getClass(), "exec_vu", false);
        setField(term20455, term20455.getClass(), "cmd", null);
        setField(term20455, term20455.getClass(), "req_id", null);
        setField(term20455, term20455.getClass(), "game_id", null);
        setField(term20455, term20455.getClass(), "r_ver", null);
        setField(term20455, term20455.getClass(), "kc_serial", null);
        setField(term20455, term20455.getClass(), "b_serial", null);
        setField(term20455, term20455.getClass(), "place_id", null);
        setField(term20455, term20455.getClass(), "time_stamp", null);
        setField(term20455, term20455.getClass(), "start_up_mode", null);
        setField(term20455, term20455.getClass(), "cmm_dly_mod", null);
        setField(term20455, term20455.getClass(), "cmm_dly_sec", null);
        setField(term20455, term20455.getClass(), "cmm_err_mod", null);
        setField(term20455, term20455.getClass(), "country_code", null);
        setField(term20455, term20455.getClass(), "region_code", null);
        term20458 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20458;
        callMethod(klass, "setAime_id", argTypes, term20455, args);
    }

};


