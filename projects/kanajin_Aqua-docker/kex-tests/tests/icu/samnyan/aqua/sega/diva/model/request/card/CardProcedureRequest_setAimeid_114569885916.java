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

public class CardProcedureRequest_setAimeid_114569885916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23421;
     Object term23424;

    public CardProcedureRequest_setAimeid_114569885916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23421 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        setIntField(term23421, term23421.getClass(), "cd_adm_cmd", 0);
        setField(term23421, term23421.getClass(), "a_code", null);
        setIntField(term23421, term23421.getClass(), "aime_id", 0);
        setField(term23421, term23421.getClass(), "aime_a_code", null);
        setField(term23421, term23421.getClass(), "cmd", null);
        setField(term23421, term23421.getClass(), "req_id", null);
        setField(term23421, term23421.getClass(), "game_id", null);
        setField(term23421, term23421.getClass(), "r_ver", null);
        setField(term23421, term23421.getClass(), "kc_serial", null);
        setField(term23421, term23421.getClass(), "b_serial", null);
        setField(term23421, term23421.getClass(), "place_id", null);
        setField(term23421, term23421.getClass(), "time_stamp", null);
        setField(term23421, term23421.getClass(), "start_up_mode", null);
        setField(term23421, term23421.getClass(), "cmm_dly_mod", null);
        setField(term23421, term23421.getClass(), "cmm_dly_sec", null);
        setField(term23421, term23421.getClass(), "cmm_err_mod", null);
        setField(term23421, term23421.getClass(), "country_code", null);
        setField(term23421, term23421.getClass(), "region_code", null);
        term23424 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23424;
        callMethod(klass, "setAime_id", argTypes, term23421, args);
    }

};


