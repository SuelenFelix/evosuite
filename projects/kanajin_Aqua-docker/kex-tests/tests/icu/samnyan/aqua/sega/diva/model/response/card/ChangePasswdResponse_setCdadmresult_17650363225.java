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

public class ChangePasswdResponse_setCdadmresult_17650363225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24702;
     Object enum74;

    public ChangePasswdResponse_setCdadmresult_17650363225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24765 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term24764 = ((Class) term24765).getDeclaredField((String) "SUCCESS");
        ((Field) term24764).setAccessible(true);
        Object enum73 = ((Field) term24764).get((Object) null);
        term24702 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term24702, term24702.getClass(), "cd_adm_result", enum73);
        setIntField(term24702, term24702.getClass(), "accept_idx", -1801760683);
        setIntField(term24702, term24702.getClass(), "pd_id", 1141317871);
        setField(term24702, term24702.getClass(), "cmd", "iikZEapDlu");
        setField(term24702, term24702.getClass(), "req_id", "nhoHrZfnIN");
        setField(term24702, term24702.getClass(), "stat", "ZkMALXpEAZ");
        Class<? extends Object> term25053 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term25052 = ((Class) term25053).getDeclaredField((String) "FAILED");
        ((Field) term25052).setAccessible(true);
        enum74 = ((Field) term25052).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum74;
        callMethod(klass, "setCd_adm_result", argTypes, term24702, args);
    }

};


