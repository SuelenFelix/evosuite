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

public class Usuario_setEmail_20220119854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336;

    public Usuario_setEmail_20220119854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term337 = new Long(5270370404989704783L);
        term336 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term392 = newInstance(Class.forName("java.time.LocalTime"));
        Object term397 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term336, term336.getClass(), "id", term337);
        setField(term336, term336.getClass(), "email", "MxlszYVzRf");
        setField(term336, term336.getClass(), "nome", "LQFpaHEwXR");
        setField(term336, term336.getClass(), "senha", "oVcInYnLWB");
        setField(term336, term336.getClass(), "perfilUsuario", "aJlieCFVtF");
        setIntField(term388, term388.getClass(), "year", 2025);
        setShortField(term388, term388.getClass(), "month", (short) 4);
        setShortField(term388, term388.getClass(), "day", (short) 24);
        setField(term387, term387.getClass(), "date", term388);
        setByteField(term392, term392.getClass(), "hour", (byte) 18);
        setByteField(term392, term392.getClass(), "minute", (byte) 11);
        setByteField(term392, term392.getClass(), "second", (byte) 40);
        setIntField(term392, term392.getClass(), "nano", 137454929);
        setField(term387, term387.getClass(), "time", term392);
        setField(term336, term336.getClass(), "dataCadastro", term387);
        setIntField(term398, term398.getClass(), "year", 2024);
        setShortField(term398, term398.getClass(), "month", (short) 1);
        setShortField(term398, term398.getClass(), "day", (short) 24);
        setField(term397, term397.getClass(), "date", term398);
        setByteField(term402, term402.getClass(), "hour", (byte) 20);
        setByteField(term402, term402.getClass(), "minute", (byte) 28);
        setByteField(term402, term402.getClass(), "second", (byte) 39);
        setIntField(term402, term402.getClass(), "nano", 952728177);
        setField(term397, term397.getClass(), "time", term402);
        setField(term336, term336.getClass(), "dataAlteracao", term397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setEmail", argTypes, term336, args);
    }

};


