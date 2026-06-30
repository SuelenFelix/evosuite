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

public class ProfileResp_getTotalAdvancedHighScore_144854350515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117048;

    public ProfileResp_getTotalAdvancedHighScore_144854350515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117048 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117106 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117048, term117048.getClass(), "userName", "UapHpyGCel");
        setIntField(term117048, term117048.getClass(), "level", -948305483);
        setField(term117048, term117048.getClass(), "exp", "LmrvTTLapr");
        setLongField(term117048, term117048.getClass(), "point", -4483971702455014477L);
        setLongField(term117048, term117048.getClass(), "totalPoint", 2256815315800053441L);
        setIntField(term117048, term117048.getClass(), "playCount", 2141356864);
        setIntField(term117048, term117048.getClass(), "playerRating", -2040651705);
        setIntField(term117048, term117048.getClass(), "highestRating", 1488113470);
        setIntField(term117048, term117048.getClass(), "nameplateId", 239561767);
        setIntField(term117048, term117048.getClass(), "frameId", -408815447);
        setIntField(term117048, term117048.getClass(), "characterId", -1822609399);
        setIntField(term117048, term117048.getClass(), "trophyId", -1179797139);
        setIntField(term117048, term117048.getClass(), "totalMapNum", 512120344);
        setLongField(term117048, term117048.getClass(), "totalHiScore", -4184721762429461078L);
        setLongField(term117048, term117048.getClass(), "totalBasicHighScore", -7830901670802129440L);
        setLongField(term117048, term117048.getClass(), "totalAdvancedHighScore", 7499440582286286516L);
        setLongField(term117048, term117048.getClass(), "totalExpertHighScore", 7767765320353951427L);
        setLongField(term117048, term117048.getClass(), "totalMasterHighScore", -8445460864939401881L);
        setLongField(term117048, term117048.getClass(), "totalUltimaHighScore", 1455676383387654807L);
        setIntField(term117048, term117048.getClass(), "friendCount", -484112725);
        setIntField(term117092, term117092.getClass(), "year", 2013);
        setShortField(term117092, term117092.getClass(), "month", (short) 6);
        setShortField(term117092, term117092.getClass(), "day", (short) 27);
        setField(term117091, term117091.getClass(), "date", term117092);
        setByteField(term117096, term117096.getClass(), "hour", (byte) 2);
        setByteField(term117096, term117096.getClass(), "minute", (byte) 2);
        setByteField(term117096, term117096.getClass(), "second", (byte) 10);
        setIntField(term117096, term117096.getClass(), "nano", 614770684);
        setField(term117091, term117091.getClass(), "time", term117096);
        setField(term117048, term117048.getClass(), "firstPlayDate", term117091);
        setIntField(term117102, term117102.getClass(), "year", 2011);
        setShortField(term117102, term117102.getClass(), "month", (short) 7);
        setShortField(term117102, term117102.getClass(), "day", (short) 4);
        setField(term117101, term117101.getClass(), "date", term117102);
        setByteField(term117106, term117106.getClass(), "hour", (byte) 10);
        setByteField(term117106, term117106.getClass(), "minute", (byte) 7);
        setByteField(term117106, term117106.getClass(), "second", (byte) 20);
        setIntField(term117106, term117106.getClass(), "nano", 320719949);
        setField(term117101, term117101.getClass(), "time", term117106);
        setField(term117048, term117048.getClass(), "lastPlayDate", term117101);
        setIntField(term117048, term117048.getClass(), "courseClass", 2006989101);
        setIntField(term117048, term117048.getClass(), "overPowerPoint", 2127925882);
        setIntField(term117048, term117048.getClass(), "overPowerRate", -879568343);
        setIntField(term117048, term117048.getClass(), "mapIconId", -1945909086);
        setIntField(term117048, term117048.getClass(), "voiceId", 1375466459);
        setIntField(term117048, term117048.getClass(), "avatarWear", -1973640659);
        setIntField(term117048, term117048.getClass(), "avatarHead", -1957855397);
        setIntField(term117048, term117048.getClass(), "avatarFace", -383446537);
        setIntField(term117048, term117048.getClass(), "avatarSkin", -1299627064);
        setIntField(term117048, term117048.getClass(), "avatarItem", -1761133399);
        setIntField(term117048, term117048.getClass(), "avatarFront", 1773688769);
        setIntField(term117048, term117048.getClass(), "avatarBack", 938096837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term117048, args);
    }

};


