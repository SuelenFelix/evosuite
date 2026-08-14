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

public class Carteira_depositar_1103721260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1565;

    public Carteira_depositar_1103721260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1565 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1566 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1568 = (int[]) newIntArray(6);
        setIntField(term1566, term1566.getClass(), "signum", 1);
        setIntElement(term1568, 0, 1954);
        setIntElement(term1568, 1, -476668863);
        setIntElement(term1568, 2, 661030673);
        setIntElement(term1568, 3, 328061253);
        setIntElement(term1568, 4, -431156338);
        setIntElement(term1568, 5, 791621529);
        setField(term1566, term1566.getClass(), "mag", term1568);
        setIntField(term1566, term1566.getClass(), "bitCountPlusOne", 0);
        setIntField(term1566, term1566.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1566, term1566.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1566, term1566.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1565, term1565.getClass(), "intVal", term1566);
        setIntField(term1565, term1565.getClass(), "scale", 52);
        setIntField(term1565, term1565.getClass(), "precision", 0);
        setField(term1565, term1565.getClass(), "stringCache", null);
        setLongField(term1565, term1565.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.desafiobackend.picpay.transacoes.users.Carteira");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("br.com.desafiobackend.picpay.transacoes.users.Transacao");
        Object[] args = new Object[2];
        args[0] = term1565;
        args[1] = null;
        callMethod(klass, "depositar", argTypes, null, args);
    }

};


