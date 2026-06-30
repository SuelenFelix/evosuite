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

public class Artista_hashCode_11666145314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12348;

    public Artista_hashCode_11666145314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12349 = new Long(3288791194263207397L);
        Class<? extends Object> term12477 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term12476 = ((Class) term12477).getDeclaredField((String) "DUPLA");
        ((Field) term12476).setAccessible(true);
        Object enum14 = ((Field) term12476).get((Object) null);
        Long term12376 = new Long(3288941170644426558L);
        term12348 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term12375 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term12426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12431 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12441 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12451 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12456 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12461 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12348, term12348.getClass(), "id", term12349);
        setField(term12348, term12348.getClass(), "nome", "zMsSLTfGhl");
        setField(term12348, term12348.getClass(), "tipo", enum14);
        setField(term12375, term12375.getClass(), "id", term12376);
        setField(term12375, term12375.getClass(), "email", "bEmHScVZaQ");
        setField(term12375, term12375.getClass(), "nome", "TcuXODkzBV");
        setField(term12375, term12375.getClass(), "senha", "coJPjrBZNe");
        setField(term12375, term12375.getClass(), "perfilUsuario", "vMsWjuPTnO");
        setIntField(term12427, term12427.getClass(), "year", 2028);
        setShortField(term12427, term12427.getClass(), "month", (short) 4);
        setShortField(term12427, term12427.getClass(), "day", (short) 19);
        setField(term12426, term12426.getClass(), "date", term12427);
        setByteField(term12431, term12431.getClass(), "hour", (byte) 1);
        setByteField(term12431, term12431.getClass(), "minute", (byte) 47);
        setByteField(term12431, term12431.getClass(), "second", (byte) 52);
        setIntField(term12431, term12431.getClass(), "nano", 666536453);
        setField(term12426, term12426.getClass(), "time", term12431);
        setField(term12375, term12375.getClass(), "dataCadastro", term12426);
        setIntField(term12437, term12437.getClass(), "year", 2023);
        setShortField(term12437, term12437.getClass(), "month", (short) 12);
        setShortField(term12437, term12437.getClass(), "day", (short) 8);
        setField(term12436, term12436.getClass(), "date", term12437);
        setByteField(term12441, term12441.getClass(), "hour", (byte) 1);
        setByteField(term12441, term12441.getClass(), "minute", (byte) 26);
        setByteField(term12441, term12441.getClass(), "second", (byte) 38);
        setIntField(term12441, term12441.getClass(), "nano", 334721598);
        setField(term12436, term12436.getClass(), "time", term12441);
        setField(term12375, term12375.getClass(), "dataAlteracao", term12436);
        setField(term12348, term12348.getClass(), "usuario", term12375);
        setIntField(term12447, term12447.getClass(), "year", 2015);
        setShortField(term12447, term12447.getClass(), "month", (short) 5);
        setShortField(term12447, term12447.getClass(), "day", (short) 26);
        setField(term12446, term12446.getClass(), "date", term12447);
        setByteField(term12451, term12451.getClass(), "hour", (byte) 9);
        setByteField(term12451, term12451.getClass(), "minute", (byte) 34);
        setByteField(term12451, term12451.getClass(), "second", (byte) 10);
        setIntField(term12451, term12451.getClass(), "nano", 873043034);
        setField(term12446, term12446.getClass(), "time", term12451);
        setField(term12348, term12348.getClass(), "dataCadastro", term12446);
        setIntField(term12457, term12457.getClass(), "year", 2021);
        setShortField(term12457, term12457.getClass(), "month", (short) 11);
        setShortField(term12457, term12457.getClass(), "day", (short) 13);
        setField(term12456, term12456.getClass(), "date", term12457);
        setByteField(term12461, term12461.getClass(), "hour", (byte) 7);
        setByteField(term12461, term12461.getClass(), "minute", (byte) 27);
        setByteField(term12461, term12461.getClass(), "second", (byte) 1);
        setIntField(term12461, term12461.getClass(), "nano", 59611302);
        setField(term12456, term12456.getClass(), "time", term12461);
        setField(term12348, term12348.getClass(), "dataAlteracao", term12456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12348, args);
    }

};


