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
import java.lang.Integer;
import java.lang.Object;

public class Musica_getTitulo_13944975324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5223;

    public Musica_getTitulo_13944975324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5224 = new Long(-7884871963229073324L);
        Integer term5238 = new Integer(-1048298087);
        Long term5241 = new Long(-8649738738252714180L);
        term5223 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term5240 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5326 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5223, term5223.getClass(), "id", term5224);
        setField(term5223, term5223.getClass(), "titulo", "GsWxOwXvSu");
        setField(term5223, term5223.getClass(), "minutos", term5238);
        setField(term5240, term5240.getClass(), "id", term5241);
        setField(term5240, term5240.getClass(), "email", "bKBSncrMEZ");
        setField(term5240, term5240.getClass(), "nome", "yeSXGqQExb");
        setField(term5240, term5240.getClass(), "senha", "uXYcXVYJZM");
        setField(term5240, term5240.getClass(), "perfilUsuario", "BJhjdJUhkz");
        setIntField(term5292, term5292.getClass(), "year", 2025);
        setShortField(term5292, term5292.getClass(), "month", (short) 4);
        setShortField(term5292, term5292.getClass(), "day", (short) 6);
        setField(term5291, term5291.getClass(), "date", term5292);
        setByteField(term5296, term5296.getClass(), "hour", (byte) 23);
        setByteField(term5296, term5296.getClass(), "minute", (byte) 17);
        setByteField(term5296, term5296.getClass(), "second", (byte) 11);
        setIntField(term5296, term5296.getClass(), "nano", 928165672);
        setField(term5291, term5291.getClass(), "time", term5296);
        setField(term5240, term5240.getClass(), "dataCadastro", term5291);
        setIntField(term5302, term5302.getClass(), "year", 2022);
        setShortField(term5302, term5302.getClass(), "month", (short) 3);
        setShortField(term5302, term5302.getClass(), "day", (short) 20);
        setField(term5301, term5301.getClass(), "date", term5302);
        setByteField(term5306, term5306.getClass(), "hour", (byte) 20);
        setByteField(term5306, term5306.getClass(), "minute", (byte) 31);
        setByteField(term5306, term5306.getClass(), "second", (byte) 56);
        setIntField(term5306, term5306.getClass(), "nano", 682853702);
        setField(term5301, term5301.getClass(), "time", term5306);
        setField(term5240, term5240.getClass(), "dataAlteracao", term5301);
        setField(term5223, term5223.getClass(), "usuario", term5240);
        setIntField(term5312, term5312.getClass(), "year", 2016);
        setShortField(term5312, term5312.getClass(), "month", (short) 5);
        setShortField(term5312, term5312.getClass(), "day", (short) 9);
        setField(term5311, term5311.getClass(), "date", term5312);
        setByteField(term5316, term5316.getClass(), "hour", (byte) 1);
        setByteField(term5316, term5316.getClass(), "minute", (byte) 20);
        setByteField(term5316, term5316.getClass(), "second", (byte) 56);
        setIntField(term5316, term5316.getClass(), "nano", 198437232);
        setField(term5311, term5311.getClass(), "time", term5316);
        setField(term5223, term5223.getClass(), "dataCadastro", term5311);
        setIntField(term5322, term5322.getClass(), "year", 2021);
        setShortField(term5322, term5322.getClass(), "month", (short) 2);
        setShortField(term5322, term5322.getClass(), "day", (short) 5);
        setField(term5321, term5321.getClass(), "date", term5322);
        setByteField(term5326, term5326.getClass(), "hour", (byte) 20);
        setByteField(term5326, term5326.getClass(), "minute", (byte) 43);
        setByteField(term5326, term5326.getClass(), "second", (byte) 37);
        setIntField(term5326, term5326.getClass(), "nano", 191661361);
        setField(term5321, term5321.getClass(), "time", term5326);
        setField(term5223, term5223.getClass(), "dataAlteracao", term5321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitulo", argTypes, term5223, args);
    }

};


