package br.org.serratec.mm.model;

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
import static br.org.serratec.mm.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Usuario_getDataAlteracao_208655039513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433;

    public Usuario_getDataAlteracao_208655039513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1434 = new Long(2535595959091595249L);
        term1433 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1499 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1433, term1433.getClass(), "id", term1434);
        setField(term1433, term1433.getClass(), "email", "UoYtihxVaS");
        setField(term1433, term1433.getClass(), "nome", "JDswTTCZHV");
        setField(term1433, term1433.getClass(), "senha", "onpbIeEKoi");
        setField(term1433, term1433.getClass(), "perfilUsuario", "YRHGsAkhxb");
        setIntField(term1485, term1485.getClass(), "year", 2023);
        setShortField(term1485, term1485.getClass(), "month", (short) 9);
        setShortField(term1485, term1485.getClass(), "day", (short) 23);
        setField(term1484, term1484.getClass(), "date", term1485);
        setByteField(term1489, term1489.getClass(), "hour", (byte) 12);
        setByteField(term1489, term1489.getClass(), "minute", (byte) 55);
        setByteField(term1489, term1489.getClass(), "second", (byte) 58);
        setIntField(term1489, term1489.getClass(), "nano", 159178396);
        setField(term1484, term1484.getClass(), "time", term1489);
        setField(term1433, term1433.getClass(), "dataCadastro", term1484);
        setIntField(term1495, term1495.getClass(), "year", 2028);
        setShortField(term1495, term1495.getClass(), "month", (short) 10);
        setShortField(term1495, term1495.getClass(), "day", (short) 1);
        setField(term1494, term1494.getClass(), "date", term1495);
        setByteField(term1499, term1499.getClass(), "hour", (byte) 17);
        setByteField(term1499, term1499.getClass(), "minute", (byte) 29);
        setByteField(term1499, term1499.getClass(), "second", (byte) 30);
        setIntField(term1499, term1499.getClass(), "nano", 845472306);
        setField(term1494, term1494.getClass(), "time", term1499);
        setField(term1433, term1433.getClass(), "dataAlteracao", term1494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term1433, args);
    }

};


