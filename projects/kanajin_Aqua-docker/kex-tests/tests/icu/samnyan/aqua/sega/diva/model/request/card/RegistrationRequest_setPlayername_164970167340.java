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

public class RegistrationRequest_setPlayername_164970167340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19435;

    public RegistrationRequest_setPlayername_164970167340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19435 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term19435, term19435.getClass(), "pmm", null);
        setField(term19435, term19435.getClass(), "idm", null);
        setField(term19435, term19435.getClass(), "mmgameid", null);
        setField(term19435, term19435.getClass(), "mmuid", null);
        setField(term19435, term19435.getClass(), "a_code", null);
        setIntField(term19435, term19435.getClass(), "aime_id", 0);
        setField(term19435, term19435.getClass(), "aime_a_code", null);
        setField(term19435, term19435.getClass(), "key_obj_type", null);
        setField(term19435, term19435.getClass(), "player_name", null);
        setField(term19435, term19435.getClass(), "passwd", null);
        setField(term19435, term19435.getClass(), "cmd", null);
        setField(term19435, term19435.getClass(), "req_id", null);
        setField(term19435, term19435.getClass(), "game_id", null);
        setField(term19435, term19435.getClass(), "r_ver", null);
        setField(term19435, term19435.getClass(), "kc_serial", null);
        setField(term19435, term19435.getClass(), "b_serial", null);
        setField(term19435, term19435.getClass(), "place_id", null);
        setField(term19435, term19435.getClass(), "time_stamp", null);
        setField(term19435, term19435.getClass(), "start_up_mode", null);
        setField(term19435, term19435.getClass(), "cmm_dly_mod", null);
        setField(term19435, term19435.getClass(), "cmm_dly_sec", null);
        setField(term19435, term19435.getClass(), "cmm_err_mod", null);
        setField(term19435, term19435.getClass(), "country_code", null);
        setField(term19435, term19435.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer_name", argTypes, term19435, args);
    }

};


