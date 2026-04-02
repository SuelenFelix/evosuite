package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class TransactionEnt_setId_126891934615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2752;
     Object term2797;

    public TransactionEnt_setId_126891934615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2753 = new Long(7247160664318067468L);
        Long term2793 = new Long(2135754395358000892L);
        Long term2795 = new Long(-8085190702504231560L);
        term2752 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2767 = newInstance(Class.forName("java.util.Date"));
        setField(term2752, term2752.getClass(), "id", term2753);
        setField(term2752, term2752.getClass(), "hash", "whBvTVIIlC");
        setLongField(term2767, term2767.getClass(), "fastTime", 1488725902101L);
        setField(term2767, term2767.getClass(), "cdate", null);
        setField(term2752, term2752.getClass(), "createDate", term2767);
        setField(term2752, term2752.getClass(), "failReason", "IgRJUzaCwW");
        setField(term2752, term2752.getClass(), "code", "JUmudUmaaV");
        setField(term2752, term2752.getClass(), "dropRecipientId", term2793);
        setField(term2752, term2752.getClass(), "dropRequestId", term2795);
        term2797 = new Long(1672578078364590450L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2797;
        callMethod(klass, "setId", argTypes, term2752, args);
    }

};


