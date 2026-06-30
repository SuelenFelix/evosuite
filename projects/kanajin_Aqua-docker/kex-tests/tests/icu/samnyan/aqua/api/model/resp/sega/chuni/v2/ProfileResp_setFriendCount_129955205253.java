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
import java.lang.Integer;

public class ProfileResp_setFriendCount_129955205253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120736;
     Object term120811;

    public ProfileResp_setFriendCount_129955205253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120736 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120794 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120736, term120736.getClass(), "userName", "CprHpAIkGr");
        setIntField(term120736, term120736.getClass(), "level", -356367162);
        setField(term120736, term120736.getClass(), "exp", "xdyDUmqjTv");
        setLongField(term120736, term120736.getClass(), "point", -5908406676382829407L);
        setLongField(term120736, term120736.getClass(), "totalPoint", 6817440310229946932L);
        setIntField(term120736, term120736.getClass(), "playCount", -738708706);
        setIntField(term120736, term120736.getClass(), "playerRating", -1516850908);
        setIntField(term120736, term120736.getClass(), "highestRating", 1722641573);
        setIntField(term120736, term120736.getClass(), "nameplateId", 1843220914);
        setIntField(term120736, term120736.getClass(), "frameId", 940806949);
        setIntField(term120736, term120736.getClass(), "characterId", 815393964);
        setIntField(term120736, term120736.getClass(), "trophyId", 2109430467);
        setIntField(term120736, term120736.getClass(), "totalMapNum", -1795784233);
        setLongField(term120736, term120736.getClass(), "totalHiScore", 7016478005878165666L);
        setLongField(term120736, term120736.getClass(), "totalBasicHighScore", -5985110120806433534L);
        setLongField(term120736, term120736.getClass(), "totalAdvancedHighScore", -3674362961748634415L);
        setLongField(term120736, term120736.getClass(), "totalExpertHighScore", 30900343565357110L);
        setLongField(term120736, term120736.getClass(), "totalMasterHighScore", -7435576953442701299L);
        setLongField(term120736, term120736.getClass(), "totalUltimaHighScore", 9011364716758687771L);
        setIntField(term120736, term120736.getClass(), "friendCount", -1228227209);
        setIntField(term120780, term120780.getClass(), "year", 2018);
        setShortField(term120780, term120780.getClass(), "month", (short) 4);
        setShortField(term120780, term120780.getClass(), "day", (short) 3);
        setField(term120779, term120779.getClass(), "date", term120780);
        setByteField(term120784, term120784.getClass(), "hour", (byte) 18);
        setByteField(term120784, term120784.getClass(), "minute", (byte) 16);
        setByteField(term120784, term120784.getClass(), "second", (byte) 49);
        setIntField(term120784, term120784.getClass(), "nano", 49011861);
        setField(term120779, term120779.getClass(), "time", term120784);
        setField(term120736, term120736.getClass(), "firstPlayDate", term120779);
        setIntField(term120790, term120790.getClass(), "year", 2017);
        setShortField(term120790, term120790.getClass(), "month", (short) 12);
        setShortField(term120790, term120790.getClass(), "day", (short) 15);
        setField(term120789, term120789.getClass(), "date", term120790);
        setByteField(term120794, term120794.getClass(), "hour", (byte) 5);
        setByteField(term120794, term120794.getClass(), "minute", (byte) 18);
        setByteField(term120794, term120794.getClass(), "second", (byte) 7);
        setIntField(term120794, term120794.getClass(), "nano", 264668265);
        setField(term120789, term120789.getClass(), "time", term120794);
        setField(term120736, term120736.getClass(), "lastPlayDate", term120789);
        setIntField(term120736, term120736.getClass(), "courseClass", 1060089005);
        setIntField(term120736, term120736.getClass(), "overPowerPoint", -413979544);
        setIntField(term120736, term120736.getClass(), "overPowerRate", 228217755);
        setIntField(term120736, term120736.getClass(), "mapIconId", -1004192177);
        setIntField(term120736, term120736.getClass(), "voiceId", 124601305);
        setIntField(term120736, term120736.getClass(), "avatarWear", 1910450736);
        setIntField(term120736, term120736.getClass(), "avatarHead", -477877409);
        setIntField(term120736, term120736.getClass(), "avatarFace", 1458856692);
        setIntField(term120736, term120736.getClass(), "avatarSkin", 1752702726);
        setIntField(term120736, term120736.getClass(), "avatarItem", 671895458);
        setIntField(term120736, term120736.getClass(), "avatarFront", 1705480415);
        setIntField(term120736, term120736.getClass(), "avatarBack", 186266958);
        term120811 = new Integer(-1925850316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120811;
        callMethod(klass, "setFriendCount", argTypes, term120736, args);
    }

};


