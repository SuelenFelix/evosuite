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

public class ProfileResp_setAvatarSkin_188175305964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121819;
     Object term121894;

    public ProfileResp_setAvatarSkin_188175305964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121819 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121867 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121877 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121819, term121819.getClass(), "userName", "mpLqtxGrAU");
        setIntField(term121819, term121819.getClass(), "level", -138038528);
        setField(term121819, term121819.getClass(), "exp", "JKBkexwJQQ");
        setLongField(term121819, term121819.getClass(), "point", 9085814143239936523L);
        setLongField(term121819, term121819.getClass(), "totalPoint", 3928385666356408907L);
        setIntField(term121819, term121819.getClass(), "playCount", 962741145);
        setIntField(term121819, term121819.getClass(), "playerRating", 119694677);
        setIntField(term121819, term121819.getClass(), "highestRating", -2043318013);
        setIntField(term121819, term121819.getClass(), "nameplateId", -1931397446);
        setIntField(term121819, term121819.getClass(), "frameId", -300563121);
        setIntField(term121819, term121819.getClass(), "characterId", -1930882577);
        setIntField(term121819, term121819.getClass(), "trophyId", 1911430199);
        setIntField(term121819, term121819.getClass(), "totalMapNum", 1883231498);
        setLongField(term121819, term121819.getClass(), "totalHiScore", -7493636961403038807L);
        setLongField(term121819, term121819.getClass(), "totalBasicHighScore", -5434014830409612713L);
        setLongField(term121819, term121819.getClass(), "totalAdvancedHighScore", -3537882128376126825L);
        setLongField(term121819, term121819.getClass(), "totalExpertHighScore", -6054241362349257095L);
        setLongField(term121819, term121819.getClass(), "totalMasterHighScore", 5442568919413262365L);
        setLongField(term121819, term121819.getClass(), "totalUltimaHighScore", 3549776544767502048L);
        setIntField(term121819, term121819.getClass(), "friendCount", 1932549327);
        setIntField(term121863, term121863.getClass(), "year", 2023);
        setShortField(term121863, term121863.getClass(), "month", (short) 6);
        setShortField(term121863, term121863.getClass(), "day", (short) 12);
        setField(term121862, term121862.getClass(), "date", term121863);
        setByteField(term121867, term121867.getClass(), "hour", (byte) 0);
        setByteField(term121867, term121867.getClass(), "minute", (byte) 32);
        setByteField(term121867, term121867.getClass(), "second", (byte) 46);
        setIntField(term121867, term121867.getClass(), "nano", 352736522);
        setField(term121862, term121862.getClass(), "time", term121867);
        setField(term121819, term121819.getClass(), "firstPlayDate", term121862);
        setIntField(term121873, term121873.getClass(), "year", 2015);
        setShortField(term121873, term121873.getClass(), "month", (short) 5);
        setShortField(term121873, term121873.getClass(), "day", (short) 29);
        setField(term121872, term121872.getClass(), "date", term121873);
        setByteField(term121877, term121877.getClass(), "hour", (byte) 6);
        setByteField(term121877, term121877.getClass(), "minute", (byte) 51);
        setByteField(term121877, term121877.getClass(), "second", (byte) 44);
        setIntField(term121877, term121877.getClass(), "nano", 730156724);
        setField(term121872, term121872.getClass(), "time", term121877);
        setField(term121819, term121819.getClass(), "lastPlayDate", term121872);
        setIntField(term121819, term121819.getClass(), "courseClass", -676185760);
        setIntField(term121819, term121819.getClass(), "overPowerPoint", -588187878);
        setIntField(term121819, term121819.getClass(), "overPowerRate", -793986537);
        setIntField(term121819, term121819.getClass(), "mapIconId", -443452743);
        setIntField(term121819, term121819.getClass(), "voiceId", 33555706);
        setIntField(term121819, term121819.getClass(), "avatarWear", 1411622798);
        setIntField(term121819, term121819.getClass(), "avatarHead", 1988591697);
        setIntField(term121819, term121819.getClass(), "avatarFace", -728864893);
        setIntField(term121819, term121819.getClass(), "avatarSkin", 1681695175);
        setIntField(term121819, term121819.getClass(), "avatarItem", -2016093994);
        setIntField(term121819, term121819.getClass(), "avatarFront", 1157006754);
        setIntField(term121819, term121819.getClass(), "avatarBack", 551391901);
        term121894 = new Integer(221461213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121894;
        callMethod(klass, "setAvatarSkin", argTypes, term121819, args);
    }

};


