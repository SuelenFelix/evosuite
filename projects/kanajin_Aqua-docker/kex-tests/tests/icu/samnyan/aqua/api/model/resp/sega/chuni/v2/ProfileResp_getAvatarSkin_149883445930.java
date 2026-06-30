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

public class ProfileResp_getAvatarSkin_149883445930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118473;

    public ProfileResp_getAvatarSkin_149883445930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118473 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118517 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118521 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118531 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118473, term118473.getClass(), "userName", "WEDoAQHAFg");
        setIntField(term118473, term118473.getClass(), "level", -742266247);
        setField(term118473, term118473.getClass(), "exp", "TDwsNJKaql");
        setLongField(term118473, term118473.getClass(), "point", 5539013659578446033L);
        setLongField(term118473, term118473.getClass(), "totalPoint", 6844271349135839950L);
        setIntField(term118473, term118473.getClass(), "playCount", -1009320182);
        setIntField(term118473, term118473.getClass(), "playerRating", 236165685);
        setIntField(term118473, term118473.getClass(), "highestRating", 1460350050);
        setIntField(term118473, term118473.getClass(), "nameplateId", -2083057991);
        setIntField(term118473, term118473.getClass(), "frameId", -1058733687);
        setIntField(term118473, term118473.getClass(), "characterId", 1476644214);
        setIntField(term118473, term118473.getClass(), "trophyId", -32668954);
        setIntField(term118473, term118473.getClass(), "totalMapNum", -372394070);
        setLongField(term118473, term118473.getClass(), "totalHiScore", 8959077806809187885L);
        setLongField(term118473, term118473.getClass(), "totalBasicHighScore", -5776525253846609674L);
        setLongField(term118473, term118473.getClass(), "totalAdvancedHighScore", 1471693542970291582L);
        setLongField(term118473, term118473.getClass(), "totalExpertHighScore", 2653767185543930605L);
        setLongField(term118473, term118473.getClass(), "totalMasterHighScore", -1090117923701476471L);
        setLongField(term118473, term118473.getClass(), "totalUltimaHighScore", -5216974957619259096L);
        setIntField(term118473, term118473.getClass(), "friendCount", 1897487132);
        setIntField(term118517, term118517.getClass(), "year", 2014);
        setShortField(term118517, term118517.getClass(), "month", (short) 12);
        setShortField(term118517, term118517.getClass(), "day", (short) 25);
        setField(term118516, term118516.getClass(), "date", term118517);
        setByteField(term118521, term118521.getClass(), "hour", (byte) 14);
        setByteField(term118521, term118521.getClass(), "minute", (byte) 15);
        setByteField(term118521, term118521.getClass(), "second", (byte) 46);
        setIntField(term118521, term118521.getClass(), "nano", 565682205);
        setField(term118516, term118516.getClass(), "time", term118521);
        setField(term118473, term118473.getClass(), "firstPlayDate", term118516);
        setIntField(term118527, term118527.getClass(), "year", 2017);
        setShortField(term118527, term118527.getClass(), "month", (short) 3);
        setShortField(term118527, term118527.getClass(), "day", (short) 17);
        setField(term118526, term118526.getClass(), "date", term118527);
        setByteField(term118531, term118531.getClass(), "hour", (byte) 7);
        setByteField(term118531, term118531.getClass(), "minute", (byte) 16);
        setByteField(term118531, term118531.getClass(), "second", (byte) 58);
        setIntField(term118531, term118531.getClass(), "nano", 658361198);
        setField(term118526, term118526.getClass(), "time", term118531);
        setField(term118473, term118473.getClass(), "lastPlayDate", term118526);
        setIntField(term118473, term118473.getClass(), "courseClass", -432026763);
        setIntField(term118473, term118473.getClass(), "overPowerPoint", 990671425);
        setIntField(term118473, term118473.getClass(), "overPowerRate", -2096352467);
        setIntField(term118473, term118473.getClass(), "mapIconId", 169255670);
        setIntField(term118473, term118473.getClass(), "voiceId", -265826893);
        setIntField(term118473, term118473.getClass(), "avatarWear", -230067016);
        setIntField(term118473, term118473.getClass(), "avatarHead", 460622811);
        setIntField(term118473, term118473.getClass(), "avatarFace", 939801257);
        setIntField(term118473, term118473.getClass(), "avatarSkin", -1179405785);
        setIntField(term118473, term118473.getClass(), "avatarItem", 1702676621);
        setIntField(term118473, term118473.getClass(), "avatarFront", -322956452);
        setIntField(term118473, term118473.getClass(), "avatarBack", 322939883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarSkin", argTypes, term118473, args);
    }

};


