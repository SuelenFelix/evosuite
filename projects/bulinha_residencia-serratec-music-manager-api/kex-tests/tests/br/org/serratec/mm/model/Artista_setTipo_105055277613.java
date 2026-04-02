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

public class Artista_setTipo_105055277613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11768;
     Object enum13;

    public Artista_setTipo_105055277613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11769 = new Long(5330761990446327930L);
        Class<? extends Object> term11908 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term11907 = ((Class) term11908).getDeclaredField((String) "BANDA");
        ((Field) term11907).setAccessible(true);
        Object enum12 = ((Field) term11907).get((Object) null);
        Long term11796 = new Long(-3954795081650780841L);
        term11768 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term11795 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term11846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11871 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11881 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11768, term11768.getClass(), "id", term11769);
        setField(term11768, term11768.getClass(), "nome", "PbLgCSAHce");
        setField(term11768, term11768.getClass(), "tipo", enum12);
        setField(term11795, term11795.getClass(), "id", term11796);
        setField(term11795, term11795.getClass(), "email", "NWldOLAbqk");
        setField(term11795, term11795.getClass(), "nome", "qnYaYSpDwO");
        setField(term11795, term11795.getClass(), "senha", "dgbFDCdHtj");
        setField(term11795, term11795.getClass(), "perfilUsuario", "EKpdCBubDE");
        setIntField(term11847, term11847.getClass(), "year", 2017);
        setShortField(term11847, term11847.getClass(), "month", (short) 11);
        setShortField(term11847, term11847.getClass(), "day", (short) 17);
        setField(term11846, term11846.getClass(), "date", term11847);
        setByteField(term11851, term11851.getClass(), "hour", (byte) 8);
        setByteField(term11851, term11851.getClass(), "minute", (byte) 54);
        setByteField(term11851, term11851.getClass(), "second", (byte) 50);
        setIntField(term11851, term11851.getClass(), "nano", 819857135);
        setField(term11846, term11846.getClass(), "time", term11851);
        setField(term11795, term11795.getClass(), "dataCadastro", term11846);
        setIntField(term11857, term11857.getClass(), "year", 2020);
        setShortField(term11857, term11857.getClass(), "month", (short) 2);
        setShortField(term11857, term11857.getClass(), "day", (short) 27);
        setField(term11856, term11856.getClass(), "date", term11857);
        setByteField(term11861, term11861.getClass(), "hour", (byte) 21);
        setByteField(term11861, term11861.getClass(), "minute", (byte) 35);
        setByteField(term11861, term11861.getClass(), "second", (byte) 42);
        setIntField(term11861, term11861.getClass(), "nano", 887239335);
        setField(term11856, term11856.getClass(), "time", term11861);
        setField(term11795, term11795.getClass(), "dataAlteracao", term11856);
        setField(term11768, term11768.getClass(), "usuario", term11795);
        setIntField(term11867, term11867.getClass(), "year", 2018);
        setShortField(term11867, term11867.getClass(), "month", (short) 11);
        setShortField(term11867, term11867.getClass(), "day", (short) 23);
        setField(term11866, term11866.getClass(), "date", term11867);
        setByteField(term11871, term11871.getClass(), "hour", (byte) 15);
        setByteField(term11871, term11871.getClass(), "minute", (byte) 21);
        setByteField(term11871, term11871.getClass(), "second", (byte) 39);
        setIntField(term11871, term11871.getClass(), "nano", 255623386);
        setField(term11866, term11866.getClass(), "time", term11871);
        setField(term11768, term11768.getClass(), "dataCadastro", term11866);
        setIntField(term11877, term11877.getClass(), "year", 2016);
        setShortField(term11877, term11877.getClass(), "month", (short) 11);
        setShortField(term11877, term11877.getClass(), "day", (short) 8);
        setField(term11876, term11876.getClass(), "date", term11877);
        setByteField(term11881, term11881.getClass(), "hour", (byte) 7);
        setByteField(term11881, term11881.getClass(), "minute", (byte) 33);
        setByteField(term11881, term11881.getClass(), "second", (byte) 30);
        setIntField(term11881, term11881.getClass(), "nano", 274725601);
        setField(term11876, term11876.getClass(), "time", term11881);
        setField(term11768, term11768.getClass(), "dataAlteracao", term11876);
        Class<? extends Object> term12150 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term12149 = ((Class) term12150).getDeclaredField((String) "SOLO");
        ((Field) term12149).setAccessible(true);
        enum13 = ((Field) term12149).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.enums.TipoArtista");
        Object[] args = new Object[1];
        args[0] = enum13;
        callMethod(klass, "setTipo", argTypes, term11768, args);
    }

};


