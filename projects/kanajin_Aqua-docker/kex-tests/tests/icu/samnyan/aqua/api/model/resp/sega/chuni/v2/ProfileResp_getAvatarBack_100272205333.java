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

public class ProfileResp_getAvatarBack_100272205333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118758;

    public ProfileResp_getAvatarBack_100272205333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118758 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118816 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118758, term118758.getClass(), "userName", "tvBudEtoqr");
        setIntField(term118758, term118758.getClass(), "level", -592683313);
        setField(term118758, term118758.getClass(), "exp", "ExUWFRqPXf");
        setLongField(term118758, term118758.getClass(), "point", -7776455266794736508L);
        setLongField(term118758, term118758.getClass(), "totalPoint", 1859486651056014320L);
        setIntField(term118758, term118758.getClass(), "playCount", -1934715476);
        setIntField(term118758, term118758.getClass(), "playerRating", -1989038983);
        setIntField(term118758, term118758.getClass(), "highestRating", 1841869880);
        setIntField(term118758, term118758.getClass(), "nameplateId", -1423393847);
        setIntField(term118758, term118758.getClass(), "frameId", -77925185);
        setIntField(term118758, term118758.getClass(), "characterId", -1278335001);
        setIntField(term118758, term118758.getClass(), "trophyId", -343824740);
        setIntField(term118758, term118758.getClass(), "totalMapNum", -558600714);
        setLongField(term118758, term118758.getClass(), "totalHiScore", 7937872670852497485L);
        setLongField(term118758, term118758.getClass(), "totalBasicHighScore", 4330619556244422331L);
        setLongField(term118758, term118758.getClass(), "totalAdvancedHighScore", -3390269648729027515L);
        setLongField(term118758, term118758.getClass(), "totalExpertHighScore", 2068158559324124841L);
        setLongField(term118758, term118758.getClass(), "totalMasterHighScore", -8371620123385419373L);
        setLongField(term118758, term118758.getClass(), "totalUltimaHighScore", 2322443444505607884L);
        setIntField(term118758, term118758.getClass(), "friendCount", 859977750);
        setIntField(term118802, term118802.getClass(), "year", 2024);
        setShortField(term118802, term118802.getClass(), "month", (short) 10);
        setShortField(term118802, term118802.getClass(), "day", (short) 21);
        setField(term118801, term118801.getClass(), "date", term118802);
        setByteField(term118806, term118806.getClass(), "hour", (byte) 14);
        setByteField(term118806, term118806.getClass(), "minute", (byte) 20);
        setByteField(term118806, term118806.getClass(), "second", (byte) 11);
        setIntField(term118806, term118806.getClass(), "nano", 920356259);
        setField(term118801, term118801.getClass(), "time", term118806);
        setField(term118758, term118758.getClass(), "firstPlayDate", term118801);
        setIntField(term118812, term118812.getClass(), "year", 2012);
        setShortField(term118812, term118812.getClass(), "month", (short) 11);
        setShortField(term118812, term118812.getClass(), "day", (short) 11);
        setField(term118811, term118811.getClass(), "date", term118812);
        setByteField(term118816, term118816.getClass(), "hour", (byte) 6);
        setByteField(term118816, term118816.getClass(), "minute", (byte) 48);
        setByteField(term118816, term118816.getClass(), "second", (byte) 20);
        setIntField(term118816, term118816.getClass(), "nano", 783890104);
        setField(term118811, term118811.getClass(), "time", term118816);
        setField(term118758, term118758.getClass(), "lastPlayDate", term118811);
        setIntField(term118758, term118758.getClass(), "courseClass", -2113481602);
        setIntField(term118758, term118758.getClass(), "overPowerPoint", 723169580);
        setIntField(term118758, term118758.getClass(), "overPowerRate", 1479596266);
        setIntField(term118758, term118758.getClass(), "mapIconId", 1927462009);
        setIntField(term118758, term118758.getClass(), "voiceId", 689751819);
        setIntField(term118758, term118758.getClass(), "avatarWear", -32684640);
        setIntField(term118758, term118758.getClass(), "avatarHead", 322376179);
        setIntField(term118758, term118758.getClass(), "avatarFace", -591477010);
        setIntField(term118758, term118758.getClass(), "avatarSkin", 1334987435);
        setIntField(term118758, term118758.getClass(), "avatarItem", -313041902);
        setIntField(term118758, term118758.getClass(), "avatarFront", 1400273039);
        setIntField(term118758, term118758.getClass(), "avatarBack", -393501162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarBack", argTypes, term118758, args);
    }

};


