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

public class RegistrationResponse_setCdadmresult_5643972573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026;
     Object enum4;

    public RegistrationResponse_setCdadmresult_5643972573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1088 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term1087 = ((Class) term1088).getDeclaredField((String) "FAILED");
        ((Field) term1087).setAccessible(true);
        Object enum3 = ((Field) term1087).get((Object) null);
        term1026 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse"));
        setField(term1026, term1026.getClass(), "cd_adm_result", enum3);
        setIntField(term1026, term1026.getClass(), "pd_id", 391863371);
        setField(term1026, term1026.getClass(), "cmd", "RMFIsYGgne");
        setField(term1026, term1026.getClass(), "req_id", "NRdvgJlhkX");
        setField(term1026, term1026.getClass(), "stat", "uuaPigETmJ");
        Class<? extends Object> term1373 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term1372 = ((Class) term1373).getDeclaredField((String) "SUCCESS");
        ((Field) term1372).setAccessible(true);
        enum4 = ((Field) term1372).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "setCd_adm_result", argTypes, term1026, args);
    }

};


