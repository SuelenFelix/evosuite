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

public class TransacaoRequest_getValor_15007142441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public TransacaoRequest_getValor_15007142441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46 = new Long(-8257434502486459194L);
        Long term48 = new Long(-8400487765614892086L);
        term28 = newInstance(Class.forName("br.com.desafiobackend.picpay.transacoes.users.TransacaoRequest"));
        Object term29 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term30 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term32 = (int[]) newIntArray(6);
        setIntField(term30, term30.getClass(), "signum", 1);
        setIntElement(term32, 0, 2364);
        setIntElement(term32, 1, -1446584625);
        setIntElement(term32, 2, 1957600567);
        setIntElement(term32, 3, -336418707);
        setIntElement(term32, 4, -1905211145);
        setIntElement(term32, 5, 86968353);
        setField(term30, term30.getClass(), "mag", term32);
        setIntField(term30, term30.getClass(), "bitCountPlusOne", 0);
        setIntField(term30, term30.getClass(), "bitLengthPlusOne", 0);
        setIntField(term30, term30.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term30, term30.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term29, term29.getClass(), "intVal", term30);
        setIntField(term29, term29.getClass(), "scale", 52);
        setIntField(term29, term29.getClass(), "precision", 0);
        setField(term29, term29.getClass(), "stringCache", null);
        setLongField(term29, term29.getClass(), "intCompact", -9223372036854775808L);
        setField(term28, term28.getClass(), "valor", term29);
        setField(term28, term28.getClass(), "pagador", term46);
        setField(term28, term28.getClass(), "beneficiado", term48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.desafiobackend.picpay.transacoes.users.TransacaoRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValor", argTypes, term28, args);
    }

};


