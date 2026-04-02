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
import java.util.LinkedList;

public class PlayListDTO_setMusicas_12825562527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6924;
     Object term6997;

    public PlayListDTO_setMusicas_12825562527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6925 = new Long(1993646237353405740L);
        Long term6942 = new Long(-4043093655001688454L);
        Integer term6945 = new Integer(1090617576);
        Object term6941 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6941, term6941.getClass(), "id", term6942);
        setField(term6941, term6941.getClass(), "titulo", "");
        setField(term6941, term6941.getClass(), "minutos", term6945);
        Long term6948 = new Long(-419800263764810394L);
        Integer term6951 = new Integer(-1547384488);
        Object term6947 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6947, term6947.getClass(), "id", term6948);
        setField(term6947, term6947.getClass(), "titulo", "");
        setField(term6947, term6947.getClass(), "minutos", term6951);
        Long term6954 = new Long(5904678961906211249L);
        Integer term6957 = new Integer(1442160736);
        Object term6953 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6953, term6953.getClass(), "id", term6954);
        setField(term6953, term6953.getClass(), "titulo", "");
        setField(term6953, term6953.getClass(), "minutos", term6957);
        Long term6960 = new Long(-1820639665251914495L);
        Integer term6963 = new Integer(1114000454);
        Object term6959 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6959, term6959.getClass(), "id", term6960);
        setField(term6959, term6959.getClass(), "titulo", "");
        setField(term6959, term6959.getClass(), "minutos", term6963);
        Long term6966 = new Long(3238645206498300107L);
        Integer term6969 = new Integer(-556405712);
        Object term6965 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6965, term6965.getClass(), "id", term6966);
        setField(term6965, term6965.getClass(), "titulo", "");
        setField(term6965, term6965.getClass(), "minutos", term6969);
        Long term6972 = new Long(-1592696983130738594L);
        Integer term6975 = new Integer(-1772434990);
        Object term6971 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6971, term6971.getClass(), "id", term6972);
        setField(term6971, term6971.getClass(), "titulo", "");
        setField(term6971, term6971.getClass(), "minutos", term6975);
        Long term6978 = new Long(6902365338255307910L);
        Integer term6981 = new Integer(-1845499264);
        Object term6977 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6977, term6977.getClass(), "id", term6978);
        setField(term6977, term6977.getClass(), "titulo", "");
        setField(term6977, term6977.getClass(), "minutos", term6981);
        Long term6984 = new Long(-8019730974733786399L);
        Integer term6987 = new Integer(-505439934);
        Object term6983 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6983, term6983.getClass(), "id", term6984);
        setField(term6983, term6983.getClass(), "titulo", "");
        setField(term6983, term6983.getClass(), "minutos", term6987);
        Long term6990 = new Long(394960377236392159L);
        Integer term6993 = new Integer(-344842608);
        Object term6989 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6989, term6989.getClass(), "id", term6990);
        setField(term6989, term6989.getClass(), "titulo", "");
        setField(term6989, term6989.getClass(), "minutos", term6993);
        ArrayList term6939 = new ArrayList();
        ((ArrayList) term6939).add(term6941);
        ((ArrayList) term6939).add(term6947);
        ((ArrayList) term6939).add(term6953);
        ((ArrayList) term6939).add(term6959);
        ((ArrayList) term6939).add(term6965);
        ((ArrayList) term6939).add(term6971);
        ((ArrayList) term6939).add(term6977);
        ((ArrayList) term6939).add(term6983);
        ((ArrayList) term6939).add(term6989);
        term6924 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term6924, term6924.getClass(), "id", term6925);
        setField(term6924, term6924.getClass(), "nome", "RxbhrFBjkO");
        setField(term6924, term6924.getClass(), "musicas", term6939);
        term6997 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6997;
        callMethod(klass, "setMusicas", argTypes, term6924, args);
    }

};


