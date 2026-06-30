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

public class Artista_equals_33202522215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12718;
     Object term12836;

    public Artista_equals_33202522215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12719 = new Long(-8338004844694486146L);
        Class<? extends Object> term12848 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term12847 = ((Class) term12848).getDeclaredField((String) "BANDA");
        ((Field) term12847).setAccessible(true);
        Object enum15 = ((Field) term12847).get((Object) null);
        Long term12746 = new Long(6426732259596412988L);
        term12718 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term12745 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term12796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12831 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12718, term12718.getClass(), "id", term12719);
        setField(term12718, term12718.getClass(), "nome", "zHvfKaOstO");
        setField(term12718, term12718.getClass(), "tipo", enum15);
        setField(term12745, term12745.getClass(), "id", term12746);
        setField(term12745, term12745.getClass(), "email", "tOszriqETr");
        setField(term12745, term12745.getClass(), "nome", "ncSPTkhKjO");
        setField(term12745, term12745.getClass(), "senha", "jcWKHRWhyj");
        setField(term12745, term12745.getClass(), "perfilUsuario", "nrQjODRMLD");
        setIntField(term12797, term12797.getClass(), "year", 2015);
        setShortField(term12797, term12797.getClass(), "month", (short) 11);
        setShortField(term12797, term12797.getClass(), "day", (short) 6);
        setField(term12796, term12796.getClass(), "date", term12797);
        setByteField(term12801, term12801.getClass(), "hour", (byte) 5);
        setByteField(term12801, term12801.getClass(), "minute", (byte) 30);
        setByteField(term12801, term12801.getClass(), "second", (byte) 37);
        setIntField(term12801, term12801.getClass(), "nano", 396534729);
        setField(term12796, term12796.getClass(), "time", term12801);
        setField(term12745, term12745.getClass(), "dataCadastro", term12796);
        setIntField(term12807, term12807.getClass(), "year", 2013);
        setShortField(term12807, term12807.getClass(), "month", (short) 1);
        setShortField(term12807, term12807.getClass(), "day", (short) 4);
        setField(term12806, term12806.getClass(), "date", term12807);
        setByteField(term12811, term12811.getClass(), "hour", (byte) 22);
        setByteField(term12811, term12811.getClass(), "minute", (byte) 8);
        setByteField(term12811, term12811.getClass(), "second", (byte) 55);
        setIntField(term12811, term12811.getClass(), "nano", 284915768);
        setField(term12806, term12806.getClass(), "time", term12811);
        setField(term12745, term12745.getClass(), "dataAlteracao", term12806);
        setField(term12718, term12718.getClass(), "usuario", term12745);
        setIntField(term12817, term12817.getClass(), "year", 2020);
        setShortField(term12817, term12817.getClass(), "month", (short) 5);
        setShortField(term12817, term12817.getClass(), "day", (short) 25);
        setField(term12816, term12816.getClass(), "date", term12817);
        setByteField(term12821, term12821.getClass(), "hour", (byte) 4);
        setByteField(term12821, term12821.getClass(), "minute", (byte) 20);
        setByteField(term12821, term12821.getClass(), "second", (byte) 39);
        setIntField(term12821, term12821.getClass(), "nano", 382102366);
        setField(term12816, term12816.getClass(), "time", term12821);
        setField(term12718, term12718.getClass(), "dataCadastro", term12816);
        setIntField(term12827, term12827.getClass(), "year", 2023);
        setShortField(term12827, term12827.getClass(), "month", (short) 3);
        setShortField(term12827, term12827.getClass(), "day", (short) 4);
        setField(term12826, term12826.getClass(), "date", term12827);
        setByteField(term12831, term12831.getClass(), "hour", (byte) 20);
        setByteField(term12831, term12831.getClass(), "minute", (byte) 17);
        setByteField(term12831, term12831.getClass(), "second", (byte) 33);
        setIntField(term12831, term12831.getClass(), "nano", 193707533);
        setField(term12826, term12826.getClass(), "time", term12831);
        setField(term12718, term12718.getClass(), "dataAlteracao", term12826);
        term12836 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12836;
        callMethod(klass, "equals", argTypes, term12718, args);
    }

};


