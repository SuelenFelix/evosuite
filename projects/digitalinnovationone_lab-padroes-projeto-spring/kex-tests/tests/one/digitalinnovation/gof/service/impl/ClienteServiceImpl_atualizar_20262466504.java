package one.digitalinnovation.gof.service.impl;

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
import static one.digitalinnovation.gof.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ClienteServiceImpl_atualizar_20262466504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249;
     Object term251;

    public ClienteServiceImpl_atualizar_20262466504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249 = new Long(-8257434502486459194L);
        Long term252 = new Long(-8400487765614892086L);
        term251 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term266 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term251, term251.getClass(), "id", term252);
        setField(term251, term251.getClass(), "nome", "uuaPigETmJ");
        setField(term266, term266.getClass(), "cep", "MxlszYVzRf");
        setField(term266, term266.getClass(), "logradouro", "LQFpaHEwXR");
        setField(term266, term266.getClass(), "complemento", "oVcInYnLWB");
        setField(term266, term266.getClass(), "bairro", "aJlieCFVtF");
        setField(term266, term266.getClass(), "localidade", "ZiaGIbnzTs");
        setField(term266, term266.getClass(), "uf", "tbcdzjIfER");
        setField(term266, term266.getClass(), "ibge", "HyxfbSQYBe");
        setField(term266, term266.getClass(), "gia", "pCTimMblYc");
        setField(term266, term266.getClass(), "ddd", "hNxWaHcfhY");
        setField(term266, term266.getClass(), "siafi", "RkybSrpybU");
        setField(term251, term251.getClass(), "endereco", term266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.service.impl.ClienteServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Object[] args = new Object[2];
        args[0] = term249;
        args[1] = term251;
        callMethod(klass, "atualizar", argTypes, null, args);
    }

};


