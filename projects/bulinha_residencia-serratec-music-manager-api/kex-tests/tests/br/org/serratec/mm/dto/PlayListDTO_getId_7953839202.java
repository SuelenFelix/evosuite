package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PlayListDTO_getId_7953839202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6689;

    public PlayListDTO_getId_7953839202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6690 = new Long(-1885698929232124806L);
        Long term6707 = new Long(5731563613239387113L);
        Integer term6710 = new Integer(335112684);
        Object term6706 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6706, term6706.getClass(), "id", term6707);
        setField(term6706, term6706.getClass(), "titulo", "");
        setField(term6706, term6706.getClass(), "minutos", term6710);
        ArrayList term6704 = new ArrayList();
        ((ArrayList) term6704).add(term6706);
        term6689 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term6689, term6689.getClass(), "id", term6690);
        setField(term6689, term6689.getClass(), "nome", "pumvwBWvpy");
        setField(term6689, term6689.getClass(), "musicas", term6704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6689, args);
    }

};


