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

public class ChangePasswdRequest_getAimeacode_182364408316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6225;

    public ChangePasswdRequest_getAimeacode_182364408316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6225 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        setField(term6225, term6225.getClass(), "a_code", null);
        setIntField(term6225, term6225.getClass(), "aime_id", 0);
        setField(term6225, term6225.getClass(), "aime_a_code", null);
        setIntField(term6225, term6225.getClass(), "pd_id", 0);
        setIntField(term6225, term6225.getClass(), "accept_idx", 0);
        setField(term6225, term6225.getClass(), "new_passwd", null);
        setField(term6225, term6225.getClass(), "cmd", null);
        setField(term6225, term6225.getClass(), "req_id", null);
        setField(term6225, term6225.getClass(), "game_id", null);
        setField(term6225, term6225.getClass(), "r_ver", null);
        setField(term6225, term6225.getClass(), "kc_serial", null);
        setField(term6225, term6225.getClass(), "b_serial", null);
        setField(term6225, term6225.getClass(), "place_id", null);
        setField(term6225, term6225.getClass(), "time_stamp", null);
        setField(term6225, term6225.getClass(), "start_up_mode", null);
        setField(term6225, term6225.getClass(), "cmm_dly_mod", null);
        setField(term6225, term6225.getClass(), "cmm_dly_sec", null);
        setField(term6225, term6225.getClass(), "cmm_err_mod", null);
        setField(term6225, term6225.getClass(), "country_code", null);
        setField(term6225, term6225.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_a_code", argTypes, term6225, args);
    }

};


