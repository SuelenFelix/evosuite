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

public class ChangeNameResponse_setPlayername_123458262319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23014;

    public ChangeNameResponse_setPlayername_123458262319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23014 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term23014, term23014.getClass(), "cd_adm_result", null);
        setIntField(term23014, term23014.getClass(), "accept_idx", 0);
        setIntField(term23014, term23014.getClass(), "pd_id", 0);
        setField(term23014, term23014.getClass(), "player_name", null);
        setField(term23014, term23014.getClass(), "cmd", null);
        setField(term23014, term23014.getClass(), "req_id", null);
        setField(term23014, term23014.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer_name", argTypes, term23014, args);
    }

};


