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
import java.lang.Integer;

public class UserOption_setVolSide_94432067355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334312;
     Object term334614;

    public UserOption_setVolSide_94432067355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334318 = new Long(-7787918913179897745L);
        term334312 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term334314 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term334316 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term334332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term334333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term334337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term334342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term334343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term334347 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term334312, term334312.getClass(), "id", 1741615617782272161L);
        setLongField(term334314, term334314.getClass(), "id", -8571589219928137443L);
        setLongField(term334316, term334316.getClass(), "id", -4808381157115672395L);
        setField(term334316, term334316.getClass(), "extId", term334318);
        setField(term334316, term334316.getClass(), "luid", "LnjxlHgiSg");
        setIntField(term334333, term334333.getClass(), "year", 2023);
        setShortField(term334333, term334333.getClass(), "month", (short) 4);
        setShortField(term334333, term334333.getClass(), "day", (short) 23);
        setField(term334332, term334332.getClass(), "date", term334333);
        setByteField(term334337, term334337.getClass(), "hour", (byte) 4);
        setByteField(term334337, term334337.getClass(), "minute", (byte) 15);
        setByteField(term334337, term334337.getClass(), "second", (byte) 3);
        setIntField(term334337, term334337.getClass(), "nano", 1598414);
        setField(term334332, term334332.getClass(), "time", term334337);
        setField(term334316, term334316.getClass(), "registerTime", term334332);
        setIntField(term334343, term334343.getClass(), "year", 2021);
        setShortField(term334343, term334343.getClass(), "month", (short) 12);
        setShortField(term334343, term334343.getClass(), "day", (short) 31);
        setField(term334342, term334342.getClass(), "date", term334343);
        setByteField(term334347, term334347.getClass(), "hour", (byte) 14);
        setByteField(term334347, term334347.getClass(), "minute", (byte) 7);
        setByteField(term334347, term334347.getClass(), "second", (byte) 36);
        setIntField(term334347, term334347.getClass(), "nano", 42029316);
        setField(term334342, term334342.getClass(), "time", term334347);
        setField(term334316, term334316.getClass(), "accessTime", term334342);
        setField(term334314, term334314.getClass(), "card", term334316);
        setField(term334314, term334314.getClass(), "userName", "dvGoacPxWs");
        setIntField(term334314, term334314.getClass(), "level", 1847175017);
        setIntField(term334314, term334314.getClass(), "reincarnationNum", -484796791);
        setLongField(term334314, term334314.getClass(), "exp", -192086484223446618L);
        setLongField(term334314, term334314.getClass(), "point", -6839868843594363123L);
        setLongField(term334314, term334314.getClass(), "totalPoint", -725476806020898653L);
        setIntField(term334314, term334314.getClass(), "playCount", -1972105053);
        setIntField(term334314, term334314.getClass(), "jewelCount", -102315999);
        setIntField(term334314, term334314.getClass(), "totalJewelCount", 1610813077);
        setIntField(term334314, term334314.getClass(), "medalCount", -18841793);
        setIntField(term334314, term334314.getClass(), "playerRating", -1351423865);
        setIntField(term334314, term334314.getClass(), "highestRating", -2015672634);
        setIntField(term334314, term334314.getClass(), "battlePoint", 1028150528);
        setIntField(term334314, term334314.getClass(), "bestBattlePoint", -1524830135);
        setIntField(term334314, term334314.getClass(), "overDamageBattlePoint", -794970365);
        setBooleanField(term334314, term334314.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term334314, term334314.getClass(), "nameplateId", 409899436);
        setIntField(term334314, term334314.getClass(), "trophyId", 2125556559);
        setIntField(term334314, term334314.getClass(), "cardId", 664340054);
        setIntField(term334314, term334314.getClass(), "characterId", -877384450);
        setIntField(term334314, term334314.getClass(), "characterVoiceNo", 142458254);
        setIntField(term334314, term334314.getClass(), "tabSetting", 1202347510);
        setIntField(term334314, term334314.getClass(), "tabSortSetting", -810607624);
        setIntField(term334314, term334314.getClass(), "cardCategorySetting", -1563203827);
        setIntField(term334314, term334314.getClass(), "cardSortSetting", -1636094904);
        setIntField(term334314, term334314.getClass(), "rivalScoreCategorySetting", -421708599);
        setIntField(term334314, term334314.getClass(), "playedTutorialBit", -1169073237);
        setIntField(term334314, term334314.getClass(), "firstTutorialCancelNum", 639742248);
        setLongField(term334314, term334314.getClass(), "sumTechHighScore", 4585010849267529881L);
        setLongField(term334314, term334314.getClass(), "sumTechBasicHighScore", 4764531065500817324L);
        setLongField(term334314, term334314.getClass(), "sumTechAdvancedHighScore", 2261000888827474926L);
        setLongField(term334314, term334314.getClass(), "sumTechExpertHighScore", 480703707840895192L);
        setLongField(term334314, term334314.getClass(), "sumTechMasterHighScore", -3822220040282106990L);
        setLongField(term334314, term334314.getClass(), "sumTechLunaticHighScore", 4766484951267876006L);
        setLongField(term334314, term334314.getClass(), "sumBattleHighScore", 6623711302273742966L);
        setLongField(term334314, term334314.getClass(), "sumBattleBasicHighScore", -1061167205690529248L);
        setLongField(term334314, term334314.getClass(), "sumBattleAdvancedHighScore", 6501450951817699523L);
        setLongField(term334314, term334314.getClass(), "sumBattleExpertHighScore", 3841498142324100413L);
        setLongField(term334314, term334314.getClass(), "sumBattleMasterHighScore", 9041743579992710873L);
        setLongField(term334314, term334314.getClass(), "sumBattleLunaticHighScore", -7111597481291444345L);
        setField(term334314, term334314.getClass(), "eventWatchedDate", "iaFnkcCpId");
        setField(term334314, term334314.getClass(), "cmEventWatchedDate", "sHRefEUAnF");
        setField(term334314, term334314.getClass(), "firstGameId", "sNihVxQXjh");
        setField(term334314, term334314.getClass(), "firstRomVersion", "phUUaPLTUK");
        setField(term334314, term334314.getClass(), "firstDataVersion", "RHCUdndxDR");
        setField(term334314, term334314.getClass(), "firstPlayDate", "fOQDmOmeXK");
        setField(term334314, term334314.getClass(), "lastGameId", "EpIvqEBXPR");
        setField(term334314, term334314.getClass(), "lastRomVersion", "vVKcTKbXeo");
        setField(term334314, term334314.getClass(), "lastDataVersion", "fVoqgBVvRg");
        setField(term334314, term334314.getClass(), "compatibleCmVersion", "kQpaPpGyEw");
        setField(term334314, term334314.getClass(), "lastPlayDate", "IAzFDwNpDv");
        setIntField(term334314, term334314.getClass(), "lastPlaceId", 475306102);
        setField(term334314, term334314.getClass(), "lastPlaceName", "pOclmVHWMn");
        setIntField(term334314, term334314.getClass(), "lastRegionId", 382363602);
        setField(term334314, term334314.getClass(), "lastRegionName", "ZuXGeJfgop");
        setIntField(term334314, term334314.getClass(), "lastAllNetId", -648483307);
        setField(term334314, term334314.getClass(), "lastClientId", "KaGVdqkSfP");
        setIntField(term334314, term334314.getClass(), "lastUsedDeckId", 1153847712);
        setIntField(term334314, term334314.getClass(), "lastPlayMusicLevel", -1975797926);
        setIntField(term334314, term334314.getClass(), "lastEmoneyBrand", -1931979420);
        setField(term334312, term334312.getClass(), "user", term334314);
        setIntField(term334312, term334312.getClass(), "optionSet", -73185137);
        setIntField(term334312, term334312.getClass(), "speed", -1348563120);
        setIntField(term334312, term334312.getClass(), "mirror", 1899795714);
        setIntField(term334312, term334312.getClass(), "judgeTiming", -1420745360);
        setIntField(term334312, term334312.getClass(), "judgeAdjustment", 299327459);
        setIntField(term334312, term334312.getClass(), "abort", 293627666);
        setIntField(term334312, term334312.getClass(), "stealthField", -1650782551);
        setIntField(term334312, term334312.getClass(), "tapSound", -883583466);
        setIntField(term334312, term334312.getClass(), "volGuide", -1023098025);
        setIntField(term334312, term334312.getClass(), "volAll", -1460755340);
        setIntField(term334312, term334312.getClass(), "volTap", 1017319261);
        setIntField(term334312, term334312.getClass(), "volCrTap", 607268223);
        setIntField(term334312, term334312.getClass(), "volHold", -689249302);
        setIntField(term334312, term334312.getClass(), "volSide", 1026118060);
        setIntField(term334312, term334312.getClass(), "volFlick", -970099998);
        setIntField(term334312, term334312.getClass(), "volBell", 2130488553);
        setIntField(term334312, term334312.getClass(), "volEnemy", -1814623267);
        setIntField(term334312, term334312.getClass(), "volSkill", 666940104);
        setIntField(term334312, term334312.getClass(), "volDamage", -908741930);
        setIntField(term334312, term334312.getClass(), "colorField", -1523769085);
        setIntField(term334312, term334312.getClass(), "colorLaneBright", 1072417396);
        setIntField(term334312, term334312.getClass(), "colorWallBright", -612351959);
        setIntField(term334312, term334312.getClass(), "colorLane", -117784043);
        setIntField(term334312, term334312.getClass(), "colorSide", 1615274874);
        setIntField(term334312, term334312.getClass(), "effectDamage", -645081091);
        setIntField(term334312, term334312.getClass(), "effectPos", 82465841);
        setIntField(term334312, term334312.getClass(), "judgeDisp", 1399306846);
        setIntField(term334312, term334312.getClass(), "judgePos", 1423778259);
        setIntField(term334312, term334312.getClass(), "judgeBreak", 1826010641);
        setIntField(term334312, term334312.getClass(), "judgeHit", 517242939);
        setIntField(term334312, term334312.getClass(), "platinumBreakDisp", -886620106);
        setIntField(term334312, term334312.getClass(), "judgeCriticalBreak", 2105589115);
        setIntField(term334312, term334312.getClass(), "matching", 1287229465);
        setIntField(term334312, term334312.getClass(), "dispPlayerLv", 1514126539);
        setIntField(term334312, term334312.getClass(), "dispRating", -1093746420);
        setIntField(term334312, term334312.getClass(), "dispBP", 1473288476);
        setIntField(term334312, term334312.getClass(), "headphone", -909959149);
        term334614 = new Integer(-1299781370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term334614;
        callMethod(klass, "setVolSide", argTypes, term334312, args);
    }

};


