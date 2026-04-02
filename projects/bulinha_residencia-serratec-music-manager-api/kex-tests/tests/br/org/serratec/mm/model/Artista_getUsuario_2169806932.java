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

public class Artista_getUsuario_2169806932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7563;

    public Artista_getUsuario_2169806932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7564 = new Long(-1677189124507026637L);
        Class<? extends Object> term7692 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term7691 = ((Class) term7692).getDeclaredField((String) "DUPLA");
        ((Field) term7691).setAccessible(true);
        Object enum1 = ((Field) term7691).get((Object) null);
        Long term7591 = new Long(4795660804170399986L);
        term7563 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term7590 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term7641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7676 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7563, term7563.getClass(), "id", term7564);
        setField(term7563, term7563.getClass(), "nome", "wwAwLLcLPp");
        setField(term7563, term7563.getClass(), "tipo", enum1);
        setField(term7590, term7590.getClass(), "id", term7591);
        setField(term7590, term7590.getClass(), "email", "nHpMKOmlpQ");
        setField(term7590, term7590.getClass(), "nome", "fKhrQsJToZ");
        setField(term7590, term7590.getClass(), "senha", "wsysQLGFnl");
        setField(term7590, term7590.getClass(), "perfilUsuario", "ckQLZGFjMX");
        setIntField(term7642, term7642.getClass(), "year", 2021);
        setShortField(term7642, term7642.getClass(), "month", (short) 11);
        setShortField(term7642, term7642.getClass(), "day", (short) 19);
        setField(term7641, term7641.getClass(), "date", term7642);
        setByteField(term7646, term7646.getClass(), "hour", (byte) 4);
        setByteField(term7646, term7646.getClass(), "minute", (byte) 39);
        setByteField(term7646, term7646.getClass(), "second", (byte) 43);
        setIntField(term7646, term7646.getClass(), "nano", 638695514);
        setField(term7641, term7641.getClass(), "time", term7646);
        setField(term7590, term7590.getClass(), "dataCadastro", term7641);
        setIntField(term7652, term7652.getClass(), "year", 2015);
        setShortField(term7652, term7652.getClass(), "month", (short) 10);
        setShortField(term7652, term7652.getClass(), "day", (short) 4);
        setField(term7651, term7651.getClass(), "date", term7652);
        setByteField(term7656, term7656.getClass(), "hour", (byte) 1);
        setByteField(term7656, term7656.getClass(), "minute", (byte) 29);
        setByteField(term7656, term7656.getClass(), "second", (byte) 20);
        setIntField(term7656, term7656.getClass(), "nano", 558273892);
        setField(term7651, term7651.getClass(), "time", term7656);
        setField(term7590, term7590.getClass(), "dataAlteracao", term7651);
        setField(term7563, term7563.getClass(), "usuario", term7590);
        setIntField(term7662, term7662.getClass(), "year", 2029);
        setShortField(term7662, term7662.getClass(), "month", (short) 1);
        setShortField(term7662, term7662.getClass(), "day", (short) 15);
        setField(term7661, term7661.getClass(), "date", term7662);
        setByteField(term7666, term7666.getClass(), "hour", (byte) 1);
        setByteField(term7666, term7666.getClass(), "minute", (byte) 39);
        setByteField(term7666, term7666.getClass(), "second", (byte) 40);
        setIntField(term7666, term7666.getClass(), "nano", 99482694);
        setField(term7661, term7661.getClass(), "time", term7666);
        setField(term7563, term7563.getClass(), "dataCadastro", term7661);
        setIntField(term7672, term7672.getClass(), "year", 2025);
        setShortField(term7672, term7672.getClass(), "month", (short) 2);
        setShortField(term7672, term7672.getClass(), "day", (short) 11);
        setField(term7671, term7671.getClass(), "date", term7672);
        setByteField(term7676, term7676.getClass(), "hour", (byte) 15);
        setByteField(term7676, term7676.getClass(), "minute", (byte) 46);
        setByteField(term7676, term7676.getClass(), "second", (byte) 31);
        setIntField(term7676, term7676.getClass(), "nano", 989587730);
        setField(term7671, term7671.getClass(), "time", term7676);
        setField(term7563, term7563.getClass(), "dataAlteracao", term7671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsuario", argTypes, term7563, args);
    }

};


