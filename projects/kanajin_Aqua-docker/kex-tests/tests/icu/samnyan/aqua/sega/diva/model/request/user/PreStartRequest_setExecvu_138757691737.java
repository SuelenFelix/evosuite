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
import java.lang.Boolean;

public class PreStartRequest_setExecvu_138757691737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20466;
     Object term20469;

    public PreStartRequest_setExecvu_138757691737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20466 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20466, term20466.getClass(), "pmm", null);
        setField(term20466, term20466.getClass(), "idm", null);
        setField(term20466, term20466.getClass(), "mmgameid", null);
        setField(term20466, term20466.getClass(), "mmuid", null);
        setField(term20466, term20466.getClass(), "a_code", null);
        setIntField(term20466, term20466.getClass(), "aime_id", 0);
        setField(term20466, term20466.getClass(), "aime_a_code", null);
        setField(term20466, term20466.getClass(), "key_obj_type", null);
        setBooleanField(term20466, term20466.getClass(), "exec_vu", false);
        setField(term20466, term20466.getClass(), "cmd", null);
        setField(term20466, term20466.getClass(), "req_id", null);
        setField(term20466, term20466.getClass(), "game_id", null);
        setField(term20466, term20466.getClass(), "r_ver", null);
        setField(term20466, term20466.getClass(), "kc_serial", null);
        setField(term20466, term20466.getClass(), "b_serial", null);
        setField(term20466, term20466.getClass(), "place_id", null);
        setField(term20466, term20466.getClass(), "time_stamp", null);
        setField(term20466, term20466.getClass(), "start_up_mode", null);
        setField(term20466, term20466.getClass(), "cmm_dly_mod", null);
        setField(term20466, term20466.getClass(), "cmm_dly_sec", null);
        setField(term20466, term20466.getClass(), "cmm_err_mod", null);
        setField(term20466, term20466.getClass(), "country_code", null);
        setField(term20466, term20466.getClass(), "region_code", null);
        term20469 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term20469;
        callMethod(klass, "setExec_vu", argTypes, term20466, args);
    }

};


