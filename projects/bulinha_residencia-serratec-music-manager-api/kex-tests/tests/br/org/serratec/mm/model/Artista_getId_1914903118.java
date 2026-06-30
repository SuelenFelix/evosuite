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

public class Artista_getId_1914903118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9910;

    public Artista_getId_1914903118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9911 = new Long(4394651392080968777L);
        Class<? extends Object> term10038 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term10037 = ((Class) term10038).getDeclaredField((String) "SOLO");
        ((Field) term10037).setAccessible(true);
        Object enum7 = ((Field) term10037).get((Object) null);
        Long term9937 = new Long(-7310273014364148916L);
        term9910 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term9936 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term9987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10002 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10022 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9910, term9910.getClass(), "id", term9911);
        setField(term9910, term9910.getClass(), "nome", "VoghngXfsK");
        setField(term9910, term9910.getClass(), "tipo", enum7);
        setField(term9936, term9936.getClass(), "id", term9937);
        setField(term9936, term9936.getClass(), "email", "GbahCBMvct");
        setField(term9936, term9936.getClass(), "nome", "iiHBhsNFgk");
        setField(term9936, term9936.getClass(), "senha", "HknsTajwxJ");
        setField(term9936, term9936.getClass(), "perfilUsuario", "XtiurrVYKw");
        setIntField(term9988, term9988.getClass(), "year", 2025);
        setShortField(term9988, term9988.getClass(), "month", (short) 8);
        setShortField(term9988, term9988.getClass(), "day", (short) 18);
        setField(term9987, term9987.getClass(), "date", term9988);
        setByteField(term9992, term9992.getClass(), "hour", (byte) 11);
        setByteField(term9992, term9992.getClass(), "minute", (byte) 28);
        setByteField(term9992, term9992.getClass(), "second", (byte) 28);
        setIntField(term9992, term9992.getClass(), "nano", 32159081);
        setField(term9987, term9987.getClass(), "time", term9992);
        setField(term9936, term9936.getClass(), "dataCadastro", term9987);
        setIntField(term9998, term9998.getClass(), "year", 2026);
        setShortField(term9998, term9998.getClass(), "month", (short) 5);
        setShortField(term9998, term9998.getClass(), "day", (short) 14);
        setField(term9997, term9997.getClass(), "date", term9998);
        setByteField(term10002, term10002.getClass(), "hour", (byte) 3);
        setByteField(term10002, term10002.getClass(), "minute", (byte) 43);
        setByteField(term10002, term10002.getClass(), "second", (byte) 41);
        setIntField(term10002, term10002.getClass(), "nano", 519970122);
        setField(term9997, term9997.getClass(), "time", term10002);
        setField(term9936, term9936.getClass(), "dataAlteracao", term9997);
        setField(term9910, term9910.getClass(), "usuario", term9936);
        setIntField(term10008, term10008.getClass(), "year", 2013);
        setShortField(term10008, term10008.getClass(), "month", (short) 1);
        setShortField(term10008, term10008.getClass(), "day", (short) 1);
        setField(term10007, term10007.getClass(), "date", term10008);
        setByteField(term10012, term10012.getClass(), "hour", (byte) 17);
        setByteField(term10012, term10012.getClass(), "minute", (byte) 16);
        setByteField(term10012, term10012.getClass(), "second", (byte) 19);
        setIntField(term10012, term10012.getClass(), "nano", 656333309);
        setField(term10007, term10007.getClass(), "time", term10012);
        setField(term9910, term9910.getClass(), "dataCadastro", term10007);
        setIntField(term10018, term10018.getClass(), "year", 2012);
        setShortField(term10018, term10018.getClass(), "month", (short) 3);
        setShortField(term10018, term10018.getClass(), "day", (short) 8);
        setField(term10017, term10017.getClass(), "date", term10018);
        setByteField(term10022, term10022.getClass(), "hour", (byte) 18);
        setByteField(term10022, term10022.getClass(), "minute", (byte) 5);
        setByteField(term10022, term10022.getClass(), "second", (byte) 29);
        setIntField(term10022, term10022.getClass(), "nano", 800260160);
        setField(term10017, term10017.getClass(), "time", term10022);
        setField(term9910, term9910.getClass(), "dataAlteracao", term10017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term9910, args);
    }

};


