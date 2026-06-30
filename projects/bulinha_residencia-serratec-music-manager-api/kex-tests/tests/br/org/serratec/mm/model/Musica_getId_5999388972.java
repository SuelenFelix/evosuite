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

public class Musica_getId_5999388972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4905;

    public Musica_getId_5999388972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4906 = new Long(-1333707622307134180L);
        Integer term4920 = new Integer(-1786399638);
        Long term4923 = new Long(-4360569253593381888L);
        term4905 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term4922 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term4973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4988 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4998 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5008 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4905, term4905.getClass(), "id", term4906);
        setField(term4905, term4905.getClass(), "titulo", "oKwCDqywym");
        setField(term4905, term4905.getClass(), "minutos", term4920);
        setField(term4922, term4922.getClass(), "id", term4923);
        setField(term4922, term4922.getClass(), "email", "zjZYTddemL");
        setField(term4922, term4922.getClass(), "nome", "QtrylgCLiF");
        setField(term4922, term4922.getClass(), "senha", "orEuhCStGM");
        setField(term4922, term4922.getClass(), "perfilUsuario", "HhEaSXWvrY");
        setIntField(term4974, term4974.getClass(), "year", 2018);
        setShortField(term4974, term4974.getClass(), "month", (short) 12);
        setShortField(term4974, term4974.getClass(), "day", (short) 17);
        setField(term4973, term4973.getClass(), "date", term4974);
        setByteField(term4978, term4978.getClass(), "hour", (byte) 2);
        setByteField(term4978, term4978.getClass(), "minute", (byte) 8);
        setByteField(term4978, term4978.getClass(), "second", (byte) 33);
        setIntField(term4978, term4978.getClass(), "nano", 799805513);
        setField(term4973, term4973.getClass(), "time", term4978);
        setField(term4922, term4922.getClass(), "dataCadastro", term4973);
        setIntField(term4984, term4984.getClass(), "year", 2015);
        setShortField(term4984, term4984.getClass(), "month", (short) 12);
        setShortField(term4984, term4984.getClass(), "day", (short) 18);
        setField(term4983, term4983.getClass(), "date", term4984);
        setByteField(term4988, term4988.getClass(), "hour", (byte) 21);
        setByteField(term4988, term4988.getClass(), "minute", (byte) 45);
        setByteField(term4988, term4988.getClass(), "second", (byte) 43);
        setIntField(term4988, term4988.getClass(), "nano", 629261984);
        setField(term4983, term4983.getClass(), "time", term4988);
        setField(term4922, term4922.getClass(), "dataAlteracao", term4983);
        setField(term4905, term4905.getClass(), "usuario", term4922);
        setIntField(term4994, term4994.getClass(), "year", 2015);
        setShortField(term4994, term4994.getClass(), "month", (short) 5);
        setShortField(term4994, term4994.getClass(), "day", (short) 14);
        setField(term4993, term4993.getClass(), "date", term4994);
        setByteField(term4998, term4998.getClass(), "hour", (byte) 13);
        setByteField(term4998, term4998.getClass(), "minute", (byte) 25);
        setByteField(term4998, term4998.getClass(), "second", (byte) 10);
        setIntField(term4998, term4998.getClass(), "nano", 246578829);
        setField(term4993, term4993.getClass(), "time", term4998);
        setField(term4905, term4905.getClass(), "dataCadastro", term4993);
        setIntField(term5004, term5004.getClass(), "year", 2028);
        setShortField(term5004, term5004.getClass(), "month", (short) 5);
        setShortField(term5004, term5004.getClass(), "day", (short) 23);
        setField(term5003, term5003.getClass(), "date", term5004);
        setByteField(term5008, term5008.getClass(), "hour", (byte) 6);
        setByteField(term5008, term5008.getClass(), "minute", (byte) 0);
        setByteField(term5008, term5008.getClass(), "second", (byte) 51);
        setIntField(term5008, term5008.getClass(), "nano", 258967293);
        setField(term5003, term5003.getClass(), "time", term5008);
        setField(term4905, term4905.getClass(), "dataAlteracao", term5003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4905, args);
    }

};


