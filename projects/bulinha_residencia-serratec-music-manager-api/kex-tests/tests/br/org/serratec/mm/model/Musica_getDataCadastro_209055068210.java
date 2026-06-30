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

public class Musica_getDataCadastro_209055068210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6306;

    public Musica_getDataCadastro_209055068210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6307 = new Long(-8892586408602479513L);
        Integer term6321 = new Integer(97029295);
        Long term6324 = new Long(4616440478358528406L);
        term6306 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term6323 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term6374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6409 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6306, term6306.getClass(), "id", term6307);
        setField(term6306, term6306.getClass(), "titulo", "weddIktxOA");
        setField(term6306, term6306.getClass(), "minutos", term6321);
        setField(term6323, term6323.getClass(), "id", term6324);
        setField(term6323, term6323.getClass(), "email", "uSlMeISsDD");
        setField(term6323, term6323.getClass(), "nome", "WdCiTDUKqn");
        setField(term6323, term6323.getClass(), "senha", "PSizQDoxxe");
        setField(term6323, term6323.getClass(), "perfilUsuario", "mKaHyMybrK");
        setIntField(term6375, term6375.getClass(), "year", 2023);
        setShortField(term6375, term6375.getClass(), "month", (short) 4);
        setShortField(term6375, term6375.getClass(), "day", (short) 10);
        setField(term6374, term6374.getClass(), "date", term6375);
        setByteField(term6379, term6379.getClass(), "hour", (byte) 19);
        setByteField(term6379, term6379.getClass(), "minute", (byte) 34);
        setByteField(term6379, term6379.getClass(), "second", (byte) 41);
        setIntField(term6379, term6379.getClass(), "nano", 911888376);
        setField(term6374, term6374.getClass(), "time", term6379);
        setField(term6323, term6323.getClass(), "dataCadastro", term6374);
        setIntField(term6385, term6385.getClass(), "year", 2014);
        setShortField(term6385, term6385.getClass(), "month", (short) 2);
        setShortField(term6385, term6385.getClass(), "day", (short) 5);
        setField(term6384, term6384.getClass(), "date", term6385);
        setByteField(term6389, term6389.getClass(), "hour", (byte) 14);
        setByteField(term6389, term6389.getClass(), "minute", (byte) 2);
        setByteField(term6389, term6389.getClass(), "second", (byte) 4);
        setIntField(term6389, term6389.getClass(), "nano", 458277660);
        setField(term6384, term6384.getClass(), "time", term6389);
        setField(term6323, term6323.getClass(), "dataAlteracao", term6384);
        setField(term6306, term6306.getClass(), "usuario", term6323);
        setIntField(term6395, term6395.getClass(), "year", 2019);
        setShortField(term6395, term6395.getClass(), "month", (short) 3);
        setShortField(term6395, term6395.getClass(), "day", (short) 23);
        setField(term6394, term6394.getClass(), "date", term6395);
        setByteField(term6399, term6399.getClass(), "hour", (byte) 13);
        setByteField(term6399, term6399.getClass(), "minute", (byte) 19);
        setByteField(term6399, term6399.getClass(), "second", (byte) 44);
        setIntField(term6399, term6399.getClass(), "nano", 912714703);
        setField(term6394, term6394.getClass(), "time", term6399);
        setField(term6306, term6306.getClass(), "dataCadastro", term6394);
        setIntField(term6405, term6405.getClass(), "year", 2027);
        setShortField(term6405, term6405.getClass(), "month", (short) 3);
        setShortField(term6405, term6405.getClass(), "day", (short) 4);
        setField(term6404, term6404.getClass(), "date", term6405);
        setByteField(term6409, term6409.getClass(), "hour", (byte) 2);
        setByteField(term6409, term6409.getClass(), "minute", (byte) 3);
        setByteField(term6409, term6409.getClass(), "second", (byte) 31);
        setIntField(term6409, term6409.getClass(), "nano", 652064220);
        setField(term6404, term6404.getClass(), "time", term6409);
        setField(term6306, term6306.getClass(), "dataAlteracao", term6404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCadastro", argTypes, term6306, args);
    }

};


