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

public class Paciente_setId_6653905977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4259;
     Object term4330;

    public Paciente_setId_6653905977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4260 = new Long(3412644969878030772L);
        Long term4313 = new Long(6698455537431331246L);
        Long term4316 = new Long(-8327432141027603933L);
        Object term4312 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4312, term4312.getClass(), "id", term4313);
        setField(term4312, term4312.getClass(), "rua", "");
        setField(term4312, term4312.getClass(), "numero", term4316);
        setField(term4312, term4312.getClass(), "complemento", "");
        setField(term4312, term4312.getClass(), "bairro", "");
        Long term4321 = new Long(-433040798405298080L);
        Long term4324 = new Long(-1505191021111100819L);
        Object term4320 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4320, term4320.getClass(), "id", term4321);
        setField(term4320, term4320.getClass(), "rua", "");
        setField(term4320, term4320.getClass(), "numero", term4324);
        setField(term4320, term4320.getClass(), "complemento", "");
        setField(term4320, term4320.getClass(), "bairro", "");
        ArrayList term4310 = new ArrayList();
        ((ArrayList) term4310).add(term4312);
        ((ArrayList) term4310).add(term4320);
        term4259 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term4259, term4259.getClass(), "id", term4260);
        setField(term4259, term4259.getClass(), "nome", "TSyCeEZPaT");
        setField(term4259, term4259.getClass(), "sobrenome", "JeZFtaqkzW");
        setField(term4259, term4259.getClass(), "email", "vOVuNSCCLe");
        setField(term4259, term4259.getClass(), "cpf", "fzeqPnzpnt");
        setField(term4259, term4259.getClass(), "enderecos", term4310);
        term4330 = new Long(-1000830646340880796L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4330;
        callMethod(klass, "setId", argTypes, term4259, args);
    }

};


