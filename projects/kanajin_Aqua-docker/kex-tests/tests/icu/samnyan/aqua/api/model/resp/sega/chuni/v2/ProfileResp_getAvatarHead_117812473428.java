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

public class ProfileResp_getAvatarHead_117812473428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118283;

    public ProfileResp_getAvatarHead_117812473428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118283 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118341 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118283, term118283.getClass(), "userName", "jUSBTYPPFt");
        setIntField(term118283, term118283.getClass(), "level", 1903268623);
        setField(term118283, term118283.getClass(), "exp", "jJtudqtLhf");
        setLongField(term118283, term118283.getClass(), "point", 5386517547679128749L);
        setLongField(term118283, term118283.getClass(), "totalPoint", -5306698981173846594L);
        setIntField(term118283, term118283.getClass(), "playCount", 760153805);
        setIntField(term118283, term118283.getClass(), "playerRating", 771334895);
        setIntField(term118283, term118283.getClass(), "highestRating", 1937460616);
        setIntField(term118283, term118283.getClass(), "nameplateId", -274388627);
        setIntField(term118283, term118283.getClass(), "frameId", -713294976);
        setIntField(term118283, term118283.getClass(), "characterId", 1193716445);
        setIntField(term118283, term118283.getClass(), "trophyId", -2121073020);
        setIntField(term118283, term118283.getClass(), "totalMapNum", -184524546);
        setLongField(term118283, term118283.getClass(), "totalHiScore", -405219218622827050L);
        setLongField(term118283, term118283.getClass(), "totalBasicHighScore", -7747257192309626292L);
        setLongField(term118283, term118283.getClass(), "totalAdvancedHighScore", -8822705404052551615L);
        setLongField(term118283, term118283.getClass(), "totalExpertHighScore", 7252665916057218138L);
        setLongField(term118283, term118283.getClass(), "totalMasterHighScore", 6912164524535243699L);
        setLongField(term118283, term118283.getClass(), "totalUltimaHighScore", 7571018035199029898L);
        setIntField(term118283, term118283.getClass(), "friendCount", -1186604489);
        setIntField(term118327, term118327.getClass(), "year", 2012);
        setShortField(term118327, term118327.getClass(), "month", (short) 12);
        setShortField(term118327, term118327.getClass(), "day", (short) 15);
        setField(term118326, term118326.getClass(), "date", term118327);
        setByteField(term118331, term118331.getClass(), "hour", (byte) 7);
        setByteField(term118331, term118331.getClass(), "minute", (byte) 16);
        setByteField(term118331, term118331.getClass(), "second", (byte) 53);
        setIntField(term118331, term118331.getClass(), "nano", 190883735);
        setField(term118326, term118326.getClass(), "time", term118331);
        setField(term118283, term118283.getClass(), "firstPlayDate", term118326);
        setIntField(term118337, term118337.getClass(), "year", 2019);
        setShortField(term118337, term118337.getClass(), "month", (short) 9);
        setShortField(term118337, term118337.getClass(), "day", (short) 13);
        setField(term118336, term118336.getClass(), "date", term118337);
        setByteField(term118341, term118341.getClass(), "hour", (byte) 13);
        setByteField(term118341, term118341.getClass(), "minute", (byte) 6);
        setByteField(term118341, term118341.getClass(), "second", (byte) 50);
        setIntField(term118341, term118341.getClass(), "nano", 554204884);
        setField(term118336, term118336.getClass(), "time", term118341);
        setField(term118283, term118283.getClass(), "lastPlayDate", term118336);
        setIntField(term118283, term118283.getClass(), "courseClass", 1649654914);
        setIntField(term118283, term118283.getClass(), "overPowerPoint", -840013725);
        setIntField(term118283, term118283.getClass(), "overPowerRate", -275217452);
        setIntField(term118283, term118283.getClass(), "mapIconId", 288932106);
        setIntField(term118283, term118283.getClass(), "voiceId", 743995516);
        setIntField(term118283, term118283.getClass(), "avatarWear", 1423199730);
        setIntField(term118283, term118283.getClass(), "avatarHead", 182976927);
        setIntField(term118283, term118283.getClass(), "avatarFace", -466347645);
        setIntField(term118283, term118283.getClass(), "avatarSkin", -1611067036);
        setIntField(term118283, term118283.getClass(), "avatarItem", -62918868);
        setIntField(term118283, term118283.getClass(), "avatarFront", -555932606);
        setIntField(term118283, term118283.getClass(), "avatarBack", -1755679832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarHead", argTypes, term118283, args);
    }

};


