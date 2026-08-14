package br.com.desafiobackend.picpay.transacoes.users;

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
import static br.com.desafiobackend.picpay.transacoes.users.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class TransacaoRequest_init_13863262960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term18;
     Object term20;

    public TransacaoRequest_init_13863262960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4 = (int[]) newIntArray(6);
        setIntField(term2, term2.getClass(), "signum", 1);
        setIntElement(term4, 0, 9058);
        setIntElement(term4, 1, 1365043541);
        setIntElement(term4, 2, 1239861896);
        setIntElement(term4, 3, -1338148297);
        setIntElement(term4, 4, -418263970);
        setIntElement(term4, 5, -265097411);
        setField(term2, term2.getClass(), "mag", term4);
        setIntField(term2, term2.getClass(), "bitCountPlusOne", 0);
        setIntField(term2, term2.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2, term2.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2, term2.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1, term1.getClass(), "intVal", term2);
        setIntField(term1, term1.getClass(), "scale", 53);
        setIntField(term1, term1.getClass(), "precision", 0);
        setField(term1, term1.getClass(), "stringCache", null);
        setLongField(term1, term1.getClass(), "intCompact", -9223372036854775808L);
        term18 = new Long(2442117782898005296L);
        term20 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.desafiobackend.picpay.transacoes.users.TransacaoRequest");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term18;
        args[2] = term20;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


