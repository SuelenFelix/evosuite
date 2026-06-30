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

public class PacienteCompletoResponse_setNome_1974841047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public PacienteCompletoResponse_setNome_1974841047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term869 = new Long(-3838084482494604218L);
        Long term922 = new Long(3892018155439224435L);
        Long term925 = new Long(5953383087795962419L);
        Object term921 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term921, term921.getClass(), "id", term922);
        setField(term921, term921.getClass(), "rua", "");
        setField(term921, term921.getClass(), "numero", term925);
        setField(term921, term921.getClass(), "complemento", "");
        setField(term921, term921.getClass(), "bairro", "");
        Long term930 = new Long(7994303628307559416L);
        Long term933 = new Long(2443640364875054177L);
        Object term929 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term929, term929.getClass(), "id", term930);
        setField(term929, term929.getClass(), "rua", "");
        setField(term929, term929.getClass(), "numero", term933);
        setField(term929, term929.getClass(), "complemento", "");
        setField(term929, term929.getClass(), "bairro", "");
        Long term938 = new Long(-1610676979013636850L);
        Long term941 = new Long(2062173786000223358L);
        Object term937 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term937, term937.getClass(), "id", term938);
        setField(term937, term937.getClass(), "rua", "");
        setField(term937, term937.getClass(), "numero", term941);
        setField(term937, term937.getClass(), "complemento", "");
        setField(term937, term937.getClass(), "bairro", "");
        Long term946 = new Long(-8658027316505137504L);
        Long term949 = new Long(414749984815662075L);
        Object term945 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term945, term945.getClass(), "id", term946);
        setField(term945, term945.getClass(), "rua", "");
        setField(term945, term945.getClass(), "numero", term949);
        setField(term945, term945.getClass(), "complemento", "");
        setField(term945, term945.getClass(), "bairro", "");
        Long term954 = new Long(463622836963501975L);
        Long term957 = new Long(305759998609888272L);
        Object term953 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term953, term953.getClass(), "id", term954);
        setField(term953, term953.getClass(), "rua", "");
        setField(term953, term953.getClass(), "numero", term957);
        setField(term953, term953.getClass(), "complemento", "");
        setField(term953, term953.getClass(), "bairro", "");
        Long term962 = new Long(-8654565919063661957L);
        Long term965 = new Long(-5248475803419977214L);
        Object term961 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term961, term961.getClass(), "id", term962);
        setField(term961, term961.getClass(), "rua", "");
        setField(term961, term961.getClass(), "numero", term965);
        setField(term961, term961.getClass(), "complemento", "");
        setField(term961, term961.getClass(), "bairro", "");
        ArrayList term919 = new ArrayList();
        ((ArrayList) term919).add(term921);
        ((ArrayList) term919).add(term929);
        ((ArrayList) term919).add(term937);
        ((ArrayList) term919).add(term945);
        ((ArrayList) term919).add(term953);
        ((ArrayList) term919).add(term961);
        term868 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term868, term868.getClass(), "id", term869);
        setField(term868, term868.getClass(), "nome", "vjxIhXHxGR");
        setField(term868, term868.getClass(), "sobrenome", "QXzGXbEXMu");
        setField(term868, term868.getClass(), "email", "qxSDVejjiY");
        setField(term868, term868.getClass(), "cpf", "xBsXSDjXYK");
        setField(term868, term868.getClass(), "enderecos", term919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHfTrWKMPk";
        callMethod(klass, "setNome", argTypes, term868, args);
    }

};


