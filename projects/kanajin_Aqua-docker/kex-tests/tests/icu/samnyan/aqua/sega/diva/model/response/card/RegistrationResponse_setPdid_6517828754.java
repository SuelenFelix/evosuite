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

public class RegistrationResponse_setPdid_6517828754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1630;
     Object term1680;

    public RegistrationResponse_setPdid_6517828754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term1682 = ((Class) term1683).getDeclaredField((String) "SUCCESS");
        ((Field) term1682).setAccessible(true);
        Object enum5 = ((Field) term1682).get((Object) null);
        term1630 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse"));
        setField(term1630, term1630.getClass(), "cd_adm_result", enum5);
        setIntField(term1630, term1630.getClass(), "pd_id", -1922583790);
        setField(term1630, term1630.getClass(), "cmd", "MxlszYVzRf");
        setField(term1630, term1630.getClass(), "req_id", "LQFpaHEwXR");
        setField(term1630, term1630.getClass(), "stat", "oVcInYnLWB");
        term1680 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1680;
        callMethod(klass, "setPd_id", argTypes, term1630, args);
    }

};


