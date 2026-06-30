package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserActivity_canEqual_11260743320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300541;
     Object term300826;

    public UserActivity_canEqual_11260743320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term300547 = new Long(5071015720043054072L);
        term300541 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term300543 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term300545 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term300561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300753 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term300541, term300541.getClass(), "id", 781303308630594465L);
        setLongField(term300543, term300543.getClass(), "id", 7907635136140347779L);
        setLongField(term300545, term300545.getClass(), "id", 8736615056458651519L);
        setField(term300545, term300545.getClass(), "extId", term300547);
        setField(term300545, term300545.getClass(), "luid", "MPUPYPQuHB");
        setIntField(term300562, term300562.getClass(), "year", 2029);
        setShortField(term300562, term300562.getClass(), "month", (short) 1);
        setShortField(term300562, term300562.getClass(), "day", (short) 20);
        setField(term300561, term300561.getClass(), "date", term300562);
        setByteField(term300566, term300566.getClass(), "hour", (byte) 22);
        setByteField(term300566, term300566.getClass(), "minute", (byte) 10);
        setByteField(term300566, term300566.getClass(), "second", (byte) 4);
        setIntField(term300566, term300566.getClass(), "nano", 648628286);
        setField(term300561, term300561.getClass(), "time", term300566);
        setField(term300545, term300545.getClass(), "registerTime", term300561);
        setIntField(term300572, term300572.getClass(), "year", 2015);
        setShortField(term300572, term300572.getClass(), "month", (short) 6);
        setShortField(term300572, term300572.getClass(), "day", (short) 7);
        setField(term300571, term300571.getClass(), "date", term300572);
        setByteField(term300576, term300576.getClass(), "hour", (byte) 15);
        setByteField(term300576, term300576.getClass(), "minute", (byte) 31);
        setByteField(term300576, term300576.getClass(), "second", (byte) 54);
        setIntField(term300576, term300576.getClass(), "nano", 622979904);
        setField(term300571, term300571.getClass(), "time", term300576);
        setField(term300545, term300545.getClass(), "accessTime", term300571);
        setField(term300543, term300543.getClass(), "card", term300545);
        setField(term300543, term300543.getClass(), "userName", "blJZUhevsA");
        setIntField(term300594, term300594.getClass(), "year", 2013);
        setShortField(term300594, term300594.getClass(), "month", (short) 9);
        setShortField(term300594, term300594.getClass(), "day", (short) 22);
        setField(term300593, term300593.getClass(), "date", term300594);
        setByteField(term300598, term300598.getClass(), "hour", (byte) 23);
        setByteField(term300598, term300598.getClass(), "minute", (byte) 52);
        setByteField(term300598, term300598.getClass(), "second", (byte) 5);
        setIntField(term300598, term300598.getClass(), "nano", 290050718);
        setField(term300593, term300593.getClass(), "time", term300598);
        setField(term300543, term300543.getClass(), "lastLoginDate", term300593);
        setBooleanField(term300543, term300543.getClass(), "isWebJoin", true);
        setField(term300543, term300543.getClass(), "webLimitDate", "nbJzmGdHpB");
        setIntField(term300543, term300543.getClass(), "level", -1825653861);
        setIntField(term300543, term300543.getClass(), "reincarnationNum", 1158565526);
        setField(term300543, term300543.getClass(), "exp", "HxihxzuKfN");
        setLongField(term300543, term300543.getClass(), "point", -205013850356169564L);
        setLongField(term300543, term300543.getClass(), "totalPoint", 2567866333573355776L);
        setIntField(term300543, term300543.getClass(), "playCount", 494749529);
        setIntField(term300543, term300543.getClass(), "multiPlayCount", -1856844247);
        setIntField(term300543, term300543.getClass(), "multiWinCount", 1204731141);
        setIntField(term300543, term300543.getClass(), "requestResCount", -303280582);
        setIntField(term300543, term300543.getClass(), "acceptResCount", -630302996);
        setIntField(term300543, term300543.getClass(), "successResCount", -1137094845);
        setIntField(term300543, term300543.getClass(), "playerRating", -219496753);
        setIntField(term300543, term300543.getClass(), "highestRating", 1063790205);
        setIntField(term300543, term300543.getClass(), "nameplateId", 618483255);
        setIntField(term300543, term300543.getClass(), "frameId", 1986426483);
        setIntField(term300543, term300543.getClass(), "characterId", -97338829);
        setIntField(term300543, term300543.getClass(), "trophyId", 1961579264);
        setIntField(term300543, term300543.getClass(), "playedTutorialBit", -1701113649);
        setIntField(term300543, term300543.getClass(), "firstTutorialCancelNum", 75746646);
        setIntField(term300543, term300543.getClass(), "masterTutorialCancelNum", -215266357);
        setIntField(term300543, term300543.getClass(), "totalRepertoireCount", -519251709);
        setIntField(term300543, term300543.getClass(), "totalMapNum", 1024031566);
        setLongField(term300543, term300543.getClass(), "totalHiScore", -4237661676220857495L);
        setLongField(term300543, term300543.getClass(), "totalBasicHighScore", -1112401645496674521L);
        setLongField(term300543, term300543.getClass(), "totalAdvancedHighScore", -7767323715199010737L);
        setLongField(term300543, term300543.getClass(), "totalExpertHighScore", 2925187842923146237L);
        setLongField(term300543, term300543.getClass(), "totalMasterHighScore", -6927656791131248157L);
        setIntField(term300655, term300655.getClass(), "year", 2019);
        setShortField(term300655, term300655.getClass(), "month", (short) 1);
        setShortField(term300655, term300655.getClass(), "day", (short) 27);
        setField(term300654, term300654.getClass(), "date", term300655);
        setByteField(term300659, term300659.getClass(), "hour", (byte) 9);
        setByteField(term300659, term300659.getClass(), "minute", (byte) 21);
        setByteField(term300659, term300659.getClass(), "second", (byte) 31);
        setIntField(term300659, term300659.getClass(), "nano", 924816690);
        setField(term300654, term300654.getClass(), "time", term300659);
        setField(term300543, term300543.getClass(), "eventWatchedDate", term300654);
        setIntField(term300543, term300543.getClass(), "friendCount", 1809869083);
        setBooleanField(term300543, term300543.getClass(), "isMaimai", false);
        setField(term300543, term300543.getClass(), "firstGameId", "kenKdxPVfm");
        setField(term300543, term300543.getClass(), "firstRomVersion", "fnztsFUlSX");
        setField(term300543, term300543.getClass(), "firstDataVersion", "eqAUffwade");
        setIntField(term300703, term300703.getClass(), "year", 2016);
        setShortField(term300703, term300703.getClass(), "month", (short) 7);
        setShortField(term300703, term300703.getClass(), "day", (short) 20);
        setField(term300702, term300702.getClass(), "date", term300703);
        setByteField(term300707, term300707.getClass(), "hour", (byte) 0);
        setByteField(term300707, term300707.getClass(), "minute", (byte) 13);
        setByteField(term300707, term300707.getClass(), "second", (byte) 14);
        setIntField(term300707, term300707.getClass(), "nano", 336587907);
        setField(term300702, term300702.getClass(), "time", term300707);
        setField(term300543, term300543.getClass(), "firstPlayDate", term300702);
        setField(term300543, term300543.getClass(), "lastGameId", "NnRkGusQSv");
        setField(term300543, term300543.getClass(), "lastRomVersion", "psNOiLjLdY");
        setField(term300543, term300543.getClass(), "lastDataVersion", "LMXTwgTyDv");
        setIntField(term300749, term300749.getClass(), "year", 2029);
        setShortField(term300749, term300749.getClass(), "month", (short) 9);
        setShortField(term300749, term300749.getClass(), "day", (short) 17);
        setField(term300748, term300748.getClass(), "date", term300749);
        setByteField(term300753, term300753.getClass(), "hour", (byte) 12);
        setByteField(term300753, term300753.getClass(), "minute", (byte) 4);
        setByteField(term300753, term300753.getClass(), "second", (byte) 51);
        setIntField(term300753, term300753.getClass(), "nano", 946958222);
        setField(term300748, term300748.getClass(), "time", term300753);
        setField(term300543, term300543.getClass(), "lastPlayDate", term300748);
        setIntField(term300543, term300543.getClass(), "lastPlaceId", 1866562735);
        setField(term300543, term300543.getClass(), "lastPlaceName", "OvMjignBZh");
        setField(term300543, term300543.getClass(), "lastRegionId", "XKohfOxQpG");
        setField(term300543, term300543.getClass(), "lastRegionName", "vaEqtdWGqW");
        setField(term300543, term300543.getClass(), "lastAllNetId", "cSMVydOyqb");
        setField(term300543, term300543.getClass(), "lastClientId", "MkvQrFcRTd");
        setField(term300541, term300541.getClass(), "user", term300543);
        setIntField(term300541, term300541.getClass(), "kind", 1326832867);
        setIntField(term300541, term300541.getClass(), "activityId", 1653843083);
        setIntField(term300541, term300541.getClass(), "sortNumber", -2127993423);
        setIntField(term300541, term300541.getClass(), "param1", -1138128703);
        setIntField(term300541, term300541.getClass(), "param2", -1090810908);
        setIntField(term300541, term300541.getClass(), "param3", -1060340214);
        setIntField(term300541, term300541.getClass(), "param4", 1049390881);
        term300826 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term300826;
        callMethod(klass, "canEqual", argTypes, term300541, args);
    }

};


