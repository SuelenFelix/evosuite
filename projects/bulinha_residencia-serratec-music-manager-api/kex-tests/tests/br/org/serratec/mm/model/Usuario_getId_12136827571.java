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

public class Usuario_getId_12136827571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Usuario_getId_12136827571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term52 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "nome", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "senha", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "perfilUsuario", "xxtlPwDYFs");
        setIntField(term53, term53.getClass(), "year", 2012);
        setShortField(term53, term53.getClass(), "month", (short) 8);
        setShortField(term53, term53.getClass(), "day", (short) 25);
        setField(term52, term52.getClass(), "date", term53);
        setByteField(term57, term57.getClass(), "hour", (byte) 5);
        setByteField(term57, term57.getClass(), "minute", (byte) 20);
        setByteField(term57, term57.getClass(), "second", (byte) 50);
        setIntField(term57, term57.getClass(), "nano", 345595912);
        setField(term52, term52.getClass(), "time", term57);
        setField(term1, term1.getClass(), "dataCadastro", term52);
        setIntField(term63, term63.getClass(), "year", 2021);
        setShortField(term63, term63.getClass(), "month", (short) 1);
        setShortField(term63, term63.getClass(), "day", (short) 18);
        setField(term62, term62.getClass(), "date", term63);
        setByteField(term67, term67.getClass(), "hour", (byte) 13);
        setByteField(term67, term67.getClass(), "minute", (byte) 38);
        setByteField(term67, term67.getClass(), "second", (byte) 26);
        setIntField(term67, term67.getClass(), "nano", 544608644);
        setField(term62, term62.getClass(), "time", term67);
        setField(term1, term1.getClass(), "dataAlteracao", term62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


