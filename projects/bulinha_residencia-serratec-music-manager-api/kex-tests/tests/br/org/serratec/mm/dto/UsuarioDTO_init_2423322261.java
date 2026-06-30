package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UsuarioDTO_init_2423322261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5724;

    public UsuarioDTO_init_2423322261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5725 = new Long(5465527210299101732L);
        term5724 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5780 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5790 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5724, term5724.getClass(), "id", term5725);
        setField(term5724, term5724.getClass(), "email", "ypEdrstygY");
        setField(term5724, term5724.getClass(), "nome", "sNQFlATEeQ");
        setField(term5724, term5724.getClass(), "senha", "ZKMLioamsY");
        setField(term5724, term5724.getClass(), "perfilUsuario", "WVbxuoDBcn");
        setIntField(term5776, term5776.getClass(), "year", 2022);
        setShortField(term5776, term5776.getClass(), "month", (short) 4);
        setShortField(term5776, term5776.getClass(), "day", (short) 15);
        setField(term5775, term5775.getClass(), "date", term5776);
        setByteField(term5780, term5780.getClass(), "hour", (byte) 20);
        setByteField(term5780, term5780.getClass(), "minute", (byte) 58);
        setByteField(term5780, term5780.getClass(), "second", (byte) 46);
        setIntField(term5780, term5780.getClass(), "nano", 435562727);
        setField(term5775, term5775.getClass(), "time", term5780);
        setField(term5724, term5724.getClass(), "dataCadastro", term5775);
        setIntField(term5786, term5786.getClass(), "year", 2026);
        setShortField(term5786, term5786.getClass(), "month", (short) 10);
        setShortField(term5786, term5786.getClass(), "day", (short) 31);
        setField(term5785, term5785.getClass(), "date", term5786);
        setByteField(term5790, term5790.getClass(), "hour", (byte) 17);
        setByteField(term5790, term5790.getClass(), "minute", (byte) 6);
        setByteField(term5790, term5790.getClass(), "second", (byte) 30);
        setIntField(term5790, term5790.getClass(), "nano", 785931660);
        setField(term5785, term5785.getClass(), "time", term5790);
        setField(term5724, term5724.getClass(), "dataAlteracao", term5785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Usuario");
        Object[] args = new Object[1];
        args[0] = term5724;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


