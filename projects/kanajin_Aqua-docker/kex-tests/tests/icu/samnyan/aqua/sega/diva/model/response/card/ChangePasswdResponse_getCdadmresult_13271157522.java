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

public class ChangePasswdResponse_getCdadmresult_13271157522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23689;

    public ChangePasswdResponse_getCdadmresult_13271157522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23741 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term23740 = ((Class) term23741).getDeclaredField((String) "SUCCESS");
        ((Field) term23740).setAccessible(true);
        Object enum70 = ((Field) term23740).get((Object) null);
        term23689 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term23689, term23689.getClass(), "cd_adm_result", enum70);
        setIntField(term23689, term23689.getClass(), "accept_idx", -663691365);
        setIntField(term23689, term23689.getClass(), "pd_id", 339854490);
        setField(term23689, term23689.getClass(), "cmd", "sZdUNdggUW");
        setField(term23689, term23689.getClass(), "req_id", "OqbwYQfvAe");
        setField(term23689, term23689.getClass(), "stat", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCd_adm_result", argTypes, term23689, args);
    }

};


