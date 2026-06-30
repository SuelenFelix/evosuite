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
import java.lang.Integer;

public class PlayList_setNome_81149776610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3895;

    public PlayList_setNome_81149776610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3896 = new Long(1667122142089513324L);
        Long term3913 = new Long(-6342139649364011743L);
        Integer term3916 = new Integer(-1145578966);
        Long term3919 = new Long(-4924950707540628022L);
        Object term3912 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term3918 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term3921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3922 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3912, term3912.getClass(), "id", term3913);
        setField(term3912, term3912.getClass(), "titulo", "");
        setField(term3912, term3912.getClass(), "minutos", term3916);
        setField(term3918, term3918.getClass(), "id", term3919);
        setField(term3918, term3918.getClass(), "email", null);
        setField(term3918, term3918.getClass(), "nome", null);
        setField(term3918, term3918.getClass(), "senha", null);
        setField(term3918, term3918.getClass(), "perfilUsuario", null);
        setField(term3918, term3918.getClass(), "dataCadastro", null);
        setField(term3918, term3918.getClass(), "dataAlteracao", null);
        setField(term3912, term3912.getClass(), "usuario", term3918);
        setField(term3921, term3921.getClass(), "date", null);
        setField(term3921, term3921.getClass(), "time", null);
        setField(term3912, term3912.getClass(), "dataCadastro", term3921);
        setField(term3922, term3922.getClass(), "date", null);
        setField(term3922, term3922.getClass(), "time", null);
        setField(term3912, term3912.getClass(), "dataAlteracao", term3922);
        ArrayList term3910 = new ArrayList();
        ((ArrayList) term3910).add(term3912);
        Long term3926 = new Long(-4393710401270724527L);
        term3895 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        Object term3925 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term3976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4001 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4011 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3895, term3895.getClass(), "id", term3896);
        setField(term3895, term3895.getClass(), "nome", "PsqusYmejD");
        setField(term3895, term3895.getClass(), "musicas", term3910);
        setField(term3925, term3925.getClass(), "id", term3926);
        setField(term3925, term3925.getClass(), "email", "GEJABPlHSI");
        setField(term3925, term3925.getClass(), "nome", "aQFUvuaYxd");
        setField(term3925, term3925.getClass(), "senha", "zNFLXMifnS");
        setField(term3925, term3925.getClass(), "perfilUsuario", "HHQcYMSBVc");
        setIntField(term3977, term3977.getClass(), "year", 2020);
        setShortField(term3977, term3977.getClass(), "month", (short) 1);
        setShortField(term3977, term3977.getClass(), "day", (short) 23);
        setField(term3976, term3976.getClass(), "date", term3977);
        setByteField(term3981, term3981.getClass(), "hour", (byte) 17);
        setByteField(term3981, term3981.getClass(), "minute", (byte) 24);
        setByteField(term3981, term3981.getClass(), "second", (byte) 54);
        setIntField(term3981, term3981.getClass(), "nano", 261767355);
        setField(term3976, term3976.getClass(), "time", term3981);
        setField(term3925, term3925.getClass(), "dataCadastro", term3976);
        setIntField(term3987, term3987.getClass(), "year", 2011);
        setShortField(term3987, term3987.getClass(), "month", (short) 1);
        setShortField(term3987, term3987.getClass(), "day", (short) 20);
        setField(term3986, term3986.getClass(), "date", term3987);
        setByteField(term3991, term3991.getClass(), "hour", (byte) 5);
        setByteField(term3991, term3991.getClass(), "minute", (byte) 23);
        setByteField(term3991, term3991.getClass(), "second", (byte) 54);
        setIntField(term3991, term3991.getClass(), "nano", 4207750);
        setField(term3986, term3986.getClass(), "time", term3991);
        setField(term3925, term3925.getClass(), "dataAlteracao", term3986);
        setField(term3895, term3895.getClass(), "usuario", term3925);
        setIntField(term3997, term3997.getClass(), "year", 2028);
        setShortField(term3997, term3997.getClass(), "month", (short) 3);
        setShortField(term3997, term3997.getClass(), "day", (short) 20);
        setField(term3996, term3996.getClass(), "date", term3997);
        setByteField(term4001, term4001.getClass(), "hour", (byte) 15);
        setByteField(term4001, term4001.getClass(), "minute", (byte) 5);
        setByteField(term4001, term4001.getClass(), "second", (byte) 16);
        setIntField(term4001, term4001.getClass(), "nano", 223082659);
        setField(term3996, term3996.getClass(), "time", term4001);
        setField(term3895, term3895.getClass(), "dataCadastro", term3996);
        setIntField(term4007, term4007.getClass(), "year", 2019);
        setShortField(term4007, term4007.getClass(), "month", (short) 4);
        setShortField(term4007, term4007.getClass(), "day", (short) 1);
        setField(term4006, term4006.getClass(), "date", term4007);
        setByteField(term4011, term4011.getClass(), "hour", (byte) 8);
        setByteField(term4011, term4011.getClass(), "minute", (byte) 11);
        setByteField(term4011, term4011.getClass(), "second", (byte) 4);
        setIntField(term4011, term4011.getClass(), "nano", 648208624);
        setField(term4006, term4006.getClass(), "time", term4011);
        setField(term3895, term3895.getClass(), "dataAlteracao", term4006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wdoqITnaAP";
        callMethod(klass, "setNome", argTypes, term3895, args);
    }

};


