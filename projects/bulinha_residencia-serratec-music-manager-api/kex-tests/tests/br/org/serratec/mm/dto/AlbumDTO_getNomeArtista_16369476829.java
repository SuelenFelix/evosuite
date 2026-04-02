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

public class AlbumDTO_getNomeArtista_16369476829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11995;

    public AlbumDTO_getNomeArtista_16369476829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11996 = new Long(3713624957161771816L);
        Long term12010 = new Long(6130232388739280211L);
        Long term12027 = new Long(3423965054378869855L);
        Long term12030 = new Long(-593735869267672817L);
        Integer term12033 = new Integer(304775596);
        Object term12026 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12026, term12026.getClass(), "idArtista", term12027);
        setField(term12026, term12026.getClass(), "nomeArtista", "");
        setField(term12026, term12026.getClass(), "id", term12030);
        setField(term12026, term12026.getClass(), "titulo", "");
        setField(term12026, term12026.getClass(), "minutos", term12033);
        Long term12036 = new Long(6041374912351843923L);
        Long term12039 = new Long(2535970782317488741L);
        Integer term12042 = new Integer(-1347665717);
        Object term12035 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12035, term12035.getClass(), "idArtista", term12036);
        setField(term12035, term12035.getClass(), "nomeArtista", "");
        setField(term12035, term12035.getClass(), "id", term12039);
        setField(term12035, term12035.getClass(), "titulo", "");
        setField(term12035, term12035.getClass(), "minutos", term12042);
        Long term12045 = new Long(-5258945362776941718L);
        Long term12048 = new Long(24067105862153728L);
        Integer term12051 = new Integer(-1888585309);
        Object term12044 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12044, term12044.getClass(), "idArtista", term12045);
        setField(term12044, term12044.getClass(), "nomeArtista", "");
        setField(term12044, term12044.getClass(), "id", term12048);
        setField(term12044, term12044.getClass(), "titulo", "");
        setField(term12044, term12044.getClass(), "minutos", term12051);
        Long term12054 = new Long(-8477368071089201577L);
        Long term12057 = new Long(-1526729287349763895L);
        Integer term12060 = new Integer(683666002);
        Object term12053 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12053, term12053.getClass(), "idArtista", term12054);
        setField(term12053, term12053.getClass(), "nomeArtista", "");
        setField(term12053, term12053.getClass(), "id", term12057);
        setField(term12053, term12053.getClass(), "titulo", "");
        setField(term12053, term12053.getClass(), "minutos", term12060);
        Long term12063 = new Long(7017605765544766728L);
        Long term12066 = new Long(-6078481855513028760L);
        Integer term12069 = new Integer(1596213415);
        Object term12062 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12062, term12062.getClass(), "idArtista", term12063);
        setField(term12062, term12062.getClass(), "nomeArtista", "");
        setField(term12062, term12062.getClass(), "id", term12066);
        setField(term12062, term12062.getClass(), "titulo", "");
        setField(term12062, term12062.getClass(), "minutos", term12069);
        Long term12072 = new Long(-6985556670871089725L);
        Long term12075 = new Long(-8469818909085103606L);
        Integer term12078 = new Integer(-268815336);
        Object term12071 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12071, term12071.getClass(), "idArtista", term12072);
        setField(term12071, term12071.getClass(), "nomeArtista", "");
        setField(term12071, term12071.getClass(), "id", term12075);
        setField(term12071, term12071.getClass(), "titulo", "");
        setField(term12071, term12071.getClass(), "minutos", term12078);
        Long term12081 = new Long(11315815278355083L);
        Long term12084 = new Long(7735460540091431012L);
        Integer term12087 = new Integer(-1210583429);
        Object term12080 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12080, term12080.getClass(), "idArtista", term12081);
        setField(term12080, term12080.getClass(), "nomeArtista", "");
        setField(term12080, term12080.getClass(), "id", term12084);
        setField(term12080, term12080.getClass(), "titulo", "");
        setField(term12080, term12080.getClass(), "minutos", term12087);
        ArrayList term12024 = new ArrayList();
        ((ArrayList) term12024).add(term12026);
        ((ArrayList) term12024).add(term12035);
        ((ArrayList) term12024).add(term12044);
        ((ArrayList) term12024).add(term12053);
        ((ArrayList) term12024).add(term12062);
        ((ArrayList) term12024).add(term12071);
        ((ArrayList) term12024).add(term12080);
        term11995 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term11995, term11995.getClass(), "id", term11996);
        setField(term11995, term11995.getClass(), "titulo", "UBPHmOICBs");
        setField(term11995, term11995.getClass(), "idArtista", term12010);
        setField(term11995, term11995.getClass(), "nomeArtista", "IDJUVPgUJf");
        setField(term11995, term11995.getClass(), "musicas", term12024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNomeArtista", argTypes, term11995, args);
    }

};


