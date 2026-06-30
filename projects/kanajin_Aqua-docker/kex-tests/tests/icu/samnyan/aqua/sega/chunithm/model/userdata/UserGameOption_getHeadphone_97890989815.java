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

public class UserGameOption_getHeadphone_97890989815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55471;

    public UserGameOption_getHeadphone_97890989815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55477 = new Long(3133860696238261492L);
        term55471 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term55473 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term55475 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55506 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55528 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55589 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55637 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55683 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55471, term55471.getClass(), "id", 4992284695861622180L);
        setLongField(term55473, term55473.getClass(), "id", -6376003179103732362L);
        setLongField(term55475, term55475.getClass(), "id", -2050936198165389315L);
        setField(term55475, term55475.getClass(), "extId", term55477);
        setField(term55475, term55475.getClass(), "luid", "MiankJgKCp");
        setIntField(term55492, term55492.getClass(), "year", 2014);
        setShortField(term55492, term55492.getClass(), "month", (short) 3);
        setShortField(term55492, term55492.getClass(), "day", (short) 25);
        setField(term55491, term55491.getClass(), "date", term55492);
        setByteField(term55496, term55496.getClass(), "hour", (byte) 21);
        setByteField(term55496, term55496.getClass(), "minute", (byte) 11);
        setByteField(term55496, term55496.getClass(), "second", (byte) 20);
        setIntField(term55496, term55496.getClass(), "nano", 320642457);
        setField(term55491, term55491.getClass(), "time", term55496);
        setField(term55475, term55475.getClass(), "registerTime", term55491);
        setIntField(term55502, term55502.getClass(), "year", 2020);
        setShortField(term55502, term55502.getClass(), "month", (short) 4);
        setShortField(term55502, term55502.getClass(), "day", (short) 20);
        setField(term55501, term55501.getClass(), "date", term55502);
        setByteField(term55506, term55506.getClass(), "hour", (byte) 15);
        setByteField(term55506, term55506.getClass(), "minute", (byte) 24);
        setByteField(term55506, term55506.getClass(), "second", (byte) 35);
        setIntField(term55506, term55506.getClass(), "nano", 679127969);
        setField(term55501, term55501.getClass(), "time", term55506);
        setField(term55475, term55475.getClass(), "accessTime", term55501);
        setField(term55473, term55473.getClass(), "card", term55475);
        setField(term55473, term55473.getClass(), "userName", "lmZBCmpOeb");
        setIntField(term55524, term55524.getClass(), "year", 2018);
        setShortField(term55524, term55524.getClass(), "month", (short) 12);
        setShortField(term55524, term55524.getClass(), "day", (short) 4);
        setField(term55523, term55523.getClass(), "date", term55524);
        setByteField(term55528, term55528.getClass(), "hour", (byte) 6);
        setByteField(term55528, term55528.getClass(), "minute", (byte) 23);
        setByteField(term55528, term55528.getClass(), "second", (byte) 36);
        setIntField(term55528, term55528.getClass(), "nano", 89535482);
        setField(term55523, term55523.getClass(), "time", term55528);
        setField(term55473, term55473.getClass(), "lastLoginDate", term55523);
        setBooleanField(term55473, term55473.getClass(), "isWebJoin", false);
        setField(term55473, term55473.getClass(), "webLimitDate", "cPlYOAUqsP");
        setIntField(term55473, term55473.getClass(), "level", 1915536131);
        setIntField(term55473, term55473.getClass(), "reincarnationNum", 936561631);
        setField(term55473, term55473.getClass(), "exp", "ritBUyuuKt");
        setLongField(term55473, term55473.getClass(), "point", -8751837616810275039L);
        setLongField(term55473, term55473.getClass(), "totalPoint", -8676733724224510585L);
        setIntField(term55473, term55473.getClass(), "playCount", -160474197);
        setIntField(term55473, term55473.getClass(), "multiPlayCount", 279768924);
        setIntField(term55473, term55473.getClass(), "multiWinCount", 1949719112);
        setIntField(term55473, term55473.getClass(), "requestResCount", 203059697);
        setIntField(term55473, term55473.getClass(), "acceptResCount", 260352378);
        setIntField(term55473, term55473.getClass(), "successResCount", -1344061485);
        setIntField(term55473, term55473.getClass(), "playerRating", -13926283);
        setIntField(term55473, term55473.getClass(), "highestRating", -1240452164);
        setIntField(term55473, term55473.getClass(), "nameplateId", 501130109);
        setIntField(term55473, term55473.getClass(), "frameId", -1307655183);
        setIntField(term55473, term55473.getClass(), "characterId", 1309934432);
        setIntField(term55473, term55473.getClass(), "trophyId", 909183017);
        setIntField(term55473, term55473.getClass(), "playedTutorialBit", -2115858923);
        setIntField(term55473, term55473.getClass(), "firstTutorialCancelNum", 1709658376);
        setIntField(term55473, term55473.getClass(), "masterTutorialCancelNum", -1235730396);
        setIntField(term55473, term55473.getClass(), "totalRepertoireCount", -366600678);
        setIntField(term55473, term55473.getClass(), "totalMapNum", -1641994868);
        setLongField(term55473, term55473.getClass(), "totalHiScore", 1318139313166175279L);
        setLongField(term55473, term55473.getClass(), "totalBasicHighScore", 1712520441197520950L);
        setLongField(term55473, term55473.getClass(), "totalAdvancedHighScore", 7043650218274841102L);
        setLongField(term55473, term55473.getClass(), "totalExpertHighScore", -6096774034189525139L);
        setLongField(term55473, term55473.getClass(), "totalMasterHighScore", -6476891479972746312L);
        setIntField(term55585, term55585.getClass(), "year", 2020);
        setShortField(term55585, term55585.getClass(), "month", (short) 1);
        setShortField(term55585, term55585.getClass(), "day", (short) 16);
        setField(term55584, term55584.getClass(), "date", term55585);
        setByteField(term55589, term55589.getClass(), "hour", (byte) 1);
        setByteField(term55589, term55589.getClass(), "minute", (byte) 58);
        setByteField(term55589, term55589.getClass(), "second", (byte) 17);
        setIntField(term55589, term55589.getClass(), "nano", 383254195);
        setField(term55584, term55584.getClass(), "time", term55589);
        setField(term55473, term55473.getClass(), "eventWatchedDate", term55584);
        setIntField(term55473, term55473.getClass(), "friendCount", 1729072481);
        setBooleanField(term55473, term55473.getClass(), "isMaimai", false);
        setField(term55473, term55473.getClass(), "firstGameId", "YfziBBiPvL");
        setField(term55473, term55473.getClass(), "firstRomVersion", "lNBaHEkYui");
        setField(term55473, term55473.getClass(), "firstDataVersion", "BqxRCYZwmn");
        setIntField(term55633, term55633.getClass(), "year", 2023);
        setShortField(term55633, term55633.getClass(), "month", (short) 8);
        setShortField(term55633, term55633.getClass(), "day", (short) 30);
        setField(term55632, term55632.getClass(), "date", term55633);
        setByteField(term55637, term55637.getClass(), "hour", (byte) 6);
        setByteField(term55637, term55637.getClass(), "minute", (byte) 55);
        setByteField(term55637, term55637.getClass(), "second", (byte) 45);
        setIntField(term55637, term55637.getClass(), "nano", 174033);
        setField(term55632, term55632.getClass(), "time", term55637);
        setField(term55473, term55473.getClass(), "firstPlayDate", term55632);
        setField(term55473, term55473.getClass(), "lastGameId", "KHPDZjrXQp");
        setField(term55473, term55473.getClass(), "lastRomVersion", "fpyUFzdCwQ");
        setField(term55473, term55473.getClass(), "lastDataVersion", "OQqBkSGDem");
        setIntField(term55679, term55679.getClass(), "year", 2017);
        setShortField(term55679, term55679.getClass(), "month", (short) 3);
        setShortField(term55679, term55679.getClass(), "day", (short) 13);
        setField(term55678, term55678.getClass(), "date", term55679);
        setByteField(term55683, term55683.getClass(), "hour", (byte) 20);
        setByteField(term55683, term55683.getClass(), "minute", (byte) 41);
        setByteField(term55683, term55683.getClass(), "second", (byte) 9);
        setIntField(term55683, term55683.getClass(), "nano", 698449623);
        setField(term55678, term55678.getClass(), "time", term55683);
        setField(term55473, term55473.getClass(), "lastPlayDate", term55678);
        setIntField(term55473, term55473.getClass(), "lastPlaceId", -1281635786);
        setField(term55473, term55473.getClass(), "lastPlaceName", "vZzZOvsIYn");
        setField(term55473, term55473.getClass(), "lastRegionId", "pAIBwhAbDu");
        setField(term55473, term55473.getClass(), "lastRegionName", "iqhNUjVbRG");
        setField(term55473, term55473.getClass(), "lastAllNetId", "SSqIrPwJXd");
        setField(term55473, term55473.getClass(), "lastClientId", "jAxYagPvcV");
        setField(term55471, term55471.getClass(), "user", term55473);
        setIntField(term55471, term55471.getClass(), "bgInfo", 1768552438);
        setIntField(term55471, term55471.getClass(), "fieldColor", -166990524);
        setIntField(term55471, term55471.getClass(), "guideSound", -1302306468);
        setIntField(term55471, term55471.getClass(), "soundEffect", -659361866);
        setIntField(term55471, term55471.getClass(), "guideLine", -2010825883);
        setIntField(term55471, term55471.getClass(), "speed", 1230224947);
        setIntField(term55471, term55471.getClass(), "optionSet", 739759836);
        setIntField(term55471, term55471.getClass(), "matching", -1233408249);
        setIntField(term55471, term55471.getClass(), "judgePos", 1252145496);
        setIntField(term55471, term55471.getClass(), "rating", -469940082);
        setIntField(term55471, term55471.getClass(), "judgeJustice", -821294367);
        setIntField(term55471, term55471.getClass(), "judgeAttack", -1260916319);
        setIntField(term55471, term55471.getClass(), "headphone", 740454987);
        setIntField(term55471, term55471.getClass(), "playerLevel", -2100331324);
        setIntField(term55471, term55471.getClass(), "successTap", 2062095733);
        setIntField(term55471, term55471.getClass(), "successExTap", -7331803);
        setIntField(term55471, term55471.getClass(), "successSlideHold", 1725012686);
        setIntField(term55471, term55471.getClass(), "successAir", -309653587);
        setIntField(term55471, term55471.getClass(), "successFlick", 1988824012);
        setIntField(term55471, term55471.getClass(), "successSkill", 365061041);
        setIntField(term55471, term55471.getClass(), "successTapTimbre", 205907008);
        setIntField(term55471, term55471.getClass(), "privacy", -1281782269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphone", argTypes, term55471, args);
    }

};


