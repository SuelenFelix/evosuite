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

public class PlayListDTO_setId_12254256783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6724;
     Object term6749;

    public PlayListDTO_setId_12254256783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6725 = new Long(3381333711768010594L);
        Long term6742 = new Long(3580984732036213717L);
        Integer term6745 = new Integer(1551099402);
        Object term6741 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6741, term6741.getClass(), "id", term6742);
        setField(term6741, term6741.getClass(), "titulo", "");
        setField(term6741, term6741.getClass(), "minutos", term6745);
        ArrayList term6739 = new ArrayList();
        ((ArrayList) term6739).add(term6741);
        term6724 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term6724, term6724.getClass(), "id", term6725);
        setField(term6724, term6724.getClass(), "nome", "RDnkgWkcbz");
        setField(term6724, term6724.getClass(), "musicas", term6739);
        term6749 = new Long(5330761990446327930L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term6749;
        callMethod(klass, "setId", argTypes, term6724, args);
    }

};


