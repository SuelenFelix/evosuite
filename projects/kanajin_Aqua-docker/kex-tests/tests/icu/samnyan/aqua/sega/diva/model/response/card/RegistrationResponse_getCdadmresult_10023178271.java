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

public class RegistrationResponse_getCdadmresult_10023178271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;

    public RegistrationResponse_getCdadmresult_10023178271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term408 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term407 = ((Class) term408).getDeclaredField((String) "FAILED");
        ((Field) term407).setAccessible(true);
        Object enum1 = ((Field) term407).get((Object) null);
        term358 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse"));
        setField(term358, term358.getClass(), "cd_adm_result", enum1);
        setIntField(term358, term358.getClass(), "pd_id", 1162663216);
        setField(term358, term358.getClass(), "cmd", "xxtlPwDYFs");
        setField(term358, term358.getClass(), "req_id", "jJCZpVmanW");
        setField(term358, term358.getClass(), "stat", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCd_adm_result", argTypes, term358, args);
    }

};


