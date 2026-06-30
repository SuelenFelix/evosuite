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
import java.lang.Integer;

public class ChangeNameResponse_setPdid_147169363518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23009;
     Object term23012;

    public ChangeNameResponse_setPdid_147169363518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23009 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term23009, term23009.getClass(), "cd_adm_result", null);
        setIntField(term23009, term23009.getClass(), "accept_idx", 0);
        setIntField(term23009, term23009.getClass(), "pd_id", 0);
        setField(term23009, term23009.getClass(), "player_name", null);
        setField(term23009, term23009.getClass(), "cmd", null);
        setField(term23009, term23009.getClass(), "req_id", null);
        setField(term23009, term23009.getClass(), "stat", null);
        term23012 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23012;
        callMethod(klass, "setPd_id", argTypes, term23009, args);
    }

};


