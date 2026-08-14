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

public class RegistrationRequest_getAimeid_118716998128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242543;

    public RegistrationRequest_getAimeid_118716998128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242543 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term242543, term242543.getClass(), "pmm", null);
        setField(term242543, term242543.getClass(), "idm", null);
        setField(term242543, term242543.getClass(), "mmgameid", null);
        setField(term242543, term242543.getClass(), "mmuid", null);
        setField(term242543, term242543.getClass(), "a_code", null);
        setIntField(term242543, term242543.getClass(), "aime_id", 0);
        setField(term242543, term242543.getClass(), "aime_a_code", null);
        setField(term242543, term242543.getClass(), "key_obj_type", null);
        setField(term242543, term242543.getClass(), "player_name", null);
        setField(term242543, term242543.getClass(), "passwd", null);
        setField(term242543, term242543.getClass(), "cmd", null);
        setField(term242543, term242543.getClass(), "req_id", null);
        setField(term242543, term242543.getClass(), "game_id", null);
        setField(term242543, term242543.getClass(), "r_ver", null);
        setField(term242543, term242543.getClass(), "kc_serial", null);
        setField(term242543, term242543.getClass(), "b_serial", null);
        setField(term242543, term242543.getClass(), "place_id", null);
        setField(term242543, term242543.getClass(), "time_stamp", null);
        setField(term242543, term242543.getClass(), "start_up_mode", null);
        setField(term242543, term242543.getClass(), "cmm_dly_mod", null);
        setField(term242543, term242543.getClass(), "cmm_dly_sec", null);
        setField(term242543, term242543.getClass(), "cmm_err_mod", null);
        setField(term242543, term242543.getClass(), "country_code", null);
        setField(term242543, term242543.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term242543, args);
    }

};


