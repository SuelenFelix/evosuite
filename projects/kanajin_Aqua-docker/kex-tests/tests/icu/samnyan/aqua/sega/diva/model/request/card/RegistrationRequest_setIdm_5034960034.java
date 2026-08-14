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

public class RegistrationRequest_setIdm_5034960034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242555;

    public RegistrationRequest_setIdm_5034960034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242555 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term242555, term242555.getClass(), "pmm", null);
        setField(term242555, term242555.getClass(), "idm", null);
        setField(term242555, term242555.getClass(), "mmgameid", null);
        setField(term242555, term242555.getClass(), "mmuid", null);
        setField(term242555, term242555.getClass(), "a_code", null);
        setIntField(term242555, term242555.getClass(), "aime_id", 0);
        setField(term242555, term242555.getClass(), "aime_a_code", null);
        setField(term242555, term242555.getClass(), "key_obj_type", null);
        setField(term242555, term242555.getClass(), "player_name", null);
        setField(term242555, term242555.getClass(), "passwd", null);
        setField(term242555, term242555.getClass(), "cmd", null);
        setField(term242555, term242555.getClass(), "req_id", null);
        setField(term242555, term242555.getClass(), "game_id", null);
        setField(term242555, term242555.getClass(), "r_ver", null);
        setField(term242555, term242555.getClass(), "kc_serial", null);
        setField(term242555, term242555.getClass(), "b_serial", null);
        setField(term242555, term242555.getClass(), "place_id", null);
        setField(term242555, term242555.getClass(), "time_stamp", null);
        setField(term242555, term242555.getClass(), "start_up_mode", null);
        setField(term242555, term242555.getClass(), "cmm_dly_mod", null);
        setField(term242555, term242555.getClass(), "cmm_dly_sec", null);
        setField(term242555, term242555.getClass(), "cmm_err_mod", null);
        setField(term242555, term242555.getClass(), "country_code", null);
        setField(term242555, term242555.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIdm", argTypes, term242555, args);
    }

};


