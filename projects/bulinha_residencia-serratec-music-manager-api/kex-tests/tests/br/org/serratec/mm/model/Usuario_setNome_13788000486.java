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

public class Usuario_setNome_13788000486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580;

    public Usuario_setNome_13788000486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term581 = new Long(4872422362414183754L);
        term580 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term646 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term580, term580.getClass(), "id", term581);
        setField(term580, term580.getClass(), "email", "RkybSrpybU");
        setField(term580, term580.getClass(), "nome", "xOEqzGAmDU");
        setField(term580, term580.getClass(), "senha", "eZFUvlxvGV");
        setField(term580, term580.getClass(), "perfilUsuario", "BYqFIqCKAV");
        setIntField(term632, term632.getClass(), "year", 2019);
        setShortField(term632, term632.getClass(), "month", (short) 2);
        setShortField(term632, term632.getClass(), "day", (short) 21);
        setField(term631, term631.getClass(), "date", term632);
        setByteField(term636, term636.getClass(), "hour", (byte) 5);
        setByteField(term636, term636.getClass(), "minute", (byte) 41);
        setByteField(term636, term636.getClass(), "second", (byte) 11);
        setIntField(term636, term636.getClass(), "nano", 859829782);
        setField(term631, term631.getClass(), "time", term636);
        setField(term580, term580.getClass(), "dataCadastro", term631);
        setIntField(term642, term642.getClass(), "year", 2018);
        setShortField(term642, term642.getClass(), "month", (short) 9);
        setShortField(term642, term642.getClass(), "day", (short) 28);
        setField(term641, term641.getClass(), "date", term642);
        setByteField(term646, term646.getClass(), "hour", (byte) 3);
        setByteField(term646, term646.getClass(), "minute", (byte) 37);
        setByteField(term646, term646.getClass(), "second", (byte) 46);
        setIntField(term646, term646.getClass(), "nano", 763326845);
        setField(term641, term641.getClass(), "time", term646);
        setField(term580, term580.getClass(), "dataAlteracao", term641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setNome", argTypes, term580, args);
    }

};


