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
import java.lang.Integer;
import java.lang.Object;

public class Musica_setMinutos_15341297437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5719;
     Object term5827;

    public Musica_setMinutos_15341297437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5720 = new Long(-2783999800714825789L);
        Integer term5734 = new Integer(-184153539);
        Long term5737 = new Long(4266570509071948633L);
        term5719 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term5736 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5802 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5822 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5719, term5719.getClass(), "id", term5720);
        setField(term5719, term5719.getClass(), "titulo", "TKlccZUpjz");
        setField(term5719, term5719.getClass(), "minutos", term5734);
        setField(term5736, term5736.getClass(), "id", term5737);
        setField(term5736, term5736.getClass(), "email", "GGzwMoHZXC");
        setField(term5736, term5736.getClass(), "nome", "IpmgwHTgnG");
        setField(term5736, term5736.getClass(), "senha", "tIpkeYIezR");
        setField(term5736, term5736.getClass(), "perfilUsuario", "YkZtEtthvz");
        setIntField(term5788, term5788.getClass(), "year", 2010);
        setShortField(term5788, term5788.getClass(), "month", (short) 5);
        setShortField(term5788, term5788.getClass(), "day", (short) 21);
        setField(term5787, term5787.getClass(), "date", term5788);
        setByteField(term5792, term5792.getClass(), "hour", (byte) 2);
        setByteField(term5792, term5792.getClass(), "minute", (byte) 7);
        setByteField(term5792, term5792.getClass(), "second", (byte) 22);
        setIntField(term5792, term5792.getClass(), "nano", 178273852);
        setField(term5787, term5787.getClass(), "time", term5792);
        setField(term5736, term5736.getClass(), "dataCadastro", term5787);
        setIntField(term5798, term5798.getClass(), "year", 2020);
        setShortField(term5798, term5798.getClass(), "month", (short) 7);
        setShortField(term5798, term5798.getClass(), "day", (short) 27);
        setField(term5797, term5797.getClass(), "date", term5798);
        setByteField(term5802, term5802.getClass(), "hour", (byte) 23);
        setByteField(term5802, term5802.getClass(), "minute", (byte) 41);
        setByteField(term5802, term5802.getClass(), "second", (byte) 32);
        setIntField(term5802, term5802.getClass(), "nano", 523353963);
        setField(term5797, term5797.getClass(), "time", term5802);
        setField(term5736, term5736.getClass(), "dataAlteracao", term5797);
        setField(term5719, term5719.getClass(), "usuario", term5736);
        setIntField(term5808, term5808.getClass(), "year", 2014);
        setShortField(term5808, term5808.getClass(), "month", (short) 2);
        setShortField(term5808, term5808.getClass(), "day", (short) 18);
        setField(term5807, term5807.getClass(), "date", term5808);
        setByteField(term5812, term5812.getClass(), "hour", (byte) 4);
        setByteField(term5812, term5812.getClass(), "minute", (byte) 16);
        setByteField(term5812, term5812.getClass(), "second", (byte) 8);
        setIntField(term5812, term5812.getClass(), "nano", 486006871);
        setField(term5807, term5807.getClass(), "time", term5812);
        setField(term5719, term5719.getClass(), "dataCadastro", term5807);
        setIntField(term5818, term5818.getClass(), "year", 2024);
        setShortField(term5818, term5818.getClass(), "month", (short) 10);
        setShortField(term5818, term5818.getClass(), "day", (short) 8);
        setField(term5817, term5817.getClass(), "date", term5818);
        setByteField(term5822, term5822.getClass(), "hour", (byte) 19);
        setByteField(term5822, term5822.getClass(), "minute", (byte) 31);
        setByteField(term5822, term5822.getClass(), "second", (byte) 10);
        setIntField(term5822, term5822.getClass(), "nano", 930417883);
        setField(term5817, term5817.getClass(), "time", term5822);
        setField(term5719, term5719.getClass(), "dataAlteracao", term5817);
        term5827 = new Integer(493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5827;
        callMethod(klass, "setMinutos", argTypes, term5719, args);
    }

};


