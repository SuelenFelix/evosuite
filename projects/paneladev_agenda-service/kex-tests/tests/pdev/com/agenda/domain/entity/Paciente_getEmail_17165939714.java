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

public class Paciente_getEmail_17165939714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3942;

    public Paciente_getEmail_17165939714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3943 = new Long(-5724112525188606013L);
        Long term3996 = new Long(-6100012593724108983L);
        Long term3999 = new Long(5465527210299101732L);
        Object term3995 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3995, term3995.getClass(), "id", term3996);
        setField(term3995, term3995.getClass(), "rua", "");
        setField(term3995, term3995.getClass(), "numero", term3999);
        setField(term3995, term3995.getClass(), "complemento", "");
        setField(term3995, term3995.getClass(), "bairro", "");
        Long term4004 = new Long(4699157009689333952L);
        Long term4007 = new Long(-78240609295693193L);
        Object term4003 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4003, term4003.getClass(), "id", term4004);
        setField(term4003, term4003.getClass(), "rua", "");
        setField(term4003, term4003.getClass(), "numero", term4007);
        setField(term4003, term4003.getClass(), "complemento", "");
        setField(term4003, term4003.getClass(), "bairro", "");
        Long term4012 = new Long(3090901538358721367L);
        Long term4015 = new Long(-1677189124507026637L);
        Object term4011 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4011, term4011.getClass(), "id", term4012);
        setField(term4011, term4011.getClass(), "rua", "");
        setField(term4011, term4011.getClass(), "numero", term4015);
        setField(term4011, term4011.getClass(), "complemento", "");
        setField(term4011, term4011.getClass(), "bairro", "");
        ArrayList term3993 = new ArrayList();
        ((ArrayList) term3993).add(term3995);
        ((ArrayList) term3993).add(term4003);
        ((ArrayList) term3993).add(term4011);
        term3942 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term3942, term3942.getClass(), "id", term3943);
        setField(term3942, term3942.getClass(), "nome", "GEJABPlHSI");
        setField(term3942, term3942.getClass(), "sobrenome", "aQFUvuaYxd");
        setField(term3942, term3942.getClass(), "email", "zNFLXMifnS");
        setField(term3942, term3942.getClass(), "cpf", "HHQcYMSBVc");
        setField(term3942, term3942.getClass(), "enderecos", term3993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3942, args);
    }

};


