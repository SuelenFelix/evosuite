package icu.samnyan.aqua.sega.diva.handler.card;

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
import static icu.samnyan.aqua.sega.diva.handler.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegistrationHandler_handle_5589632523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638;

    public RegistrationHandler_handle_5589632523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.card.RegistrationHandler"));
        setField(term638, term638.getClass(), "playerProfileService", null);
        setField(term638, term638.getClass(), "mapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.RegistrationHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handle", argTypes, term638, args);
    }

};


