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

public class ProfileResp_setHighestRating_131216333241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119572;
     Object term119647;

    public ProfileResp_setHighestRating_131216333241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119572 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119620 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119630 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119572, term119572.getClass(), "userName", "vZnHzZGaqo");
        setIntField(term119572, term119572.getClass(), "level", 1530423034);
        setField(term119572, term119572.getClass(), "exp", "DLxHFGRtHg");
        setLongField(term119572, term119572.getClass(), "point", 8287717396745699238L);
        setLongField(term119572, term119572.getClass(), "totalPoint", 2780391456169453608L);
        setIntField(term119572, term119572.getClass(), "playCount", 1961275420);
        setIntField(term119572, term119572.getClass(), "playerRating", -1976430939);
        setIntField(term119572, term119572.getClass(), "highestRating", 754117346);
        setIntField(term119572, term119572.getClass(), "nameplateId", 71941370);
        setIntField(term119572, term119572.getClass(), "frameId", -409431855);
        setIntField(term119572, term119572.getClass(), "characterId", -1384158978);
        setIntField(term119572, term119572.getClass(), "trophyId", 1847631575);
        setIntField(term119572, term119572.getClass(), "totalMapNum", -1549897302);
        setLongField(term119572, term119572.getClass(), "totalHiScore", 6274100094579147268L);
        setLongField(term119572, term119572.getClass(), "totalBasicHighScore", -8139745683966925044L);
        setLongField(term119572, term119572.getClass(), "totalAdvancedHighScore", -70290858846123640L);
        setLongField(term119572, term119572.getClass(), "totalExpertHighScore", 5694128139482897319L);
        setLongField(term119572, term119572.getClass(), "totalMasterHighScore", -7695239710538668939L);
        setLongField(term119572, term119572.getClass(), "totalUltimaHighScore", 3015313255108144976L);
        setIntField(term119572, term119572.getClass(), "friendCount", -731230903);
        setIntField(term119616, term119616.getClass(), "year", 2026);
        setShortField(term119616, term119616.getClass(), "month", (short) 4);
        setShortField(term119616, term119616.getClass(), "day", (short) 23);
        setField(term119615, term119615.getClass(), "date", term119616);
        setByteField(term119620, term119620.getClass(), "hour", (byte) 2);
        setByteField(term119620, term119620.getClass(), "minute", (byte) 58);
        setByteField(term119620, term119620.getClass(), "second", (byte) 18);
        setIntField(term119620, term119620.getClass(), "nano", 529855623);
        setField(term119615, term119615.getClass(), "time", term119620);
        setField(term119572, term119572.getClass(), "firstPlayDate", term119615);
        setIntField(term119626, term119626.getClass(), "year", 2019);
        setShortField(term119626, term119626.getClass(), "month", (short) 3);
        setShortField(term119626, term119626.getClass(), "day", (short) 29);
        setField(term119625, term119625.getClass(), "date", term119626);
        setByteField(term119630, term119630.getClass(), "hour", (byte) 20);
        setByteField(term119630, term119630.getClass(), "minute", (byte) 0);
        setByteField(term119630, term119630.getClass(), "second", (byte) 37);
        setIntField(term119630, term119630.getClass(), "nano", 703177535);
        setField(term119625, term119625.getClass(), "time", term119630);
        setField(term119572, term119572.getClass(), "lastPlayDate", term119625);
        setIntField(term119572, term119572.getClass(), "courseClass", -453963758);
        setIntField(term119572, term119572.getClass(), "overPowerPoint", -1343699901);
        setIntField(term119572, term119572.getClass(), "overPowerRate", 1374375364);
        setIntField(term119572, term119572.getClass(), "mapIconId", -1406551784);
        setIntField(term119572, term119572.getClass(), "voiceId", -1729751262);
        setIntField(term119572, term119572.getClass(), "avatarWear", 25065314);
        setIntField(term119572, term119572.getClass(), "avatarHead", -1309856364);
        setIntField(term119572, term119572.getClass(), "avatarFace", -1026085005);
        setIntField(term119572, term119572.getClass(), "avatarSkin", -1268161606);
        setIntField(term119572, term119572.getClass(), "avatarItem", 1876077886);
        setIntField(term119572, term119572.getClass(), "avatarFront", -1754710526);
        setIntField(term119572, term119572.getClass(), "avatarBack", 1497441762);
        term119647 = new Integer(-668148646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119647;
        callMethod(klass, "setHighestRating", argTypes, term119572, args);
    }

};


