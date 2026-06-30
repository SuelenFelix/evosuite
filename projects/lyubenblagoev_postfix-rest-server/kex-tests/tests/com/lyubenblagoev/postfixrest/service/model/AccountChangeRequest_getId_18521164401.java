package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class AccountChangeRequest_getId_18521164401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3247;

    public AccountChangeRequest_getId_18521164401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3248 = new Long(6005241913654469005L);
        Long term3286 = new Long(-1983291584002806658L);
        Boolean term3288 = new Boolean(true);
        term3247 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3247, term3247.getClass(), "id", term3248);
        setField(term3247, term3247.getClass(), "username", "lHfTrWKMPk");
        setField(term3247, term3247.getClass(), "password", "JDaAnsVTGV");
        setField(term3247, term3247.getClass(), "confirmPassword", "mLUZFTfjle");
        setField(term3247, term3247.getClass(), "domainId", term3286);
        setField(term3247, term3247.getClass(), "enabled", term3288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3247, args);
    }

};


