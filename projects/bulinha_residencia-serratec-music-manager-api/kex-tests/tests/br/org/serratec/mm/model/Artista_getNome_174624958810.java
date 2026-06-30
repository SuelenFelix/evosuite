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

public class Artista_getNome_174624958810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10644;

    public Artista_getNome_174624958810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10645 = new Long(8540994973773607992L);
        Class<? extends Object> term10772 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term10771 = ((Class) term10772).getDeclaredField((String) "SOLO");
        ((Field) term10771).setAccessible(true);
        Object enum9 = ((Field) term10771).get((Object) null);
        Long term10671 = new Long(-2338103433822116635L);
        term10644 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term10670 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term10721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10756 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10644, term10644.getClass(), "id", term10645);
        setField(term10644, term10644.getClass(), "nome", "BtvAvsJSei");
        setField(term10644, term10644.getClass(), "tipo", enum9);
        setField(term10670, term10670.getClass(), "id", term10671);
        setField(term10670, term10670.getClass(), "email", "vqnBkkxoIa");
        setField(term10670, term10670.getClass(), "nome", "bycpZjxXFn");
        setField(term10670, term10670.getClass(), "senha", "jQWttOAiwL");
        setField(term10670, term10670.getClass(), "perfilUsuario", "DzKFxEuEEC");
        setIntField(term10722, term10722.getClass(), "year", 2029);
        setShortField(term10722, term10722.getClass(), "month", (short) 10);
        setShortField(term10722, term10722.getClass(), "day", (short) 12);
        setField(term10721, term10721.getClass(), "date", term10722);
        setByteField(term10726, term10726.getClass(), "hour", (byte) 12);
        setByteField(term10726, term10726.getClass(), "minute", (byte) 8);
        setByteField(term10726, term10726.getClass(), "second", (byte) 27);
        setIntField(term10726, term10726.getClass(), "nano", 729635487);
        setField(term10721, term10721.getClass(), "time", term10726);
        setField(term10670, term10670.getClass(), "dataCadastro", term10721);
        setIntField(term10732, term10732.getClass(), "year", 2015);
        setShortField(term10732, term10732.getClass(), "month", (short) 3);
        setShortField(term10732, term10732.getClass(), "day", (short) 29);
        setField(term10731, term10731.getClass(), "date", term10732);
        setByteField(term10736, term10736.getClass(), "hour", (byte) 23);
        setByteField(term10736, term10736.getClass(), "minute", (byte) 1);
        setByteField(term10736, term10736.getClass(), "second", (byte) 57);
        setIntField(term10736, term10736.getClass(), "nano", 425020447);
        setField(term10731, term10731.getClass(), "time", term10736);
        setField(term10670, term10670.getClass(), "dataAlteracao", term10731);
        setField(term10644, term10644.getClass(), "usuario", term10670);
        setIntField(term10742, term10742.getClass(), "year", 2025);
        setShortField(term10742, term10742.getClass(), "month", (short) 8);
        setShortField(term10742, term10742.getClass(), "day", (short) 4);
        setField(term10741, term10741.getClass(), "date", term10742);
        setByteField(term10746, term10746.getClass(), "hour", (byte) 7);
        setByteField(term10746, term10746.getClass(), "minute", (byte) 29);
        setByteField(term10746, term10746.getClass(), "second", (byte) 4);
        setIntField(term10746, term10746.getClass(), "nano", 175288511);
        setField(term10741, term10741.getClass(), "time", term10746);
        setField(term10644, term10644.getClass(), "dataCadastro", term10741);
        setIntField(term10752, term10752.getClass(), "year", 2029);
        setShortField(term10752, term10752.getClass(), "month", (short) 9);
        setShortField(term10752, term10752.getClass(), "day", (short) 1);
        setField(term10751, term10751.getClass(), "date", term10752);
        setByteField(term10756, term10756.getClass(), "hour", (byte) 19);
        setByteField(term10756, term10756.getClass(), "minute", (byte) 56);
        setByteField(term10756, term10756.getClass(), "second", (byte) 46);
        setIntField(term10756, term10756.getClass(), "nano", 657110114);
        setField(term10751, term10751.getClass(), "time", term10756);
        setField(term10644, term10644.getClass(), "dataAlteracao", term10751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term10644, args);
    }

};


