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

public class ChangePasswdResponse_getPdid_2627817864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24367;

    public ChangePasswdResponse_getPdid_2627817864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24418 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term24417 = ((Class) term24418).getDeclaredField((String) "FAILED");
        ((Field) term24417).setAccessible(true);
        Object enum72 = ((Field) term24417).get((Object) null);
        term24367 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term24367, term24367.getClass(), "cd_adm_result", enum72);
        setIntField(term24367, term24367.getClass(), "accept_idx", -341962980);
        setIntField(term24367, term24367.getClass(), "pd_id", 1532716628);
        setField(term24367, term24367.getClass(), "cmd", "kGMQdqJYyB");
        setField(term24367, term24367.getClass(), "req_id", "XJJNClzHRf");
        setField(term24367, term24367.getClass(), "stat", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term24367, args);
    }

};


