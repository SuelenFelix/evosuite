package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpendCreditRequest_setMyqststs_8119361022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5837;

    public SpendCreditRequest_setMyqststs_8119361022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5837 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        setIntField(term5837, term5837.getClass(), "pd_id", 0);
        setField(term5837, term5837.getClass(), "my_qst_id", null);
        setField(term5837, term5837.getClass(), "my_qst_sts", null);
        setIntField(term5837, term5837.getClass(), "crdt_typ", 0);
        setField(term5837, term5837.getClass(), "cmpgn_id", null);
        setField(term5837, term5837.getClass(), "cmpgn_pb", null);
        setField(term5837, term5837.getClass(), "cmd", null);
        setField(term5837, term5837.getClass(), "req_id", null);
        setField(term5837, term5837.getClass(), "game_id", null);
        setField(term5837, term5837.getClass(), "r_ver", null);
        setField(term5837, term5837.getClass(), "kc_serial", null);
        setField(term5837, term5837.getClass(), "b_serial", null);
        setField(term5837, term5837.getClass(), "place_id", null);
        setField(term5837, term5837.getClass(), "time_stamp", null);
        setField(term5837, term5837.getClass(), "start_up_mode", null);
        setField(term5837, term5837.getClass(), "cmm_dly_mod", null);
        setField(term5837, term5837.getClass(), "cmm_dly_sec", null);
        setField(term5837, term5837.getClass(), "cmm_err_mod", null);
        setField(term5837, term5837.getClass(), "country_code", null);
        setField(term5837, term5837.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMy_qst_sts", argTypes, term5837, args);
    }

};


