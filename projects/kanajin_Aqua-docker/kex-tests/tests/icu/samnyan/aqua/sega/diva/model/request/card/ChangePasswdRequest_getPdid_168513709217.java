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

public class ChangePasswdRequest_getPdid_168513709217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6229;

    public ChangePasswdRequest_getPdid_168513709217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6229 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        setField(term6229, term6229.getClass(), "a_code", null);
        setIntField(term6229, term6229.getClass(), "aime_id", 0);
        setField(term6229, term6229.getClass(), "aime_a_code", null);
        setIntField(term6229, term6229.getClass(), "pd_id", 0);
        setIntField(term6229, term6229.getClass(), "accept_idx", 0);
        setField(term6229, term6229.getClass(), "new_passwd", null);
        setField(term6229, term6229.getClass(), "cmd", null);
        setField(term6229, term6229.getClass(), "req_id", null);
        setField(term6229, term6229.getClass(), "game_id", null);
        setField(term6229, term6229.getClass(), "r_ver", null);
        setField(term6229, term6229.getClass(), "kc_serial", null);
        setField(term6229, term6229.getClass(), "b_serial", null);
        setField(term6229, term6229.getClass(), "place_id", null);
        setField(term6229, term6229.getClass(), "time_stamp", null);
        setField(term6229, term6229.getClass(), "start_up_mode", null);
        setField(term6229, term6229.getClass(), "cmm_dly_mod", null);
        setField(term6229, term6229.getClass(), "cmm_dly_sec", null);
        setField(term6229, term6229.getClass(), "cmm_err_mod", null);
        setField(term6229, term6229.getClass(), "country_code", null);
        setField(term6229, term6229.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term6229, args);
    }

};


