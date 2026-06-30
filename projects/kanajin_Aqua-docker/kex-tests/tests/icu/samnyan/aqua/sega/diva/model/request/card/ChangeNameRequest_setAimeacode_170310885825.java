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

public class ChangeNameRequest_setAimeacode_170310885825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30726;

    public ChangeNameRequest_setAimeacode_170310885825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30726 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        setField(term30726, term30726.getClass(), "a_code", null);
        setIntField(term30726, term30726.getClass(), "aime_id", 0);
        setField(term30726, term30726.getClass(), "aime_a_code", null);
        setIntField(term30726, term30726.getClass(), "pd_id", 0);
        setIntField(term30726, term30726.getClass(), "accept_idx", 0);
        setField(term30726, term30726.getClass(), "player_name", null);
        setIntField(term30726, term30726.getClass(), "chg_name_price", 0);
        setField(term30726, term30726.getClass(), "cmd", null);
        setField(term30726, term30726.getClass(), "req_id", null);
        setField(term30726, term30726.getClass(), "game_id", null);
        setField(term30726, term30726.getClass(), "r_ver", null);
        setField(term30726, term30726.getClass(), "kc_serial", null);
        setField(term30726, term30726.getClass(), "b_serial", null);
        setField(term30726, term30726.getClass(), "place_id", null);
        setField(term30726, term30726.getClass(), "time_stamp", null);
        setField(term30726, term30726.getClass(), "start_up_mode", null);
        setField(term30726, term30726.getClass(), "cmm_dly_mod", null);
        setField(term30726, term30726.getClass(), "cmm_dly_sec", null);
        setField(term30726, term30726.getClass(), "cmm_err_mod", null);
        setField(term30726, term30726.getClass(), "country_code", null);
        setField(term30726, term30726.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAime_a_code", argTypes, term30726, args);
    }

};


