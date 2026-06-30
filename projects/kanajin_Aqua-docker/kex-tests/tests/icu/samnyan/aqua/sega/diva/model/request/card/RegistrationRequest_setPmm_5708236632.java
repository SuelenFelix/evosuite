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

public class RegistrationRequest_setPmm_5708236632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19417;

    public RegistrationRequest_setPmm_5708236632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19417 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term19417, term19417.getClass(), "pmm", null);
        setField(term19417, term19417.getClass(), "idm", null);
        setField(term19417, term19417.getClass(), "mmgameid", null);
        setField(term19417, term19417.getClass(), "mmuid", null);
        setField(term19417, term19417.getClass(), "a_code", null);
        setIntField(term19417, term19417.getClass(), "aime_id", 0);
        setField(term19417, term19417.getClass(), "aime_a_code", null);
        setField(term19417, term19417.getClass(), "key_obj_type", null);
        setField(term19417, term19417.getClass(), "player_name", null);
        setField(term19417, term19417.getClass(), "passwd", null);
        setField(term19417, term19417.getClass(), "cmd", null);
        setField(term19417, term19417.getClass(), "req_id", null);
        setField(term19417, term19417.getClass(), "game_id", null);
        setField(term19417, term19417.getClass(), "r_ver", null);
        setField(term19417, term19417.getClass(), "kc_serial", null);
        setField(term19417, term19417.getClass(), "b_serial", null);
        setField(term19417, term19417.getClass(), "place_id", null);
        setField(term19417, term19417.getClass(), "time_stamp", null);
        setField(term19417, term19417.getClass(), "start_up_mode", null);
        setField(term19417, term19417.getClass(), "cmm_dly_mod", null);
        setField(term19417, term19417.getClass(), "cmm_dly_sec", null);
        setField(term19417, term19417.getClass(), "cmm_err_mod", null);
        setField(term19417, term19417.getClass(), "country_code", null);
        setField(term19417, term19417.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPmm", argTypes, term19417, args);
    }

};


