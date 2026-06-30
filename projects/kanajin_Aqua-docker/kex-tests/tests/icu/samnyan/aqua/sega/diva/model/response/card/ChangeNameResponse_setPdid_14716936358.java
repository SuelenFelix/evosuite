package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class ChangeNameResponse_setPdid_14716936358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22239;
     Object term22302;

    public ChangeNameResponse_setPdid_14716936358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term22304 = ((Class) term22305).getDeclaredField((String) "SUCCESS");
        ((Field) term22304).setAccessible(true);
        Object enum66 = ((Field) term22304).get((Object) null);
        term22239 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term22239, term22239.getClass(), "cd_adm_result", enum66);
        setIntField(term22239, term22239.getClass(), "accept_idx", 304775596);
        setIntField(term22239, term22239.getClass(), "pd_id", -1347665717);
        setField(term22239, term22239.getClass(), "player_name", "lihXWlGDxk");
        setField(term22239, term22239.getClass(), "cmd", "JmcmxoGhIK");
        setField(term22239, term22239.getClass(), "req_id", "jXzmYyrnnT");
        setField(term22239, term22239.getClass(), "stat", "igCAtimmYB");
        term22302 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22302;
        callMethod(klass, "setPd_id", argTypes, term22239, args);
    }

};


