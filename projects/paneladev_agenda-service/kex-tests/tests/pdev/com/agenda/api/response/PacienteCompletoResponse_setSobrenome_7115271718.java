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

public class PacienteCompletoResponse_setSobrenome_7115271718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;

    public PacienteCompletoResponse_setSobrenome_7115271718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1034 = new Long(-6723783499250797216L);
        Long term1087 = new Long(41775768178052008L);
        Long term1090 = new Long(6682528376118987775L);
        Object term1086 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1086, term1086.getClass(), "id", term1087);
        setField(term1086, term1086.getClass(), "rua", "");
        setField(term1086, term1086.getClass(), "numero", term1090);
        setField(term1086, term1086.getClass(), "complemento", "");
        setField(term1086, term1086.getClass(), "bairro", "");
        Long term1095 = new Long(682356318767179819L);
        Long term1098 = new Long(-7291743527973326814L);
        Object term1094 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1094, term1094.getClass(), "id", term1095);
        setField(term1094, term1094.getClass(), "rua", "");
        setField(term1094, term1094.getClass(), "numero", term1098);
        setField(term1094, term1094.getClass(), "complemento", "");
        setField(term1094, term1094.getClass(), "bairro", "");
        Long term1103 = new Long(-5963439350418910964L);
        Long term1106 = new Long(9013624480170062917L);
        Object term1102 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1102, term1102.getClass(), "id", term1103);
        setField(term1102, term1102.getClass(), "rua", "");
        setField(term1102, term1102.getClass(), "numero", term1106);
        setField(term1102, term1102.getClass(), "complemento", "");
        setField(term1102, term1102.getClass(), "bairro", "");
        Long term1111 = new Long(7862575738391801707L);
        Long term1114 = new Long(50358265865610362L);
        Object term1110 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1110, term1110.getClass(), "id", term1111);
        setField(term1110, term1110.getClass(), "rua", "");
        setField(term1110, term1110.getClass(), "numero", term1114);
        setField(term1110, term1110.getClass(), "complemento", "");
        setField(term1110, term1110.getClass(), "bairro", "");
        Long term1119 = new Long(5510783420697225605L);
        Long term1122 = new Long(6005241913654469005L);
        Object term1118 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1118, term1118.getClass(), "id", term1119);
        setField(term1118, term1118.getClass(), "rua", "");
        setField(term1118, term1118.getClass(), "numero", term1122);
        setField(term1118, term1118.getClass(), "complemento", "");
        setField(term1118, term1118.getClass(), "bairro", "");
        Long term1127 = new Long(-1983291584002806658L);
        Long term1130 = new Long(5946780097489996391L);
        Object term1126 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1126, term1126.getClass(), "id", term1127);
        setField(term1126, term1126.getClass(), "rua", "");
        setField(term1126, term1126.getClass(), "numero", term1130);
        setField(term1126, term1126.getClass(), "complemento", "");
        setField(term1126, term1126.getClass(), "bairro", "");
        Long term1135 = new Long(-8652538484981166496L);
        Long term1138 = new Long(2701184207686293431L);
        Object term1134 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1134, term1134.getClass(), "id", term1135);
        setField(term1134, term1134.getClass(), "rua", "");
        setField(term1134, term1134.getClass(), "numero", term1138);
        setField(term1134, term1134.getClass(), "complemento", "");
        setField(term1134, term1134.getClass(), "bairro", "");
        ArrayList term1084 = new ArrayList();
        ((ArrayList) term1084).add(term1086);
        ((ArrayList) term1084).add(term1094);
        ((ArrayList) term1084).add(term1102);
        ((ArrayList) term1084).add(term1110);
        ((ArrayList) term1084).add(term1118);
        ((ArrayList) term1084).add(term1126);
        ((ArrayList) term1084).add(term1134);
        term1033 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term1033, term1033.getClass(), "id", term1034);
        setField(term1033, term1033.getClass(), "nome", "JDaAnsVTGV");
        setField(term1033, term1033.getClass(), "sobrenome", "mLUZFTfjle");
        setField(term1033, term1033.getClass(), "email", "xIeFjkHkOe");
        setField(term1033, term1033.getClass(), "cpf", "SdCKLMIYnX");
        setField(term1033, term1033.getClass(), "enderecos", term1084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        callMethod(klass, "setSobrenome", argTypes, term1033, args);
    }

};


