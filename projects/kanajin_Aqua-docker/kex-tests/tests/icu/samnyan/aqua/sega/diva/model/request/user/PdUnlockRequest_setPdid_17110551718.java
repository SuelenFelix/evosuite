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

public class PdUnlockRequest_setPdid_17110551718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7625;
     Object term7628;

    public PdUnlockRequest_setPdid_17110551718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7625 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        setIntField(term7625, term7625.getClass(), "pd_id", 0);
        setIntField(term7625, term7625.getClass(), "accept_idx", 0);
        setField(term7625, term7625.getClass(), "cmd", null);
        setField(term7625, term7625.getClass(), "req_id", null);
        setField(term7625, term7625.getClass(), "game_id", null);
        setField(term7625, term7625.getClass(), "r_ver", null);
        setField(term7625, term7625.getClass(), "kc_serial", null);
        setField(term7625, term7625.getClass(), "b_serial", null);
        setField(term7625, term7625.getClass(), "place_id", null);
        setField(term7625, term7625.getClass(), "time_stamp", null);
        setField(term7625, term7625.getClass(), "start_up_mode", null);
        setField(term7625, term7625.getClass(), "cmm_dly_mod", null);
        setField(term7625, term7625.getClass(), "cmm_dly_sec", null);
        setField(term7625, term7625.getClass(), "cmm_err_mod", null);
        setField(term7625, term7625.getClass(), "country_code", null);
        setField(term7625, term7625.getClass(), "region_code", null);
        term7628 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7628;
        callMethod(klass, "setPd_id", argTypes, term7625, args);
    }

};


