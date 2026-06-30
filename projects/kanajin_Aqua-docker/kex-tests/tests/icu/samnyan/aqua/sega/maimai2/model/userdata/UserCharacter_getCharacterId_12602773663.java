package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserCharacter_getCharacterId_12602773663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186276;

    public UserCharacter_getCharacterId_12602773663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186282 = new Long(4341016500855678917L);
        Integer term186345 = new Integer(-639247037);
        Integer term186347 = new Integer(-110418958);
        Integer term186349 = new Integer(1131695499);
        Integer term186351 = new Integer(-699693103);
        Integer term186353 = new Integer(-365179239);
        ArrayList term186343 = new ArrayList();
        ((ArrayList) term186343).add(term186345);
        ((ArrayList) term186343).add(term186347);
        ((ArrayList) term186343).add(term186349);
        ((ArrayList) term186343).add(term186351);
        ((ArrayList) term186343).add(term186353);
        Integer term186359 = new Integer(-1670737346);
        Integer term186361 = new Integer(-1150935030);
        Integer term186363 = new Integer(78607598);
        Integer term186365 = new Integer(-126292072);
        Integer term186367 = new Integer(-1541809993);
        ArrayList term186357 = new ArrayList();
        ((ArrayList) term186357).add(term186359);
        ((ArrayList) term186357).add(term186361);
        ((ArrayList) term186357).add(term186363);
        ((ArrayList) term186357).add(term186365);
        ((ArrayList) term186357).add(term186367);
        term186276 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term186278 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term186280 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186296 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186297 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186301 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186311 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186276, term186276.getClass(), "id", -8573375024113271710L);
        setLongField(term186278, term186278.getClass(), "id", -5466314644855449620L);
        setLongField(term186280, term186280.getClass(), "id", -1608345939535109455L);
        setField(term186280, term186280.getClass(), "extId", term186282);
        setField(term186280, term186280.getClass(), "luid", "RwbNOPHwhW");
        setIntField(term186297, term186297.getClass(), "year", 2021);
        setShortField(term186297, term186297.getClass(), "month", (short) 10);
        setShortField(term186297, term186297.getClass(), "day", (short) 12);
        setField(term186296, term186296.getClass(), "date", term186297);
        setByteField(term186301, term186301.getClass(), "hour", (byte) 10);
        setByteField(term186301, term186301.getClass(), "minute", (byte) 35);
        setByteField(term186301, term186301.getClass(), "second", (byte) 54);
        setIntField(term186301, term186301.getClass(), "nano", 943613873);
        setField(term186296, term186296.getClass(), "time", term186301);
        setField(term186280, term186280.getClass(), "registerTime", term186296);
        setIntField(term186307, term186307.getClass(), "year", 2014);
        setShortField(term186307, term186307.getClass(), "month", (short) 12);
        setShortField(term186307, term186307.getClass(), "day", (short) 24);
        setField(term186306, term186306.getClass(), "date", term186307);
        setByteField(term186311, term186311.getClass(), "hour", (byte) 14);
        setByteField(term186311, term186311.getClass(), "minute", (byte) 18);
        setByteField(term186311, term186311.getClass(), "second", (byte) 26);
        setIntField(term186311, term186311.getClass(), "nano", 945081214);
        setField(term186306, term186306.getClass(), "time", term186311);
        setField(term186280, term186280.getClass(), "accessTime", term186306);
        setField(term186278, term186278.getClass(), "card", term186280);
        setField(term186278, term186278.getClass(), "userName", "FSKhxZvpnl");
        setIntField(term186278, term186278.getClass(), "isNetMember", -560107024);
        setIntField(term186278, term186278.getClass(), "iconId", 660630715);
        setIntField(term186278, term186278.getClass(), "plateId", 693006347);
        setIntField(term186278, term186278.getClass(), "titleId", 1168153277);
        setIntField(term186278, term186278.getClass(), "partnerId", -1469071189);
        setIntField(term186278, term186278.getClass(), "frameId", -578033218);
        setIntField(term186278, term186278.getClass(), "selectMapId", -590662380);
        setIntField(term186278, term186278.getClass(), "totalAwake", -1434317430);
        setIntField(term186278, term186278.getClass(), "gradeRating", -1957611106);
        setIntField(term186278, term186278.getClass(), "musicRating", -1843660330);
        setIntField(term186278, term186278.getClass(), "playerRating", 1324882121);
        setIntField(term186278, term186278.getClass(), "highestRating", 254828594);
        setIntField(term186278, term186278.getClass(), "gradeRank", -2104928418);
        setIntField(term186278, term186278.getClass(), "classRank", -637342505);
        setIntField(term186278, term186278.getClass(), "courseRank", 1064415036);
        setField(term186278, term186278.getClass(), "charaSlot", term186343);
        setField(term186278, term186278.getClass(), "charaLockSlot", term186357);
        setLongField(term186278, term186278.getClass(), "contentBit", 3258015411464637764L);
        setIntField(term186278, term186278.getClass(), "playCount", -1504699704);
        setField(term186278, term186278.getClass(), "eventWatchedDate", "dKmYpbxoRS");
        setField(term186278, term186278.getClass(), "lastGameId", "azUzzteCGy");
        setField(term186278, term186278.getClass(), "lastRomVersion", "BLBvGRqyYM");
        setField(term186278, term186278.getClass(), "lastDataVersion", "oKQiVhGGYR");
        setField(term186278, term186278.getClass(), "lastLoginDate", "TzLaUPSnqj");
        setField(term186278, term186278.getClass(), "lastPlayDate", "aBNUlBwETR");
        setIntField(term186278, term186278.getClass(), "lastPlayCredit", 188156612);
        setIntField(term186278, term186278.getClass(), "lastPlayMode", -1650671835);
        setIntField(term186278, term186278.getClass(), "lastPlaceId", 1886042366);
        setField(term186278, term186278.getClass(), "lastPlaceName", "qjmxrabYcx");
        setIntField(term186278, term186278.getClass(), "lastAllNetId", 1750279326);
        setIntField(term186278, term186278.getClass(), "lastRegionId", 69628657);
        setField(term186278, term186278.getClass(), "lastRegionName", "myWRMyEhIt");
        setField(term186278, term186278.getClass(), "lastClientId", "EmDmkDpxon");
        setField(term186278, term186278.getClass(), "lastCountryCode", "VvItpTBxIr");
        setIntField(term186278, term186278.getClass(), "lastSelectEMoney", -2051929242);
        setIntField(term186278, term186278.getClass(), "lastSelectTicket", -1610300223);
        setIntField(term186278, term186278.getClass(), "lastSelectCourse", 446623516);
        setIntField(term186278, term186278.getClass(), "lastCountCourse", 1459327378);
        setField(term186278, term186278.getClass(), "firstGameId", "lRNmJJNKCh");
        setField(term186278, term186278.getClass(), "firstRomVersion", "wQjEhEbcxP");
        setField(term186278, term186278.getClass(), "firstDataVersion", "WQWajfRESR");
        setField(term186278, term186278.getClass(), "firstPlayDate", "FpLNKrgBfH");
        setField(term186278, term186278.getClass(), "compatibleCmVersion", "eOMULntXto");
        setField(term186278, term186278.getClass(), "dailyBonusDate", "wGroGsyEBE");
        setField(term186278, term186278.getClass(), "dailyCourseBonusDate", "ytRmDKVnzC");
        setField(term186278, term186278.getClass(), "lastPairLoginDate", "xIlQLEFozf");
        setField(term186278, term186278.getClass(), "lastTrialPlayDate", "vjkUeksZSx");
        setIntField(term186278, term186278.getClass(), "playVsCount", -2025069703);
        setIntField(term186278, term186278.getClass(), "playSyncCount", -10565826);
        setIntField(term186278, term186278.getClass(), "winCount", -613811757);
        setIntField(term186278, term186278.getClass(), "helpCount", -1533182108);
        setIntField(term186278, term186278.getClass(), "comboCount", -2143828825);
        setLongField(term186278, term186278.getClass(), "totalDeluxscore", 869392470837426566L);
        setLongField(term186278, term186278.getClass(), "totalBasicDeluxscore", 4646930212097294716L);
        setLongField(term186278, term186278.getClass(), "totalAdvancedDeluxscore", 3463084499266875904L);
        setLongField(term186278, term186278.getClass(), "totalExpertDeluxscore", -7732584336161913999L);
        setLongField(term186278, term186278.getClass(), "totalMasterDeluxscore", -9198569837410546989L);
        setLongField(term186278, term186278.getClass(), "totalReMasterDeluxscore", -1774178372431419404L);
        setIntField(term186278, term186278.getClass(), "totalSync", -1675965095);
        setIntField(term186278, term186278.getClass(), "totalBasicSync", -1629158447);
        setIntField(term186278, term186278.getClass(), "totalAdvancedSync", -478026502);
        setIntField(term186278, term186278.getClass(), "totalExpertSync", -1202054376);
        setIntField(term186278, term186278.getClass(), "totalMasterSync", 1502227586);
        setIntField(term186278, term186278.getClass(), "totalReMasterSync", 1320517174);
        setLongField(term186278, term186278.getClass(), "totalAchievement", -5232167923670406765L);
        setLongField(term186278, term186278.getClass(), "totalBasicAchievement", 2839192734257680041L);
        setLongField(term186278, term186278.getClass(), "totalAdvancedAchievement", -6632951164960930766L);
        setLongField(term186278, term186278.getClass(), "totalExpertAchievement", -5628065665330605775L);
        setLongField(term186278, term186278.getClass(), "totalMasterAchievement", -3198795776779837753L);
        setLongField(term186278, term186278.getClass(), "totalReMasterAchievement", -6404400134373703541L);
        setLongField(term186278, term186278.getClass(), "playerOldRating", -797757766423223920L);
        setLongField(term186278, term186278.getClass(), "playerNewRating", 2045688555375039671L);
        setIntField(term186278, term186278.getClass(), "banState", -1036993603);
        setLongField(term186278, term186278.getClass(), "dateTime", -820715354224473286L);
        setField(term186276, term186276.getClass(), "user", term186278);
        setIntField(term186276, term186276.getClass(), "characterId", -1696528248);
        setIntField(term186276, term186276.getClass(), "level", -1346251427);
        setIntField(term186276, term186276.getClass(), "awakening", -821292025);
        setIntField(term186276, term186276.getClass(), "useCount", 525638452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term186276, args);
    }

};


