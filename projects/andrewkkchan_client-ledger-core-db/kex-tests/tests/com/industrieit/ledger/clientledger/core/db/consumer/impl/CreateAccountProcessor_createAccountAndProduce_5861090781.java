package com.industrieit.ledger.clientledger.core.db.consumer.impl;

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
import static com.industrieit.ledger.clientledger.core.db.consumer.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class CreateAccountProcessor_createAccountAndProduce_5861090781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term136;
     Object term138;

    public CreateAccountProcessor_createAccountAndProduce_5861090781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest"));
        setField(term87, term87.getClass(), "id", "jJCZpVmanW");
        setField(term87, term87.getClass(), "currency", "EGtDIRbSSb");
        setField(term87, term87.getClass(), "accountName", "SzjVpOQTyS");
        setField(term87, term87.getClass(), "accountGroup", "MjGYSRKTNF");
        term136 = new Long(2442117782898005296L);
        term138 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.CreateAccountProcessor");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = "xxtlPwDYFs";
        args[1] = term87;
        args[2] = term136;
        args[3] = term138;
        callMethod(klass, "createAccountAndProduce", argTypes, null, args);
    }

};


