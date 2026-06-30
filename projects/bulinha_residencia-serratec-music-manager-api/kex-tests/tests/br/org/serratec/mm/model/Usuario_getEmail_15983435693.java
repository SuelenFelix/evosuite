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

public class Usuario_getEmail_15983435693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;

    public Usuario_getEmail_15983435693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226 = new Long(-8400487765614892086L);
        term225 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term225, term225.getClass(), "id", term226);
        setField(term225, term225.getClass(), "email", "hRNSzYYIrc");
        setField(term225, term225.getClass(), "nome", "RMFIsYGgne");
        setField(term225, term225.getClass(), "senha", "NRdvgJlhkX");
        setField(term225, term225.getClass(), "perfilUsuario", "uuaPigETmJ");
        setIntField(term277, term277.getClass(), "year", 2022);
        setShortField(term277, term277.getClass(), "month", (short) 2);
        setShortField(term277, term277.getClass(), "day", (short) 26);
        setField(term276, term276.getClass(), "date", term277);
        setByteField(term281, term281.getClass(), "hour", (byte) 11);
        setByteField(term281, term281.getClass(), "minute", (byte) 42);
        setByteField(term281, term281.getClass(), "second", (byte) 15);
        setIntField(term281, term281.getClass(), "nano", 377731937);
        setField(term276, term276.getClass(), "time", term281);
        setField(term225, term225.getClass(), "dataCadastro", term276);
        setIntField(term287, term287.getClass(), "year", 2026);
        setShortField(term287, term287.getClass(), "month", (short) 12);
        setShortField(term287, term287.getClass(), "day", (short) 14);
        setField(term286, term286.getClass(), "date", term287);
        setByteField(term291, term291.getClass(), "hour", (byte) 16);
        setByteField(term291, term291.getClass(), "minute", (byte) 34);
        setByteField(term291, term291.getClass(), "second", (byte) 9);
        setIntField(term291, term291.getClass(), "nano", 518326996);
        setField(term286, term286.getClass(), "time", term291);
        setField(term225, term225.getClass(), "dataAlteracao", term286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term225, args);
    }

};


