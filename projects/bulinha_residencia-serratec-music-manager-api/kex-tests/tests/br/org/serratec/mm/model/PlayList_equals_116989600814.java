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
import java.util.ArrayList;
import java.lang.Object;

public class PlayList_equals_116989600814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4703;
     Object term4813;

    public PlayList_equals_116989600814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4704 = new Long(-4598158870068953328L);
        ArrayList term4718 = new ArrayList();
        Long term4723 = new Long(138235087558060686L);
        term4703 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        Object term4722 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term4773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4798 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4808 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4703, term4703.getClass(), "id", term4704);
        setField(term4703, term4703.getClass(), "nome", "IkpjUOuWQU");
        setField(term4703, term4703.getClass(), "musicas", term4718);
        setField(term4722, term4722.getClass(), "id", term4723);
        setField(term4722, term4722.getClass(), "email", "boSSpezHeU");
        setField(term4722, term4722.getClass(), "nome", "OUeBWNTQDh");
        setField(term4722, term4722.getClass(), "senha", "gltJarNuUk");
        setField(term4722, term4722.getClass(), "perfilUsuario", "ZwZIDwYcSW");
        setIntField(term4774, term4774.getClass(), "year", 2022);
        setShortField(term4774, term4774.getClass(), "month", (short) 5);
        setShortField(term4774, term4774.getClass(), "day", (short) 28);
        setField(term4773, term4773.getClass(), "date", term4774);
        setByteField(term4778, term4778.getClass(), "hour", (byte) 20);
        setByteField(term4778, term4778.getClass(), "minute", (byte) 42);
        setByteField(term4778, term4778.getClass(), "second", (byte) 20);
        setIntField(term4778, term4778.getClass(), "nano", 528388661);
        setField(term4773, term4773.getClass(), "time", term4778);
        setField(term4722, term4722.getClass(), "dataCadastro", term4773);
        setIntField(term4784, term4784.getClass(), "year", 2029);
        setShortField(term4784, term4784.getClass(), "month", (short) 5);
        setShortField(term4784, term4784.getClass(), "day", (short) 12);
        setField(term4783, term4783.getClass(), "date", term4784);
        setByteField(term4788, term4788.getClass(), "hour", (byte) 23);
        setByteField(term4788, term4788.getClass(), "minute", (byte) 20);
        setByteField(term4788, term4788.getClass(), "second", (byte) 4);
        setIntField(term4788, term4788.getClass(), "nano", 378307890);
        setField(term4783, term4783.getClass(), "time", term4788);
        setField(term4722, term4722.getClass(), "dataAlteracao", term4783);
        setField(term4703, term4703.getClass(), "usuario", term4722);
        setIntField(term4794, term4794.getClass(), "year", 2020);
        setShortField(term4794, term4794.getClass(), "month", (short) 4);
        setShortField(term4794, term4794.getClass(), "day", (short) 16);
        setField(term4793, term4793.getClass(), "date", term4794);
        setByteField(term4798, term4798.getClass(), "hour", (byte) 7);
        setByteField(term4798, term4798.getClass(), "minute", (byte) 46);
        setByteField(term4798, term4798.getClass(), "second", (byte) 47);
        setIntField(term4798, term4798.getClass(), "nano", 687690824);
        setField(term4793, term4793.getClass(), "time", term4798);
        setField(term4703, term4703.getClass(), "dataCadastro", term4793);
        setIntField(term4804, term4804.getClass(), "year", 2010);
        setShortField(term4804, term4804.getClass(), "month", (short) 7);
        setShortField(term4804, term4804.getClass(), "day", (short) 15);
        setField(term4803, term4803.getClass(), "date", term4804);
        setByteField(term4808, term4808.getClass(), "hour", (byte) 11);
        setByteField(term4808, term4808.getClass(), "minute", (byte) 28);
        setByteField(term4808, term4808.getClass(), "second", (byte) 5);
        setIntField(term4808, term4808.getClass(), "nano", 471613968);
        setField(term4803, term4803.getClass(), "time", term4808);
        setField(term4703, term4703.getClass(), "dataAlteracao", term4803);
        term4813 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4813;
        callMethod(klass, "equals", argTypes, term4703, args);
    }

};


