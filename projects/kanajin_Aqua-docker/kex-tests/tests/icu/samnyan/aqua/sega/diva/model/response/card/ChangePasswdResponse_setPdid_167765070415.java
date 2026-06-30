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

public class ChangePasswdResponse_setPdid_167765070415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26006;
     Object term26009;

    public ChangePasswdResponse_setPdid_167765070415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26006 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term26006, term26006.getClass(), "cd_adm_result", null);
        setIntField(term26006, term26006.getClass(), "accept_idx", 0);
        setIntField(term26006, term26006.getClass(), "pd_id", 0);
        setField(term26006, term26006.getClass(), "cmd", null);
        setField(term26006, term26006.getClass(), "req_id", null);
        setField(term26006, term26006.getClass(), "stat", null);
        term26009 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26009;
        callMethod(klass, "setPd_id", argTypes, term26006, args);
    }

};


