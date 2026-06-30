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

public class PdUnlockRequest_setAcceptidx_8770669459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7630;
     Object term7633;

    public PdUnlockRequest_setAcceptidx_8770669459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7630 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        setIntField(term7630, term7630.getClass(), "pd_id", 0);
        setIntField(term7630, term7630.getClass(), "accept_idx", 0);
        setField(term7630, term7630.getClass(), "cmd", null);
        setField(term7630, term7630.getClass(), "req_id", null);
        setField(term7630, term7630.getClass(), "game_id", null);
        setField(term7630, term7630.getClass(), "r_ver", null);
        setField(term7630, term7630.getClass(), "kc_serial", null);
        setField(term7630, term7630.getClass(), "b_serial", null);
        setField(term7630, term7630.getClass(), "place_id", null);
        setField(term7630, term7630.getClass(), "time_stamp", null);
        setField(term7630, term7630.getClass(), "start_up_mode", null);
        setField(term7630, term7630.getClass(), "cmm_dly_mod", null);
        setField(term7630, term7630.getClass(), "cmm_dly_sec", null);
        setField(term7630, term7630.getClass(), "cmm_err_mod", null);
        setField(term7630, term7630.getClass(), "country_code", null);
        setField(term7630, term7630.getClass(), "region_code", null);
        term7633 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7633;
        callMethod(klass, "setAccept_idx", argTypes, term7630, args);
    }

};


