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

public class AlbumDTO_setNomeArtista_173999849810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12111;

    public AlbumDTO_setNomeArtista_173999849810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12112 = new Long(1346299551708610248L);
        Long term12126 = new Long(-7191625829563442696L);
        Long term12143 = new Long(1463379874413441830L);
        Long term12146 = new Long(7998051124369147543L);
        Integer term12149 = new Integer(-663691365);
        Object term12142 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12142, term12142.getClass(), "idArtista", term12143);
        setField(term12142, term12142.getClass(), "nomeArtista", "");
        setField(term12142, term12142.getClass(), "id", term12146);
        setField(term12142, term12142.getClass(), "titulo", "");
        setField(term12142, term12142.getClass(), "minutos", term12149);
        Long term12152 = new Long(-1481367303699139651L);
        Long term12155 = new Long(-7709317346333670618L);
        Integer term12158 = new Integer(339854490);
        Object term12151 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12151, term12151.getClass(), "idArtista", term12152);
        setField(term12151, term12151.getClass(), "nomeArtista", "");
        setField(term12151, term12151.getClass(), "id", term12155);
        setField(term12151, term12151.getClass(), "titulo", "");
        setField(term12151, term12151.getClass(), "minutos", term12158);
        ArrayList term12140 = new ArrayList();
        ((ArrayList) term12140).add(term12142);
        ((ArrayList) term12140).add(term12151);
        term12111 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term12111, term12111.getClass(), "id", term12112);
        setField(term12111, term12111.getClass(), "titulo", "iUkOOQhEkw");
        setField(term12111, term12111.getClass(), "idArtista", term12126);
        setField(term12111, term12111.getClass(), "nomeArtista", "wmVoFoUVmU");
        setField(term12111, term12111.getClass(), "musicas", term12140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mUNcKUxghj";
        callMethod(klass, "setNomeArtista", argTypes, term12111, args);
    }

};


