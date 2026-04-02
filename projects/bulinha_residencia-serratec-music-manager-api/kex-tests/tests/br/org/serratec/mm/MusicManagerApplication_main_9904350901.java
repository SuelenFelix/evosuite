package br.org.serratec.mm;

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
import static br.org.serratec.mm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MusicManagerApplication_main_9904350901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12602;

    public MusicManagerApplication_main_9904350901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12602 = (Object[]) newArray("java.lang.String", 4);
        setElement(term12602, 0, "VuLLXpvPpZ");
        setElement(term12602, 1, "UEdzEKEEEV");
        setElement(term12602, 2, "BcENaQFYSd");
        setElement(term12602, 3, "POPYycoDBy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.MusicManagerApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12602;
        callMethod(klass, "main", argTypes, null, args);
    }

};


