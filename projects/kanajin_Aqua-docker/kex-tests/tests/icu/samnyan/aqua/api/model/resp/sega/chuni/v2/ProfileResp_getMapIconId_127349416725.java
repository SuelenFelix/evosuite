package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getMapIconId_127349416725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117998;

    public ProfileResp_getMapIconId_127349416725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117998 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118056 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117998, term117998.getClass(), "userName", "JihKJuVbQI");
        setIntField(term117998, term117998.getClass(), "level", 1229626430);
        setField(term117998, term117998.getClass(), "exp", "nenRtMWwiS");
        setLongField(term117998, term117998.getClass(), "point", 8143078360158902496L);
        setLongField(term117998, term117998.getClass(), "totalPoint", 1622805710482087035L);
        setIntField(term117998, term117998.getClass(), "playCount", 1396254024);
        setIntField(term117998, term117998.getClass(), "playerRating", 1854867075);
        setIntField(term117998, term117998.getClass(), "highestRating", 368822903);
        setIntField(term117998, term117998.getClass(), "nameplateId", 1313983717);
        setIntField(term117998, term117998.getClass(), "frameId", 49797716);
        setIntField(term117998, term117998.getClass(), "characterId", -376931464);
        setIntField(term117998, term117998.getClass(), "trophyId", 685350257);
        setIntField(term117998, term117998.getClass(), "totalMapNum", 1965391727);
        setLongField(term117998, term117998.getClass(), "totalHiScore", 6925038568830195357L);
        setLongField(term117998, term117998.getClass(), "totalBasicHighScore", -5888026883804622434L);
        setLongField(term117998, term117998.getClass(), "totalAdvancedHighScore", -1508478131158925889L);
        setLongField(term117998, term117998.getClass(), "totalExpertHighScore", 5763410539655354024L);
        setLongField(term117998, term117998.getClass(), "totalMasterHighScore", 3788556609185745767L);
        setLongField(term117998, term117998.getClass(), "totalUltimaHighScore", -1954015532365465759L);
        setIntField(term117998, term117998.getClass(), "friendCount", 257684932);
        setIntField(term118042, term118042.getClass(), "year", 2016);
        setShortField(term118042, term118042.getClass(), "month", (short) 2);
        setShortField(term118042, term118042.getClass(), "day", (short) 15);
        setField(term118041, term118041.getClass(), "date", term118042);
        setByteField(term118046, term118046.getClass(), "hour", (byte) 4);
        setByteField(term118046, term118046.getClass(), "minute", (byte) 40);
        setByteField(term118046, term118046.getClass(), "second", (byte) 47);
        setIntField(term118046, term118046.getClass(), "nano", 9179243);
        setField(term118041, term118041.getClass(), "time", term118046);
        setField(term117998, term117998.getClass(), "firstPlayDate", term118041);
        setIntField(term118052, term118052.getClass(), "year", 2027);
        setShortField(term118052, term118052.getClass(), "month", (short) 7);
        setShortField(term118052, term118052.getClass(), "day", (short) 7);
        setField(term118051, term118051.getClass(), "date", term118052);
        setByteField(term118056, term118056.getClass(), "hour", (byte) 18);
        setByteField(term118056, term118056.getClass(), "minute", (byte) 22);
        setByteField(term118056, term118056.getClass(), "second", (byte) 24);
        setIntField(term118056, term118056.getClass(), "nano", 197679681);
        setField(term118051, term118051.getClass(), "time", term118056);
        setField(term117998, term117998.getClass(), "lastPlayDate", term118051);
        setIntField(term117998, term117998.getClass(), "courseClass", 147476792);
        setIntField(term117998, term117998.getClass(), "overPowerPoint", 565848824);
        setIntField(term117998, term117998.getClass(), "overPowerRate", 405522649);
        setIntField(term117998, term117998.getClass(), "mapIconId", 1184085014);
        setIntField(term117998, term117998.getClass(), "voiceId", 1662024353);
        setIntField(term117998, term117998.getClass(), "avatarWear", -942229504);
        setIntField(term117998, term117998.getClass(), "avatarHead", -810582679);
        setIntField(term117998, term117998.getClass(), "avatarFace", 804216916);
        setIntField(term117998, term117998.getClass(), "avatarSkin", -2036707087);
        setIntField(term117998, term117998.getClass(), "avatarItem", -825629007);
        setIntField(term117998, term117998.getClass(), "avatarFront", -824700377);
        setIntField(term117998, term117998.getClass(), "avatarBack", -991262091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapIconId", argTypes, term117998, args);
    }

};


