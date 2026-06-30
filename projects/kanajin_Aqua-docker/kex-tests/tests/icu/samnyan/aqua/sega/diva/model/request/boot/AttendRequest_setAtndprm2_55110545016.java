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

public class AttendRequest_setAtndprm2_55110545016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4383;

    public AttendRequest_setAtndprm2_55110545016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4383 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        setField(term4383, term4383.getClass(), "atnd_lut", null);
        setField(term4383, term4383.getClass(), "atnd_prm1", null);
        setField(term4383, term4383.getClass(), "atnd_prm2", null);
        setField(term4383, term4383.getClass(), "atnd_prm3", null);
        setField(term4383, term4383.getClass(), "cmd", null);
        setField(term4383, term4383.getClass(), "req_id", null);
        setField(term4383, term4383.getClass(), "game_id", null);
        setField(term4383, term4383.getClass(), "r_ver", null);
        setField(term4383, term4383.getClass(), "kc_serial", null);
        setField(term4383, term4383.getClass(), "b_serial", null);
        setField(term4383, term4383.getClass(), "place_id", null);
        setField(term4383, term4383.getClass(), "time_stamp", null);
        setField(term4383, term4383.getClass(), "start_up_mode", null);
        setField(term4383, term4383.getClass(), "cmm_dly_mod", null);
        setField(term4383, term4383.getClass(), "cmm_dly_sec", null);
        setField(term4383, term4383.getClass(), "cmm_err_mod", null);
        setField(term4383, term4383.getClass(), "country_code", null);
        setField(term4383, term4383.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAtnd_prm2", argTypes, term4383, args);
    }

};


