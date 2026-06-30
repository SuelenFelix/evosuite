package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ChangePasswdRequest_setAimeid_136052239821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6245;
     Object term6249;

    public ChangePasswdRequest_setAimeid_136052239821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6245 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        setField(term6245, term6245.getClass(), "a_code", null);
        setIntField(term6245, term6245.getClass(), "aime_id", 0);
        setField(term6245, term6245.getClass(), "aime_a_code", null);
        setIntField(term6245, term6245.getClass(), "pd_id", 0);
        setIntField(term6245, term6245.getClass(), "accept_idx", 0);
        setField(term6245, term6245.getClass(), "new_passwd", null);
        setField(term6245, term6245.getClass(), "cmd", null);
        setField(term6245, term6245.getClass(), "req_id", null);
        setField(term6245, term6245.getClass(), "game_id", null);
        setField(term6245, term6245.getClass(), "r_ver", null);
        setField(term6245, term6245.getClass(), "kc_serial", null);
        setField(term6245, term6245.getClass(), "b_serial", null);
        setField(term6245, term6245.getClass(), "place_id", null);
        setField(term6245, term6245.getClass(), "time_stamp", null);
        setField(term6245, term6245.getClass(), "start_up_mode", null);
        setField(term6245, term6245.getClass(), "cmm_dly_mod", null);
        setField(term6245, term6245.getClass(), "cmm_dly_sec", null);
        setField(term6245, term6245.getClass(), "cmm_err_mod", null);
        setField(term6245, term6245.getClass(), "country_code", null);
        setField(term6245, term6245.getClass(), "region_code", null);
        term6249 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6249;
        callMethod(klass, "setAime_id", argTypes, term6245, args);
    }

};


