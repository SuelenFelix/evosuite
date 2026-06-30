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

public class Agenda_getId_15776418801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;

    public Agenda_getId_15776418801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term980 = new Long(-5476826692763582090L);
        Long term1015 = new Long(-872011222785455006L);
        Long term1068 = new Long(-316468845751588286L);
        Long term1070 = new Long(5127676408959197577L);
        Object term1067 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1067, term1067.getClass(), "id", term1068);
        setField(term1067, term1067.getClass(), "rua", null);
        setField(term1067, term1067.getClass(), "numero", term1070);
        setField(term1067, term1067.getClass(), "complemento", null);
        setField(term1067, term1067.getClass(), "bairro", null);
        Long term1073 = new Long(-6573104506744284592L);
        Long term1075 = new Long(-4920224193275732920L);
        Object term1072 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1072, term1072.getClass(), "id", term1073);
        setField(term1072, term1072.getClass(), "rua", null);
        setField(term1072, term1072.getClass(), "numero", term1075);
        setField(term1072, term1072.getClass(), "complemento", null);
        setField(term1072, term1072.getClass(), "bairro", null);
        Long term1078 = new Long(8428634514691209827L);
        Long term1080 = new Long(-2585684163342970173L);
        Object term1077 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1077, term1077.getClass(), "id", term1078);
        setField(term1077, term1077.getClass(), "rua", null);
        setField(term1077, term1077.getClass(), "numero", term1080);
        setField(term1077, term1077.getClass(), "complemento", null);
        setField(term1077, term1077.getClass(), "bairro", null);
        Long term1083 = new Long(8059786003080744426L);
        Long term1085 = new Long(-4365849114644724155L);
        Object term1082 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1082, term1082.getClass(), "id", term1083);
        setField(term1082, term1082.getClass(), "rua", null);
        setField(term1082, term1082.getClass(), "numero", term1085);
        setField(term1082, term1082.getClass(), "complemento", null);
        setField(term1082, term1082.getClass(), "bairro", null);
        Long term1088 = new Long(2486810210675247493L);
        Long term1090 = new Long(7009926388951271268L);
        Object term1087 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1087, term1087.getClass(), "id", term1088);
        setField(term1087, term1087.getClass(), "rua", null);
        setField(term1087, term1087.getClass(), "numero", term1090);
        setField(term1087, term1087.getClass(), "complemento", null);
        setField(term1087, term1087.getClass(), "bairro", null);
        ArrayList term1065 = new ArrayList();
        ((ArrayList) term1065).add(term1067);
        ((ArrayList) term1065).add(term1072);
        ((ArrayList) term1065).add(term1077);
        ((ArrayList) term1065).add(term1082);
        ((ArrayList) term1065).add(term1087);
        term979 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1009 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1014 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term979, term979.getClass(), "id", term980);
        setField(term979, term979.getClass(), "descricao", "gGSMzuGICf");
        setIntField(term995, term995.getClass(), "year", 2012);
        setShortField(term995, term995.getClass(), "month", (short) 8);
        setShortField(term995, term995.getClass(), "day", (short) 25);
        setField(term994, term994.getClass(), "date", term995);
        setByteField(term999, term999.getClass(), "hour", (byte) 5);
        setByteField(term999, term999.getClass(), "minute", (byte) 20);
        setByteField(term999, term999.getClass(), "second", (byte) 50);
        setIntField(term999, term999.getClass(), "nano", 345595912);
        setField(term994, term994.getClass(), "time", term999);
        setField(term979, term979.getClass(), "horario", term994);
        setIntField(term1005, term1005.getClass(), "year", 2021);
        setShortField(term1005, term1005.getClass(), "month", (short) 1);
        setShortField(term1005, term1005.getClass(), "day", (short) 18);
        setField(term1004, term1004.getClass(), "date", term1005);
        setByteField(term1009, term1009.getClass(), "hour", (byte) 13);
        setByteField(term1009, term1009.getClass(), "minute", (byte) 38);
        setByteField(term1009, term1009.getClass(), "second", (byte) 26);
        setIntField(term1009, term1009.getClass(), "nano", 544608644);
        setField(term1004, term1004.getClass(), "time", term1009);
        setField(term979, term979.getClass(), "dataCriacao", term1004);
        setField(term1014, term1014.getClass(), "id", term1015);
        setField(term1014, term1014.getClass(), "nome", "hxCBltsObl");
        setField(term1014, term1014.getClass(), "sobrenome", "BndsHwAFMv");
        setField(term1014, term1014.getClass(), "email", "GzFkzHGYFt");
        setField(term1014, term1014.getClass(), "cpf", "tShwQLRGNe");
        setField(term1014, term1014.getClass(), "enderecos", term1065);
        setField(term979, term979.getClass(), "paciente", term1014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term979, args);
    }

};


