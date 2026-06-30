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

public class PacienteCompletoResponse_setId_3976749456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;
     Object term826;

    public PacienteCompletoResponse_setId_3976749456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term756 = new Long(-1154553077993834885L);
        Long term809 = new Long(-2850532706972744550L);
        Long term812 = new Long(-2644215923136513282L);
        Object term808 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term808, term808.getClass(), "id", term809);
        setField(term808, term808.getClass(), "rua", "");
        setField(term808, term808.getClass(), "numero", term812);
        setField(term808, term808.getClass(), "complemento", "");
        setField(term808, term808.getClass(), "bairro", "");
        Long term817 = new Long(-1468719814009985452L);
        Long term820 = new Long(-7738503207562305297L);
        Object term816 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term816, term816.getClass(), "id", term817);
        setField(term816, term816.getClass(), "rua", "");
        setField(term816, term816.getClass(), "numero", term820);
        setField(term816, term816.getClass(), "complemento", "");
        setField(term816, term816.getClass(), "bairro", "");
        ArrayList term806 = new ArrayList();
        ((ArrayList) term806).add(term808);
        ((ArrayList) term806).add(term816);
        term755 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term755, term755.getClass(), "id", term756);
        setField(term755, term755.getClass(), "nome", "JqXGgAhZPl");
        setField(term755, term755.getClass(), "sobrenome", "jiKYgYHqIS");
        setField(term755, term755.getClass(), "email", "DfISiziTgG");
        setField(term755, term755.getClass(), "cpf", "XqgfKFvPSD");
        setField(term755, term755.getClass(), "enderecos", term806);
        term826 = new Long(3825396310311739952L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term826;
        callMethod(klass, "setId", argTypes, term755, args);
    }

};


