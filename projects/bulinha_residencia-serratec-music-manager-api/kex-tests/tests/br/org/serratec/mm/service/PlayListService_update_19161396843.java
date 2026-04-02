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

public class PlayListService_update_19161396843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;
     Object term297;

    public PlayListService_update_19161396843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = new Long(-2813493605142626659L);
        Long term298 = new Long(-8885298608300233488L);
        Long term315 = new Long(-4325723315152823407L);
        Integer term318 = new Integer(-616727354);
        Object term314 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term314, term314.getClass(), "id", term315);
        setField(term314, term314.getClass(), "titulo", "");
        setField(term314, term314.getClass(), "minutos", term318);
        Long term321 = new Long(2535595959091595249L);
        Integer term324 = new Integer(-1955890973);
        Object term320 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term320, term320.getClass(), "id", term321);
        setField(term320, term320.getClass(), "titulo", "");
        setField(term320, term320.getClass(), "minutos", term324);
        Long term327 = new Long(-5476826692763582090L);
        Integer term330 = new Integer(-2038273078);
        Object term326 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term326, term326.getClass(), "id", term327);
        setField(term326, term326.getClass(), "titulo", "");
        setField(term326, term326.getClass(), "minutos", term330);
        Long term333 = new Long(-872011222785455006L);
        Integer term336 = new Integer(1227103734);
        Object term332 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term332, term332.getClass(), "id", term333);
        setField(term332, term332.getClass(), "titulo", "");
        setField(term332, term332.getClass(), "minutos", term336);
        ArrayList term312 = new ArrayList();
        ((ArrayList) term312).add(term314);
        ((ArrayList) term312).add(term320);
        ((ArrayList) term312).add(term326);
        ((ArrayList) term312).add(term332);
        term297 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term297, term297.getClass(), "id", term298);
        setField(term297, term297.getClass(), "nome", "ZiaGIbnzTs");
        setField(term297, term297.getClass(), "musicas", term312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.PlayListService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Object[] args = new Object[2];
        args[0] = term295;
        args[1] = term297;
        callMethod(klass, "update", argTypes, null, args);
    }

};


