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

public class LyricsDTO_setLyrics_6842698642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8754;

    public LyricsDTO_setLyrics_6842698642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8754 = newInstance(Class.forName("br.org.serratec.mm.dto.LyricsDTO"));
        setField(term8754, term8754.getClass(), "lyrics", "OGQsfjmReM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.LyricsDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YsUtbngnRO";
        callMethod(klass, "setLyrics", argTypes, term8754, args);
    }

};


