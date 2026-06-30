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

public class RegistrationRequest_getPasswd_1596108031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19415;

    public RegistrationRequest_getPasswd_1596108031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19415 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term19415, term19415.getClass(), "pmm", null);
        setField(term19415, term19415.getClass(), "idm", null);
        setField(term19415, term19415.getClass(), "mmgameid", null);
        setField(term19415, term19415.getClass(), "mmuid", null);
        setField(term19415, term19415.getClass(), "a_code", null);
        setIntField(term19415, term19415.getClass(), "aime_id", 0);
        setField(term19415, term19415.getClass(), "aime_a_code", null);
        setField(term19415, term19415.getClass(), "key_obj_type", null);
        setField(term19415, term19415.getClass(), "player_name", null);
        setField(term19415, term19415.getClass(), "passwd", null);
        setField(term19415, term19415.getClass(), "cmd", null);
        setField(term19415, term19415.getClass(), "req_id", null);
        setField(term19415, term19415.getClass(), "game_id", null);
        setField(term19415, term19415.getClass(), "r_ver", null);
        setField(term19415, term19415.getClass(), "kc_serial", null);
        setField(term19415, term19415.getClass(), "b_serial", null);
        setField(term19415, term19415.getClass(), "place_id", null);
        setField(term19415, term19415.getClass(), "time_stamp", null);
        setField(term19415, term19415.getClass(), "start_up_mode", null);
        setField(term19415, term19415.getClass(), "cmm_dly_mod", null);
        setField(term19415, term19415.getClass(), "cmm_dly_sec", null);
        setField(term19415, term19415.getClass(), "cmm_err_mod", null);
        setField(term19415, term19415.getClass(), "country_code", null);
        setField(term19415, term19415.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswd", argTypes, term19415, args);
    }

};


