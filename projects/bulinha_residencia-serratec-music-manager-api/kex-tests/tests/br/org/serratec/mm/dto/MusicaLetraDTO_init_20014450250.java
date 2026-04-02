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

public class MusicaLetraDTO_init_20014450250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;

    public MusicaLetraDTO_init_20014450250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1232 = new Long(2442117782898005296L);
        Integer term1246 = new Integer(568599855);
        Long term1249 = new Long(6375119433582206027L);
        term1231 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term1248 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1334 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1231, term1231.getClass(), "id", term1232);
        setField(term1231, term1231.getClass(), "titulo", "YRHGsAkhxb");
        setField(term1231, term1231.getClass(), "minutos", term1246);
        setField(term1248, term1248.getClass(), "id", term1249);
        setField(term1248, term1248.getClass(), "email", "ffYhPOzlUs");
        setField(term1248, term1248.getClass(), "nome", "MLqYREekMl");
        setField(term1248, term1248.getClass(), "senha", "ytSBIKXogI");
        setField(term1248, term1248.getClass(), "perfilUsuario", "nHXjMycHlU");
        setIntField(term1300, term1300.getClass(), "year", 2012);
        setShortField(term1300, term1300.getClass(), "month", (short) 8);
        setShortField(term1300, term1300.getClass(), "day", (short) 25);
        setField(term1299, term1299.getClass(), "date", term1300);
        setByteField(term1304, term1304.getClass(), "hour", (byte) 5);
        setByteField(term1304, term1304.getClass(), "minute", (byte) 20);
        setByteField(term1304, term1304.getClass(), "second", (byte) 50);
        setIntField(term1304, term1304.getClass(), "nano", 345595912);
        setField(term1299, term1299.getClass(), "time", term1304);
        setField(term1248, term1248.getClass(), "dataCadastro", term1299);
        setIntField(term1310, term1310.getClass(), "year", 2021);
        setShortField(term1310, term1310.getClass(), "month", (short) 1);
        setShortField(term1310, term1310.getClass(), "day", (short) 18);
        setField(term1309, term1309.getClass(), "date", term1310);
        setByteField(term1314, term1314.getClass(), "hour", (byte) 13);
        setByteField(term1314, term1314.getClass(), "minute", (byte) 38);
        setByteField(term1314, term1314.getClass(), "second", (byte) 26);
        setIntField(term1314, term1314.getClass(), "nano", 544608644);
        setField(term1309, term1309.getClass(), "time", term1314);
        setField(term1248, term1248.getClass(), "dataAlteracao", term1309);
        setField(term1231, term1231.getClass(), "usuario", term1248);
        setIntField(term1320, term1320.getClass(), "year", 2015);
        setShortField(term1320, term1320.getClass(), "month", (short) 9);
        setShortField(term1320, term1320.getClass(), "day", (short) 19);
        setField(term1319, term1319.getClass(), "date", term1320);
        setByteField(term1324, term1324.getClass(), "hour", (byte) 9);
        setByteField(term1324, term1324.getClass(), "minute", (byte) 4);
        setByteField(term1324, term1324.getClass(), "second", (byte) 10);
        setIntField(term1324, term1324.getClass(), "nano", 401765865);
        setField(term1319, term1319.getClass(), "time", term1324);
        setField(term1231, term1231.getClass(), "dataCadastro", term1319);
        setIntField(term1330, term1330.getClass(), "year", 2015);
        setShortField(term1330, term1330.getClass(), "month", (short) 4);
        setShortField(term1330, term1330.getClass(), "day", (short) 14);
        setField(term1329, term1329.getClass(), "date", term1330);
        setByteField(term1334, term1334.getClass(), "hour", (byte) 18);
        setByteField(term1334, term1334.getClass(), "minute", (byte) 24);
        setByteField(term1334, term1334.getClass(), "second", (byte) 32);
        setIntField(term1334, term1334.getClass(), "nano", 369233818);
        setField(term1329, term1329.getClass(), "time", term1334);
        setField(term1231, term1231.getClass(), "dataAlteracao", term1329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Musica");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1231;
        args[1] = "ieCtQFdkii";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


