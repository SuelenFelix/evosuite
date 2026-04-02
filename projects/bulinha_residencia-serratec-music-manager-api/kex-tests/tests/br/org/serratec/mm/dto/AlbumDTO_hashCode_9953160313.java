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

public class AlbumDTO_hashCode_9953160313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12402;

    public AlbumDTO_hashCode_9953160313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12403 = new Long(-5951743062322506095L);
        Long term12417 = new Long(768144790810175653L);
        ArrayList term12431 = new ArrayList();
        term12402 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term12402, term12402.getClass(), "id", term12403);
        setField(term12402, term12402.getClass(), "titulo", "MpJsPKLTIU");
        setField(term12402, term12402.getClass(), "idArtista", term12417);
        setField(term12402, term12402.getClass(), "nomeArtista", "IiNCZfdouL");
        setField(term12402, term12402.getClass(), "musicas", term12431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12402, args);
    }

};


