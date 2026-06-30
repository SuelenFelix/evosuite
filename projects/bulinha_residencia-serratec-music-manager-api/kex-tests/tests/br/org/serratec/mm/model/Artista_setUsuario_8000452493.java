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
import java.lang.String;
import java.lang.Object;

public class Artista_setUsuario_8000452493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7933;
     Object term8051;

    public Artista_setUsuario_8000452493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7934 = new Long(-4030863184426321096L);
        Class<? extends Object> term8133 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term8132 = ((Class) term8133).getDeclaredField((String) "BANDA");
        ((Field) term8132).setAccessible(true);
        Object enum2 = ((Field) term8132).get((Object) null);
        Long term7961 = new Long(-8010214112439224349L);
        term7933 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term7960 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term8011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8046 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7933, term7933.getClass(), "id", term7934);
        setField(term7933, term7933.getClass(), "nome", "qphdrqUtNx");
        setField(term7933, term7933.getClass(), "tipo", enum2);
        setField(term7960, term7960.getClass(), "id", term7961);
        setField(term7960, term7960.getClass(), "email", "bwlLFAfNWx");
        setField(term7960, term7960.getClass(), "nome", "JWodNQzjjV");
        setField(term7960, term7960.getClass(), "senha", "CAgxWjhxNf");
        setField(term7960, term7960.getClass(), "perfilUsuario", "goAoCMhKBu");
        setIntField(term8012, term8012.getClass(), "year", 2024);
        setShortField(term8012, term8012.getClass(), "month", (short) 11);
        setShortField(term8012, term8012.getClass(), "day", (short) 16);
        setField(term8011, term8011.getClass(), "date", term8012);
        setByteField(term8016, term8016.getClass(), "hour", (byte) 23);
        setByteField(term8016, term8016.getClass(), "minute", (byte) 40);
        setByteField(term8016, term8016.getClass(), "second", (byte) 40);
        setIntField(term8016, term8016.getClass(), "nano", 810133212);
        setField(term8011, term8011.getClass(), "time", term8016);
        setField(term7960, term7960.getClass(), "dataCadastro", term8011);
        setIntField(term8022, term8022.getClass(), "year", 2018);
        setShortField(term8022, term8022.getClass(), "month", (short) 5);
        setShortField(term8022, term8022.getClass(), "day", (short) 15);
        setField(term8021, term8021.getClass(), "date", term8022);
        setByteField(term8026, term8026.getClass(), "hour", (byte) 17);
        setByteField(term8026, term8026.getClass(), "minute", (byte) 19);
        setByteField(term8026, term8026.getClass(), "second", (byte) 28);
        setIntField(term8026, term8026.getClass(), "nano", 153049369);
        setField(term8021, term8021.getClass(), "time", term8026);
        setField(term7960, term7960.getClass(), "dataAlteracao", term8021);
        setField(term7933, term7933.getClass(), "usuario", term7960);
        setIntField(term8032, term8032.getClass(), "year", 2018);
        setShortField(term8032, term8032.getClass(), "month", (short) 9);
        setShortField(term8032, term8032.getClass(), "day", (short) 19);
        setField(term8031, term8031.getClass(), "date", term8032);
        setByteField(term8036, term8036.getClass(), "hour", (byte) 23);
        setByteField(term8036, term8036.getClass(), "minute", (byte) 30);
        setByteField(term8036, term8036.getClass(), "second", (byte) 11);
        setIntField(term8036, term8036.getClass(), "nano", 615798597);
        setField(term8031, term8031.getClass(), "time", term8036);
        setField(term7933, term7933.getClass(), "dataCadastro", term8031);
        setIntField(term8042, term8042.getClass(), "year", 2021);
        setShortField(term8042, term8042.getClass(), "month", (short) 3);
        setShortField(term8042, term8042.getClass(), "day", (short) 13);
        setField(term8041, term8041.getClass(), "date", term8042);
        setByteField(term8046, term8046.getClass(), "hour", (byte) 11);
        setByteField(term8046, term8046.getClass(), "minute", (byte) 11);
        setByteField(term8046, term8046.getClass(), "second", (byte) 36);
        setIntField(term8046, term8046.getClass(), "nano", 411690155);
        setField(term8041, term8041.getClass(), "time", term8046);
        setField(term7933, term7933.getClass(), "dataAlteracao", term8041);
        Long term8052 = new Long(-6673920710396545553L);
        term8051 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term8102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8117 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8051, term8051.getClass(), "id", term8052);
        setField(term8051, term8051.getClass(), "email", "BWxJSgKHRT");
        setField(term8051, term8051.getClass(), "nome", "AGXoIndFnm");
        setField(term8051, term8051.getClass(), "senha", "mwmFMNEzkK");
        setField(term8051, term8051.getClass(), "perfilUsuario", "kVAmKknVln");
        setIntField(term8103, term8103.getClass(), "year", 2025);
        setShortField(term8103, term8103.getClass(), "month", (short) 2);
        setShortField(term8103, term8103.getClass(), "day", (short) 24);
        setField(term8102, term8102.getClass(), "date", term8103);
        setByteField(term8107, term8107.getClass(), "hour", (byte) 10);
        setByteField(term8107, term8107.getClass(), "minute", (byte) 56);
        setByteField(term8107, term8107.getClass(), "second", (byte) 29);
        setIntField(term8107, term8107.getClass(), "nano", 207724630);
        setField(term8102, term8102.getClass(), "time", term8107);
        setField(term8051, term8051.getClass(), "dataCadastro", term8102);
        setIntField(term8113, term8113.getClass(), "year", 2027);
        setShortField(term8113, term8113.getClass(), "month", (short) 8);
        setShortField(term8113, term8113.getClass(), "day", (short) 16);
        setField(term8112, term8112.getClass(), "date", term8113);
        setByteField(term8117, term8117.getClass(), "hour", (byte) 1);
        setByteField(term8117, term8117.getClass(), "minute", (byte) 50);
        setByteField(term8117, term8117.getClass(), "second", (byte) 52);
        setIntField(term8117, term8117.getClass(), "nano", 161814778);
        setField(term8112, term8112.getClass(), "time", term8117);
        setField(term8051, term8051.getClass(), "dataAlteracao", term8112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Usuario");
        Object[] args = new Object[1];
        args[0] = term8051;
        callMethod(klass, "setUsuario", argTypes, term7933, args);
    }

};


