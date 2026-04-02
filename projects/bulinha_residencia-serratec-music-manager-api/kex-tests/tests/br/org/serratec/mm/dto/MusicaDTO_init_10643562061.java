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
import java.lang.Integer;
import java.lang.Object;

public class MusicaDTO_init_10643562061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7149;

    public MusicaDTO_init_10643562061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7150 = new Long(3666226122807672448L);
        Integer term7164 = new Integer(-663691365);
        Long term7167 = new Long(3108750145697087661L);
        term7149 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term7166 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term7217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7252 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7149, term7149.getClass(), "id", term7150);
        setField(term7149, term7149.getClass(), "titulo", "eOJfbiZLnb");
        setField(term7149, term7149.getClass(), "minutos", term7164);
        setField(term7166, term7166.getClass(), "id", term7167);
        setField(term7166, term7166.getClass(), "email", "nKZKnxWYCK");
        setField(term7166, term7166.getClass(), "nome", "JOqQxuzRuZ");
        setField(term7166, term7166.getClass(), "senha", "RSaoipUlsg");
        setField(term7166, term7166.getClass(), "perfilUsuario", "cSHGbqKqlN");
        setIntField(term7218, term7218.getClass(), "year", 2027);
        setShortField(term7218, term7218.getClass(), "month", (short) 6);
        setShortField(term7218, term7218.getClass(), "day", (short) 20);
        setField(term7217, term7217.getClass(), "date", term7218);
        setByteField(term7222, term7222.getClass(), "hour", (byte) 23);
        setByteField(term7222, term7222.getClass(), "minute", (byte) 21);
        setByteField(term7222, term7222.getClass(), "second", (byte) 6);
        setIntField(term7222, term7222.getClass(), "nano", 897776059);
        setField(term7217, term7217.getClass(), "time", term7222);
        setField(term7166, term7166.getClass(), "dataCadastro", term7217);
        setIntField(term7228, term7228.getClass(), "year", 2016);
        setShortField(term7228, term7228.getClass(), "month", (short) 3);
        setShortField(term7228, term7228.getClass(), "day", (short) 20);
        setField(term7227, term7227.getClass(), "date", term7228);
        setByteField(term7232, term7232.getClass(), "hour", (byte) 0);
        setByteField(term7232, term7232.getClass(), "minute", (byte) 54);
        setByteField(term7232, term7232.getClass(), "second", (byte) 6);
        setIntField(term7232, term7232.getClass(), "nano", 183302469);
        setField(term7227, term7227.getClass(), "time", term7232);
        setField(term7166, term7166.getClass(), "dataAlteracao", term7227);
        setField(term7149, term7149.getClass(), "usuario", term7166);
        setIntField(term7238, term7238.getClass(), "year", 2013);
        setShortField(term7238, term7238.getClass(), "month", (short) 11);
        setShortField(term7238, term7238.getClass(), "day", (short) 19);
        setField(term7237, term7237.getClass(), "date", term7238);
        setByteField(term7242, term7242.getClass(), "hour", (byte) 6);
        setByteField(term7242, term7242.getClass(), "minute", (byte) 45);
        setByteField(term7242, term7242.getClass(), "second", (byte) 10);
        setIntField(term7242, term7242.getClass(), "nano", 288981190);
        setField(term7237, term7237.getClass(), "time", term7242);
        setField(term7149, term7149.getClass(), "dataCadastro", term7237);
        setIntField(term7248, term7248.getClass(), "year", 2025);
        setShortField(term7248, term7248.getClass(), "month", (short) 9);
        setShortField(term7248, term7248.getClass(), "day", (short) 18);
        setField(term7247, term7247.getClass(), "date", term7248);
        setByteField(term7252, term7252.getClass(), "hour", (byte) 16);
        setByteField(term7252, term7252.getClass(), "minute", (byte) 1);
        setByteField(term7252, term7252.getClass(), "second", (byte) 23);
        setIntField(term7252, term7252.getClass(), "nano", 178285726);
        setField(term7247, term7247.getClass(), "time", term7252);
        setField(term7149, term7149.getClass(), "dataAlteracao", term7247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Musica");
        Object[] args = new Object[1];
        args[0] = term7149;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


