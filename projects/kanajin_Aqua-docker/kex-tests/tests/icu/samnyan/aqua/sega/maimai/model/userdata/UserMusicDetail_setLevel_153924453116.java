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

public class UserMusicDetail_setLevel_153924453116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184601;
     Object term184787;

    public UserMusicDetail_setLevel_153924453116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184607 = new Long(-7155106718297861156L);
        term184601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term184603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term184605 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term184621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term184631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term184601, term184601.getClass(), "id", -7977668399638006021L);
        setLongField(term184603, term184603.getClass(), "id", -6264785127930873499L);
        setLongField(term184605, term184605.getClass(), "id", -3057089152637139157L);
        setField(term184605, term184605.getClass(), "extId", term184607);
        setField(term184605, term184605.getClass(), "luid", "UkkxEeaUAd");
        setIntField(term184622, term184622.getClass(), "year", 2019);
        setShortField(term184622, term184622.getClass(), "month", (short) 1);
        setShortField(term184622, term184622.getClass(), "day", (short) 30);
        setField(term184621, term184621.getClass(), "date", term184622);
        setByteField(term184626, term184626.getClass(), "hour", (byte) 14);
        setByteField(term184626, term184626.getClass(), "minute", (byte) 10);
        setByteField(term184626, term184626.getClass(), "second", (byte) 20);
        setIntField(term184626, term184626.getClass(), "nano", 60618008);
        setField(term184621, term184621.getClass(), "time", term184626);
        setField(term184605, term184605.getClass(), "registerTime", term184621);
        setIntField(term184632, term184632.getClass(), "year", 2029);
        setShortField(term184632, term184632.getClass(), "month", (short) 12);
        setShortField(term184632, term184632.getClass(), "day", (short) 9);
        setField(term184631, term184631.getClass(), "date", term184632);
        setByteField(term184636, term184636.getClass(), "hour", (byte) 7);
        setByteField(term184636, term184636.getClass(), "minute", (byte) 27);
        setByteField(term184636, term184636.getClass(), "second", (byte) 9);
        setIntField(term184636, term184636.getClass(), "nano", 116678441);
        setField(term184631, term184631.getClass(), "time", term184636);
        setField(term184605, term184605.getClass(), "accessTime", term184631);
        setField(term184603, term184603.getClass(), "card", term184605);
        setIntField(term184603, term184603.getClass(), "lastDataVersion", 1706743362);
        setField(term184603, term184603.getClass(), "userName", "YuCzAoZaux");
        setIntField(term184603, term184603.getClass(), "point", 621499890);
        setIntField(term184603, term184603.getClass(), "totalPoint", 1467106125);
        setIntField(term184603, term184603.getClass(), "iconId", 465492033);
        setIntField(term184603, term184603.getClass(), "nameplateId", -423823446);
        setIntField(term184603, term184603.getClass(), "frameId", 322302901);
        setIntField(term184603, term184603.getClass(), "trophyId", 817692208);
        setIntField(term184603, term184603.getClass(), "playCount", -797190585);
        setIntField(term184603, term184603.getClass(), "playVsCount", -653043568);
        setIntField(term184603, term184603.getClass(), "playSyncCount", -91451282);
        setIntField(term184603, term184603.getClass(), "winCount", -1975754025);
        setIntField(term184603, term184603.getClass(), "helpCount", -1675142116);
        setIntField(term184603, term184603.getClass(), "comboCount", -2134670083);
        setIntField(term184603, term184603.getClass(), "feverCount", -456130368);
        setIntField(term184603, term184603.getClass(), "totalHiScore", -38617838);
        setIntField(term184603, term184603.getClass(), "totalEasyHighScore", -106659825);
        setIntField(term184603, term184603.getClass(), "totalBasicHighScore", -2048646183);
        setIntField(term184603, term184603.getClass(), "totalAdvancedHighScore", 1954356700);
        setIntField(term184603, term184603.getClass(), "totalExpertHighScore", -408217920);
        setIntField(term184603, term184603.getClass(), "totalMasterHighScore", 460965196);
        setIntField(term184603, term184603.getClass(), "totalReMasterHighScore", -1278837345);
        setIntField(term184603, term184603.getClass(), "totalHighSync", -563029977);
        setIntField(term184603, term184603.getClass(), "totalEasySync", -2109440090);
        setIntField(term184603, term184603.getClass(), "totalBasicSync", 106375449);
        setIntField(term184603, term184603.getClass(), "totalAdvancedSync", -425379244);
        setIntField(term184603, term184603.getClass(), "totalExpertSync", -790081510);
        setIntField(term184603, term184603.getClass(), "totalMasterSync", 13205121);
        setIntField(term184603, term184603.getClass(), "totalReMasterSync", -157728676);
        setIntField(term184603, term184603.getClass(), "playerRating", -1095988556);
        setIntField(term184603, term184603.getClass(), "highestRating", 384768362);
        setIntField(term184603, term184603.getClass(), "rankAuthTailId", 1394933597);
        setField(term184603, term184603.getClass(), "eventWatchedDate", "ovBBNANJnh");
        setField(term184603, term184603.getClass(), "webLimitDate", "TXVFqDUypQ");
        setIntField(term184603, term184603.getClass(), "challengeTrackPhase", 883042656);
        setIntField(term184603, term184603.getClass(), "firstPlayBits", -876662610);
        setField(term184603, term184603.getClass(), "lastPlayDate", "bAuMZKiuMg");
        setIntField(term184603, term184603.getClass(), "lastPlaceId", -1546908568);
        setField(term184603, term184603.getClass(), "lastPlaceName", "sOlEVEhJBz");
        setIntField(term184603, term184603.getClass(), "lastRegionId", -2021174489);
        setField(term184603, term184603.getClass(), "lastRegionName", "PKUBbcvbbv");
        setField(term184603, term184603.getClass(), "lastClientId", "jrRihiCPvt");
        setField(term184603, term184603.getClass(), "lastCountryCode", "qlCPJWygtB");
        setIntField(term184603, term184603.getClass(), "eventPoint", -634825256);
        setIntField(term184603, term184603.getClass(), "totalLv", -207676653);
        setIntField(term184603, term184603.getClass(), "lastLoginBonusDay", 807356841);
        setIntField(term184603, term184603.getClass(), "lastSurvivalBonusDay", 983766145);
        setIntField(term184603, term184603.getClass(), "loginBonusLv", 489648419);
        setField(term184601, term184601.getClass(), "user", term184603);
        setIntField(term184601, term184601.getClass(), "musicId", -1151891319);
        setIntField(term184601, term184601.getClass(), "level", -1469426711);
        setIntField(term184601, term184601.getClass(), "playCount", -2062350891);
        setIntField(term184601, term184601.getClass(), "scoreMax", -61610287);
        setIntField(term184601, term184601.getClass(), "syncRateMax", -130947643);
        setBooleanField(term184601, term184601.getClass(), "isAllPerfect", false);
        setIntField(term184601, term184601.getClass(), "isAllPerfectPlus", 1961190444);
        setIntField(term184601, term184601.getClass(), "fullCombo", 66534572);
        setIntField(term184601, term184601.getClass(), "maxFever", -400700059);
        setIntField(term184601, term184601.getClass(), "achievement", -883041544);
        term184787 = new Integer(-1693230043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184787;
        callMethod(klass, "setLevel", argTypes, term184601, args);
    }

};


