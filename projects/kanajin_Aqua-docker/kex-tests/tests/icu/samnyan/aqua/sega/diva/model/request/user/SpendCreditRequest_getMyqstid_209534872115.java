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

public class SpendCreditRequest_getMyqstid_209534872115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5814;

    public SpendCreditRequest_getMyqstid_209534872115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5814 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        setIntField(term5814, term5814.getClass(), "pd_id", 0);
        setField(term5814, term5814.getClass(), "my_qst_id", null);
        setField(term5814, term5814.getClass(), "my_qst_sts", null);
        setIntField(term5814, term5814.getClass(), "crdt_typ", 0);
        setField(term5814, term5814.getClass(), "cmpgn_id", null);
        setField(term5814, term5814.getClass(), "cmpgn_pb", null);
        setField(term5814, term5814.getClass(), "cmd", null);
        setField(term5814, term5814.getClass(), "req_id", null);
        setField(term5814, term5814.getClass(), "game_id", null);
        setField(term5814, term5814.getClass(), "r_ver", null);
        setField(term5814, term5814.getClass(), "kc_serial", null);
        setField(term5814, term5814.getClass(), "b_serial", null);
        setField(term5814, term5814.getClass(), "place_id", null);
        setField(term5814, term5814.getClass(), "time_stamp", null);
        setField(term5814, term5814.getClass(), "start_up_mode", null);
        setField(term5814, term5814.getClass(), "cmm_dly_mod", null);
        setField(term5814, term5814.getClass(), "cmm_dly_sec", null);
        setField(term5814, term5814.getClass(), "cmm_err_mod", null);
        setField(term5814, term5814.getClass(), "country_code", null);
        setField(term5814, term5814.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_id", argTypes, term5814, args);
    }

};


