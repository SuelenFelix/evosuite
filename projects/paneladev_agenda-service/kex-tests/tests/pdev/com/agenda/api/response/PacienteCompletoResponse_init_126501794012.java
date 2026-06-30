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
import java.util.LinkedList;
import java.lang.Object;

public class PacienteCompletoResponse_init_126501794012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1634;
     Object term1684;

    public PacienteCompletoResponse_init_126501794012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1634 = new Long(1667122142089513324L);
        Long term1688 = new Long(-6342139649364011743L);
        Long term1702 = new Long(-4924950707540628022L);
        Object term1687 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1687, term1687.getClass(), "id", term1688);
        setField(term1687, term1687.getClass(), "rua", "tlzpzIjMib");
        setField(term1687, term1687.getClass(), "numero", term1702);
        setField(term1687, term1687.getClass(), "complemento", "AZdLeSugwv");
        setField(term1687, term1687.getClass(), "bairro", "RMsXuyzKJV");
        Long term1730 = new Long(-4393710401270724527L);
        Long term1733 = new Long(-4822736661741380518L);
        Object term1729 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1729, term1729.getClass(), "id", term1730);
        setField(term1729, term1729.getClass(), "rua", "");
        setField(term1729, term1729.getClass(), "numero", term1733);
        setField(term1729, term1729.getClass(), "complemento", "");
        setField(term1729, term1729.getClass(), "bairro", "");
        Long term1739 = new Long(-5386201758403679145L);
        Long term1741 = new Long(-7268507582722666254L);
        Object term1738 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1738, term1738.getClass(), "id", term1739);
        setField(term1738, term1738.getClass(), "rua", null);
        setField(term1738, term1738.getClass(), "numero", term1741);
        setField(term1738, term1738.getClass(), "complemento", null);
        setField(term1738, term1738.getClass(), "bairro", null);
        term1684 = new LinkedList();
        ((LinkedList) term1684).add(term1687);
        ((LinkedList) term1684).add(term1729);
        ((LinkedList) term1684).add(term1738);
        ((LinkedList) term1684).add((Object)null);
        ((LinkedList) term1684).add((Object)null);
        ((LinkedList) term1684).add((Object)null);
        ((LinkedList) term1684).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = term1634;
        args[1] = "ZkMALXpEAZ";
        args[2] = "tXfQjSqDzN";
        args[3] = "BjugTaMcxJ";
        args[4] = "vGiuZVPJNH";
        args[5] = term1684;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


