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

public class PlayListDTO_getNome_19448240994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6761;

    public PlayListDTO_getNome_19448240994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6762 = new Long(-3954795081650780841L);
        Long term6779 = new Long(3288791194263207397L);
        Integer term6782 = new Integer(-2027534003);
        Object term6778 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6778, term6778.getClass(), "id", term6779);
        setField(term6778, term6778.getClass(), "titulo", "");
        setField(term6778, term6778.getClass(), "minutos", term6782);
        Long term6785 = new Long(3288941170644426558L);
        Integer term6788 = new Integer(1063420942);
        Object term6784 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6784, term6784.getClass(), "id", term6785);
        setField(term6784, term6784.getClass(), "titulo", "");
        setField(term6784, term6784.getClass(), "minutos", term6788);
        ArrayList term6776 = new ArrayList();
        ((ArrayList) term6776).add(term6778);
        ((ArrayList) term6776).add(term6784);
        term6761 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term6761, term6761.getClass(), "id", term6762);
        setField(term6761, term6761.getClass(), "nome", "hePqROaplw");
        setField(term6761, term6761.getClass(), "musicas", term6776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term6761, args);
    }

};


