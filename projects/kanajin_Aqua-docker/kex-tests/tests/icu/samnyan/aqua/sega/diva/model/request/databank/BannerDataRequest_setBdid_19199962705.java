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

public class BannerDataRequest_setBdid_19199962705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2703;
     Object term2705;

    public BannerDataRequest_setBdid_19199962705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2703 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest"));
        setIntField(term2703, term2703.getClass(), "bd_id", 0);
        setField(term2703, term2703.getClass(), "cmd", null);
        setField(term2703, term2703.getClass(), "req_id", null);
        setField(term2703, term2703.getClass(), "game_id", null);
        setField(term2703, term2703.getClass(), "r_ver", null);
        setField(term2703, term2703.getClass(), "kc_serial", null);
        setField(term2703, term2703.getClass(), "b_serial", null);
        setField(term2703, term2703.getClass(), "place_id", null);
        setField(term2703, term2703.getClass(), "time_stamp", null);
        setField(term2703, term2703.getClass(), "start_up_mode", null);
        setField(term2703, term2703.getClass(), "cmm_dly_mod", null);
        setField(term2703, term2703.getClass(), "cmm_dly_sec", null);
        setField(term2703, term2703.getClass(), "cmm_err_mod", null);
        setField(term2703, term2703.getClass(), "country_code", null);
        setField(term2703, term2703.getClass(), "region_code", null);
        term2705 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2705;
        callMethod(klass, "setBd_id", argTypes, term2703, args);
    }

};


