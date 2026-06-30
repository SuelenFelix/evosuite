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

public class RegistrationResponse_getPdid_17027519312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;

    public RegistrationResponse_getPdid_17027519312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term742 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term741 = ((Class) term742).getDeclaredField((String) "FAILED");
        ((Field) term741).setAccessible(true);
        Object enum2 = ((Field) term741).get((Object) null);
        term692 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse"));
        setField(term692, term692.getClass(), "cd_adm_result", enum2);
        setIntField(term692, term692.getClass(), "pd_id", 1484323161);
        setField(term692, term692.getClass(), "cmd", "SzjVpOQTyS");
        setField(term692, term692.getClass(), "req_id", "MjGYSRKTNF");
        setField(term692, term692.getClass(), "stat", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term692, args);
    }

};


