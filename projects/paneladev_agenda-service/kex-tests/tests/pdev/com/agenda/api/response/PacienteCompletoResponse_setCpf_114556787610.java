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

public class PacienteCompletoResponse_setCpf_114556787610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1331;

    public PacienteCompletoResponse_setCpf_114556787610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1332 = new Long(846579494941632714L);
        Long term1385 = new Long(6689117472719450333L);
        Long term1388 = new Long(5836128569274066678L);
        Object term1384 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1384, term1384.getClass(), "id", term1385);
        setField(term1384, term1384.getClass(), "rua", "");
        setField(term1384, term1384.getClass(), "numero", term1388);
        setField(term1384, term1384.getClass(), "complemento", "");
        setField(term1384, term1384.getClass(), "bairro", "");
        Long term1393 = new Long(-2177368829816872572L);
        Long term1396 = new Long(-8463029266761149071L);
        Object term1392 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1392, term1392.getClass(), "id", term1393);
        setField(term1392, term1392.getClass(), "rua", "");
        setField(term1392, term1392.getClass(), "numero", term1396);
        setField(term1392, term1392.getClass(), "complemento", "");
        setField(term1392, term1392.getClass(), "bairro", "");
        Long term1401 = new Long(3133860696238261492L);
        Long term1404 = new Long(7247160664318067468L);
        Object term1400 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1400, term1400.getClass(), "id", term1401);
        setField(term1400, term1400.getClass(), "rua", "");
        setField(term1400, term1400.getClass(), "numero", term1404);
        setField(term1400, term1400.getClass(), "complemento", "");
        setField(term1400, term1400.getClass(), "bairro", "");
        Long term1409 = new Long(2135754395358000892L);
        Long term1412 = new Long(-8085190702504231560L);
        Object term1408 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1408, term1408.getClass(), "id", term1409);
        setField(term1408, term1408.getClass(), "rua", "");
        setField(term1408, term1408.getClass(), "numero", term1412);
        setField(term1408, term1408.getClass(), "complemento", "");
        setField(term1408, term1408.getClass(), "bairro", "");
        Long term1417 = new Long(1672578078364590450L);
        Long term1420 = new Long(4949335493504695457L);
        Object term1416 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1416, term1416.getClass(), "id", term1417);
        setField(term1416, term1416.getClass(), "rua", "");
        setField(term1416, term1416.getClass(), "numero", term1420);
        setField(term1416, term1416.getClass(), "complemento", "");
        setField(term1416, term1416.getClass(), "bairro", "");
        Long term1425 = new Long(-5216789073301458893L);
        Long term1428 = new Long(-1832940336320585644L);
        Object term1424 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1424, term1424.getClass(), "id", term1425);
        setField(term1424, term1424.getClass(), "rua", "");
        setField(term1424, term1424.getClass(), "numero", term1428);
        setField(term1424, term1424.getClass(), "complemento", "");
        setField(term1424, term1424.getClass(), "bairro", "");
        ArrayList term1382 = new ArrayList();
        ((ArrayList) term1382).add(term1384);
        ((ArrayList) term1382).add(term1392);
        ((ArrayList) term1382).add(term1400);
        ((ArrayList) term1382).add(term1408);
        ((ArrayList) term1382).add(term1416);
        ((ArrayList) term1382).add(term1424);
        term1331 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term1331, term1331.getClass(), "id", term1332);
        setField(term1331, term1331.getClass(), "nome", "VeDtgDzGAN");
        setField(term1331, term1331.getClass(), "sobrenome", "aWYOWZFyaX");
        setField(term1331, term1331.getClass(), "email", "BRIVNtfUWU");
        setField(term1331, term1331.getClass(), "cpf", "DbiCVtPPCT");
        setField(term1331, term1331.getClass(), "enderecos", term1382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kVEZMHmRtR";
        callMethod(klass, "setCpf", argTypes, term1331, args);
    }

};


