package one.digitalinnovation.gof.model;

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
import static one.digitalinnovation.gof.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Cliente_setId_4917509502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term383;

    public Cliente_setId_4917509502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248 = new Long(6375119433582206027L);
        term247 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term262 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term247, term247.getClass(), "id", term248);
        setField(term247, term247.getClass(), "nome", "uuaPigETmJ");
        setField(term262, term262.getClass(), "cep", "MxlszYVzRf");
        setField(term262, term262.getClass(), "logradouro", "LQFpaHEwXR");
        setField(term262, term262.getClass(), "complemento", "oVcInYnLWB");
        setField(term262, term262.getClass(), "bairro", "aJlieCFVtF");
        setField(term262, term262.getClass(), "localidade", "ZiaGIbnzTs");
        setField(term262, term262.getClass(), "uf", "tbcdzjIfER");
        setField(term262, term262.getClass(), "ibge", "HyxfbSQYBe");
        setField(term262, term262.getClass(), "gia", "pCTimMblYc");
        setField(term262, term262.getClass(), "ddd", "hNxWaHcfhY");
        setField(term262, term262.getClass(), "siafi", "RkybSrpybU");
        setField(term247, term247.getClass(), "endereco", term262);
        term383 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term383;
        callMethod(klass, "setId", argTypes, term247, args);
    }

};


