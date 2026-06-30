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

public class Usuario_getNome_3410765205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;

    public Usuario_getNome_3410765205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term470 = new Long(7411271909051562686L);
        term469 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term535 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term469, term469.getClass(), "id", term470);
        setField(term469, term469.getClass(), "email", "tbcdzjIfER");
        setField(term469, term469.getClass(), "nome", "HyxfbSQYBe");
        setField(term469, term469.getClass(), "senha", "pCTimMblYc");
        setField(term469, term469.getClass(), "perfilUsuario", "hNxWaHcfhY");
        setIntField(term521, term521.getClass(), "year", 2029);
        setShortField(term521, term521.getClass(), "month", (short) 8);
        setShortField(term521, term521.getClass(), "day", (short) 29);
        setField(term520, term520.getClass(), "date", term521);
        setByteField(term525, term525.getClass(), "hour", (byte) 15);
        setByteField(term525, term525.getClass(), "minute", (byte) 50);
        setByteField(term525, term525.getClass(), "second", (byte) 1);
        setIntField(term525, term525.getClass(), "nano", 277971904);
        setField(term520, term520.getClass(), "time", term525);
        setField(term469, term469.getClass(), "dataCadastro", term520);
        setIntField(term531, term531.getClass(), "year", 2022);
        setShortField(term531, term531.getClass(), "month", (short) 11);
        setShortField(term531, term531.getClass(), "day", (short) 16);
        setField(term530, term530.getClass(), "date", term531);
        setByteField(term535, term535.getClass(), "hour", (byte) 15);
        setByteField(term535, term535.getClass(), "minute", (byte) 54);
        setByteField(term535, term535.getClass(), "second", (byte) 2);
        setIntField(term535, term535.getClass(), "nano", 733274103);
        setField(term530, term530.getClass(), "time", term535);
        setField(term469, term469.getClass(), "dataAlteracao", term530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term469, args);
    }

};


