package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class ArtistaService_update_500963103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638;
     Object term640;

    public ArtistaService_update_500963103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638 = new Long(-2585684163342970173L);
        Long term641 = new Long(8059786003080744426L);
        Class<? extends Object> term678 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term677 = ((Class) term678).getDeclaredField((String) "DUPLA");
        ((Field) term677).setAccessible(true);
        Object enum1 = ((Field) term677).get((Object) null);
        term640 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term640, term640.getClass(), "id", term641);
        setField(term640, term640.getClass(), "nome", "xOEqzGAmDU");
        setField(term640, term640.getClass(), "tipo", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.ArtistaService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Object[] args = new Object[2];
        args[0] = term638;
        args[1] = term640;
        callMethod(klass, "update", argTypes, null, args);
    }

};


