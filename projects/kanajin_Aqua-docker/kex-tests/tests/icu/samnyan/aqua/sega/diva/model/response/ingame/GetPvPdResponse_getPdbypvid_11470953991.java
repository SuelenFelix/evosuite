package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GetPvPdResponse_getPdbypvid_11470953991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64894;

    public GetPvPdResponse_getPdbypvid_11470953991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term64907 = new Boolean(false);
        term64894 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse"));
        setField(term64894, term64894.getClass(), "pd_by_pv_id", "HlddItIexw");
        setField(term64894, term64894.getClass(), "pdddt_flg", term64907);
        setField(term64894, term64894.getClass(), "pdddt_tm", "HnpLvemmRI");
        setField(term64894, term64894.getClass(), "cmd", "dHrIcaTbcS");
        setField(term64894, term64894.getClass(), "req_id", "tAqyToqusS");
        setField(term64894, term64894.getClass(), "stat", "MwiFLgdSDA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.GetPvPdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_by_pv_id", argTypes, term64894, args);
    }

};


