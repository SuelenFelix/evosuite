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

public class RegistrationRequest_getMmuid_105654326625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19403;

    public RegistrationRequest_getMmuid_105654326625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19403 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term19403, term19403.getClass(), "pmm", null);
        setField(term19403, term19403.getClass(), "idm", null);
        setField(term19403, term19403.getClass(), "mmgameid", null);
        setField(term19403, term19403.getClass(), "mmuid", null);
        setField(term19403, term19403.getClass(), "a_code", null);
        setIntField(term19403, term19403.getClass(), "aime_id", 0);
        setField(term19403, term19403.getClass(), "aime_a_code", null);
        setField(term19403, term19403.getClass(), "key_obj_type", null);
        setField(term19403, term19403.getClass(), "player_name", null);
        setField(term19403, term19403.getClass(), "passwd", null);
        setField(term19403, term19403.getClass(), "cmd", null);
        setField(term19403, term19403.getClass(), "req_id", null);
        setField(term19403, term19403.getClass(), "game_id", null);
        setField(term19403, term19403.getClass(), "r_ver", null);
        setField(term19403, term19403.getClass(), "kc_serial", null);
        setField(term19403, term19403.getClass(), "b_serial", null);
        setField(term19403, term19403.getClass(), "place_id", null);
        setField(term19403, term19403.getClass(), "time_stamp", null);
        setField(term19403, term19403.getClass(), "start_up_mode", null);
        setField(term19403, term19403.getClass(), "cmm_dly_mod", null);
        setField(term19403, term19403.getClass(), "cmm_dly_sec", null);
        setField(term19403, term19403.getClass(), "cmm_err_mod", null);
        setField(term19403, term19403.getClass(), "country_code", null);
        setField(term19403, term19403.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMmuid", argTypes, term19403, args);
    }

};


