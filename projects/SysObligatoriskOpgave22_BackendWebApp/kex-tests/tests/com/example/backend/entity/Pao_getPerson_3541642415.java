package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Pao_getPerson_3541642415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7762;

    public Pao_getPerson_3541642415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7763 = new Long(-5242567610844514867L);
        Long term7814 = new Long(-2951854704066477061L);
        Long term7817 = new Long(174253963298276221L);
        Class<? extends Object> term7930 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term7929 = ((Class) term7930).getDeclaredField((String) "SIX");
        ((Field) term7929).setAccessible(true);
        Object enum31 = ((Field) term7929).get((Object) null);
        Class<? extends Object> term8101 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term8100 = ((Class) term8101).getDeclaredField((String) "HEARTS");
        ((Field) term8100).setAccessible(true);
        Object enum32 = ((Field) term8100).get((Object) null);
        ArrayList term7825 = new ArrayList();
        Long term7830 = new Long(3713624957161771816L);
        Long term7881 = new Long(6130232388739280211L);
        Long term7884 = new Long(3423965054378869855L);
        Long term7887 = new Long(11315815278355083L);
        term7762 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term7813 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term7816 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term7829 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term7880 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term7883 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term7886 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term7762, term7762.getClass(), "id", term7763);
        setField(term7762, term7762.getClass(), "imageUrl", "NTWMiBEaDF");
        setField(term7762, term7762.getClass(), "person", "SPBstwKFVr");
        setField(term7762, term7762.getClass(), "action", "WxYUTuqmIq");
        setField(term7762, term7762.getClass(), "object", "OeQLvhVERT");
        setField(term7813, term7813.getClass(), "id", term7814);
        setField(term7816, term7816.getClass(), "id", term7817);
        setField(term7816, term7816.getClass(), "rank", enum31);
        setField(term7816, term7816.getClass(), "suit", enum32);
        setField(term7816, term7816.getClass(), "paoCards", term7825);
        setField(term7813, term7813.getClass(), "card", term7816);
        setField(term7829, term7829.getClass(), "id", term7830);
        setField(term7829, term7829.getClass(), "imageUrl", "IlvgFINwIa");
        setField(term7829, term7829.getClass(), "person", "GEJABPlHSI");
        setField(term7829, term7829.getClass(), "action", "aQFUvuaYxd");
        setField(term7829, term7829.getClass(), "object", "zNFLXMifnS");
        setField(term7880, term7880.getClass(), "id", term7881);
        setField(term7883, term7883.getClass(), "id", term7884);
        setField(term7883, term7883.getClass(), "rank", null);
        setField(term7883, term7883.getClass(), "suit", null);
        setField(term7883, term7883.getClass(), "paoCards", null);
        setField(term7880, term7880.getClass(), "card", term7883);
        setField(term7886, term7886.getClass(), "id", term7887);
        setField(term7886, term7886.getClass(), "imageUrl", null);
        setField(term7886, term7886.getClass(), "person", null);
        setField(term7886, term7886.getClass(), "action", null);
        setField(term7886, term7886.getClass(), "object", null);
        setField(term7886, term7886.getClass(), "paoCard", null);
        setField(term7880, term7880.getClass(), "pao", term7886);
        setField(term7829, term7829.getClass(), "paoCard", term7880);
        setField(term7813, term7813.getClass(), "pao", term7829);
        setField(term7762, term7762.getClass(), "paoCard", term7813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerson", argTypes, term7762, args);
    }

};


