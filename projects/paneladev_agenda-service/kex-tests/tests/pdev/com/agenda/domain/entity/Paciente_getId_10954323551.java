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

public class Paciente_getId_10954323551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3561;

    public Paciente_getId_10954323551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3562 = new Long(138235087558060686L);
        Long term3615 = new Long(5381386339318883012L);
        Long term3618 = new Long(-1333707622307134180L);
        Object term3614 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3614, term3614.getClass(), "id", term3615);
        setField(term3614, term3614.getClass(), "rua", "");
        setField(term3614, term3614.getClass(), "numero", term3618);
        setField(term3614, term3614.getClass(), "complemento", "");
        setField(term3614, term3614.getClass(), "bairro", "");
        Long term3623 = new Long(-4360569253593381888L);
        Long term3626 = new Long(1457594663983990440L);
        Object term3622 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3622, term3622.getClass(), "id", term3623);
        setField(term3622, term3622.getClass(), "rua", "");
        setField(term3622, term3622.getClass(), "numero", term3626);
        setField(term3622, term3622.getClass(), "complemento", "");
        setField(term3622, term3622.getClass(), "bairro", "");
        Long term3631 = new Long(3452833434644634217L);
        Long term3634 = new Long(-8603648071751666348L);
        Object term3630 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3630, term3630.getClass(), "id", term3631);
        setField(term3630, term3630.getClass(), "rua", "");
        setField(term3630, term3630.getClass(), "numero", term3634);
        setField(term3630, term3630.getClass(), "complemento", "");
        setField(term3630, term3630.getClass(), "bairro", "");
        Long term3639 = new Long(-7884871963229073324L);
        Long term3642 = new Long(-8649738738252714180L);
        Object term3638 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3638, term3638.getClass(), "id", term3639);
        setField(term3638, term3638.getClass(), "rua", "");
        setField(term3638, term3638.getClass(), "numero", term3642);
        setField(term3638, term3638.getClass(), "complemento", "");
        setField(term3638, term3638.getClass(), "bairro", "");
        Long term3647 = new Long(-7278883608542636188L);
        Long term3650 = new Long(-1539859611880912454L);
        Object term3646 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3646, term3646.getClass(), "id", term3647);
        setField(term3646, term3646.getClass(), "rua", "");
        setField(term3646, term3646.getClass(), "numero", term3650);
        setField(term3646, term3646.getClass(), "complemento", "");
        setField(term3646, term3646.getClass(), "bairro", "");
        ArrayList term3612 = new ArrayList();
        ((ArrayList) term3612).add(term3614);
        ((ArrayList) term3612).add(term3622);
        ((ArrayList) term3612).add(term3630);
        ((ArrayList) term3612).add(term3638);
        ((ArrayList) term3612).add(term3646);
        term3561 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term3561, term3561.getClass(), "id", term3562);
        setField(term3561, term3561.getClass(), "nome", "onQLVONGuf");
        setField(term3561, term3561.getClass(), "sobrenome", "SOrEHbcbmn");
        setField(term3561, term3561.getClass(), "email", "bnsyeQXFdu");
        setField(term3561, term3561.getClass(), "cpf", "BwtdjiefJn");
        setField(term3561, term3561.getClass(), "enderecos", term3612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3561, args);
    }

};


