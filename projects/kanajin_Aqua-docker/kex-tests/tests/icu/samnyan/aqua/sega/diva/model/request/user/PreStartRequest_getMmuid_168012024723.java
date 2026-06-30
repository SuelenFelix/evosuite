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

public class PreStartRequest_getMmuid_168012024723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20422;

    public PreStartRequest_getMmuid_168012024723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20422 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        setField(term20422, term20422.getClass(), "pmm", null);
        setField(term20422, term20422.getClass(), "idm", null);
        setField(term20422, term20422.getClass(), "mmgameid", null);
        setField(term20422, term20422.getClass(), "mmuid", null);
        setField(term20422, term20422.getClass(), "a_code", null);
        setIntField(term20422, term20422.getClass(), "aime_id", 0);
        setField(term20422, term20422.getClass(), "aime_a_code", null);
        setField(term20422, term20422.getClass(), "key_obj_type", null);
        setBooleanField(term20422, term20422.getClass(), "exec_vu", false);
        setField(term20422, term20422.getClass(), "cmd", null);
        setField(term20422, term20422.getClass(), "req_id", null);
        setField(term20422, term20422.getClass(), "game_id", null);
        setField(term20422, term20422.getClass(), "r_ver", null);
        setField(term20422, term20422.getClass(), "kc_serial", null);
        setField(term20422, term20422.getClass(), "b_serial", null);
        setField(term20422, term20422.getClass(), "place_id", null);
        setField(term20422, term20422.getClass(), "time_stamp", null);
        setField(term20422, term20422.getClass(), "start_up_mode", null);
        setField(term20422, term20422.getClass(), "cmm_dly_mod", null);
        setField(term20422, term20422.getClass(), "cmm_dly_sec", null);
        setField(term20422, term20422.getClass(), "cmm_err_mod", null);
        setField(term20422, term20422.getClass(), "country_code", null);
        setField(term20422, term20422.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMmuid", argTypes, term20422, args);
    }

};


