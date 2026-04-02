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

public class Artista_setDataAlteracao_12526109857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9530;
     Object term9648;

    public Artista_setDataAlteracao_12526109857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9531 = new Long(5973526439563541711L);
        Class<? extends Object> term9669 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term9668 = ((Class) term9669).getDeclaredField((String) "DUPLA");
        ((Field) term9668).setAccessible(true);
        Object enum6 = ((Field) term9668).get((Object) null);
        Long term9558 = new Long(5246058710498845622L);
        term9530 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term9557 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term9608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9623 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9633 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9643 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9530, term9530.getClass(), "id", term9531);
        setField(term9530, term9530.getClass(), "nome", "OirVUQhauU");
        setField(term9530, term9530.getClass(), "tipo", enum6);
        setField(term9557, term9557.getClass(), "id", term9558);
        setField(term9557, term9557.getClass(), "email", "GLbyDfbNZI");
        setField(term9557, term9557.getClass(), "nome", "oNLcCYDAsO");
        setField(term9557, term9557.getClass(), "senha", "CNqMxLvtcJ");
        setField(term9557, term9557.getClass(), "perfilUsuario", "ktbqerIaKW");
        setIntField(term9609, term9609.getClass(), "year", 2012);
        setShortField(term9609, term9609.getClass(), "month", (short) 10);
        setShortField(term9609, term9609.getClass(), "day", (short) 26);
        setField(term9608, term9608.getClass(), "date", term9609);
        setByteField(term9613, term9613.getClass(), "hour", (byte) 13);
        setByteField(term9613, term9613.getClass(), "minute", (byte) 50);
        setByteField(term9613, term9613.getClass(), "second", (byte) 34);
        setIntField(term9613, term9613.getClass(), "nano", 738625041);
        setField(term9608, term9608.getClass(), "time", term9613);
        setField(term9557, term9557.getClass(), "dataCadastro", term9608);
        setIntField(term9619, term9619.getClass(), "year", 2012);
        setShortField(term9619, term9619.getClass(), "month", (short) 7);
        setShortField(term9619, term9619.getClass(), "day", (short) 6);
        setField(term9618, term9618.getClass(), "date", term9619);
        setByteField(term9623, term9623.getClass(), "hour", (byte) 0);
        setByteField(term9623, term9623.getClass(), "minute", (byte) 48);
        setByteField(term9623, term9623.getClass(), "second", (byte) 16);
        setIntField(term9623, term9623.getClass(), "nano", 235139356);
        setField(term9618, term9618.getClass(), "time", term9623);
        setField(term9557, term9557.getClass(), "dataAlteracao", term9618);
        setField(term9530, term9530.getClass(), "usuario", term9557);
        setIntField(term9629, term9629.getClass(), "year", 2023);
        setShortField(term9629, term9629.getClass(), "month", (short) 2);
        setShortField(term9629, term9629.getClass(), "day", (short) 6);
        setField(term9628, term9628.getClass(), "date", term9629);
        setByteField(term9633, term9633.getClass(), "hour", (byte) 3);
        setByteField(term9633, term9633.getClass(), "minute", (byte) 1);
        setByteField(term9633, term9633.getClass(), "second", (byte) 52);
        setIntField(term9633, term9633.getClass(), "nano", 345404097);
        setField(term9628, term9628.getClass(), "time", term9633);
        setField(term9530, term9530.getClass(), "dataCadastro", term9628);
        setIntField(term9639, term9639.getClass(), "year", 2017);
        setShortField(term9639, term9639.getClass(), "month", (short) 2);
        setShortField(term9639, term9639.getClass(), "day", (short) 28);
        setField(term9638, term9638.getClass(), "date", term9639);
        setByteField(term9643, term9643.getClass(), "hour", (byte) 16);
        setByteField(term9643, term9643.getClass(), "minute", (byte) 54);
        setByteField(term9643, term9643.getClass(), "second", (byte) 4);
        setIntField(term9643, term9643.getClass(), "nano", 721722853);
        setField(term9638, term9638.getClass(), "time", term9643);
        setField(term9530, term9530.getClass(), "dataAlteracao", term9638);
        term9648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9653 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9649, term9649.getClass(), "year", 2018);
        setShortField(term9649, term9649.getClass(), "month", (short) 8);
        setShortField(term9649, term9649.getClass(), "day", (short) 4);
        setField(term9648, term9648.getClass(), "date", term9649);
        setByteField(term9653, term9653.getClass(), "hour", (byte) 8);
        setByteField(term9653, term9653.getClass(), "minute", (byte) 15);
        setByteField(term9653, term9653.getClass(), "second", (byte) 15);
        setIntField(term9653, term9653.getClass(), "nano", 116834692);
        setField(term9648, term9648.getClass(), "time", term9653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9648;
        callMethod(klass, "setDataAlteracao", argTypes, term9530, args);
    }

};


