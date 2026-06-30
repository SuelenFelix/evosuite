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

public class BannerDataRequest_getBdid_4345385364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2701;

    public BannerDataRequest_getBdid_4345385364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2701 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest"));
        setIntField(term2701, term2701.getClass(), "bd_id", 0);
        setField(term2701, term2701.getClass(), "cmd", null);
        setField(term2701, term2701.getClass(), "req_id", null);
        setField(term2701, term2701.getClass(), "game_id", null);
        setField(term2701, term2701.getClass(), "r_ver", null);
        setField(term2701, term2701.getClass(), "kc_serial", null);
        setField(term2701, term2701.getClass(), "b_serial", null);
        setField(term2701, term2701.getClass(), "place_id", null);
        setField(term2701, term2701.getClass(), "time_stamp", null);
        setField(term2701, term2701.getClass(), "start_up_mode", null);
        setField(term2701, term2701.getClass(), "cmm_dly_mod", null);
        setField(term2701, term2701.getClass(), "cmm_dly_sec", null);
        setField(term2701, term2701.getClass(), "cmm_err_mod", null);
        setField(term2701, term2701.getClass(), "country_code", null);
        setField(term2701, term2701.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBd_id", argTypes, term2701, args);
    }

};


