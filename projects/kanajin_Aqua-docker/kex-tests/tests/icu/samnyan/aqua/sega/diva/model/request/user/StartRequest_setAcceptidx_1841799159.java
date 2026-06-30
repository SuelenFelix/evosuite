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

public class StartRequest_setAcceptidx_1841799159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9414;
     Object term9417;

    public StartRequest_setAcceptidx_1841799159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9414 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        setIntField(term9414, term9414.getClass(), "pd_id", 0);
        setIntField(term9414, term9414.getClass(), "accept_idx", 0);
        setField(term9414, term9414.getClass(), "cmd", null);
        setField(term9414, term9414.getClass(), "req_id", null);
        setField(term9414, term9414.getClass(), "game_id", null);
        setField(term9414, term9414.getClass(), "r_ver", null);
        setField(term9414, term9414.getClass(), "kc_serial", null);
        setField(term9414, term9414.getClass(), "b_serial", null);
        setField(term9414, term9414.getClass(), "place_id", null);
        setField(term9414, term9414.getClass(), "time_stamp", null);
        setField(term9414, term9414.getClass(), "start_up_mode", null);
        setField(term9414, term9414.getClass(), "cmm_dly_mod", null);
        setField(term9414, term9414.getClass(), "cmm_dly_sec", null);
        setField(term9414, term9414.getClass(), "cmm_err_mod", null);
        setField(term9414, term9414.getClass(), "country_code", null);
        setField(term9414, term9414.getClass(), "region_code", null);
        term9417 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9417;
        callMethod(klass, "setAccept_idx", argTypes, term9414, args);
    }

};


