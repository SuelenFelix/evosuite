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

public class ProfileResp_getFrameId_13281580499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116478;

    public ProfileResp_getFrameId_13281580499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116478 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116536 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116478, term116478.getClass(), "userName", "EuxSqUqdeF");
        setIntField(term116478, term116478.getClass(), "level", -472772358);
        setField(term116478, term116478.getClass(), "exp", "SfweyHkybO");
        setLongField(term116478, term116478.getClass(), "point", -7120024779761397532L);
        setLongField(term116478, term116478.getClass(), "totalPoint", -319639018436435626L);
        setIntField(term116478, term116478.getClass(), "playCount", 768691928);
        setIntField(term116478, term116478.getClass(), "playerRating", 1796959459);
        setIntField(term116478, term116478.getClass(), "highestRating", 2054501005);
        setIntField(term116478, term116478.getClass(), "nameplateId", 718247536);
        setIntField(term116478, term116478.getClass(), "frameId", -429291361);
        setIntField(term116478, term116478.getClass(), "characterId", 212106976);
        setIntField(term116478, term116478.getClass(), "trophyId", 2055833738);
        setIntField(term116478, term116478.getClass(), "totalMapNum", -1717452124);
        setLongField(term116478, term116478.getClass(), "totalHiScore", -1397194044604203977L);
        setLongField(term116478, term116478.getClass(), "totalBasicHighScore", 6285743072915973208L);
        setLongField(term116478, term116478.getClass(), "totalAdvancedHighScore", 1181688496390966879L);
        setLongField(term116478, term116478.getClass(), "totalExpertHighScore", 6601409929231712200L);
        setLongField(term116478, term116478.getClass(), "totalMasterHighScore", -2601991304881664917L);
        setLongField(term116478, term116478.getClass(), "totalUltimaHighScore", 4862692876541944031L);
        setIntField(term116478, term116478.getClass(), "friendCount", 2113747159);
        setIntField(term116522, term116522.getClass(), "year", 2026);
        setShortField(term116522, term116522.getClass(), "month", (short) 10);
        setShortField(term116522, term116522.getClass(), "day", (short) 3);
        setField(term116521, term116521.getClass(), "date", term116522);
        setByteField(term116526, term116526.getClass(), "hour", (byte) 11);
        setByteField(term116526, term116526.getClass(), "minute", (byte) 7);
        setByteField(term116526, term116526.getClass(), "second", (byte) 21);
        setIntField(term116526, term116526.getClass(), "nano", 786897813);
        setField(term116521, term116521.getClass(), "time", term116526);
        setField(term116478, term116478.getClass(), "firstPlayDate", term116521);
        setIntField(term116532, term116532.getClass(), "year", 2024);
        setShortField(term116532, term116532.getClass(), "month", (short) 7);
        setShortField(term116532, term116532.getClass(), "day", (short) 11);
        setField(term116531, term116531.getClass(), "date", term116532);
        setByteField(term116536, term116536.getClass(), "hour", (byte) 1);
        setByteField(term116536, term116536.getClass(), "minute", (byte) 20);
        setByteField(term116536, term116536.getClass(), "second", (byte) 25);
        setIntField(term116536, term116536.getClass(), "nano", 421909408);
        setField(term116531, term116531.getClass(), "time", term116536);
        setField(term116478, term116478.getClass(), "lastPlayDate", term116531);
        setIntField(term116478, term116478.getClass(), "courseClass", 32087752);
        setIntField(term116478, term116478.getClass(), "overPowerPoint", 399092865);
        setIntField(term116478, term116478.getClass(), "overPowerRate", -2107127515);
        setIntField(term116478, term116478.getClass(), "mapIconId", 1486605352);
        setIntField(term116478, term116478.getClass(), "voiceId", -695861924);
        setIntField(term116478, term116478.getClass(), "avatarWear", -160610143);
        setIntField(term116478, term116478.getClass(), "avatarHead", -1037585429);
        setIntField(term116478, term116478.getClass(), "avatarFace", 1335973478);
        setIntField(term116478, term116478.getClass(), "avatarSkin", -463802918);
        setIntField(term116478, term116478.getClass(), "avatarItem", 981220843);
        setIntField(term116478, term116478.getClass(), "avatarFront", -1912826160);
        setIntField(term116478, term116478.getClass(), "avatarBack", -1752386831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term116478, args);
    }

};


