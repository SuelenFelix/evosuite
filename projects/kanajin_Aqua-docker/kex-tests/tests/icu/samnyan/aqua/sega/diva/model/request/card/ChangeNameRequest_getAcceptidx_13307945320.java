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

public class ChangeNameRequest_getAcceptidx_13307945320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30699;

    public ChangeNameRequest_getAcceptidx_13307945320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30699 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        setField(term30699, term30699.getClass(), "a_code", null);
        setIntField(term30699, term30699.getClass(), "aime_id", 0);
        setField(term30699, term30699.getClass(), "aime_a_code", null);
        setIntField(term30699, term30699.getClass(), "pd_id", 0);
        setIntField(term30699, term30699.getClass(), "accept_idx", 0);
        setField(term30699, term30699.getClass(), "player_name", null);
        setIntField(term30699, term30699.getClass(), "chg_name_price", 0);
        setField(term30699, term30699.getClass(), "cmd", null);
        setField(term30699, term30699.getClass(), "req_id", null);
        setField(term30699, term30699.getClass(), "game_id", null);
        setField(term30699, term30699.getClass(), "r_ver", null);
        setField(term30699, term30699.getClass(), "kc_serial", null);
        setField(term30699, term30699.getClass(), "b_serial", null);
        setField(term30699, term30699.getClass(), "place_id", null);
        setField(term30699, term30699.getClass(), "time_stamp", null);
        setField(term30699, term30699.getClass(), "start_up_mode", null);
        setField(term30699, term30699.getClass(), "cmm_dly_mod", null);
        setField(term30699, term30699.getClass(), "cmm_dly_sec", null);
        setField(term30699, term30699.getClass(), "cmm_err_mod", null);
        setField(term30699, term30699.getClass(), "country_code", null);
        setField(term30699, term30699.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term30699, args);
    }

};


