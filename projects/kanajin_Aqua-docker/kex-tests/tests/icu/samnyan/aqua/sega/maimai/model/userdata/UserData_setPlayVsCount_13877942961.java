package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserData_setPlayVsCount_13877942961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16191;
     Object term16365;

    public UserData_setPlayVsCount_13877942961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16195 = new Long(2443640364875054177L);
        term16191 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term16193 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term16209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16224 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term16191, term16191.getClass(), "id", 6273754186658578034L);
        setLongField(term16193, term16193.getClass(), "id", 3620247240684476031L);
        setField(term16193, term16193.getClass(), "extId", term16195);
        setField(term16193, term16193.getClass(), "luid", "QZBHZqZope");
        setIntField(term16210, term16210.getClass(), "year", 2016);
        setShortField(term16210, term16210.getClass(), "month", (short) 4);
        setShortField(term16210, term16210.getClass(), "day", (short) 18);
        setField(term16209, term16209.getClass(), "date", term16210);
        setByteField(term16214, term16214.getClass(), "hour", (byte) 15);
        setByteField(term16214, term16214.getClass(), "minute", (byte) 56);
        setByteField(term16214, term16214.getClass(), "second", (byte) 45);
        setIntField(term16214, term16214.getClass(), "nano", 248103350);
        setField(term16209, term16209.getClass(), "time", term16214);
        setField(term16193, term16193.getClass(), "registerTime", term16209);
        setIntField(term16220, term16220.getClass(), "year", 2028);
        setShortField(term16220, term16220.getClass(), "month", (short) 3);
        setShortField(term16220, term16220.getClass(), "day", (short) 25);
        setField(term16219, term16219.getClass(), "date", term16220);
        setByteField(term16224, term16224.getClass(), "hour", (byte) 6);
        setByteField(term16224, term16224.getClass(), "minute", (byte) 9);
        setByteField(term16224, term16224.getClass(), "second", (byte) 35);
        setIntField(term16224, term16224.getClass(), "nano", 744453524);
        setField(term16219, term16219.getClass(), "time", term16224);
        setField(term16193, term16193.getClass(), "accessTime", term16219);
        setField(term16191, term16191.getClass(), "card", term16193);
        setIntField(term16191, term16191.getClass(), "lastDataVersion", 903788782);
        setField(term16191, term16191.getClass(), "userName", "VBUahCvyxC");
        setIntField(term16191, term16191.getClass(), "point", -608033702);
        setIntField(term16191, term16191.getClass(), "totalPoint", 1118825073);
        setIntField(term16191, term16191.getClass(), "iconId", 751108197);
        setIntField(term16191, term16191.getClass(), "nameplateId", -1810066487);
        setIntField(term16191, term16191.getClass(), "frameId", 12697707);
        setIntField(term16191, term16191.getClass(), "trophyId", -971143668);
        setIntField(term16191, term16191.getClass(), "playCount", 127763053);
        setIntField(term16191, term16191.getClass(), "playVsCount", 968035207);
        setIntField(term16191, term16191.getClass(), "playSyncCount", -643589717);
        setIntField(term16191, term16191.getClass(), "winCount", -1599482698);
        setIntField(term16191, term16191.getClass(), "helpCount", -370600915);
        setIntField(term16191, term16191.getClass(), "comboCount", -311572875);
        setIntField(term16191, term16191.getClass(), "feverCount", 355595594);
        setIntField(term16191, term16191.getClass(), "totalHiScore", 842697786);
        setIntField(term16191, term16191.getClass(), "totalEasyHighScore", 1685808201);
        setIntField(term16191, term16191.getClass(), "totalBasicHighScore", 1565114969);
        setIntField(term16191, term16191.getClass(), "totalAdvancedHighScore", 806831765);
        setIntField(term16191, term16191.getClass(), "totalExpertHighScore", -1445658721);
        setIntField(term16191, term16191.getClass(), "totalMasterHighScore", 872435483);
        setIntField(term16191, term16191.getClass(), "totalReMasterHighScore", 110611143);
        setIntField(term16191, term16191.getClass(), "totalHighSync", 793381056);
        setIntField(term16191, term16191.getClass(), "totalEasySync", 65007514);
        setIntField(term16191, term16191.getClass(), "totalBasicSync", 1731844126);
        setIntField(term16191, term16191.getClass(), "totalAdvancedSync", -861962061);
        setIntField(term16191, term16191.getClass(), "totalExpertSync", -1867124507);
        setIntField(term16191, term16191.getClass(), "totalMasterSync", 416116291);
        setIntField(term16191, term16191.getClass(), "totalReMasterSync", 1104795023);
        setIntField(term16191, term16191.getClass(), "playerRating", -1833777337);
        setIntField(term16191, term16191.getClass(), "highestRating", -2068333492);
        setIntField(term16191, term16191.getClass(), "rankAuthTailId", 1892862475);
        setField(term16191, term16191.getClass(), "eventWatchedDate", "MlzTkzKMCX");
        setField(term16191, term16191.getClass(), "webLimitDate", "UqKUbMyPMJ");
        setIntField(term16191, term16191.getClass(), "challengeTrackPhase", -807914927);
        setIntField(term16191, term16191.getClass(), "firstPlayBits", -313873930);
        setField(term16191, term16191.getClass(), "lastPlayDate", "QpYltHAdyY");
        setIntField(term16191, term16191.getClass(), "lastPlaceId", -1064231188);
        setField(term16191, term16191.getClass(), "lastPlaceName", "lbmSGBwIiV");
        setIntField(term16191, term16191.getClass(), "lastRegionId", 1631564781);
        setField(term16191, term16191.getClass(), "lastRegionName", "DAxyHoTLzZ");
        setField(term16191, term16191.getClass(), "lastClientId", "fhZgTouhCC");
        setField(term16191, term16191.getClass(), "lastCountryCode", "wrikqJwXvL");
        setIntField(term16191, term16191.getClass(), "eventPoint", -3085808);
        setIntField(term16191, term16191.getClass(), "totalLv", 1975783377);
        setIntField(term16191, term16191.getClass(), "lastLoginBonusDay", -665938382);
        setIntField(term16191, term16191.getClass(), "lastSurvivalBonusDay", 325391588);
        setIntField(term16191, term16191.getClass(), "loginBonusLv", 1443046313);
        term16365 = new Integer(1055117337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16365;
        callMethod(klass, "setPlayVsCount", argTypes, term16191, args);
    }

};


