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

public class TransacaoRequest_getBeneficiado_11323630863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public TransacaoRequest_getBeneficiado_11323630863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102 = new Long(4872422362414183754L);
        Long term104 = new Long(6811161968424632369L);
        term84 = newInstance(Class.forName("br.com.desafiobackend.picpay.transacoes.users.TransacaoRequest"));
        Object term85 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term86 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term88 = (int[]) newIntArray(6);
        setIntField(term86, term86.getClass(), "signum", 1);
        setIntElement(term88, 0, 3726);
        setIntElement(term88, 1, 1561510548);
        setIntElement(term88, 2, 756973629);
        setIntElement(term88, 3, -1169068666);
        setIntElement(term88, 4, -1772498162);
        setIntElement(term88, 5, -1207241473);
        setField(term86, term86.getClass(), "mag", term88);
        setIntField(term86, term86.getClass(), "bitCountPlusOne", 0);
        setIntField(term86, term86.getClass(), "bitLengthPlusOne", 0);
        setIntField(term86, term86.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term86, term86.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term85, term85.getClass(), "intVal", term86);
        setIntField(term85, term85.getClass(), "scale", 52);
        setIntField(term85, term85.getClass(), "precision", 0);
        setField(term85, term85.getClass(), "stringCache", null);
        setLongField(term85, term85.getClass(), "intCompact", -9223372036854775808L);
        setField(term84, term84.getClass(), "valor", term85);
        setField(term84, term84.getClass(), "pagador", term102);
        setField(term84, term84.getClass(), "beneficiado", term104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.desafiobackend.picpay.transacoes.users.TransacaoRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeneficiado", argTypes, term84, args);
    }

};


