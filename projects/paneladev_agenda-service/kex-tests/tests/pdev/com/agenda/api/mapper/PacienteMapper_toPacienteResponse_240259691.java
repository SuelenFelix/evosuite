package pdev.com.agenda.api.mapper;

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
import static pdev.com.agenda.api.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PacienteMapper_toPacienteResponse_240259691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public PacienteMapper_toPacienteResponse_240259691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93 = new Long(6375119433582206027L);
        Long term146 = new Long(-8257434502486459194L);
        Long term149 = new Long(-8400487765614892086L);
        Object term145 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term145, term145.getClass(), "id", term146);
        setField(term145, term145.getClass(), "rua", "");
        setField(term145, term145.getClass(), "numero", term149);
        setField(term145, term145.getClass(), "complemento", "");
        setField(term145, term145.getClass(), "bairro", "");
        Long term154 = new Long(5270370404989704783L);
        Long term157 = new Long(7411271909051562686L);
        Object term153 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term153, term153.getClass(), "id", term154);
        setField(term153, term153.getClass(), "rua", "");
        setField(term153, term153.getClass(), "numero", term157);
        setField(term153, term153.getClass(), "complemento", "");
        setField(term153, term153.getClass(), "bairro", "");
        Long term162 = new Long(4872422362414183754L);
        Long term165 = new Long(6811161968424632369L);
        Object term161 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term161, term161.getClass(), "id", term162);
        setField(term161, term161.getClass(), "rua", "");
        setField(term161, term161.getClass(), "numero", term165);
        setField(term161, term161.getClass(), "complemento", "");
        setField(term161, term161.getClass(), "bairro", "");
        Long term170 = new Long(-7237588299778557629L);
        Long term173 = new Long(6967924379644551255L);
        Object term169 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term169, term169.getClass(), "id", term170);
        setField(term169, term169.getClass(), "rua", "");
        setField(term169, term169.getClass(), "numero", term173);
        setField(term169, term169.getClass(), "complemento", "");
        setField(term169, term169.getClass(), "bairro", "");
        Long term178 = new Long(-2813493605142626659L);
        Long term181 = new Long(-8885298608300233488L);
        Object term177 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term177, term177.getClass(), "id", term178);
        setField(term177, term177.getClass(), "rua", "");
        setField(term177, term177.getClass(), "numero", term181);
        setField(term177, term177.getClass(), "complemento", "");
        setField(term177, term177.getClass(), "bairro", "");
        ArrayList term143 = new ArrayList();
        ((ArrayList) term143).add(term145);
        ((ArrayList) term143).add(term153);
        ((ArrayList) term143).add(term161);
        ((ArrayList) term143).add(term169);
        ((ArrayList) term143).add(term177);
        term92 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term92, term92.getClass(), "id", term93);
        setField(term92, term92.getClass(), "nome", "jJCZpVmanW");
        setField(term92, term92.getClass(), "sobrenome", "EGtDIRbSSb");
        setField(term92, term92.getClass(), "email", "SzjVpOQTyS");
        setField(term92, term92.getClass(), "cpf", "MjGYSRKTNF");
        setField(term92, term92.getClass(), "enderecos", term143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.mapper.PacienteMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Object[] args = new Object[1];
        args[0] = term92;
        callMethod(klass, "toPacienteResponse", argTypes, null, args);
    }

};


