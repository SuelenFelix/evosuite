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

public class PacienteCompletoResponse_getNome_15223924641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;

    public PacienteCompletoResponse_getNome_15223924641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137 = new Long(-8885298608300233488L);
        Long term190 = new Long(-4325723315152823407L);
        Long term193 = new Long(2535595959091595249L);
        Object term189 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term189, term189.getClass(), "id", term190);
        setField(term189, term189.getClass(), "rua", "");
        setField(term189, term189.getClass(), "numero", term193);
        setField(term189, term189.getClass(), "complemento", "");
        setField(term189, term189.getClass(), "bairro", "");
        Long term198 = new Long(-5476826692763582090L);
        Long term201 = new Long(-872011222785455006L);
        Object term197 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term197, term197.getClass(), "id", term198);
        setField(term197, term197.getClass(), "rua", "");
        setField(term197, term197.getClass(), "numero", term201);
        setField(term197, term197.getClass(), "complemento", "");
        setField(term197, term197.getClass(), "bairro", "");
        Long term206 = new Long(-316468845751588286L);
        Long term209 = new Long(5127676408959197577L);
        Object term205 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term205, term205.getClass(), "id", term206);
        setField(term205, term205.getClass(), "rua", "");
        setField(term205, term205.getClass(), "numero", term209);
        setField(term205, term205.getClass(), "complemento", "");
        setField(term205, term205.getClass(), "bairro", "");
        Long term214 = new Long(-6573104506744284592L);
        Long term217 = new Long(-4920224193275732920L);
        Object term213 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term213, term213.getClass(), "id", term214);
        setField(term213, term213.getClass(), "rua", "");
        setField(term213, term213.getClass(), "numero", term217);
        setField(term213, term213.getClass(), "complemento", "");
        setField(term213, term213.getClass(), "bairro", "");
        ArrayList term187 = new ArrayList();
        ((ArrayList) term187).add(term189);
        ((ArrayList) term187).add(term197);
        ((ArrayList) term187).add(term205);
        ((ArrayList) term187).add(term213);
        term136 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term136, term136.getClass(), "id", term137);
        setField(term136, term136.getClass(), "nome", "pCTimMblYc");
        setField(term136, term136.getClass(), "sobrenome", "hNxWaHcfhY");
        setField(term136, term136.getClass(), "email", "RkybSrpybU");
        setField(term136, term136.getClass(), "cpf", "xOEqzGAmDU");
        setField(term136, term136.getClass(), "enderecos", term187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term136, args);
    }

};


