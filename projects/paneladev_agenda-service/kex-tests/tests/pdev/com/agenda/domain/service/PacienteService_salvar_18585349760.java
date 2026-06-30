package pdev.com.agenda.domain.service;

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
import static pdev.com.agenda.domain.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PacienteService_salvar_18585349760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PacienteService_salvar_18585349760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term55 = new Long(6375119433582206027L);
        Long term58 = new Long(-8257434502486459194L);
        Object term54 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term54, term54.getClass(), "id", term55);
        setField(term54, term54.getClass(), "rua", "");
        setField(term54, term54.getClass(), "numero", term58);
        setField(term54, term54.getClass(), "complemento", "");
        setField(term54, term54.getClass(), "bairro", "");
        Long term63 = new Long(-8400487765614892086L);
        Long term66 = new Long(5270370404989704783L);
        Object term62 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term62, term62.getClass(), "id", term63);
        setField(term62, term62.getClass(), "rua", "");
        setField(term62, term62.getClass(), "numero", term66);
        setField(term62, term62.getClass(), "complemento", "");
        setField(term62, term62.getClass(), "bairro", "");
        Long term71 = new Long(7411271909051562686L);
        Long term74 = new Long(4872422362414183754L);
        Object term70 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term70, term70.getClass(), "id", term71);
        setField(term70, term70.getClass(), "rua", "");
        setField(term70, term70.getClass(), "numero", term74);
        setField(term70, term70.getClass(), "complemento", "");
        setField(term70, term70.getClass(), "bairro", "");
        Long term79 = new Long(6811161968424632369L);
        Long term82 = new Long(-7237588299778557629L);
        Object term78 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term78, term78.getClass(), "id", term79);
        setField(term78, term78.getClass(), "rua", "");
        setField(term78, term78.getClass(), "numero", term82);
        setField(term78, term78.getClass(), "complemento", "");
        setField(term78, term78.getClass(), "bairro", "");
        Long term87 = new Long(6967924379644551255L);
        Long term90 = new Long(-2813493605142626659L);
        Object term86 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term86, term86.getClass(), "id", term87);
        setField(term86, term86.getClass(), "rua", "");
        setField(term86, term86.getClass(), "numero", term90);
        setField(term86, term86.getClass(), "complemento", "");
        setField(term86, term86.getClass(), "bairro", "");
        ArrayList term52 = new ArrayList();
        ((ArrayList) term52).add(term54);
        ((ArrayList) term52).add(term62);
        ((ArrayList) term52).add(term70);
        ((ArrayList) term52).add(term78);
        ((ArrayList) term52).add(term86);
        term1 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "nome", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "sobrenome", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "email", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "cpf", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "enderecos", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.service.PacienteService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "salvar", argTypes, null, args);
    }

};


