package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class MusicaService_insert_10592437202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888;

    public MusicaService_insert_10592437202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term889 = new Long(7009926388951271268L);
        Integer term903 = new Integer(-1339778481);
        Long term906 = new Long(-7672528020740371001L);
        term888 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term905 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term961 = newInstance(Class.forName("java.time.LocalTime"));
        Object term966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term991 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term888, term888.getClass(), "id", term889);
        setField(term888, term888.getClass(), "titulo", "eZFUvlxvGV");
        setField(term888, term888.getClass(), "minutos", term903);
        setField(term905, term905.getClass(), "id", term906);
        setField(term905, term905.getClass(), "email", "BYqFIqCKAV");
        setField(term905, term905.getClass(), "nome", "vrQLuWIDJX");
        setField(term905, term905.getClass(), "senha", "flxyYxBRtu");
        setField(term905, term905.getClass(), "perfilUsuario", "OclPbYPkcH");
        setIntField(term957, term957.getClass(), "year", 2012);
        setShortField(term957, term957.getClass(), "month", (short) 8);
        setShortField(term957, term957.getClass(), "day", (short) 25);
        setField(term956, term956.getClass(), "date", term957);
        setByteField(term961, term961.getClass(), "hour", (byte) 5);
        setByteField(term961, term961.getClass(), "minute", (byte) 20);
        setByteField(term961, term961.getClass(), "second", (byte) 50);
        setIntField(term961, term961.getClass(), "nano", 345595912);
        setField(term956, term956.getClass(), "time", term961);
        setField(term905, term905.getClass(), "dataCadastro", term956);
        setIntField(term967, term967.getClass(), "year", 2021);
        setShortField(term967, term967.getClass(), "month", (short) 1);
        setShortField(term967, term967.getClass(), "day", (short) 18);
        setField(term966, term966.getClass(), "date", term967);
        setByteField(term971, term971.getClass(), "hour", (byte) 13);
        setByteField(term971, term971.getClass(), "minute", (byte) 38);
        setByteField(term971, term971.getClass(), "second", (byte) 26);
        setIntField(term971, term971.getClass(), "nano", 544608644);
        setField(term966, term966.getClass(), "time", term971);
        setField(term905, term905.getClass(), "dataAlteracao", term966);
        setField(term888, term888.getClass(), "usuario", term905);
        setIntField(term977, term977.getClass(), "year", 2015);
        setShortField(term977, term977.getClass(), "month", (short) 9);
        setShortField(term977, term977.getClass(), "day", (short) 19);
        setField(term976, term976.getClass(), "date", term977);
        setByteField(term981, term981.getClass(), "hour", (byte) 9);
        setByteField(term981, term981.getClass(), "minute", (byte) 4);
        setByteField(term981, term981.getClass(), "second", (byte) 10);
        setIntField(term981, term981.getClass(), "nano", 401765865);
        setField(term976, term976.getClass(), "time", term981);
        setField(term888, term888.getClass(), "dataCadastro", term976);
        setIntField(term987, term987.getClass(), "year", 2015);
        setShortField(term987, term987.getClass(), "month", (short) 4);
        setShortField(term987, term987.getClass(), "day", (short) 14);
        setField(term986, term986.getClass(), "date", term987);
        setByteField(term991, term991.getClass(), "hour", (byte) 18);
        setByteField(term991, term991.getClass(), "minute", (byte) 24);
        setByteField(term991, term991.getClass(), "second", (byte) 32);
        setIntField(term991, term991.getClass(), "nano", 369233818);
        setField(term986, term986.getClass(), "time", term991);
        setField(term888, term888.getClass(), "dataAlteracao", term986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.MusicaService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Musica");
        Object[] args = new Object[1];
        args[0] = term888;
        callMethod(klass, "insert", argTypes, null, args);
    }

};


