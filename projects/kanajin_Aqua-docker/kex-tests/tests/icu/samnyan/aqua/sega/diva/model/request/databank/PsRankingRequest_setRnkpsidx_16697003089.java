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
import java.lang.Integer;

public class PsRankingRequest_setRnkpsidx_16697003089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1815;
     Object term1817;

    public PsRankingRequest_setRnkpsidx_16697003089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1815 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest"));
        setField(term1815, term1815.getClass(), "rnk_ps_pv_id_lst", null);
        setIntField(term1815, term1815.getClass(), "rnk_ps_idx", 0);
        setField(term1815, term1815.getClass(), "cmd", null);
        setField(term1815, term1815.getClass(), "req_id", null);
        setField(term1815, term1815.getClass(), "game_id", null);
        setField(term1815, term1815.getClass(), "r_ver", null);
        setField(term1815, term1815.getClass(), "kc_serial", null);
        setField(term1815, term1815.getClass(), "b_serial", null);
        setField(term1815, term1815.getClass(), "place_id", null);
        setField(term1815, term1815.getClass(), "time_stamp", null);
        setField(term1815, term1815.getClass(), "start_up_mode", null);
        setField(term1815, term1815.getClass(), "cmm_dly_mod", null);
        setField(term1815, term1815.getClass(), "cmm_dly_sec", null);
        setField(term1815, term1815.getClass(), "cmm_err_mod", null);
        setField(term1815, term1815.getClass(), "country_code", null);
        setField(term1815, term1815.getClass(), "region_code", null);
        term1817 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1817;
        callMethod(klass, "setRnk_ps_idx", argTypes, term1815, args);
    }

};


