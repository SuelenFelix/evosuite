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

public class Transacao_getBeneficiado_20455310157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1562;

    public Transacao_getBeneficiado_20455310157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1562 = newInstance(Class.forName("br.com.desafiobackend.picpay.transacoes.users.Transacao"));
        setField(term1562, term1562.getClass(), "id", null);
        setField(term1562, term1562.getClass(), "pagador", null);
        setField(term1562, term1562.getClass(), "beneficiado", null);
        setField(term1562, term1562.getClass(), "transferidoEm", null);
        setField(term1562, term1562.getClass(), "valor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.desafiobackend.picpay.transacoes.users.Transacao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeneficiado", argTypes, term1562, args);
    }

};


