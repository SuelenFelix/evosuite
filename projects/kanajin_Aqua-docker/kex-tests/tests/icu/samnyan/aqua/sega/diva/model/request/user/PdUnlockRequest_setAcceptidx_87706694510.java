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

public class PdUnlockRequest_setAcceptidx_87706694510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1914467;
     Object term1914470;

    public PdUnlockRequest_setAcceptidx_87706694510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1914467 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        setIntField(term1914467, term1914467.getClass(), "pd_id", 0);
        setIntField(term1914467, term1914467.getClass(), "accept_idx", 0);
        setField(term1914467, term1914467.getClass(), "cmd", null);
        setField(term1914467, term1914467.getClass(), "req_id", null);
        setField(term1914467, term1914467.getClass(), "game_id", null);
        setField(term1914467, term1914467.getClass(), "r_ver", null);
        setField(term1914467, term1914467.getClass(), "kc_serial", null);
        setField(term1914467, term1914467.getClass(), "b_serial", null);
        setField(term1914467, term1914467.getClass(), "place_id", null);
        setField(term1914467, term1914467.getClass(), "time_stamp", null);
        setField(term1914467, term1914467.getClass(), "start_up_mode", null);
        setField(term1914467, term1914467.getClass(), "cmm_dly_mod", null);
        setField(term1914467, term1914467.getClass(), "cmm_dly_sec", null);
        setField(term1914467, term1914467.getClass(), "cmm_err_mod", null);
        setField(term1914467, term1914467.getClass(), "country_code", null);
        setField(term1914467, term1914467.getClass(), "region_code", null);
        term1914470 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1914470;
        callMethod(klass, "setAccept_idx", argTypes, term1914467, args);
    }

};


