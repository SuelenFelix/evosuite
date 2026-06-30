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

public class CardProcedureRequest_setAcode_3243967515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23418;

    public CardProcedureRequest_setAcode_3243967515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23418 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        setIntField(term23418, term23418.getClass(), "cd_adm_cmd", 0);
        setField(term23418, term23418.getClass(), "a_code", null);
        setIntField(term23418, term23418.getClass(), "aime_id", 0);
        setField(term23418, term23418.getClass(), "aime_a_code", null);
        setField(term23418, term23418.getClass(), "cmd", null);
        setField(term23418, term23418.getClass(), "req_id", null);
        setField(term23418, term23418.getClass(), "game_id", null);
        setField(term23418, term23418.getClass(), "r_ver", null);
        setField(term23418, term23418.getClass(), "kc_serial", null);
        setField(term23418, term23418.getClass(), "b_serial", null);
        setField(term23418, term23418.getClass(), "place_id", null);
        setField(term23418, term23418.getClass(), "time_stamp", null);
        setField(term23418, term23418.getClass(), "start_up_mode", null);
        setField(term23418, term23418.getClass(), "cmm_dly_mod", null);
        setField(term23418, term23418.getClass(), "cmm_dly_sec", null);
        setField(term23418, term23418.getClass(), "cmm_err_mod", null);
        setField(term23418, term23418.getClass(), "country_code", null);
        setField(term23418, term23418.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setA_code", argTypes, term23418, args);
    }

};


