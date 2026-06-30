package pdev.com.agenda.api.mapper;

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
import static pdev.com.agenda.api.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PacienteMapper_toPacienteCompletoResponse_15912285352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public PacienteMapper_toPacienteCompletoResponse_15912285352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term228 = new Long(-4325723315152823407L);
        Long term281 = new Long(2535595959091595249L);
        Long term284 = new Long(-5476826692763582090L);
        Object term280 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term280, term280.getClass(), "id", term281);
        setField(term280, term280.getClass(), "rua", "");
        setField(term280, term280.getClass(), "numero", term284);
        setField(term280, term280.getClass(), "complemento", "");
        setField(term280, term280.getClass(), "bairro", "");
        Long term289 = new Long(-872011222785455006L);
        Long term292 = new Long(-316468845751588286L);
        Object term288 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term288, term288.getClass(), "id", term289);
        setField(term288, term288.getClass(), "rua", "");
        setField(term288, term288.getClass(), "numero", term292);
        setField(term288, term288.getClass(), "complemento", "");
        setField(term288, term288.getClass(), "bairro", "");
        Long term297 = new Long(5127676408959197577L);
        Long term300 = new Long(-6573104506744284592L);
        Object term296 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term296, term296.getClass(), "id", term297);
        setField(term296, term296.getClass(), "rua", "");
        setField(term296, term296.getClass(), "numero", term300);
        setField(term296, term296.getClass(), "complemento", "");
        setField(term296, term296.getClass(), "bairro", "");
        Long term305 = new Long(-4920224193275732920L);
        Long term308 = new Long(8428634514691209827L);
        Object term304 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term304, term304.getClass(), "id", term305);
        setField(term304, term304.getClass(), "rua", "");
        setField(term304, term304.getClass(), "numero", term308);
        setField(term304, term304.getClass(), "complemento", "");
        setField(term304, term304.getClass(), "bairro", "");
        ArrayList term278 = new ArrayList();
        ((ArrayList) term278).add(term280);
        ((ArrayList) term278).add(term288);
        ((ArrayList) term278).add(term296);
        ((ArrayList) term278).add(term304);
        term227 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term227, term227.getClass(), "id", term228);
        setField(term227, term227.getClass(), "nome", "eZFUvlxvGV");
        setField(term227, term227.getClass(), "sobrenome", "BYqFIqCKAV");
        setField(term227, term227.getClass(), "email", "vrQLuWIDJX");
        setField(term227, term227.getClass(), "cpf", "flxyYxBRtu");
        setField(term227, term227.getClass(), "enderecos", term278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.mapper.PacienteMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Object[] args = new Object[1];
        args[0] = term227;
        callMethod(klass, "toPacienteCompletoResponse", argTypes, null, args);
    }

};


