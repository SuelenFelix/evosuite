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

public class Paciente_setEmail_214026238710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718;

    public Paciente_setEmail_214026238710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4719 = new Long(-1820639665251914495L);
        Long term4772 = new Long(3238645206498300107L);
        Long term4775 = new Long(-1592696983130738594L);
        Object term4771 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4771, term4771.getClass(), "id", term4772);
        setField(term4771, term4771.getClass(), "rua", "");
        setField(term4771, term4771.getClass(), "numero", term4775);
        setField(term4771, term4771.getClass(), "complemento", "");
        setField(term4771, term4771.getClass(), "bairro", "");
        Long term4780 = new Long(6902365338255307910L);
        Long term4783 = new Long(-8019730974733786399L);
        Object term4779 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4779, term4779.getClass(), "id", term4780);
        setField(term4779, term4779.getClass(), "rua", "");
        setField(term4779, term4779.getClass(), "numero", term4783);
        setField(term4779, term4779.getClass(), "complemento", "");
        setField(term4779, term4779.getClass(), "bairro", "");
        ArrayList term4769 = new ArrayList();
        ((ArrayList) term4769).add(term4771);
        ((ArrayList) term4769).add(term4779);
        term4718 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term4718, term4718.getClass(), "id", term4719);
        setField(term4718, term4718.getClass(), "nome", "oKwCDqywym");
        setField(term4718, term4718.getClass(), "sobrenome", "zjZYTddemL");
        setField(term4718, term4718.getClass(), "email", "QtrylgCLiF");
        setField(term4718, term4718.getClass(), "cpf", "orEuhCStGM");
        setField(term4718, term4718.getClass(), "enderecos", term4769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GsWxOwXvSu";
        callMethod(klass, "setEmail", argTypes, term4718, args);
    }

};


