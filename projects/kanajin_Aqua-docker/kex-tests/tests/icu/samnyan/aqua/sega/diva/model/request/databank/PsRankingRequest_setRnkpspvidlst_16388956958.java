package icu.samnyan.aqua.sega.diva.model.request.databank;

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
import static icu.samnyan.aqua.sega.diva.model.request.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PsRankingRequest_setRnkpspvidlst_16388956958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;

    public PsRankingRequest_setRnkpspvidlst_16388956958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1813 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest"));
        setField(term1813, term1813.getClass(), "rnk_ps_pv_id_lst", null);
        setIntField(term1813, term1813.getClass(), "rnk_ps_idx", 0);
        setField(term1813, term1813.getClass(), "cmd", null);
        setField(term1813, term1813.getClass(), "req_id", null);
        setField(term1813, term1813.getClass(), "game_id", null);
        setField(term1813, term1813.getClass(), "r_ver", null);
        setField(term1813, term1813.getClass(), "kc_serial", null);
        setField(term1813, term1813.getClass(), "b_serial", null);
        setField(term1813, term1813.getClass(), "place_id", null);
        setField(term1813, term1813.getClass(), "time_stamp", null);
        setField(term1813, term1813.getClass(), "start_up_mode", null);
        setField(term1813, term1813.getClass(), "cmm_dly_mod", null);
        setField(term1813, term1813.getClass(), "cmm_dly_sec", null);
        setField(term1813, term1813.getClass(), "cmm_err_mod", null);
        setField(term1813, term1813.getClass(), "country_code", null);
        setField(term1813, term1813.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRnk_ps_pv_id_lst", argTypes, term1813, args);
    }

};


