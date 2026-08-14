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

public class Carteira_sacar_20124171771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1588;

    public Carteira_sacar_20124171771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1588 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1589 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1591 = (int[]) newIntArray(6);
        setIntField(term1589, term1589.getClass(), "signum", 1);
        setIntElement(term1591, 0, 27489);
        setIntElement(term1591, 1, -274433180);
        setIntElement(term1591, 2, 698548608);
        setIntElement(term1591, 3, -1143703655);
        setIntElement(term1591, 4, 1619765041);
        setIntElement(term1591, 5, -418227111);
        setField(term1589, term1589.getClass(), "mag", term1591);
        setIntField(term1589, term1589.getClass(), "bitCountPlusOne", 0);
        setIntField(term1589, term1589.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1589, term1589.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1589, term1589.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1588, term1588.getClass(), "intVal", term1589);
        setIntField(term1588, term1588.getClass(), "scale", 53);
        setIntField(term1588, term1588.getClass(), "precision", 0);
        setField(term1588, term1588.getClass(), "stringCache", null);
        setLongField(term1588, term1588.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.desafiobackend.picpay.transacoes.users.Carteira");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("br.com.desafiobackend.picpay.transacoes.users.Transacao");
        Object[] args = new Object[2];
        args[0] = term1588;
        args[1] = null;
        callMethod(klass, "sacar", argTypes, null, args);
    }

};


