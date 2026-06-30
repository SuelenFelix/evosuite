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

public class PdUnlockRequest_getPdid_6434796356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7619;

    public PdUnlockRequest_getPdid_6434796356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7619 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        setIntField(term7619, term7619.getClass(), "pd_id", 0);
        setIntField(term7619, term7619.getClass(), "accept_idx", 0);
        setField(term7619, term7619.getClass(), "cmd", null);
        setField(term7619, term7619.getClass(), "req_id", null);
        setField(term7619, term7619.getClass(), "game_id", null);
        setField(term7619, term7619.getClass(), "r_ver", null);
        setField(term7619, term7619.getClass(), "kc_serial", null);
        setField(term7619, term7619.getClass(), "b_serial", null);
        setField(term7619, term7619.getClass(), "place_id", null);
        setField(term7619, term7619.getClass(), "time_stamp", null);
        setField(term7619, term7619.getClass(), "start_up_mode", null);
        setField(term7619, term7619.getClass(), "cmm_dly_mod", null);
        setField(term7619, term7619.getClass(), "cmm_dly_sec", null);
        setField(term7619, term7619.getClass(), "cmm_err_mod", null);
        setField(term7619, term7619.getClass(), "country_code", null);
        setField(term7619, term7619.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term7619, args);
    }

};


