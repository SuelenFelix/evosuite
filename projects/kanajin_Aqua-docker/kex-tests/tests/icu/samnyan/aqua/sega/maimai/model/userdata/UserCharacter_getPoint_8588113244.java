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

public class UserCharacter_getPoint_8588113244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33670;

    public UserCharacter_getPoint_8588113244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33676 = new Long(1597484336218508869L);
        term33670 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term33672 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term33674 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33705 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33670, term33670.getClass(), "id", 3238645206498300107L);
        setLongField(term33672, term33672.getClass(), "id", -1592696983130738594L);
        setLongField(term33674, term33674.getClass(), "id", 6902365338255307910L);
        setField(term33674, term33674.getClass(), "extId", term33676);
        setField(term33674, term33674.getClass(), "luid", "KSZfGbvzPE");
        setIntField(term33691, term33691.getClass(), "year", 2022);
        setShortField(term33691, term33691.getClass(), "month", (short) 1);
        setShortField(term33691, term33691.getClass(), "day", (short) 4);
        setField(term33690, term33690.getClass(), "date", term33691);
        setByteField(term33695, term33695.getClass(), "hour", (byte) 21);
        setByteField(term33695, term33695.getClass(), "minute", (byte) 36);
        setByteField(term33695, term33695.getClass(), "second", (byte) 43);
        setIntField(term33695, term33695.getClass(), "nano", 941221944);
        setField(term33690, term33690.getClass(), "time", term33695);
        setField(term33674, term33674.getClass(), "registerTime", term33690);
        setIntField(term33701, term33701.getClass(), "year", 2011);
        setShortField(term33701, term33701.getClass(), "month", (short) 4);
        setShortField(term33701, term33701.getClass(), "day", (short) 18);
        setField(term33700, term33700.getClass(), "date", term33701);
        setByteField(term33705, term33705.getClass(), "hour", (byte) 15);
        setByteField(term33705, term33705.getClass(), "minute", (byte) 35);
        setByteField(term33705, term33705.getClass(), "second", (byte) 7);
        setIntField(term33705, term33705.getClass(), "nano", 925983040);
        setField(term33700, term33700.getClass(), "time", term33705);
        setField(term33674, term33674.getClass(), "accessTime", term33700);
        setField(term33672, term33672.getClass(), "card", term33674);
        setIntField(term33672, term33672.getClass(), "lastDataVersion", 1394978641);
        setField(term33672, term33672.getClass(), "userName", "YfgYGgzYER");
        setIntField(term33672, term33672.getClass(), "point", 1085224973);
        setIntField(term33672, term33672.getClass(), "totalPoint", 580824436);
        setIntField(term33672, term33672.getClass(), "iconId", 400588448);
        setIntField(term33672, term33672.getClass(), "nameplateId", -798151545);
        setIntField(term33672, term33672.getClass(), "frameId", -243386399);
        setIntField(term33672, term33672.getClass(), "trophyId", 1238856040);
        setIntField(term33672, term33672.getClass(), "playCount", -171442968);
        setIntField(term33672, term33672.getClass(), "playVsCount", 1345075451);
        setIntField(term33672, term33672.getClass(), "playSyncCount", -482097687);
        setIntField(term33672, term33672.getClass(), "winCount", -1155698012);
        setIntField(term33672, term33672.getClass(), "helpCount", -1635314310);
        setIntField(term33672, term33672.getClass(), "comboCount", -1583672247);
        setIntField(term33672, term33672.getClass(), "feverCount", 1150713854);
        setIntField(term33672, term33672.getClass(), "totalHiScore", 999843869);
        setIntField(term33672, term33672.getClass(), "totalEasyHighScore", 1047162942);
        setIntField(term33672, term33672.getClass(), "totalBasicHighScore", 555668629);
        setIntField(term33672, term33672.getClass(), "totalAdvancedHighScore", -704789127);
        setIntField(term33672, term33672.getClass(), "totalExpertHighScore", 2018335018);
        setIntField(term33672, term33672.getClass(), "totalMasterHighScore", 524629103);
        setIntField(term33672, term33672.getClass(), "totalReMasterHighScore", 601775827);
        setIntField(term33672, term33672.getClass(), "totalHighSync", 1713144877);
        setIntField(term33672, term33672.getClass(), "totalEasySync", -513074841);
        setIntField(term33672, term33672.getClass(), "totalBasicSync", -1384079183);
        setIntField(term33672, term33672.getClass(), "totalAdvancedSync", -1401413822);
        setIntField(term33672, term33672.getClass(), "totalExpertSync", -1735958377);
        setIntField(term33672, term33672.getClass(), "totalMasterSync", -477618469);
        setIntField(term33672, term33672.getClass(), "totalReMasterSync", 117739625);
        setIntField(term33672, term33672.getClass(), "playerRating", -314816968);
        setIntField(term33672, term33672.getClass(), "highestRating", -1478972076);
        setIntField(term33672, term33672.getClass(), "rankAuthTailId", 828708445);
        setField(term33672, term33672.getClass(), "eventWatchedDate", "IDClvDZuqE");
        setField(term33672, term33672.getClass(), "webLimitDate", "cMvKxpZOvg");
        setIntField(term33672, term33672.getClass(), "challengeTrackPhase", -1198357943);
        setIntField(term33672, term33672.getClass(), "firstPlayBits", 407342373);
        setField(term33672, term33672.getClass(), "lastPlayDate", "WWBYemIuiK");
        setIntField(term33672, term33672.getClass(), "lastPlaceId", 633857490);
        setField(term33672, term33672.getClass(), "lastPlaceName", "nHYQYkycCR");
        setIntField(term33672, term33672.getClass(), "lastRegionId", -602285518);
        setField(term33672, term33672.getClass(), "lastRegionName", "yBiVacDcZX");
        setField(term33672, term33672.getClass(), "lastClientId", "QrKfEgQeoy");
        setField(term33672, term33672.getClass(), "lastCountryCode", "oApgdbwnti");
        setIntField(term33672, term33672.getClass(), "eventPoint", 95548457);
        setIntField(term33672, term33672.getClass(), "totalLv", -652818479);
        setIntField(term33672, term33672.getClass(), "lastLoginBonusDay", 909221962);
        setIntField(term33672, term33672.getClass(), "lastSurvivalBonusDay", 1036562171);
        setIntField(term33672, term33672.getClass(), "loginBonusLv", -1176098787);
        setField(term33670, term33670.getClass(), "user", term33672);
        setIntField(term33670, term33670.getClass(), "characterId", -1108621848);
        setIntField(term33670, term33670.getClass(), "point", 1868049133);
        setIntField(term33670, term33670.getClass(), "level", -2041713971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term33670, args);
    }

};


