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

public class RegistrationRequest_setMmuid_148021168235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19423;

    public RegistrationRequest_setMmuid_148021168235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19423 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        setField(term19423, term19423.getClass(), "pmm", null);
        setField(term19423, term19423.getClass(), "idm", null);
        setField(term19423, term19423.getClass(), "mmgameid", null);
        setField(term19423, term19423.getClass(), "mmuid", null);
        setField(term19423, term19423.getClass(), "a_code", null);
        setIntField(term19423, term19423.getClass(), "aime_id", 0);
        setField(term19423, term19423.getClass(), "aime_a_code", null);
        setField(term19423, term19423.getClass(), "key_obj_type", null);
        setField(term19423, term19423.getClass(), "player_name", null);
        setField(term19423, term19423.getClass(), "passwd", null);
        setField(term19423, term19423.getClass(), "cmd", null);
        setField(term19423, term19423.getClass(), "req_id", null);
        setField(term19423, term19423.getClass(), "game_id", null);
        setField(term19423, term19423.getClass(), "r_ver", null);
        setField(term19423, term19423.getClass(), "kc_serial", null);
        setField(term19423, term19423.getClass(), "b_serial", null);
        setField(term19423, term19423.getClass(), "place_id", null);
        setField(term19423, term19423.getClass(), "time_stamp", null);
        setField(term19423, term19423.getClass(), "start_up_mode", null);
        setField(term19423, term19423.getClass(), "cmm_dly_mod", null);
        setField(term19423, term19423.getClass(), "cmm_dly_sec", null);
        setField(term19423, term19423.getClass(), "cmm_err_mod", null);
        setField(term19423, term19423.getClass(), "country_code", null);
        setField(term19423, term19423.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMmuid", argTypes, term19423, args);
    }

};


