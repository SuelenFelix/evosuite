package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpendCreditRequest_init_165406725012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5785;
     Object term5787;
     Object term5790;
     Object term5796;
     Object term5798;
     Object term5799;

    public SpendCreditRequest_init_165406725012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5785 = new Integer(-420030135);
        term5787 = (int[]) newIntArray(2);
        setIntElement(term5787, 0, 267763294);
        setIntElement(term5787, 1, -1497710478);
        term5790 = (int[]) newIntArray(5);
        setIntElement(term5790, 0, 49950830);
        setIntElement(term5790, 1, -525257914);
        setIntElement(term5790, 2, 147209682);
        setIntElement(term5790, 3, 34470066);
        setIntElement(term5790, 4, 2058711405);
        term5796 = new Integer(1743683601);
        term5798 = (int[]) newIntArray(0);
        term5799 = (int[]) newIntArray(2);
        setIntElement(term5799, 0, -945116798);
        setIntElement(term5799, 1, 1593461795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(int.class, 0).getClass();
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term5785;
        args[1] = term5787;
        args[2] = term5790;
        args[3] = term5796;
        args[4] = term5798;
        args[5] = term5799;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


