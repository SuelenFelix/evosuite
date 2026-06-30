package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AttendRequest_getAtndlut_31930555010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4377;

    public AttendRequest_getAtndlut_31930555010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4377 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        setField(term4377, term4377.getClass(), "atnd_lut", null);
        setField(term4377, term4377.getClass(), "atnd_prm1", null);
        setField(term4377, term4377.getClass(), "atnd_prm2", null);
        setField(term4377, term4377.getClass(), "atnd_prm3", null);
        setField(term4377, term4377.getClass(), "cmd", null);
        setField(term4377, term4377.getClass(), "req_id", null);
        setField(term4377, term4377.getClass(), "game_id", null);
        setField(term4377, term4377.getClass(), "r_ver", null);
        setField(term4377, term4377.getClass(), "kc_serial", null);
        setField(term4377, term4377.getClass(), "b_serial", null);
        setField(term4377, term4377.getClass(), "place_id", null);
        setField(term4377, term4377.getClass(), "time_stamp", null);
        setField(term4377, term4377.getClass(), "start_up_mode", null);
        setField(term4377, term4377.getClass(), "cmm_dly_mod", null);
        setField(term4377, term4377.getClass(), "cmm_dly_sec", null);
        setField(term4377, term4377.getClass(), "cmm_err_mod", null);
        setField(term4377, term4377.getClass(), "country_code", null);
        setField(term4377, term4377.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_lut", argTypes, term4377, args);
    }

};


