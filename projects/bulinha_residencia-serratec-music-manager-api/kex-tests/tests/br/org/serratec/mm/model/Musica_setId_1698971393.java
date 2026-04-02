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

public class Musica_setId_1698971393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5063;
     Object term5171;

    public Musica_setId_1698971393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5064 = new Long(1457594663983990440L);
        Integer term5078 = new Integer(2055867847);
        Long term5081 = new Long(3452833434644634217L);
        term5063 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term5080 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5166 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5063, term5063.getClass(), "id", term5064);
        setField(term5063, term5063.getClass(), "titulo", "CVRGEomOth");
        setField(term5063, term5063.getClass(), "minutos", term5078);
        setField(term5080, term5080.getClass(), "id", term5081);
        setField(term5080, term5080.getClass(), "email", "vSeruUyNWX");
        setField(term5080, term5080.getClass(), "nome", "UkKvaeJfEC");
        setField(term5080, term5080.getClass(), "senha", "WPxXsahPRq");
        setField(term5080, term5080.getClass(), "perfilUsuario", "IENRuqmwUU");
        setIntField(term5132, term5132.getClass(), "year", 2017);
        setShortField(term5132, term5132.getClass(), "month", (short) 1);
        setShortField(term5132, term5132.getClass(), "day", (short) 3);
        setField(term5131, term5131.getClass(), "date", term5132);
        setByteField(term5136, term5136.getClass(), "hour", (byte) 14);
        setByteField(term5136, term5136.getClass(), "minute", (byte) 1);
        setByteField(term5136, term5136.getClass(), "second", (byte) 1);
        setIntField(term5136, term5136.getClass(), "nano", 827128674);
        setField(term5131, term5131.getClass(), "time", term5136);
        setField(term5080, term5080.getClass(), "dataCadastro", term5131);
        setIntField(term5142, term5142.getClass(), "year", 2022);
        setShortField(term5142, term5142.getClass(), "month", (short) 9);
        setShortField(term5142, term5142.getClass(), "day", (short) 3);
        setField(term5141, term5141.getClass(), "date", term5142);
        setByteField(term5146, term5146.getClass(), "hour", (byte) 22);
        setByteField(term5146, term5146.getClass(), "minute", (byte) 31);
        setByteField(term5146, term5146.getClass(), "second", (byte) 44);
        setIntField(term5146, term5146.getClass(), "nano", 798112760);
        setField(term5141, term5141.getClass(), "time", term5146);
        setField(term5080, term5080.getClass(), "dataAlteracao", term5141);
        setField(term5063, term5063.getClass(), "usuario", term5080);
        setIntField(term5152, term5152.getClass(), "year", 2018);
        setShortField(term5152, term5152.getClass(), "month", (short) 7);
        setShortField(term5152, term5152.getClass(), "day", (short) 24);
        setField(term5151, term5151.getClass(), "date", term5152);
        setByteField(term5156, term5156.getClass(), "hour", (byte) 8);
        setByteField(term5156, term5156.getClass(), "minute", (byte) 32);
        setByteField(term5156, term5156.getClass(), "second", (byte) 43);
        setIntField(term5156, term5156.getClass(), "nano", 490940025);
        setField(term5151, term5151.getClass(), "time", term5156);
        setField(term5063, term5063.getClass(), "dataCadastro", term5151);
        setIntField(term5162, term5162.getClass(), "year", 2018);
        setShortField(term5162, term5162.getClass(), "month", (short) 7);
        setShortField(term5162, term5162.getClass(), "day", (short) 6);
        setField(term5161, term5161.getClass(), "date", term5162);
        setByteField(term5166, term5166.getClass(), "hour", (byte) 6);
        setByteField(term5166, term5166.getClass(), "minute", (byte) 33);
        setByteField(term5166, term5166.getClass(), "second", (byte) 21);
        setIntField(term5166, term5166.getClass(), "nano", 484192339);
        setField(term5161, term5161.getClass(), "time", term5166);
        setField(term5063, term5063.getClass(), "dataAlteracao", term5161);
        term5171 = new Long(-8603648071751666348L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5171;
        callMethod(klass, "setId", argTypes, term5063, args);
    }

};


