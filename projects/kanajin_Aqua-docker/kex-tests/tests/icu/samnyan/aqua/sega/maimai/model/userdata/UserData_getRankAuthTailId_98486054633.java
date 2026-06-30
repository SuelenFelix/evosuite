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

public class UserData_getRankAuthTailId_98486054633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8713;

    public UserData_getRankAuthTailId_98486054633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8717 = new Long(-6823727938421990489L);
        term8713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term8715 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8746 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8713, term8713.getClass(), "id", 414749984815662075L);
        setLongField(term8715, term8715.getClass(), "id", 463622836963501975L);
        setField(term8715, term8715.getClass(), "extId", term8717);
        setField(term8715, term8715.getClass(), "luid", "wBGfLpNNiZ");
        setIntField(term8732, term8732.getClass(), "year", 2018);
        setShortField(term8732, term8732.getClass(), "month", (short) 2);
        setShortField(term8732, term8732.getClass(), "day", (short) 14);
        setField(term8731, term8731.getClass(), "date", term8732);
        setByteField(term8736, term8736.getClass(), "hour", (byte) 2);
        setByteField(term8736, term8736.getClass(), "minute", (byte) 40);
        setByteField(term8736, term8736.getClass(), "second", (byte) 48);
        setIntField(term8736, term8736.getClass(), "nano", 371006728);
        setField(term8731, term8731.getClass(), "time", term8736);
        setField(term8715, term8715.getClass(), "registerTime", term8731);
        setIntField(term8742, term8742.getClass(), "year", 2025);
        setShortField(term8742, term8742.getClass(), "month", (short) 8);
        setShortField(term8742, term8742.getClass(), "day", (short) 22);
        setField(term8741, term8741.getClass(), "date", term8742);
        setByteField(term8746, term8746.getClass(), "hour", (byte) 6);
        setByteField(term8746, term8746.getClass(), "minute", (byte) 48);
        setByteField(term8746, term8746.getClass(), "second", (byte) 49);
        setIntField(term8746, term8746.getClass(), "nano", 46400229);
        setField(term8741, term8741.getClass(), "time", term8746);
        setField(term8715, term8715.getClass(), "accessTime", term8741);
        setField(term8713, term8713.getClass(), "card", term8715);
        setIntField(term8713, term8713.getClass(), "lastDataVersion", 750084083);
        setField(term8713, term8713.getClass(), "userName", "yUGCjlqgJE");
        setIntField(term8713, term8713.getClass(), "point", -1603460382);
        setIntField(term8713, term8713.getClass(), "totalPoint", -298939768);
        setIntField(term8713, term8713.getClass(), "iconId", -767031634);
        setIntField(term8713, term8713.getClass(), "nameplateId", -2072469750);
        setIntField(term8713, term8713.getClass(), "frameId", 2106616847);
        setIntField(term8713, term8713.getClass(), "trophyId", 403107947);
        setIntField(term8713, term8713.getClass(), "playCount", -1433815725);
        setIntField(term8713, term8713.getClass(), "playVsCount", -1445089135);
        setIntField(term8713, term8713.getClass(), "playSyncCount", -291618851);
        setIntField(term8713, term8713.getClass(), "winCount", -378436487);
        setIntField(term8713, term8713.getClass(), "helpCount", 584949609);
        setIntField(term8713, term8713.getClass(), "comboCount", 879795058);
        setIntField(term8713, term8713.getClass(), "feverCount", -1016087889);
        setIntField(term8713, term8713.getClass(), "totalHiScore", 1968287557);
        setIntField(term8713, term8713.getClass(), "totalEasyHighScore", 1101385603);
        setIntField(term8713, term8713.getClass(), "totalBasicHighScore", 1980267589);
        setIntField(term8713, term8713.getClass(), "totalAdvancedHighScore", -2009434910);
        setIntField(term8713, term8713.getClass(), "totalExpertHighScore", -374887532);
        setIntField(term8713, term8713.getClass(), "totalMasterHighScore", -165487736);
        setIntField(term8713, term8713.getClass(), "totalReMasterHighScore", -608393431);
        setIntField(term8713, term8713.getClass(), "totalHighSync", 298082829);
        setIntField(term8713, term8713.getClass(), "totalEasySync", -1494372780);
        setIntField(term8713, term8713.getClass(), "totalBasicSync", 703799187);
        setIntField(term8713, term8713.getClass(), "totalAdvancedSync", -1305898281);
        setIntField(term8713, term8713.getClass(), "totalExpertSync", 140501130);
        setIntField(term8713, term8713.getClass(), "totalMasterSync", -1458890291);
        setIntField(term8713, term8713.getClass(), "totalReMasterSync", 1016087323);
        setIntField(term8713, term8713.getClass(), "playerRating", 1957748979);
        setIntField(term8713, term8713.getClass(), "highestRating", -1290093259);
        setIntField(term8713, term8713.getClass(), "rankAuthTailId", -1200934890);
        setField(term8713, term8713.getClass(), "eventWatchedDate", "PXdVZyoJyC");
        setField(term8713, term8713.getClass(), "webLimitDate", "vLerpqavFM");
        setIntField(term8713, term8713.getClass(), "challengeTrackPhase", 1765633108);
        setIntField(term8713, term8713.getClass(), "firstPlayBits", 1312888741);
        setField(term8713, term8713.getClass(), "lastPlayDate", "qnvxzwuGKX");
        setIntField(term8713, term8713.getClass(), "lastPlaceId", -1443680397);
        setField(term8713, term8713.getClass(), "lastPlaceName", "EdPAvpluZg");
        setIntField(term8713, term8713.getClass(), "lastRegionId", -1331169079);
        setField(term8713, term8713.getClass(), "lastRegionName", "DzHVBMqWtE");
        setField(term8713, term8713.getClass(), "lastClientId", "THZSpzBRYP");
        setField(term8713, term8713.getClass(), "lastCountryCode", "ZfBIVGBQOE");
        setIntField(term8713, term8713.getClass(), "eventPoint", 1109050836);
        setIntField(term8713, term8713.getClass(), "totalLv", 1978065000);
        setIntField(term8713, term8713.getClass(), "lastLoginBonusDay", -2121133707);
        setIntField(term8713, term8713.getClass(), "lastSurvivalBonusDay", -1005498887);
        setIntField(term8713, term8713.getClass(), "loginBonusLv", 1329150584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRankAuthTailId", argTypes, term8713, args);
    }

};


