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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PlayListService_insert_4087095702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;

    public PlayListService_insert_4087095702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term237 = new Long(5270370404989704783L);
        Long term254 = new Long(7411271909051562686L);
        Integer term257 = new Integer(568599855);
        Object term253 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term253, term253.getClass(), "id", term254);
        setField(term253, term253.getClass(), "titulo", "");
        setField(term253, term253.getClass(), "minutos", term257);
        Long term260 = new Long(4872422362414183754L);
        Integer term263 = new Integer(1162663216);
        Object term259 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term259, term259.getClass(), "id", term260);
        setField(term259, term259.getClass(), "titulo", "");
        setField(term259, term259.getClass(), "minutos", term263);
        Long term266 = new Long(6811161968424632369L);
        Integer term269 = new Integer(1484323161);
        Object term265 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term265, term265.getClass(), "id", term266);
        setField(term265, term265.getClass(), "titulo", "");
        setField(term265, term265.getClass(), "minutos", term269);
        Long term272 = new Long(-7237588299778557629L);
        Integer term275 = new Integer(391863371);
        Object term271 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term271, term271.getClass(), "id", term272);
        setField(term271, term271.getClass(), "titulo", "");
        setField(term271, term271.getClass(), "minutos", term275);
        Long term278 = new Long(6967924379644551255L);
        Integer term281 = new Integer(-1922583790);
        Object term277 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term277, term277.getClass(), "id", term278);
        setField(term277, term277.getClass(), "titulo", "");
        setField(term277, term277.getClass(), "minutos", term281);
        ArrayList term251 = new ArrayList();
        ((ArrayList) term251).add(term253);
        ((ArrayList) term251).add(term259);
        ((ArrayList) term251).add(term265);
        ((ArrayList) term251).add(term271);
        ((ArrayList) term251).add(term277);
        term236 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term236, term236.getClass(), "id", term237);
        setField(term236, term236.getClass(), "nome", "NRdvgJlhkX");
        setField(term236, term236.getClass(), "musicas", term251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.PlayListService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Object[] args = new Object[1];
        args[0] = term236;
        callMethod(klass, "insert", argTypes, null, args);
    }

};


