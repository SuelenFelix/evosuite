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

public class Musica_setUsuario_86160419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6037;
     Object term6145;

    public Musica_setUsuario_86160419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6038 = new Long(5219030281405653303L);
        Integer term6052 = new Integer(1596070772);
        Long term6055 = new Long(-8471550651709805183L);
        term6037 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term6054 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term6105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6110 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6140 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6037, term6037.getClass(), "id", term6038);
        setField(term6037, term6037.getClass(), "titulo", "JisaWUxcNb");
        setField(term6037, term6037.getClass(), "minutos", term6052);
        setField(term6054, term6054.getClass(), "id", term6055);
        setField(term6054, term6054.getClass(), "email", "NxgmYPzWCI");
        setField(term6054, term6054.getClass(), "nome", "SqjyKmayBx");
        setField(term6054, term6054.getClass(), "senha", "XjDhvToxJy");
        setField(term6054, term6054.getClass(), "perfilUsuario", "nxSTJflLQy");
        setIntField(term6106, term6106.getClass(), "year", 2022);
        setShortField(term6106, term6106.getClass(), "month", (short) 12);
        setShortField(term6106, term6106.getClass(), "day", (short) 22);
        setField(term6105, term6105.getClass(), "date", term6106);
        setByteField(term6110, term6110.getClass(), "hour", (byte) 18);
        setByteField(term6110, term6110.getClass(), "minute", (byte) 30);
        setByteField(term6110, term6110.getClass(), "second", (byte) 56);
        setIntField(term6110, term6110.getClass(), "nano", 111391416);
        setField(term6105, term6105.getClass(), "time", term6110);
        setField(term6054, term6054.getClass(), "dataCadastro", term6105);
        setIntField(term6116, term6116.getClass(), "year", 2019);
        setShortField(term6116, term6116.getClass(), "month", (short) 6);
        setShortField(term6116, term6116.getClass(), "day", (short) 22);
        setField(term6115, term6115.getClass(), "date", term6116);
        setByteField(term6120, term6120.getClass(), "hour", (byte) 9);
        setByteField(term6120, term6120.getClass(), "minute", (byte) 14);
        setByteField(term6120, term6120.getClass(), "second", (byte) 27);
        setIntField(term6120, term6120.getClass(), "nano", 124138657);
        setField(term6115, term6115.getClass(), "time", term6120);
        setField(term6054, term6054.getClass(), "dataAlteracao", term6115);
        setField(term6037, term6037.getClass(), "usuario", term6054);
        setIntField(term6126, term6126.getClass(), "year", 2023);
        setShortField(term6126, term6126.getClass(), "month", (short) 5);
        setShortField(term6126, term6126.getClass(), "day", (short) 8);
        setField(term6125, term6125.getClass(), "date", term6126);
        setByteField(term6130, term6130.getClass(), "hour", (byte) 6);
        setByteField(term6130, term6130.getClass(), "minute", (byte) 35);
        setByteField(term6130, term6130.getClass(), "second", (byte) 9);
        setIntField(term6130, term6130.getClass(), "nano", 577816079);
        setField(term6125, term6125.getClass(), "time", term6130);
        setField(term6037, term6037.getClass(), "dataCadastro", term6125);
        setIntField(term6136, term6136.getClass(), "year", 2019);
        setShortField(term6136, term6136.getClass(), "month", (short) 12);
        setShortField(term6136, term6136.getClass(), "day", (short) 13);
        setField(term6135, term6135.getClass(), "date", term6136);
        setByteField(term6140, term6140.getClass(), "hour", (byte) 7);
        setByteField(term6140, term6140.getClass(), "minute", (byte) 59);
        setByteField(term6140, term6140.getClass(), "second", (byte) 40);
        setIntField(term6140, term6140.getClass(), "nano", 824164134);
        setField(term6135, term6135.getClass(), "time", term6140);
        setField(term6037, term6037.getClass(), "dataAlteracao", term6135);
        Long term6146 = new Long(-948292411727204525L);
        term6145 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term6196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6211 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6145, term6145.getClass(), "id", term6146);
        setField(term6145, term6145.getClass(), "email", "FlHzxEfFzI");
        setField(term6145, term6145.getClass(), "nome", "aSATgQUpoe");
        setField(term6145, term6145.getClass(), "senha", "VkPSXewZfB");
        setField(term6145, term6145.getClass(), "perfilUsuario", "ubodzJoMGW");
        setIntField(term6197, term6197.getClass(), "year", 2013);
        setShortField(term6197, term6197.getClass(), "month", (short) 6);
        setShortField(term6197, term6197.getClass(), "day", (short) 29);
        setField(term6196, term6196.getClass(), "date", term6197);
        setByteField(term6201, term6201.getClass(), "hour", (byte) 22);
        setByteField(term6201, term6201.getClass(), "minute", (byte) 31);
        setByteField(term6201, term6201.getClass(), "second", (byte) 28);
        setIntField(term6201, term6201.getClass(), "nano", 930397670);
        setField(term6196, term6196.getClass(), "time", term6201);
        setField(term6145, term6145.getClass(), "dataCadastro", term6196);
        setIntField(term6207, term6207.getClass(), "year", 2020);
        setShortField(term6207, term6207.getClass(), "month", (short) 5);
        setShortField(term6207, term6207.getClass(), "day", (short) 8);
        setField(term6206, term6206.getClass(), "date", term6207);
        setByteField(term6211, term6211.getClass(), "hour", (byte) 14);
        setByteField(term6211, term6211.getClass(), "minute", (byte) 28);
        setByteField(term6211, term6211.getClass(), "second", (byte) 38);
        setIntField(term6211, term6211.getClass(), "nano", 93855882);
        setField(term6206, term6206.getClass(), "time", term6211);
        setField(term6145, term6145.getClass(), "dataAlteracao", term6206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Usuario");
        Object[] args = new Object[1];
        args[0] = term6145;
        callMethod(klass, "setUsuario", argTypes, term6037, args);
    }

};


