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

public class PacienteCompletoResponse_getEmail_15153077833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public PacienteCompletoResponse_getEmail_15153077833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term383 = new Long(-4502405999831680926L);
        Long term436 = new Long(1967728129628047933L);
        Long term439 = new Long(2120084523938730454L);
        Object term435 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term435, term435.getClass(), "id", term436);
        setField(term435, term435.getClass(), "rua", "");
        setField(term435, term435.getClass(), "numero", term439);
        setField(term435, term435.getClass(), "complemento", "");
        setField(term435, term435.getClass(), "bairro", "");
        Long term444 = new Long(6855071767938501807L);
        Long term447 = new Long(-5892135042702373494L);
        Object term443 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term443, term443.getClass(), "id", term444);
        setField(term443, term443.getClass(), "rua", "");
        setField(term443, term443.getClass(), "numero", term447);
        setField(term443, term443.getClass(), "complemento", "");
        setField(term443, term443.getClass(), "bairro", "");
        Long term452 = new Long(5262507301787091109L);
        Long term455 = new Long(-6823727938421990489L);
        Object term451 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term451, term451.getClass(), "id", term452);
        setField(term451, term451.getClass(), "rua", "");
        setField(term451, term451.getClass(), "numero", term455);
        setField(term451, term451.getClass(), "complemento", "");
        setField(term451, term451.getClass(), "bairro", "");
        Long term460 = new Long(-484994522244390100L);
        Long term463 = new Long(1233889271256172047L);
        Object term459 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term459, term459.getClass(), "id", term460);
        setField(term459, term459.getClass(), "rua", "");
        setField(term459, term459.getClass(), "numero", term463);
        setField(term459, term459.getClass(), "complemento", "");
        setField(term459, term459.getClass(), "bairro", "");
        ArrayList term433 = new ArrayList();
        ((ArrayList) term433).add(term435);
        ((ArrayList) term433).add(term443);
        ((ArrayList) term433).add(term451);
        ((ArrayList) term433).add(term459);
        term382 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term382, term382.getClass(), "id", term383);
        setField(term382, term382.getClass(), "nome", "xLbjWUgOIL");
        setField(term382, term382.getClass(), "sobrenome", "jDtqGUpnZN");
        setField(term382, term382.getClass(), "email", "nGKItKLYNC");
        setField(term382, term382.getClass(), "cpf", "UiUYnPrcCi");
        setField(term382, term382.getClass(), "enderecos", term433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term382, args);
    }

};


