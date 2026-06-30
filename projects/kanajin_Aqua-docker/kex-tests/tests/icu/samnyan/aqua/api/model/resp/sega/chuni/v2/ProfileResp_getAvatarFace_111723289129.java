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

public class ProfileResp_getAvatarFace_111723289129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118378;

    public ProfileResp_getAvatarFace_111723289129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118378 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118436 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118378, term118378.getClass(), "userName", "EhfPOdaJdQ");
        setIntField(term118378, term118378.getClass(), "level", 763110536);
        setField(term118378, term118378.getClass(), "exp", "KoTunRQrvH");
        setLongField(term118378, term118378.getClass(), "point", -3423660656787101905L);
        setLongField(term118378, term118378.getClass(), "totalPoint", 5184225522070807597L);
        setIntField(term118378, term118378.getClass(), "playCount", -313522722);
        setIntField(term118378, term118378.getClass(), "playerRating", 1514600866);
        setIntField(term118378, term118378.getClass(), "highestRating", -684745);
        setIntField(term118378, term118378.getClass(), "nameplateId", -503780899);
        setIntField(term118378, term118378.getClass(), "frameId", 1553361038);
        setIntField(term118378, term118378.getClass(), "characterId", 2068219584);
        setIntField(term118378, term118378.getClass(), "trophyId", 234686771);
        setIntField(term118378, term118378.getClass(), "totalMapNum", -1320947917);
        setLongField(term118378, term118378.getClass(), "totalHiScore", 4236454922411772640L);
        setLongField(term118378, term118378.getClass(), "totalBasicHighScore", 1708134081013823426L);
        setLongField(term118378, term118378.getClass(), "totalAdvancedHighScore", -4324302825174686661L);
        setLongField(term118378, term118378.getClass(), "totalExpertHighScore", -6842571177438982724L);
        setLongField(term118378, term118378.getClass(), "totalMasterHighScore", 4190870724733110372L);
        setLongField(term118378, term118378.getClass(), "totalUltimaHighScore", 5014808953079526280L);
        setIntField(term118378, term118378.getClass(), "friendCount", 1610905497);
        setIntField(term118422, term118422.getClass(), "year", 2015);
        setShortField(term118422, term118422.getClass(), "month", (short) 5);
        setShortField(term118422, term118422.getClass(), "day", (short) 3);
        setField(term118421, term118421.getClass(), "date", term118422);
        setByteField(term118426, term118426.getClass(), "hour", (byte) 2);
        setByteField(term118426, term118426.getClass(), "minute", (byte) 14);
        setByteField(term118426, term118426.getClass(), "second", (byte) 5);
        setIntField(term118426, term118426.getClass(), "nano", 74807349);
        setField(term118421, term118421.getClass(), "time", term118426);
        setField(term118378, term118378.getClass(), "firstPlayDate", term118421);
        setIntField(term118432, term118432.getClass(), "year", 2022);
        setShortField(term118432, term118432.getClass(), "month", (short) 1);
        setShortField(term118432, term118432.getClass(), "day", (short) 29);
        setField(term118431, term118431.getClass(), "date", term118432);
        setByteField(term118436, term118436.getClass(), "hour", (byte) 14);
        setByteField(term118436, term118436.getClass(), "minute", (byte) 4);
        setByteField(term118436, term118436.getClass(), "second", (byte) 13);
        setIntField(term118436, term118436.getClass(), "nano", 833076859);
        setField(term118431, term118431.getClass(), "time", term118436);
        setField(term118378, term118378.getClass(), "lastPlayDate", term118431);
        setIntField(term118378, term118378.getClass(), "courseClass", -1539860471);
        setIntField(term118378, term118378.getClass(), "overPowerPoint", 64134047);
        setIntField(term118378, term118378.getClass(), "overPowerRate", -1861234006);
        setIntField(term118378, term118378.getClass(), "mapIconId", 1582217371);
        setIntField(term118378, term118378.getClass(), "voiceId", 2128986860);
        setIntField(term118378, term118378.getClass(), "avatarWear", -1615942263);
        setIntField(term118378, term118378.getClass(), "avatarHead", 1664790628);
        setIntField(term118378, term118378.getClass(), "avatarFace", -1671150574);
        setIntField(term118378, term118378.getClass(), "avatarSkin", -803771219);
        setIntField(term118378, term118378.getClass(), "avatarItem", 962903369);
        setIntField(term118378, term118378.getClass(), "avatarFront", -946325637);
        setIntField(term118378, term118378.getClass(), "avatarBack", 138209605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarFace", argTypes, term118378, args);
    }

};


