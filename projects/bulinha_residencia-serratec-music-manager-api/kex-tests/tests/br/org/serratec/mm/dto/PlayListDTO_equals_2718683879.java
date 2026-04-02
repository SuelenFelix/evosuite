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

public class PlayListDTO_equals_2718683879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7075;
     Object term7130;

    public PlayListDTO_equals_2718683879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7076 = new Long(-6394943900800506753L);
        Long term7093 = new Long(-4867941246533901410L);
        Integer term7096 = new Integer(-1347665717);
        Object term7092 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7092, term7092.getClass(), "id", term7093);
        setField(term7092, term7092.getClass(), "titulo", "");
        setField(term7092, term7092.getClass(), "minutos", term7096);
        Long term7099 = new Long(1044883697493326351L);
        Integer term7102 = new Integer(-1888585309);
        Object term7098 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7098, term7098.getClass(), "id", term7099);
        setField(term7098, term7098.getClass(), "titulo", "");
        setField(term7098, term7098.getClass(), "minutos", term7102);
        Long term7105 = new Long(-7406618974062419277L);
        Integer term7108 = new Integer(683666002);
        Object term7104 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7104, term7104.getClass(), "id", term7105);
        setField(term7104, term7104.getClass(), "titulo", "");
        setField(term7104, term7104.getClass(), "minutos", term7108);
        Long term7111 = new Long(868503089567085985L);
        Integer term7114 = new Integer(1596213415);
        Object term7110 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7110, term7110.getClass(), "id", term7111);
        setField(term7110, term7110.getClass(), "titulo", "");
        setField(term7110, term7110.getClass(), "minutos", term7114);
        Long term7117 = new Long(-3277773415369003529L);
        Integer term7120 = new Integer(-268815336);
        Object term7116 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7116, term7116.getClass(), "id", term7117);
        setField(term7116, term7116.getClass(), "titulo", "");
        setField(term7116, term7116.getClass(), "minutos", term7120);
        Long term7123 = new Long(1253549421411622358L);
        Integer term7126 = new Integer(-1210583429);
        Object term7122 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7122, term7122.getClass(), "id", term7123);
        setField(term7122, term7122.getClass(), "titulo", "");
        setField(term7122, term7122.getClass(), "minutos", term7126);
        ArrayList term7090 = new ArrayList();
        ((ArrayList) term7090).add(term7092);
        ((ArrayList) term7090).add(term7098);
        ((ArrayList) term7090).add(term7104);
        ((ArrayList) term7090).add(term7110);
        ((ArrayList) term7090).add(term7116);
        ((ArrayList) term7090).add(term7122);
        term7075 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term7075, term7075.getClass(), "id", term7076);
        setField(term7075, term7075.getClass(), "nome", "GNEmuHPNcU");
        setField(term7075, term7075.getClass(), "musicas", term7090);
        term7130 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7130;
        callMethod(klass, "equals", argTypes, term7075, args);
    }

};


