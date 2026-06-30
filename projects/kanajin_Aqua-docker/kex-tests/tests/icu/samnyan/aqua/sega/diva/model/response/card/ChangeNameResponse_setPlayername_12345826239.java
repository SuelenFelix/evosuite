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

public class ChangeNameResponse_setPlayername_12345826239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22602;

    public ChangeNameResponse_setPlayername_12345826239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22678 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term22677 = ((Class) term22678).getDeclaredField((String) "SUCCESS");
        ((Field) term22677).setAccessible(true);
        Object enum67 = ((Field) term22677).get((Object) null);
        term22602 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term22602, term22602.getClass(), "cd_adm_result", enum67);
        setIntField(term22602, term22602.getClass(), "accept_idx", 683666002);
        setIntField(term22602, term22602.getClass(), "pd_id", 1596213415);
        setField(term22602, term22602.getClass(), "player_name", "DyiXbeYIaN");
        setField(term22602, term22602.getClass(), "cmd", "VGizxZnyHX");
        setField(term22602, term22602.getClass(), "req_id", "kVEZMHmRtR");
        setField(term22602, term22602.getClass(), "stat", "ekxGuOYIwi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RbVQXSpxXy";
        callMethod(klass, "setPlayer_name", argTypes, term22602, args);
    }

};


