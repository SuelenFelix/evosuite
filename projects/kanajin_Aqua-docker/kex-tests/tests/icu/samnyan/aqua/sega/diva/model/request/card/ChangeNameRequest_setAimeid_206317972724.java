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
import java.lang.Integer;

public class ChangeNameRequest_setAimeid_206317972724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30719;
     Object term30724;

    public ChangeNameRequest_setAimeid_206317972724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        setField(term30719, term30719.getClass(), "a_code", null);
        setIntField(term30719, term30719.getClass(), "aime_id", 0);
        setField(term30719, term30719.getClass(), "aime_a_code", null);
        setIntField(term30719, term30719.getClass(), "pd_id", 0);
        setIntField(term30719, term30719.getClass(), "accept_idx", 0);
        setField(term30719, term30719.getClass(), "player_name", null);
        setIntField(term30719, term30719.getClass(), "chg_name_price", 0);
        setField(term30719, term30719.getClass(), "cmd", null);
        setField(term30719, term30719.getClass(), "req_id", null);
        setField(term30719, term30719.getClass(), "game_id", null);
        setField(term30719, term30719.getClass(), "r_ver", null);
        setField(term30719, term30719.getClass(), "kc_serial", null);
        setField(term30719, term30719.getClass(), "b_serial", null);
        setField(term30719, term30719.getClass(), "place_id", null);
        setField(term30719, term30719.getClass(), "time_stamp", null);
        setField(term30719, term30719.getClass(), "start_up_mode", null);
        setField(term30719, term30719.getClass(), "cmm_dly_mod", null);
        setField(term30719, term30719.getClass(), "cmm_dly_sec", null);
        setField(term30719, term30719.getClass(), "cmm_err_mod", null);
        setField(term30719, term30719.getClass(), "country_code", null);
        setField(term30719, term30719.getClass(), "region_code", null);
        term30724 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30724;
        callMethod(klass, "setAime_id", argTypes, term30719, args);
    }

};


