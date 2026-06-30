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

public class Usuario_setDataCadastro_108988024212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312;
     Object term1383;

    public Usuario_setDataCadastro_108988024212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1313 = new Long(-4325723315152823407L);
        term1312 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1378 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1312, term1312.getClass(), "id", term1313);
        setField(term1312, term1312.getClass(), "email", "xLbjWUgOIL");
        setField(term1312, term1312.getClass(), "nome", "jDtqGUpnZN");
        setField(term1312, term1312.getClass(), "senha", "nGKItKLYNC");
        setField(term1312, term1312.getClass(), "perfilUsuario", "UiUYnPrcCi");
        setIntField(term1364, term1364.getClass(), "year", 2015);
        setShortField(term1364, term1364.getClass(), "month", (short) 3);
        setShortField(term1364, term1364.getClass(), "day", (short) 10);
        setField(term1363, term1363.getClass(), "date", term1364);
        setByteField(term1368, term1368.getClass(), "hour", (byte) 23);
        setByteField(term1368, term1368.getClass(), "minute", (byte) 34);
        setByteField(term1368, term1368.getClass(), "second", (byte) 44);
        setIntField(term1368, term1368.getClass(), "nano", 587322824);
        setField(term1363, term1363.getClass(), "time", term1368);
        setField(term1312, term1312.getClass(), "dataCadastro", term1363);
        setIntField(term1374, term1374.getClass(), "year", 2027);
        setShortField(term1374, term1374.getClass(), "month", (short) 8);
        setShortField(term1374, term1374.getClass(), "day", (short) 26);
        setField(term1373, term1373.getClass(), "date", term1374);
        setByteField(term1378, term1378.getClass(), "hour", (byte) 5);
        setByteField(term1378, term1378.getClass(), "minute", (byte) 11);
        setByteField(term1378, term1378.getClass(), "second", (byte) 9);
        setIntField(term1378, term1378.getClass(), "nano", 219245092);
        setField(term1373, term1373.getClass(), "time", term1378);
        setField(term1312, term1312.getClass(), "dataAlteracao", term1373);
        term1383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1388 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1384, term1384.getClass(), "year", 2025);
        setShortField(term1384, term1384.getClass(), "month", (short) 3);
        setShortField(term1384, term1384.getClass(), "day", (short) 9);
        setField(term1383, term1383.getClass(), "date", term1384);
        setByteField(term1388, term1388.getClass(), "hour", (byte) 5);
        setByteField(term1388, term1388.getClass(), "minute", (byte) 49);
        setByteField(term1388, term1388.getClass(), "second", (byte) 12);
        setIntField(term1388, term1388.getClass(), "nano", 791695028);
        setField(term1383, term1383.getClass(), "time", term1388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1383;
        callMethod(klass, "setDataCadastro", argTypes, term1312, args);
    }

};


