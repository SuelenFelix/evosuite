package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserOption_getJudgeTiming_3256335186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311223;

    public UserOption_getJudgeTiming_3256335186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term311229 = new Long(-3724162247917461536L);
        term311223 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term311225 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term311227 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term311243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311248 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311258 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term311223, term311223.getClass(), "id", -9067570540357916985L);
        setLongField(term311225, term311225.getClass(), "id", 7717739652065380558L);
        setLongField(term311227, term311227.getClass(), "id", 6146130122853423862L);
        setField(term311227, term311227.getClass(), "extId", term311229);
        setField(term311227, term311227.getClass(), "luid", "XruLHHzcFI");
        setIntField(term311244, term311244.getClass(), "year", 2027);
        setShortField(term311244, term311244.getClass(), "month", (short) 10);
        setShortField(term311244, term311244.getClass(), "day", (short) 28);
        setField(term311243, term311243.getClass(), "date", term311244);
        setByteField(term311248, term311248.getClass(), "hour", (byte) 2);
        setByteField(term311248, term311248.getClass(), "minute", (byte) 55);
        setByteField(term311248, term311248.getClass(), "second", (byte) 11);
        setIntField(term311248, term311248.getClass(), "nano", 659627264);
        setField(term311243, term311243.getClass(), "time", term311248);
        setField(term311227, term311227.getClass(), "registerTime", term311243);
        setIntField(term311254, term311254.getClass(), "year", 2022);
        setShortField(term311254, term311254.getClass(), "month", (short) 1);
        setShortField(term311254, term311254.getClass(), "day", (short) 20);
        setField(term311253, term311253.getClass(), "date", term311254);
        setByteField(term311258, term311258.getClass(), "hour", (byte) 0);
        setByteField(term311258, term311258.getClass(), "minute", (byte) 5);
        setByteField(term311258, term311258.getClass(), "second", (byte) 34);
        setIntField(term311258, term311258.getClass(), "nano", 917908477);
        setField(term311253, term311253.getClass(), "time", term311258);
        setField(term311227, term311227.getClass(), "accessTime", term311253);
        setField(term311225, term311225.getClass(), "card", term311227);
        setField(term311225, term311225.getClass(), "userName", "ehfFMFARbX");
        setIntField(term311225, term311225.getClass(), "level", 1407318663);
        setIntField(term311225, term311225.getClass(), "reincarnationNum", 879663317);
        setLongField(term311225, term311225.getClass(), "exp", 2584792764836766576L);
        setLongField(term311225, term311225.getClass(), "point", -3683097337053967370L);
        setLongField(term311225, term311225.getClass(), "totalPoint", -8473212281059660231L);
        setIntField(term311225, term311225.getClass(), "playCount", -503337456);
        setIntField(term311225, term311225.getClass(), "jewelCount", 71852904);
        setIntField(term311225, term311225.getClass(), "totalJewelCount", -22064897);
        setIntField(term311225, term311225.getClass(), "medalCount", -408710017);
        setIntField(term311225, term311225.getClass(), "playerRating", 1412968182);
        setIntField(term311225, term311225.getClass(), "highestRating", 444654725);
        setIntField(term311225, term311225.getClass(), "battlePoint", -436317636);
        setIntField(term311225, term311225.getClass(), "bestBattlePoint", 1621635528);
        setIntField(term311225, term311225.getClass(), "overDamageBattlePoint", -1598952399);
        setBooleanField(term311225, term311225.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term311225, term311225.getClass(), "nameplateId", -492568124);
        setIntField(term311225, term311225.getClass(), "trophyId", -1054760615);
        setIntField(term311225, term311225.getClass(), "cardId", -1051526562);
        setIntField(term311225, term311225.getClass(), "characterId", 1604342486);
        setIntField(term311225, term311225.getClass(), "characterVoiceNo", -301302512);
        setIntField(term311225, term311225.getClass(), "tabSetting", -928036798);
        setIntField(term311225, term311225.getClass(), "tabSortSetting", 1106525831);
        setIntField(term311225, term311225.getClass(), "cardCategorySetting", 2136483916);
        setIntField(term311225, term311225.getClass(), "cardSortSetting", 1306099530);
        setIntField(term311225, term311225.getClass(), "rivalScoreCategorySetting", 2123746183);
        setIntField(term311225, term311225.getClass(), "playedTutorialBit", 1905262181);
        setIntField(term311225, term311225.getClass(), "firstTutorialCancelNum", -1489308604);
        setLongField(term311225, term311225.getClass(), "sumTechHighScore", -2627525991801511871L);
        setLongField(term311225, term311225.getClass(), "sumTechBasicHighScore", -3956747090376329225L);
        setLongField(term311225, term311225.getClass(), "sumTechAdvancedHighScore", -7168579496759610062L);
        setLongField(term311225, term311225.getClass(), "sumTechExpertHighScore", -810110342722677773L);
        setLongField(term311225, term311225.getClass(), "sumTechMasterHighScore", 8655153486860829894L);
        setLongField(term311225, term311225.getClass(), "sumTechLunaticHighScore", 4537354902647209811L);
        setLongField(term311225, term311225.getClass(), "sumBattleHighScore", 2644653285598962598L);
        setLongField(term311225, term311225.getClass(), "sumBattleBasicHighScore", -8891334792991377216L);
        setLongField(term311225, term311225.getClass(), "sumBattleAdvancedHighScore", -1624051448191771804L);
        setLongField(term311225, term311225.getClass(), "sumBattleExpertHighScore", 6048999879906422344L);
        setLongField(term311225, term311225.getClass(), "sumBattleMasterHighScore", -3883439436503587579L);
        setLongField(term311225, term311225.getClass(), "sumBattleLunaticHighScore", -2393033149372471932L);
        setField(term311225, term311225.getClass(), "eventWatchedDate", "lvVJcUbQhH");
        setField(term311225, term311225.getClass(), "cmEventWatchedDate", "aGSTcHytvT");
        setField(term311225, term311225.getClass(), "firstGameId", "eajfQtluiX");
        setField(term311225, term311225.getClass(), "firstRomVersion", "wbTCLFBQCF");
        setField(term311225, term311225.getClass(), "firstDataVersion", "YdrFzLJmBL");
        setField(term311225, term311225.getClass(), "firstPlayDate", "oJxwTUrGoA");
        setField(term311225, term311225.getClass(), "lastGameId", "DZyWRMZKkh");
        setField(term311225, term311225.getClass(), "lastRomVersion", "FfDRlqapMv");
        setField(term311225, term311225.getClass(), "lastDataVersion", "REXiUGDUvP");
        setField(term311225, term311225.getClass(), "compatibleCmVersion", "kxhtDyZCFj");
        setField(term311225, term311225.getClass(), "lastPlayDate", "ksqLSkOdPn");
        setIntField(term311225, term311225.getClass(), "lastPlaceId", 2002775337);
        setField(term311225, term311225.getClass(), "lastPlaceName", "OjuNeqiAeo");
        setIntField(term311225, term311225.getClass(), "lastRegionId", -1102174349);
        setField(term311225, term311225.getClass(), "lastRegionName", "NMHarFCqvq");
        setIntField(term311225, term311225.getClass(), "lastAllNetId", -1426676868);
        setField(term311225, term311225.getClass(), "lastClientId", "MmNWdQUdHF");
        setIntField(term311225, term311225.getClass(), "lastUsedDeckId", -946170394);
        setIntField(term311225, term311225.getClass(), "lastPlayMusicLevel", -1543920037);
        setIntField(term311225, term311225.getClass(), "lastEmoneyBrand", 680004189);
        setField(term311223, term311223.getClass(), "user", term311225);
        setIntField(term311223, term311223.getClass(), "optionSet", 1190219377);
        setIntField(term311223, term311223.getClass(), "speed", -316377012);
        setIntField(term311223, term311223.getClass(), "mirror", 432345840);
        setIntField(term311223, term311223.getClass(), "judgeTiming", 1169088573);
        setIntField(term311223, term311223.getClass(), "judgeAdjustment", -608256748);
        setIntField(term311223, term311223.getClass(), "abort", 57088563);
        setIntField(term311223, term311223.getClass(), "stealthField", 676963064);
        setIntField(term311223, term311223.getClass(), "tapSound", -109345918);
        setIntField(term311223, term311223.getClass(), "volGuide", 845810848);
        setIntField(term311223, term311223.getClass(), "volAll", 1274797295);
        setIntField(term311223, term311223.getClass(), "volTap", -697031574);
        setIntField(term311223, term311223.getClass(), "volCrTap", 816817953);
        setIntField(term311223, term311223.getClass(), "volHold", -1017848768);
        setIntField(term311223, term311223.getClass(), "volSide", -905294177);
        setIntField(term311223, term311223.getClass(), "volFlick", 494408519);
        setIntField(term311223, term311223.getClass(), "volBell", 2119519729);
        setIntField(term311223, term311223.getClass(), "volEnemy", -1998416939);
        setIntField(term311223, term311223.getClass(), "volSkill", 192504738);
        setIntField(term311223, term311223.getClass(), "volDamage", 1542670334);
        setIntField(term311223, term311223.getClass(), "colorField", -1464999115);
        setIntField(term311223, term311223.getClass(), "colorLaneBright", -775236874);
        setIntField(term311223, term311223.getClass(), "colorWallBright", -1787407543);
        setIntField(term311223, term311223.getClass(), "colorLane", 1128507410);
        setIntField(term311223, term311223.getClass(), "colorSide", -996030342);
        setIntField(term311223, term311223.getClass(), "effectDamage", -1066054600);
        setIntField(term311223, term311223.getClass(), "effectPos", -1069544499);
        setIntField(term311223, term311223.getClass(), "judgeDisp", -1269515015);
        setIntField(term311223, term311223.getClass(), "judgePos", 1513778339);
        setIntField(term311223, term311223.getClass(), "judgeBreak", 572625070);
        setIntField(term311223, term311223.getClass(), "judgeHit", 698446211);
        setIntField(term311223, term311223.getClass(), "platinumBreakDisp", -1369090745);
        setIntField(term311223, term311223.getClass(), "judgeCriticalBreak", 1656635458);
        setIntField(term311223, term311223.getClass(), "matching", -742289485);
        setIntField(term311223, term311223.getClass(), "dispPlayerLv", -1250697907);
        setIntField(term311223, term311223.getClass(), "dispRating", -282881013);
        setIntField(term311223, term311223.getClass(), "dispBP", -1834542296);
        setIntField(term311223, term311223.getClass(), "headphone", -1684680986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeTiming", argTypes, term311223, args);
    }

};


