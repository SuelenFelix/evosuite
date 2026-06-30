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

public class ProfileResp_getCourseClass_212663146622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117713;

    public ProfileResp_getCourseClass_212663146622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117713 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117771 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117713, term117713.getClass(), "userName", "nsyKPkuiKM");
        setIntField(term117713, term117713.getClass(), "level", 1493949914);
        setField(term117713, term117713.getClass(), "exp", "QQrzJyhVFh");
        setLongField(term117713, term117713.getClass(), "point", -8965803539495697005L);
        setLongField(term117713, term117713.getClass(), "totalPoint", -769464752627615058L);
        setIntField(term117713, term117713.getClass(), "playCount", 767003357);
        setIntField(term117713, term117713.getClass(), "playerRating", -1708219488);
        setIntField(term117713, term117713.getClass(), "highestRating", -614584350);
        setIntField(term117713, term117713.getClass(), "nameplateId", -699012488);
        setIntField(term117713, term117713.getClass(), "frameId", -1333226327);
        setIntField(term117713, term117713.getClass(), "characterId", -570021795);
        setIntField(term117713, term117713.getClass(), "trophyId", -2018482302);
        setIntField(term117713, term117713.getClass(), "totalMapNum", 73612503);
        setLongField(term117713, term117713.getClass(), "totalHiScore", -2001410532006219304L);
        setLongField(term117713, term117713.getClass(), "totalBasicHighScore", 9027162258119014420L);
        setLongField(term117713, term117713.getClass(), "totalAdvancedHighScore", 4655675274816076457L);
        setLongField(term117713, term117713.getClass(), "totalExpertHighScore", 597217404486026348L);
        setLongField(term117713, term117713.getClass(), "totalMasterHighScore", 5688461670703265476L);
        setLongField(term117713, term117713.getClass(), "totalUltimaHighScore", 8535417948216692452L);
        setIntField(term117713, term117713.getClass(), "friendCount", -1548796371);
        setIntField(term117757, term117757.getClass(), "year", 2022);
        setShortField(term117757, term117757.getClass(), "month", (short) 3);
        setShortField(term117757, term117757.getClass(), "day", (short) 21);
        setField(term117756, term117756.getClass(), "date", term117757);
        setByteField(term117761, term117761.getClass(), "hour", (byte) 7);
        setByteField(term117761, term117761.getClass(), "minute", (byte) 28);
        setByteField(term117761, term117761.getClass(), "second", (byte) 31);
        setIntField(term117761, term117761.getClass(), "nano", 584068303);
        setField(term117756, term117756.getClass(), "time", term117761);
        setField(term117713, term117713.getClass(), "firstPlayDate", term117756);
        setIntField(term117767, term117767.getClass(), "year", 2016);
        setShortField(term117767, term117767.getClass(), "month", (short) 6);
        setShortField(term117767, term117767.getClass(), "day", (short) 1);
        setField(term117766, term117766.getClass(), "date", term117767);
        setByteField(term117771, term117771.getClass(), "hour", (byte) 3);
        setByteField(term117771, term117771.getClass(), "minute", (byte) 49);
        setByteField(term117771, term117771.getClass(), "second", (byte) 22);
        setIntField(term117771, term117771.getClass(), "nano", 551269700);
        setField(term117766, term117766.getClass(), "time", term117771);
        setField(term117713, term117713.getClass(), "lastPlayDate", term117766);
        setIntField(term117713, term117713.getClass(), "courseClass", -2081271175);
        setIntField(term117713, term117713.getClass(), "overPowerPoint", -1494718134);
        setIntField(term117713, term117713.getClass(), "overPowerRate", -1564849958);
        setIntField(term117713, term117713.getClass(), "mapIconId", 764359433);
        setIntField(term117713, term117713.getClass(), "voiceId", 408878042);
        setIntField(term117713, term117713.getClass(), "avatarWear", -1272622540);
        setIntField(term117713, term117713.getClass(), "avatarHead", -827982292);
        setIntField(term117713, term117713.getClass(), "avatarFace", -881679605);
        setIntField(term117713, term117713.getClass(), "avatarSkin", 916234357);
        setIntField(term117713, term117713.getClass(), "avatarItem", 1330928005);
        setIntField(term117713, term117713.getClass(), "avatarFront", 1556362132);
        setIntField(term117713, term117713.getClass(), "avatarBack", 822832375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseClass", argTypes, term117713, args);
    }

};


