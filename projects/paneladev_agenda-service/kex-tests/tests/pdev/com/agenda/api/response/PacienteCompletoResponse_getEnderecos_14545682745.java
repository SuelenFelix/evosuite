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

public class PacienteCompletoResponse_getEnderecos_14545682745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612;

    public PacienteCompletoResponse_getEnderecos_14545682745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term613 = new Long(5907001541142728739L);
        Long term666 = new Long(4178434741742309755L);
        Long term669 = new Long(-2068172595987555756L);
        Object term665 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term665, term665.getClass(), "id", term666);
        setField(term665, term665.getClass(), "rua", "");
        setField(term665, term665.getClass(), "numero", term669);
        setField(term665, term665.getClass(), "complemento", "");
        setField(term665, term665.getClass(), "bairro", "");
        Long term674 = new Long(-6292278961887936280L);
        Long term677 = new Long(-6645965768855543712L);
        Object term673 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term673, term673.getClass(), "id", term674);
        setField(term673, term673.getClass(), "rua", "");
        setField(term673, term673.getClass(), "numero", term677);
        setField(term673, term673.getClass(), "complemento", "");
        setField(term673, term673.getClass(), "bairro", "");
        Long term682 = new Long(4784595517102746672L);
        Long term685 = new Long(-7612550318181586304L);
        Object term681 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term681, term681.getClass(), "id", term682);
        setField(term681, term681.getClass(), "rua", "");
        setField(term681, term681.getClass(), "numero", term685);
        setField(term681, term681.getClass(), "complemento", "");
        setField(term681, term681.getClass(), "bairro", "");
        Long term690 = new Long(-2170847986967241072L);
        Long term693 = new Long(4044358158040652353L);
        Object term689 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term689, term689.getClass(), "id", term690);
        setField(term689, term689.getClass(), "rua", "");
        setField(term689, term689.getClass(), "numero", term693);
        setField(term689, term689.getClass(), "complemento", "");
        setField(term689, term689.getClass(), "bairro", "");
        Long term698 = new Long(-4443169559037975007L);
        Long term701 = new Long(-3842548265506930260L);
        Object term697 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term697, term697.getClass(), "id", term698);
        setField(term697, term697.getClass(), "rua", "");
        setField(term697, term697.getClass(), "numero", term701);
        setField(term697, term697.getClass(), "complemento", "");
        setField(term697, term697.getClass(), "bairro", "");
        Long term706 = new Long(-5788180182343976541L);
        Long term709 = new Long(2936323121573284007L);
        Object term705 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term705, term705.getClass(), "id", term706);
        setField(term705, term705.getClass(), "rua", "");
        setField(term705, term705.getClass(), "numero", term709);
        setField(term705, term705.getClass(), "complemento", "");
        setField(term705, term705.getClass(), "bairro", "");
        ArrayList term663 = new ArrayList();
        ((ArrayList) term663).add(term665);
        ((ArrayList) term663).add(term673);
        ((ArrayList) term663).add(term681);
        ((ArrayList) term663).add(term689);
        ((ArrayList) term663).add(term697);
        ((ArrayList) term663).add(term705);
        term612 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term612, term612.getClass(), "id", term613);
        setField(term612, term612.getClass(), "nome", "IgRJUzaCwW");
        setField(term612, term612.getClass(), "sobrenome", "JUmudUmaaV");
        setField(term612, term612.getClass(), "email", "KoyGrUJeJW");
        setField(term612, term612.getClass(), "cpf", "HqBOwkVqjD");
        setField(term612, term612.getClass(), "enderecos", term663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnderecos", argTypes, term612, args);
    }

};


