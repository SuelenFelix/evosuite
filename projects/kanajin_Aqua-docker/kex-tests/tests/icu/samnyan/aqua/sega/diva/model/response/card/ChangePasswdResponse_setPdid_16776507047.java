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

public class ChangePasswdResponse_setPdid_16776507047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25644;
     Object term25695;

    public ChangePasswdResponse_setPdid_16776507047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25698 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term25697 = ((Class) term25698).getDeclaredField((String) "SUCCESS");
        ((Field) term25697).setAccessible(true);
        Object enum76 = ((Field) term25697).get((Object) null);
        term25644 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term25644, term25644.getClass(), "cd_adm_result", enum76);
        setIntField(term25644, term25644.getClass(), "accept_idx", -1963434938);
        setIntField(term25644, term25644.getClass(), "pd_id", 906181092);
        setField(term25644, term25644.getClass(), "cmd", "tlzpzIjMib");
        setField(term25644, term25644.getClass(), "req_id", "AZdLeSugwv");
        setField(term25644, term25644.getClass(), "stat", "RMsXuyzKJV");
        term25695 = new Integer(1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25695;
        callMethod(klass, "setPd_id", argTypes, term25644, args);
    }

};


