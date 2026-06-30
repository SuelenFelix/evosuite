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

public class RegistrationResponse_setCdadmresult_5643972578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1976;

    public RegistrationResponse_setCdadmresult_5643972578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1976 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse"));
        setField(term1976, term1976.getClass(), "cd_adm_result", null);
        setIntField(term1976, term1976.getClass(), "pd_id", 0);
        setField(term1976, term1976.getClass(), "cmd", null);
        setField(term1976, term1976.getClass(), "req_id", null);
        setField(term1976, term1976.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.RegistrationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCd_adm_result", argTypes, term1976, args);
    }

};


