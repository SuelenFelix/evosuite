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

public class PacienteService_alterar_5047045241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term138;

    public PacienteService_alterar_5047045241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = new Long(-8885298608300233488L);
        Long term139 = new Long(-4325723315152823407L);
        Long term192 = new Long(2535595959091595249L);
        Long term195 = new Long(-5476826692763582090L);
        Object term191 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term191, term191.getClass(), "id", term192);
        setField(term191, term191.getClass(), "rua", "");
        setField(term191, term191.getClass(), "numero", term195);
        setField(term191, term191.getClass(), "complemento", "");
        setField(term191, term191.getClass(), "bairro", "");
        Long term200 = new Long(-872011222785455006L);
        Long term203 = new Long(-316468845751588286L);
        Object term199 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term199, term199.getClass(), "id", term200);
        setField(term199, term199.getClass(), "rua", "");
        setField(term199, term199.getClass(), "numero", term203);
        setField(term199, term199.getClass(), "complemento", "");
        setField(term199, term199.getClass(), "bairro", "");
        Long term208 = new Long(5127676408959197577L);
        Long term211 = new Long(-6573104506744284592L);
        Object term207 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term207, term207.getClass(), "id", term208);
        setField(term207, term207.getClass(), "rua", "");
        setField(term207, term207.getClass(), "numero", term211);
        setField(term207, term207.getClass(), "complemento", "");
        setField(term207, term207.getClass(), "bairro", "");
        Long term216 = new Long(-4920224193275732920L);
        Long term219 = new Long(8428634514691209827L);
        Object term215 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term215, term215.getClass(), "id", term216);
        setField(term215, term215.getClass(), "rua", "");
        setField(term215, term215.getClass(), "numero", term219);
        setField(term215, term215.getClass(), "complemento", "");
        setField(term215, term215.getClass(), "bairro", "");
        ArrayList term189 = new ArrayList();
        ((ArrayList) term189).add(term191);
        ((ArrayList) term189).add(term199);
        ((ArrayList) term189).add(term207);
        ((ArrayList) term189).add(term215);
        term138 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term138, term138.getClass(), "id", term139);
        setField(term138, term138.getClass(), "nome", "pCTimMblYc");
        setField(term138, term138.getClass(), "sobrenome", "hNxWaHcfhY");
        setField(term138, term138.getClass(), "email", "RkybSrpybU");
        setField(term138, term138.getClass(), "cpf", "xOEqzGAmDU");
        setField(term138, term138.getClass(), "enderecos", term189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.service.PacienteService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Object[] args = new Object[2];
        args[0] = term136;
        args[1] = term138;
        callMethod(klass, "alterar", argTypes, null, args);
    }

};


