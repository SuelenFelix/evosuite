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
import java.lang.Long;

public class ProfileResp_setPoint_92530833337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119184;
     Object term119259;

    public ProfileResp_setPoint_92530833337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119184 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119242 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119184, term119184.getClass(), "userName", "iAhGpxznud");
        setIntField(term119184, term119184.getClass(), "level", 144401642);
        setField(term119184, term119184.getClass(), "exp", "oIZYdVpStA");
        setLongField(term119184, term119184.getClass(), "point", 6000339484311671071L);
        setLongField(term119184, term119184.getClass(), "totalPoint", -26107593653918206L);
        setIntField(term119184, term119184.getClass(), "playCount", -1041912502);
        setIntField(term119184, term119184.getClass(), "playerRating", 632068695);
        setIntField(term119184, term119184.getClass(), "highestRating", 641999875);
        setIntField(term119184, term119184.getClass(), "nameplateId", 2026536518);
        setIntField(term119184, term119184.getClass(), "frameId", -1871748004);
        setIntField(term119184, term119184.getClass(), "characterId", 164750112);
        setIntField(term119184, term119184.getClass(), "trophyId", 43223793);
        setIntField(term119184, term119184.getClass(), "totalMapNum", -125390305);
        setLongField(term119184, term119184.getClass(), "totalHiScore", -882029722229355739L);
        setLongField(term119184, term119184.getClass(), "totalBasicHighScore", -764143069790997305L);
        setLongField(term119184, term119184.getClass(), "totalAdvancedHighScore", 7841874237578415646L);
        setLongField(term119184, term119184.getClass(), "totalExpertHighScore", 4722907183385854894L);
        setLongField(term119184, term119184.getClass(), "totalMasterHighScore", 1141311547133627189L);
        setLongField(term119184, term119184.getClass(), "totalUltimaHighScore", -5819816209403809941L);
        setIntField(term119184, term119184.getClass(), "friendCount", 1069221906);
        setIntField(term119228, term119228.getClass(), "year", 2013);
        setShortField(term119228, term119228.getClass(), "month", (short) 9);
        setShortField(term119228, term119228.getClass(), "day", (short) 13);
        setField(term119227, term119227.getClass(), "date", term119228);
        setByteField(term119232, term119232.getClass(), "hour", (byte) 5);
        setByteField(term119232, term119232.getClass(), "minute", (byte) 36);
        setByteField(term119232, term119232.getClass(), "second", (byte) 37);
        setIntField(term119232, term119232.getClass(), "nano", 447967534);
        setField(term119227, term119227.getClass(), "time", term119232);
        setField(term119184, term119184.getClass(), "firstPlayDate", term119227);
        setIntField(term119238, term119238.getClass(), "year", 2020);
        setShortField(term119238, term119238.getClass(), "month", (short) 3);
        setShortField(term119238, term119238.getClass(), "day", (short) 7);
        setField(term119237, term119237.getClass(), "date", term119238);
        setByteField(term119242, term119242.getClass(), "hour", (byte) 21);
        setByteField(term119242, term119242.getClass(), "minute", (byte) 38);
        setByteField(term119242, term119242.getClass(), "second", (byte) 58);
        setIntField(term119242, term119242.getClass(), "nano", 917040474);
        setField(term119237, term119237.getClass(), "time", term119242);
        setField(term119184, term119184.getClass(), "lastPlayDate", term119237);
        setIntField(term119184, term119184.getClass(), "courseClass", 1695465227);
        setIntField(term119184, term119184.getClass(), "overPowerPoint", -2102568816);
        setIntField(term119184, term119184.getClass(), "overPowerRate", 1867786364);
        setIntField(term119184, term119184.getClass(), "mapIconId", 1653372776);
        setIntField(term119184, term119184.getClass(), "voiceId", 188572423);
        setIntField(term119184, term119184.getClass(), "avatarWear", -356160852);
        setIntField(term119184, term119184.getClass(), "avatarHead", 1687517175);
        setIntField(term119184, term119184.getClass(), "avatarFace", 1996950306);
        setIntField(term119184, term119184.getClass(), "avatarSkin", 1587352706);
        setIntField(term119184, term119184.getClass(), "avatarItem", 519193972);
        setIntField(term119184, term119184.getClass(), "avatarFront", 1163777183);
        setIntField(term119184, term119184.getClass(), "avatarBack", 1769759964);
        term119259 = new Long(-3534340455184560024L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term119259;
        callMethod(klass, "setPoint", argTypes, term119184, args);
    }

};


