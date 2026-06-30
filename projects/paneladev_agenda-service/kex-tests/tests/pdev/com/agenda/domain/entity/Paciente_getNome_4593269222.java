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

public class Paciente_getNome_4593269222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696;

    public Paciente_getNome_4593269222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3697 = new Long(4100236067313034103L);
        Long term3750 = new Long(1195529027276497124L);
        Long term3753 = new Long(-2783999800714825789L);
        Object term3749 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3749, term3749.getClass(), "id", term3750);
        setField(term3749, term3749.getClass(), "rua", "");
        setField(term3749, term3749.getClass(), "numero", term3753);
        setField(term3749, term3749.getClass(), "complemento", "");
        setField(term3749, term3749.getClass(), "bairro", "");
        Long term3758 = new Long(4266570509071948633L);
        Long term3761 = new Long(-7291742736502427077L);
        Object term3757 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3757, term3757.getClass(), "id", term3758);
        setField(term3757, term3757.getClass(), "rua", "");
        setField(term3757, term3757.getClass(), "numero", term3761);
        setField(term3757, term3757.getClass(), "complemento", "");
        setField(term3757, term3757.getClass(), "bairro", "");
        Long term3766 = new Long(-8121849829073967555L);
        Long term3769 = new Long(5219030281405653303L);
        Object term3765 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3765, term3765.getClass(), "id", term3766);
        setField(term3765, term3765.getClass(), "rua", "");
        setField(term3765, term3765.getClass(), "numero", term3769);
        setField(term3765, term3765.getClass(), "complemento", "");
        setField(term3765, term3765.getClass(), "bairro", "");
        Long term3774 = new Long(-8471550651709805183L);
        Long term3777 = new Long(-948292411727204525L);
        Object term3773 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3773, term3773.getClass(), "id", term3774);
        setField(term3773, term3773.getClass(), "rua", "");
        setField(term3773, term3773.getClass(), "numero", term3777);
        setField(term3773, term3773.getClass(), "complemento", "");
        setField(term3773, term3773.getClass(), "bairro", "");
        Long term3782 = new Long(-8892586408602479513L);
        Long term3785 = new Long(4616440478358528406L);
        Object term3781 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3781, term3781.getClass(), "id", term3782);
        setField(term3781, term3781.getClass(), "rua", "");
        setField(term3781, term3781.getClass(), "numero", term3785);
        setField(term3781, term3781.getClass(), "complemento", "");
        setField(term3781, term3781.getClass(), "bairro", "");
        ArrayList term3747 = new ArrayList();
        ((ArrayList) term3747).add(term3749);
        ((ArrayList) term3747).add(term3757);
        ((ArrayList) term3747).add(term3765);
        ((ArrayList) term3747).add(term3773);
        ((ArrayList) term3747).add(term3781);
        term3696 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term3696, term3696.getClass(), "id", term3697);
        setField(term3696, term3696.getClass(), "nome", "MYWYUeLGOp");
        setField(term3696, term3696.getClass(), "sobrenome", "tsTGdgQYUL");
        setField(term3696, term3696.getClass(), "email", "TtGbVmKcnX");
        setField(term3696, term3696.getClass(), "cpf", "GJVkUrCVdD");
        setField(term3696, term3696.getClass(), "enderecos", term3747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term3696, args);
    }

};


