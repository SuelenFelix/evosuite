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
import java.lang.Integer;

public class SpendCreditRequest_setPdid_55972453820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5829;
     Object term5832;

    public SpendCreditRequest_setPdid_55972453820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5829 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        setIntField(term5829, term5829.getClass(), "pd_id", 0);
        setField(term5829, term5829.getClass(), "my_qst_id", null);
        setField(term5829, term5829.getClass(), "my_qst_sts", null);
        setIntField(term5829, term5829.getClass(), "crdt_typ", 0);
        setField(term5829, term5829.getClass(), "cmpgn_id", null);
        setField(term5829, term5829.getClass(), "cmpgn_pb", null);
        setField(term5829, term5829.getClass(), "cmd", null);
        setField(term5829, term5829.getClass(), "req_id", null);
        setField(term5829, term5829.getClass(), "game_id", null);
        setField(term5829, term5829.getClass(), "r_ver", null);
        setField(term5829, term5829.getClass(), "kc_serial", null);
        setField(term5829, term5829.getClass(), "b_serial", null);
        setField(term5829, term5829.getClass(), "place_id", null);
        setField(term5829, term5829.getClass(), "time_stamp", null);
        setField(term5829, term5829.getClass(), "start_up_mode", null);
        setField(term5829, term5829.getClass(), "cmm_dly_mod", null);
        setField(term5829, term5829.getClass(), "cmm_dly_sec", null);
        setField(term5829, term5829.getClass(), "cmm_err_mod", null);
        setField(term5829, term5829.getClass(), "country_code", null);
        setField(term5829, term5829.getClass(), "region_code", null);
        term5832 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5832;
        callMethod(klass, "setPd_id", argTypes, term5829, args);
    }

};


