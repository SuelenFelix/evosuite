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
import java.util.ArrayList;
import java.lang.Object;

public class Paciente_getSobrenome_1887809313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3831;

    public Paciente_getSobrenome_1887809313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3832 = new Long(3427570961451840069L);
        Long term3885 = new Long(4502292577098212311L);
        Long term3888 = new Long(-3730936709704460408L);
        Object term3884 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3884, term3884.getClass(), "id", term3885);
        setField(term3884, term3884.getClass(), "rua", "");
        setField(term3884, term3884.getClass(), "numero", term3888);
        setField(term3884, term3884.getClass(), "complemento", "");
        setField(term3884, term3884.getClass(), "bairro", "");
        Long term3893 = new Long(-8614778293741404325L);
        Long term3896 = new Long(-5447369594017685765L);
        Object term3892 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3892, term3892.getClass(), "id", term3893);
        setField(term3892, term3892.getClass(), "rua", "");
        setField(term3892, term3892.getClass(), "numero", term3896);
        setField(term3892, term3892.getClass(), "complemento", "");
        setField(term3892, term3892.getClass(), "bairro", "");
        ArrayList term3882 = new ArrayList();
        ((ArrayList) term3882).add(term3884);
        ((ArrayList) term3882).add(term3892);
        term3831 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term3831, term3831.getClass(), "id", term3832);
        setField(term3831, term3831.getClass(), "nome", "DzHVBMqWtE");
        setField(term3831, term3831.getClass(), "sobrenome", "THZSpzBRYP");
        setField(term3831, term3831.getClass(), "email", "ZfBIVGBQOE");
        setField(term3831, term3831.getClass(), "cpf", "QSrDQfEsTR");
        setField(term3831, term3831.getClass(), "enderecos", term3882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSobrenome", argTypes, term3831, args);
    }

};


