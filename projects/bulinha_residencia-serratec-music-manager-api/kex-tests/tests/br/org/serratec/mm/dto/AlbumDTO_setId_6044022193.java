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

public class AlbumDTO_setId_6044022193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4640;
     Object term4718;

    public AlbumDTO_setId_6044022193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4641 = new Long(-8658027316505137504L);
        Long term4655 = new Long(414749984815662075L);
        Long term4672 = new Long(463622836963501975L);
        Long term4675 = new Long(305759998609888272L);
        Integer term4678 = new Integer(-1007160944);
        Object term4671 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4671, term4671.getClass(), "idArtista", term4672);
        setField(term4671, term4671.getClass(), "nomeArtista", "");
        setField(term4671, term4671.getClass(), "id", term4675);
        setField(term4671, term4671.getClass(), "titulo", "");
        setField(term4671, term4671.getClass(), "minutos", term4678);
        Long term4681 = new Long(-8654565919063661957L);
        Long term4684 = new Long(-5248475803419977214L);
        Integer term4687 = new Integer(1135664017);
        Object term4680 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4680, term4680.getClass(), "idArtista", term4681);
        setField(term4680, term4680.getClass(), "nomeArtista", "");
        setField(term4680, term4680.getClass(), "id", term4684);
        setField(term4680, term4680.getClass(), "titulo", "");
        setField(term4680, term4680.getClass(), "minutos", term4687);
        Long term4690 = new Long(-6723783499250797216L);
        Long term4693 = new Long(41775768178052008L);
        Integer term4696 = new Integer(590364439);
        Object term4689 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4689, term4689.getClass(), "idArtista", term4690);
        setField(term4689, term4689.getClass(), "nomeArtista", "");
        setField(term4689, term4689.getClass(), "id", term4693);
        setField(term4689, term4689.getClass(), "titulo", "");
        setField(term4689, term4689.getClass(), "minutos", term4696);
        Long term4699 = new Long(6682528376118987775L);
        Long term4702 = new Long(682356318767179819L);
        Integer term4705 = new Integer(865208305);
        Object term4698 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4698, term4698.getClass(), "idArtista", term4699);
        setField(term4698, term4698.getClass(), "nomeArtista", "");
        setField(term4698, term4698.getClass(), "id", term4702);
        setField(term4698, term4698.getClass(), "titulo", "");
        setField(term4698, term4698.getClass(), "minutos", term4705);
        Long term4708 = new Long(-7291743527973326814L);
        Long term4711 = new Long(-5963439350418910964L);
        Integer term4714 = new Integer(-1275173084);
        Object term4707 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4707, term4707.getClass(), "idArtista", term4708);
        setField(term4707, term4707.getClass(), "nomeArtista", "");
        setField(term4707, term4707.getClass(), "id", term4711);
        setField(term4707, term4707.getClass(), "titulo", "");
        setField(term4707, term4707.getClass(), "minutos", term4714);
        ArrayList term4669 = new ArrayList();
        ((ArrayList) term4669).add(term4671);
        ((ArrayList) term4669).add(term4680);
        ((ArrayList) term4669).add(term4689);
        ((ArrayList) term4669).add(term4698);
        ((ArrayList) term4669).add(term4707);
        term4640 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term4640, term4640.getClass(), "id", term4641);
        setField(term4640, term4640.getClass(), "titulo", "UfQtPRyWRC");
        setField(term4640, term4640.getClass(), "idArtista", term4655);
        setField(term4640, term4640.getClass(), "nomeArtista", "FPvxVzzSvD");
        setField(term4640, term4640.getClass(), "musicas", term4669);
        term4718 = new Long(9013624480170062917L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4718;
        callMethod(klass, "setId", argTypes, term4640, args);
    }

};


