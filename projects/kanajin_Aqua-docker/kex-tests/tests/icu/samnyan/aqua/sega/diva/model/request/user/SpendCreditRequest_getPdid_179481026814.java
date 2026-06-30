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

public class SpendCreditRequest_getPdid_179481026814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5811;

    public SpendCreditRequest_getPdid_179481026814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5811 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        setIntField(term5811, term5811.getClass(), "pd_id", 0);
        setField(term5811, term5811.getClass(), "my_qst_id", null);
        setField(term5811, term5811.getClass(), "my_qst_sts", null);
        setIntField(term5811, term5811.getClass(), "crdt_typ", 0);
        setField(term5811, term5811.getClass(), "cmpgn_id", null);
        setField(term5811, term5811.getClass(), "cmpgn_pb", null);
        setField(term5811, term5811.getClass(), "cmd", null);
        setField(term5811, term5811.getClass(), "req_id", null);
        setField(term5811, term5811.getClass(), "game_id", null);
        setField(term5811, term5811.getClass(), "r_ver", null);
        setField(term5811, term5811.getClass(), "kc_serial", null);
        setField(term5811, term5811.getClass(), "b_serial", null);
        setField(term5811, term5811.getClass(), "place_id", null);
        setField(term5811, term5811.getClass(), "time_stamp", null);
        setField(term5811, term5811.getClass(), "start_up_mode", null);
        setField(term5811, term5811.getClass(), "cmm_dly_mod", null);
        setField(term5811, term5811.getClass(), "cmm_dly_sec", null);
        setField(term5811, term5811.getClass(), "cmm_err_mod", null);
        setField(term5811, term5811.getClass(), "country_code", null);
        setField(term5811, term5811.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term5811, args);
    }

};


