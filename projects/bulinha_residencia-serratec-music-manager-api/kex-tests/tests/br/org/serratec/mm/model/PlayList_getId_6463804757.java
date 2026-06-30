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

public class PlayList_getId_6463804757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3248;

    public PlayList_getId_6463804757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3249 = new Long(-5963439350418910964L);
        Long term3266 = new Long(9013624480170062917L);
        Integer term3269 = new Integer(-117576464);
        Long term3272 = new Long(7862575738391801707L);
        Object term3265 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term3271 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term3274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3275 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3265, term3265.getClass(), "id", term3266);
        setField(term3265, term3265.getClass(), "titulo", "");
        setField(term3265, term3265.getClass(), "minutos", term3269);
        setField(term3271, term3271.getClass(), "id", term3272);
        setField(term3271, term3271.getClass(), "email", null);
        setField(term3271, term3271.getClass(), "nome", null);
        setField(term3271, term3271.getClass(), "senha", null);
        setField(term3271, term3271.getClass(), "perfilUsuario", null);
        setField(term3271, term3271.getClass(), "dataCadastro", null);
        setField(term3271, term3271.getClass(), "dataAlteracao", null);
        setField(term3265, term3265.getClass(), "usuario", term3271);
        setField(term3274, term3274.getClass(), "date", null);
        setField(term3274, term3274.getClass(), "time", null);
        setField(term3265, term3265.getClass(), "dataCadastro", term3274);
        setField(term3275, term3275.getClass(), "date", null);
        setField(term3275, term3275.getClass(), "time", null);
        setField(term3265, term3265.getClass(), "dataAlteracao", term3275);
        Long term3277 = new Long(50358265865610362L);
        Integer term3280 = new Integer(-1007160944);
        Long term3283 = new Long(5510783420697225605L);
        Object term3276 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term3282 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term3285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3286 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3276, term3276.getClass(), "id", term3277);
        setField(term3276, term3276.getClass(), "titulo", "");
        setField(term3276, term3276.getClass(), "minutos", term3280);
        setField(term3282, term3282.getClass(), "id", term3283);
        setField(term3282, term3282.getClass(), "email", null);
        setField(term3282, term3282.getClass(), "nome", null);
        setField(term3282, term3282.getClass(), "senha", null);
        setField(term3282, term3282.getClass(), "perfilUsuario", null);
        setField(term3282, term3282.getClass(), "dataCadastro", null);
        setField(term3282, term3282.getClass(), "dataAlteracao", null);
        setField(term3276, term3276.getClass(), "usuario", term3282);
        setField(term3285, term3285.getClass(), "date", null);
        setField(term3285, term3285.getClass(), "time", null);
        setField(term3276, term3276.getClass(), "dataCadastro", term3285);
        setField(term3286, term3286.getClass(), "date", null);
        setField(term3286, term3286.getClass(), "time", null);
        setField(term3276, term3276.getClass(), "dataAlteracao", term3286);
        ArrayList term3263 = new ArrayList();
        ((ArrayList) term3263).add(term3265);
        ((ArrayList) term3263).add(term3276);
        Long term3290 = new Long(6005241913654469005L);
        term3248 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        Object term3289 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term3340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3345 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3375 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3248, term3248.getClass(), "id", term3249);
        setField(term3248, term3248.getClass(), "nome", "GrqozDKFOk");
        setField(term3248, term3248.getClass(), "musicas", term3263);
        setField(term3289, term3289.getClass(), "id", term3290);
        setField(term3289, term3289.getClass(), "email", "gUvcueTURF");
        setField(term3289, term3289.getClass(), "nome", "EwQBhZjCIT");
        setField(term3289, term3289.getClass(), "senha", "aSkmSwTnEw");
        setField(term3289, term3289.getClass(), "perfilUsuario", "xvkbvaEGYd");
        setIntField(term3341, term3341.getClass(), "year", 2014);
        setShortField(term3341, term3341.getClass(), "month", (short) 6);
        setShortField(term3341, term3341.getClass(), "day", (short) 28);
        setField(term3340, term3340.getClass(), "date", term3341);
        setByteField(term3345, term3345.getClass(), "hour", (byte) 7);
        setByteField(term3345, term3345.getClass(), "minute", (byte) 14);
        setByteField(term3345, term3345.getClass(), "second", (byte) 59);
        setIntField(term3345, term3345.getClass(), "nano", 314278386);
        setField(term3340, term3340.getClass(), "time", term3345);
        setField(term3289, term3289.getClass(), "dataCadastro", term3340);
        setIntField(term3351, term3351.getClass(), "year", 2015);
        setShortField(term3351, term3351.getClass(), "month", (short) 10);
        setShortField(term3351, term3351.getClass(), "day", (short) 8);
        setField(term3350, term3350.getClass(), "date", term3351);
        setByteField(term3355, term3355.getClass(), "hour", (byte) 22);
        setByteField(term3355, term3355.getClass(), "minute", (byte) 20);
        setByteField(term3355, term3355.getClass(), "second", (byte) 59);
        setIntField(term3355, term3355.getClass(), "nano", 350521903);
        setField(term3350, term3350.getClass(), "time", term3355);
        setField(term3289, term3289.getClass(), "dataAlteracao", term3350);
        setField(term3248, term3248.getClass(), "usuario", term3289);
        setIntField(term3361, term3361.getClass(), "year", 2029);
        setShortField(term3361, term3361.getClass(), "month", (short) 11);
        setShortField(term3361, term3361.getClass(), "day", (short) 8);
        setField(term3360, term3360.getClass(), "date", term3361);
        setByteField(term3365, term3365.getClass(), "hour", (byte) 23);
        setByteField(term3365, term3365.getClass(), "minute", (byte) 43);
        setByteField(term3365, term3365.getClass(), "second", (byte) 12);
        setIntField(term3365, term3365.getClass(), "nano", 586227255);
        setField(term3360, term3360.getClass(), "time", term3365);
        setField(term3248, term3248.getClass(), "dataCadastro", term3360);
        setIntField(term3371, term3371.getClass(), "year", 2014);
        setShortField(term3371, term3371.getClass(), "month", (short) 1);
        setShortField(term3371, term3371.getClass(), "day", (short) 23);
        setField(term3370, term3370.getClass(), "date", term3371);
        setByteField(term3375, term3375.getClass(), "hour", (byte) 19);
        setByteField(term3375, term3375.getClass(), "minute", (byte) 52);
        setByteField(term3375, term3375.getClass(), "second", (byte) 9);
        setIntField(term3375, term3375.getClass(), "nano", 235326975);
        setField(term3370, term3370.getClass(), "time", term3375);
        setField(term3248, term3248.getClass(), "dataAlteracao", term3370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3248, args);
    }

};


