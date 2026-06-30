package pdev.com.agenda.api.response;

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
import static pdev.com.agenda.api.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class PacienteCompletoResponse_setEnderecos_147419522811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1496;
     Object term1591;

    public PacienteCompletoResponse_setEnderecos_147419522811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1497 = new Long(-8033714905181142681L);
        Long term1550 = new Long(-9040825890007374809L);
        Long term1553 = new Long(1368340889161782793L);
        Object term1549 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1549, term1549.getClass(), "id", term1550);
        setField(term1549, term1549.getClass(), "rua", "");
        setField(term1549, term1549.getClass(), "numero", term1553);
        setField(term1549, term1549.getClass(), "complemento", "");
        setField(term1549, term1549.getClass(), "bairro", "");
        Long term1558 = new Long(-5786861555969446503L);
        Long term1561 = new Long(2354625302846375590L);
        Object term1557 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1557, term1557.getClass(), "id", term1558);
        setField(term1557, term1557.getClass(), "rua", "");
        setField(term1557, term1557.getClass(), "numero", term1561);
        setField(term1557, term1557.getClass(), "complemento", "");
        setField(term1557, term1557.getClass(), "bairro", "");
        Long term1566 = new Long(7276637106827860087L);
        Long term1569 = new Long(-3936701866695933852L);
        Object term1565 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1565, term1565.getClass(), "id", term1566);
        setField(term1565, term1565.getClass(), "rua", "");
        setField(term1565, term1565.getClass(), "numero", term1569);
        setField(term1565, term1565.getClass(), "complemento", "");
        setField(term1565, term1565.getClass(), "bairro", "");
        Long term1574 = new Long(1215116475929634177L);
        Long term1577 = new Long(1597484336218508869L);
        Object term1573 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1573, term1573.getClass(), "id", term1574);
        setField(term1573, term1573.getClass(), "rua", "");
        setField(term1573, term1573.getClass(), "numero", term1577);
        setField(term1573, term1573.getClass(), "complemento", "");
        setField(term1573, term1573.getClass(), "bairro", "");
        Long term1582 = new Long(-685023850445639859L);
        Long term1585 = new Long(-6950146046121430355L);
        Object term1581 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1581, term1581.getClass(), "id", term1582);
        setField(term1581, term1581.getClass(), "rua", "");
        setField(term1581, term1581.getClass(), "numero", term1585);
        setField(term1581, term1581.getClass(), "complemento", "");
        setField(term1581, term1581.getClass(), "bairro", "");
        ArrayList term1547 = new ArrayList();
        ((ArrayList) term1547).add(term1549);
        ((ArrayList) term1547).add(term1557);
        ((ArrayList) term1547).add(term1565);
        ((ArrayList) term1547).add(term1573);
        ((ArrayList) term1547).add(term1581);
        term1496 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term1496, term1496.getClass(), "id", term1497);
        setField(term1496, term1496.getClass(), "nome", "ekxGuOYIwi");
        setField(term1496, term1496.getClass(), "sobrenome", "RbVQXSpxXy");
        setField(term1496, term1496.getClass(), "email", "YpJbIgJWWv");
        setField(term1496, term1496.getClass(), "cpf", "JppkknKVOw");
        setField(term1496, term1496.getClass(), "enderecos", term1547);
        term1591 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1591;
        callMethod(klass, "setEnderecos", argTypes, term1496, args);
    }

};


