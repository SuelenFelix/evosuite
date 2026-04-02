package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class ArtistaDTO_init_1121399701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1897;

    public ArtistaDTO_init_1121399701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1898 = new Long(2535595959091595249L);
        Class<? extends Object> term2061 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term2060 = ((Class) term2061).getDeclaredField((String) "BANDA");
        ((Field) term2060).setAccessible(true);
        Object enum0 = ((Field) term2060).get((Object) null);
        Long term1925 = new Long(-5476826692763582090L);
        term1897 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term1924 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2010 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1897, term1897.getClass(), "id", term1898);
        setField(term1897, term1897.getClass(), "nome", "wGmYcqUkgE");
        setField(term1897, term1897.getClass(), "tipo", enum0);
        setField(term1924, term1924.getClass(), "id", term1925);
        setField(term1924, term1924.getClass(), "email", "idgaQsnJpQ");
        setField(term1924, term1924.getClass(), "nome", "VgZnGoIFwQ");
        setField(term1924, term1924.getClass(), "senha", "jUbSRrkrYZ");
        setField(term1924, term1924.getClass(), "perfilUsuario", "bWWfajKbEX");
        setIntField(term1976, term1976.getClass(), "year", 2029);
        setShortField(term1976, term1976.getClass(), "month", (short) 8);
        setShortField(term1976, term1976.getClass(), "day", (short) 29);
        setField(term1975, term1975.getClass(), "date", term1976);
        setByteField(term1980, term1980.getClass(), "hour", (byte) 15);
        setByteField(term1980, term1980.getClass(), "minute", (byte) 50);
        setByteField(term1980, term1980.getClass(), "second", (byte) 1);
        setIntField(term1980, term1980.getClass(), "nano", 277971904);
        setField(term1975, term1975.getClass(), "time", term1980);
        setField(term1924, term1924.getClass(), "dataCadastro", term1975);
        setIntField(term1986, term1986.getClass(), "year", 2022);
        setShortField(term1986, term1986.getClass(), "month", (short) 11);
        setShortField(term1986, term1986.getClass(), "day", (short) 16);
        setField(term1985, term1985.getClass(), "date", term1986);
        setByteField(term1990, term1990.getClass(), "hour", (byte) 15);
        setByteField(term1990, term1990.getClass(), "minute", (byte) 54);
        setByteField(term1990, term1990.getClass(), "second", (byte) 2);
        setIntField(term1990, term1990.getClass(), "nano", 733274103);
        setField(term1985, term1985.getClass(), "time", term1990);
        setField(term1924, term1924.getClass(), "dataAlteracao", term1985);
        setField(term1897, term1897.getClass(), "usuario", term1924);
        setIntField(term1996, term1996.getClass(), "year", 2019);
        setShortField(term1996, term1996.getClass(), "month", (short) 2);
        setShortField(term1996, term1996.getClass(), "day", (short) 21);
        setField(term1995, term1995.getClass(), "date", term1996);
        setByteField(term2000, term2000.getClass(), "hour", (byte) 5);
        setByteField(term2000, term2000.getClass(), "minute", (byte) 41);
        setByteField(term2000, term2000.getClass(), "second", (byte) 11);
        setIntField(term2000, term2000.getClass(), "nano", 859829782);
        setField(term1995, term1995.getClass(), "time", term2000);
        setField(term1897, term1897.getClass(), "dataCadastro", term1995);
        setIntField(term2006, term2006.getClass(), "year", 2018);
        setShortField(term2006, term2006.getClass(), "month", (short) 9);
        setShortField(term2006, term2006.getClass(), "day", (short) 28);
        setField(term2005, term2005.getClass(), "date", term2006);
        setByteField(term2010, term2010.getClass(), "hour", (byte) 3);
        setByteField(term2010, term2010.getClass(), "minute", (byte) 37);
        setByteField(term2010, term2010.getClass(), "second", (byte) 46);
        setIntField(term2010, term2010.getClass(), "nano", 763326845);
        setField(term2005, term2005.getClass(), "time", term2010);
        setField(term1897, term1897.getClass(), "dataAlteracao", term2005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Artista");
        Object[] args = new Object[1];
        args[0] = term1897;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


