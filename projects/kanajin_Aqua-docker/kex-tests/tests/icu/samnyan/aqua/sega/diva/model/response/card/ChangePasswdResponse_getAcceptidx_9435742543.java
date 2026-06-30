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

public class ChangePasswdResponse_getAcceptidx_9435742543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24028;

    public ChangePasswdResponse_getAcceptidx_9435742543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term24079 = ((Class) term24080).getDeclaredField((String) "SUCCESS");
        ((Field) term24079).setAccessible(true);
        Object enum71 = ((Field) term24079).get((Object) null);
        term24028 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term24028, term24028.getClass(), "cd_adm_result", enum71);
        setIntField(term24028, term24028.getClass(), "accept_idx", -615654495);
        setIntField(term24028, term24028.getClass(), "pd_id", -1476117762);
        setField(term24028, term24028.getClass(), "cmd", "DhjNLmRMCu");
        setField(term24028, term24028.getClass(), "req_id", "PgPzMSEjjX");
        setField(term24028, term24028.getClass(), "stat", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term24028, args);
    }

};


