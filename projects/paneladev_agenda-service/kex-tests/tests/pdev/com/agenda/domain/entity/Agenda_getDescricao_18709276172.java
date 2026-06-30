package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Agenda_getDescricao_18709276172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1144;

    public Agenda_getDescricao_18709276172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1145 = new Long(-7672528020740371001L);
        Long term1180 = new Long(-4502405999831680926L);
        Long term1233 = new Long(1967728129628047933L);
        Long term1235 = new Long(2120084523938730454L);
        Object term1232 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1232, term1232.getClass(), "id", term1233);
        setField(term1232, term1232.getClass(), "rua", null);
        setField(term1232, term1232.getClass(), "numero", term1235);
        setField(term1232, term1232.getClass(), "complemento", null);
        setField(term1232, term1232.getClass(), "bairro", null);
        Long term1238 = new Long(6855071767938501807L);
        Long term1240 = new Long(-5892135042702373494L);
        Object term1237 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1237, term1237.getClass(), "id", term1238);
        setField(term1237, term1237.getClass(), "rua", null);
        setField(term1237, term1237.getClass(), "numero", term1240);
        setField(term1237, term1237.getClass(), "complemento", null);
        setField(term1237, term1237.getClass(), "bairro", null);
        Long term1243 = new Long(5262507301787091109L);
        Long term1245 = new Long(-6823727938421990489L);
        Object term1242 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1242, term1242.getClass(), "id", term1243);
        setField(term1242, term1242.getClass(), "rua", null);
        setField(term1242, term1242.getClass(), "numero", term1245);
        setField(term1242, term1242.getClass(), "complemento", null);
        setField(term1242, term1242.getClass(), "bairro", null);
        Long term1248 = new Long(-484994522244390100L);
        Long term1250 = new Long(1233889271256172047L);
        Object term1247 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1247, term1247.getClass(), "id", term1248);
        setField(term1247, term1247.getClass(), "rua", null);
        setField(term1247, term1247.getClass(), "numero", term1250);
        setField(term1247, term1247.getClass(), "complemento", null);
        setField(term1247, term1247.getClass(), "bairro", null);
        ArrayList term1230 = new ArrayList();
        ((ArrayList) term1230).add(term1232);
        ((ArrayList) term1230).add(term1237);
        ((ArrayList) term1230).add(term1242);
        ((ArrayList) term1230).add(term1247);
        term1144 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term1159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1174 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1179 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1144, term1144.getClass(), "id", term1145);
        setField(term1144, term1144.getClass(), "descricao", "hoicvmsovO");
        setIntField(term1160, term1160.getClass(), "year", 2015);
        setShortField(term1160, term1160.getClass(), "month", (short) 9);
        setShortField(term1160, term1160.getClass(), "day", (short) 19);
        setField(term1159, term1159.getClass(), "date", term1160);
        setByteField(term1164, term1164.getClass(), "hour", (byte) 9);
        setByteField(term1164, term1164.getClass(), "minute", (byte) 4);
        setByteField(term1164, term1164.getClass(), "second", (byte) 10);
        setIntField(term1164, term1164.getClass(), "nano", 401765865);
        setField(term1159, term1159.getClass(), "time", term1164);
        setField(term1144, term1144.getClass(), "horario", term1159);
        setIntField(term1170, term1170.getClass(), "year", 2015);
        setShortField(term1170, term1170.getClass(), "month", (short) 4);
        setShortField(term1170, term1170.getClass(), "day", (short) 14);
        setField(term1169, term1169.getClass(), "date", term1170);
        setByteField(term1174, term1174.getClass(), "hour", (byte) 18);
        setByteField(term1174, term1174.getClass(), "minute", (byte) 24);
        setByteField(term1174, term1174.getClass(), "second", (byte) 32);
        setIntField(term1174, term1174.getClass(), "nano", 369233818);
        setField(term1169, term1169.getClass(), "time", term1174);
        setField(term1144, term1144.getClass(), "dataCriacao", term1169);
        setField(term1179, term1179.getClass(), "id", term1180);
        setField(term1179, term1179.getClass(), "nome", "eqJfYWRaEL");
        setField(term1179, term1179.getClass(), "sobrenome", "fhkbdRViHi");
        setField(term1179, term1179.getClass(), "email", "uWHnvSvaPl");
        setField(term1179, term1179.getClass(), "cpf", "kBdSllIBVz");
        setField(term1179, term1179.getClass(), "enderecos", term1230);
        setField(term1144, term1144.getClass(), "paciente", term1179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescricao", argTypes, term1144, args);
    }

};


