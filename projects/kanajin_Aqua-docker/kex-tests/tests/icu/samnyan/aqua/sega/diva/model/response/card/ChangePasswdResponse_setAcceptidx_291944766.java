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

public class ChangePasswdResponse_setAcceptidx_291944766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25307;
     Object term25357;

    public ChangePasswdResponse_setAcceptidx_291944766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term25359 = ((Class) term25360).getDeclaredField((String) "FAILED");
        ((Field) term25359).setAccessible(true);
        Object enum75 = ((Field) term25359).get((Object) null);
        term25307 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term25307, term25307.getClass(), "cd_adm_result", enum75);
        setIntField(term25307, term25307.getClass(), "accept_idx", 890669485);
        setIntField(term25307, term25307.getClass(), "pd_id", 691577392);
        setField(term25307, term25307.getClass(), "cmd", "tXfQjSqDzN");
        setField(term25307, term25307.getClass(), "req_id", "BjugTaMcxJ");
        setField(term25307, term25307.getClass(), "stat", "vGiuZVPJNH");
        term25357 = new Integer(-893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25357;
        callMethod(klass, "setAccept_idx", argTypes, term25307, args);
    }

};


