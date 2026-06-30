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

public class Paciente_setSobrenome_3515383719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4553;

    public Paciente_setSobrenome_3515383719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4554 = new Long(-8338004844694486146L);
        Long term4607 = new Long(6426732259596412988L);
        Long term4610 = new Long(185793058502220865L);
        Object term4606 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4606, term4606.getClass(), "id", term4607);
        setField(term4606, term4606.getClass(), "rua", "");
        setField(term4606, term4606.getClass(), "numero", term4610);
        setField(term4606, term4606.getClass(), "complemento", "");
        setField(term4606, term4606.getClass(), "bairro", "");
        Long term4615 = new Long(-7698746988132548371L);
        Long term4618 = new Long(2145420811068634601L);
        Object term4614 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4614, term4614.getClass(), "id", term4615);
        setField(term4614, term4614.getClass(), "rua", "");
        setField(term4614, term4614.getClass(), "numero", term4618);
        setField(term4614, term4614.getClass(), "complemento", "");
        setField(term4614, term4614.getClass(), "bairro", "");
        Long term4623 = new Long(2191130532479601175L);
        Long term4626 = new Long(860079646007397083L);
        Object term4622 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4622, term4622.getClass(), "id", term4623);
        setField(term4622, term4622.getClass(), "rua", "");
        setField(term4622, term4622.getClass(), "numero", term4626);
        setField(term4622, term4622.getClass(), "complemento", "");
        setField(term4622, term4622.getClass(), "bairro", "");
        Long term4631 = new Long(3230472384687362867L);
        Long term4634 = new Long(-1145146470850585022L);
        Object term4630 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4630, term4630.getClass(), "id", term4631);
        setField(term4630, term4630.getClass(), "rua", "");
        setField(term4630, term4630.getClass(), "numero", term4634);
        setField(term4630, term4630.getClass(), "complemento", "");
        setField(term4630, term4630.getClass(), "bairro", "");
        Long term4639 = new Long(1993646237353405740L);
        Long term4642 = new Long(-4043093655001688454L);
        Object term4638 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4638, term4638.getClass(), "id", term4639);
        setField(term4638, term4638.getClass(), "rua", "");
        setField(term4638, term4638.getClass(), "numero", term4642);
        setField(term4638, term4638.getClass(), "complemento", "");
        setField(term4638, term4638.getClass(), "bairro", "");
        Long term4647 = new Long(-419800263764810394L);
        Long term4650 = new Long(5904678961906211249L);
        Object term4646 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4646, term4646.getClass(), "id", term4647);
        setField(term4646, term4646.getClass(), "rua", "");
        setField(term4646, term4646.getClass(), "numero", term4650);
        setField(term4646, term4646.getClass(), "complemento", "");
        setField(term4646, term4646.getClass(), "bairro", "");
        ArrayList term4604 = new ArrayList();
        ((ArrayList) term4604).add(term4606);
        ((ArrayList) term4604).add(term4614);
        ((ArrayList) term4604).add(term4622);
        ((ArrayList) term4604).add(term4630);
        ((ArrayList) term4604).add(term4638);
        ((ArrayList) term4604).add(term4646);
        term4553 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term4553, term4553.getClass(), "id", term4554);
        setField(term4553, term4553.getClass(), "nome", "bdyhHbDAmJ");
        setField(term4553, term4553.getClass(), "sobrenome", "BBXiTNHqGE");
        setField(term4553, term4553.getClass(), "email", "IEYhJmgCVd");
        setField(term4553, term4553.getClass(), "cpf", "KSJeYkkvpk");
        setField(term4553, term4553.getClass(), "enderecos", term4604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sOdkipUKRu";
        callMethod(klass, "setSobrenome", argTypes, term4553, args);
    }

};


