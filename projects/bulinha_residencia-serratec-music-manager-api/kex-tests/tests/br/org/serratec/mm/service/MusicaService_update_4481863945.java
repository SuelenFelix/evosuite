package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class MusicaService_update_4481863945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1102;
     Object term1104;

    public MusicaService_update_4481863945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1102 = new Long(6855071767938501807L);
        Long term1105 = new Long(-5892135042702373494L);
        Integer term1119 = new Integer(1134449235);
        Long term1122 = new Long(5262507301787091109L);
        term1104 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term1121 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1187 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1197 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1207 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1104, term1104.getClass(), "id", term1105);
        setField(term1104, term1104.getClass(), "titulo", "OWDIEULEFu");
        setField(term1104, term1104.getClass(), "minutos", term1119);
        setField(term1121, term1121.getClass(), "id", term1122);
        setField(term1121, term1121.getClass(), "email", "dWRymuLBtr");
        setField(term1121, term1121.getClass(), "nome", "AijpHYOFuy");
        setField(term1121, term1121.getClass(), "senha", "SbAoxhfrkn");
        setField(term1121, term1121.getClass(), "perfilUsuario", "kuTXqwMtDB");
        setIntField(term1173, term1173.getClass(), "year", 2022);
        setShortField(term1173, term1173.getClass(), "month", (short) 2);
        setShortField(term1173, term1173.getClass(), "day", (short) 26);
        setField(term1172, term1172.getClass(), "date", term1173);
        setByteField(term1177, term1177.getClass(), "hour", (byte) 11);
        setByteField(term1177, term1177.getClass(), "minute", (byte) 42);
        setByteField(term1177, term1177.getClass(), "second", (byte) 15);
        setIntField(term1177, term1177.getClass(), "nano", 377731937);
        setField(term1172, term1172.getClass(), "time", term1177);
        setField(term1121, term1121.getClass(), "dataCadastro", term1172);
        setIntField(term1183, term1183.getClass(), "year", 2026);
        setShortField(term1183, term1183.getClass(), "month", (short) 12);
        setShortField(term1183, term1183.getClass(), "day", (short) 14);
        setField(term1182, term1182.getClass(), "date", term1183);
        setByteField(term1187, term1187.getClass(), "hour", (byte) 16);
        setByteField(term1187, term1187.getClass(), "minute", (byte) 34);
        setByteField(term1187, term1187.getClass(), "second", (byte) 9);
        setIntField(term1187, term1187.getClass(), "nano", 518326996);
        setField(term1182, term1182.getClass(), "time", term1187);
        setField(term1121, term1121.getClass(), "dataAlteracao", term1182);
        setField(term1104, term1104.getClass(), "usuario", term1121);
        setIntField(term1193, term1193.getClass(), "year", 2025);
        setShortField(term1193, term1193.getClass(), "month", (short) 4);
        setShortField(term1193, term1193.getClass(), "day", (short) 24);
        setField(term1192, term1192.getClass(), "date", term1193);
        setByteField(term1197, term1197.getClass(), "hour", (byte) 18);
        setByteField(term1197, term1197.getClass(), "minute", (byte) 11);
        setByteField(term1197, term1197.getClass(), "second", (byte) 40);
        setIntField(term1197, term1197.getClass(), "nano", 137454929);
        setField(term1192, term1192.getClass(), "time", term1197);
        setField(term1104, term1104.getClass(), "dataCadastro", term1192);
        setIntField(term1203, term1203.getClass(), "year", 2024);
        setShortField(term1203, term1203.getClass(), "month", (short) 1);
        setShortField(term1203, term1203.getClass(), "day", (short) 24);
        setField(term1202, term1202.getClass(), "date", term1203);
        setByteField(term1207, term1207.getClass(), "hour", (byte) 20);
        setByteField(term1207, term1207.getClass(), "minute", (byte) 28);
        setByteField(term1207, term1207.getClass(), "second", (byte) 39);
        setIntField(term1207, term1207.getClass(), "nano", 952728177);
        setField(term1202, term1202.getClass(), "time", term1207);
        setField(term1104, term1104.getClass(), "dataAlteracao", term1202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.MusicaService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("br.org.serratec.mm.model.Musica");
        Object[] args = new Object[2];
        args[0] = term1102;
        args[1] = term1104;
        callMethod(klass, "update", argTypes, null, args);
    }

};


