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

public class SpendCreditRequest_setCrdttyp_68573895923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5840;
     Object term5843;

    public SpendCreditRequest_setCrdttyp_68573895923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5840 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        setIntField(term5840, term5840.getClass(), "pd_id", 0);
        setField(term5840, term5840.getClass(), "my_qst_id", null);
        setField(term5840, term5840.getClass(), "my_qst_sts", null);
        setIntField(term5840, term5840.getClass(), "crdt_typ", 0);
        setField(term5840, term5840.getClass(), "cmpgn_id", null);
        setField(term5840, term5840.getClass(), "cmpgn_pb", null);
        setField(term5840, term5840.getClass(), "cmd", null);
        setField(term5840, term5840.getClass(), "req_id", null);
        setField(term5840, term5840.getClass(), "game_id", null);
        setField(term5840, term5840.getClass(), "r_ver", null);
        setField(term5840, term5840.getClass(), "kc_serial", null);
        setField(term5840, term5840.getClass(), "b_serial", null);
        setField(term5840, term5840.getClass(), "place_id", null);
        setField(term5840, term5840.getClass(), "time_stamp", null);
        setField(term5840, term5840.getClass(), "start_up_mode", null);
        setField(term5840, term5840.getClass(), "cmm_dly_mod", null);
        setField(term5840, term5840.getClass(), "cmm_dly_sec", null);
        setField(term5840, term5840.getClass(), "cmm_err_mod", null);
        setField(term5840, term5840.getClass(), "country_code", null);
        setField(term5840, term5840.getClass(), "region_code", null);
        term5843 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5843;
        callMethod(klass, "setCrdt_typ", argTypes, term5840, args);
    }

};


