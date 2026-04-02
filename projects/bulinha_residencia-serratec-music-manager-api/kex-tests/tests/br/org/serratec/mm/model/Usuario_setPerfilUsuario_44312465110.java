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

public class Usuario_setPerfilUsuario_44312465110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068;

    public Usuario_setPerfilUsuario_44312465110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1069 = new Long(-2813493605142626659L);
        term1068 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1134 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1068, term1068.getClass(), "id", term1069);
        setField(term1068, term1068.getClass(), "email", "aKnKipADSo");
        setField(term1068, term1068.getClass(), "nome", "wSQxaModmm");
        setField(term1068, term1068.getClass(), "senha", "UlajhuVLaP");
        setField(term1068, term1068.getClass(), "perfilUsuario", "gGSMzuGICf");
        setIntField(term1120, term1120.getClass(), "year", 2017);
        setShortField(term1120, term1120.getClass(), "month", (short) 3);
        setShortField(term1120, term1120.getClass(), "day", (short) 5);
        setField(term1119, term1119.getClass(), "date", term1120);
        setByteField(term1124, term1124.getClass(), "hour", (byte) 20);
        setByteField(term1124, term1124.getClass(), "minute", (byte) 34);
        setByteField(term1124, term1124.getClass(), "second", (byte) 55);
        setIntField(term1124, term1124.getClass(), "nano", 78024496);
        setField(term1119, term1119.getClass(), "time", term1124);
        setField(term1068, term1068.getClass(), "dataCadastro", term1119);
        setIntField(term1130, term1130.getClass(), "year", 2020);
        setShortField(term1130, term1130.getClass(), "month", (short) 7);
        setShortField(term1130, term1130.getClass(), "day", (short) 24);
        setField(term1129, term1129.getClass(), "date", term1130);
        setByteField(term1134, term1134.getClass(), "hour", (byte) 0);
        setByteField(term1134, term1134.getClass(), "minute", (byte) 59);
        setByteField(term1134, term1134.getClass(), "second", (byte) 56);
        setIntField(term1134, term1134.getClass(), "nano", 320219201);
        setField(term1129, term1129.getClass(), "time", term1134);
        setField(term1068, term1068.getClass(), "dataAlteracao", term1129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setPerfilUsuario", argTypes, term1068, args);
    }

};


