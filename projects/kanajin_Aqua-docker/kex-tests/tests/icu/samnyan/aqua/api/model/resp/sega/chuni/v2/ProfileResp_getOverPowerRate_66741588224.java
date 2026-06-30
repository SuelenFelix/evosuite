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

public class ProfileResp_getOverPowerRate_66741588224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117903;

    public ProfileResp_getOverPowerRate_66741588224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117903 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117951 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117961 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117903, term117903.getClass(), "userName", "ljsmTMvgTG");
        setIntField(term117903, term117903.getClass(), "level", 62022224);
        setField(term117903, term117903.getClass(), "exp", "SvZVhBPcjK");
        setLongField(term117903, term117903.getClass(), "point", 5054033979699834646L);
        setLongField(term117903, term117903.getClass(), "totalPoint", 658500236944944374L);
        setIntField(term117903, term117903.getClass(), "playCount", -1365605318);
        setIntField(term117903, term117903.getClass(), "playerRating", 453239000);
        setIntField(term117903, term117903.getClass(), "highestRating", 715275164);
        setIntField(term117903, term117903.getClass(), "nameplateId", 474419267);
        setIntField(term117903, term117903.getClass(), "frameId", 978778471);
        setIntField(term117903, term117903.getClass(), "characterId", 19369919);
        setIntField(term117903, term117903.getClass(), "trophyId", -324613353);
        setIntField(term117903, term117903.getClass(), "totalMapNum", 1312700556);
        setLongField(term117903, term117903.getClass(), "totalHiScore", -2706892193113781197L);
        setLongField(term117903, term117903.getClass(), "totalBasicHighScore", -1192466301838383709L);
        setLongField(term117903, term117903.getClass(), "totalAdvancedHighScore", 1368557283066981343L);
        setLongField(term117903, term117903.getClass(), "totalExpertHighScore", 6590977446424762721L);
        setLongField(term117903, term117903.getClass(), "totalMasterHighScore", -3753828594925236519L);
        setLongField(term117903, term117903.getClass(), "totalUltimaHighScore", -2980872849014503888L);
        setIntField(term117903, term117903.getClass(), "friendCount", -1485635755);
        setIntField(term117947, term117947.getClass(), "year", 2027);
        setShortField(term117947, term117947.getClass(), "month", (short) 5);
        setShortField(term117947, term117947.getClass(), "day", (short) 8);
        setField(term117946, term117946.getClass(), "date", term117947);
        setByteField(term117951, term117951.getClass(), "hour", (byte) 7);
        setByteField(term117951, term117951.getClass(), "minute", (byte) 53);
        setByteField(term117951, term117951.getClass(), "second", (byte) 35);
        setIntField(term117951, term117951.getClass(), "nano", 69283790);
        setField(term117946, term117946.getClass(), "time", term117951);
        setField(term117903, term117903.getClass(), "firstPlayDate", term117946);
        setIntField(term117957, term117957.getClass(), "year", 2021);
        setShortField(term117957, term117957.getClass(), "month", (short) 8);
        setShortField(term117957, term117957.getClass(), "day", (short) 15);
        setField(term117956, term117956.getClass(), "date", term117957);
        setByteField(term117961, term117961.getClass(), "hour", (byte) 14);
        setByteField(term117961, term117961.getClass(), "minute", (byte) 47);
        setByteField(term117961, term117961.getClass(), "second", (byte) 19);
        setIntField(term117961, term117961.getClass(), "nano", 395038826);
        setField(term117956, term117956.getClass(), "time", term117961);
        setField(term117903, term117903.getClass(), "lastPlayDate", term117956);
        setIntField(term117903, term117903.getClass(), "courseClass", 1295828395);
        setIntField(term117903, term117903.getClass(), "overPowerPoint", -1835015575);
        setIntField(term117903, term117903.getClass(), "overPowerRate", 661562880);
        setIntField(term117903, term117903.getClass(), "mapIconId", -1375635181);
        setIntField(term117903, term117903.getClass(), "voiceId", -474974421);
        setIntField(term117903, term117903.getClass(), "avatarWear", -650334599);
        setIntField(term117903, term117903.getClass(), "avatarHead", -628505449);
        setIntField(term117903, term117903.getClass(), "avatarFace", -1077256693);
        setIntField(term117903, term117903.getClass(), "avatarSkin", 1876895126);
        setIntField(term117903, term117903.getClass(), "avatarItem", 987058310);
        setIntField(term117903, term117903.getClass(), "avatarFront", 1907984003);
        setIntField(term117903, term117903.getClass(), "avatarBack", -138069113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverPowerRate", argTypes, term117903, args);
    }

};


