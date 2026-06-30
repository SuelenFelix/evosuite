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

public class UserOption_setMirror_103149386244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329208;
     Object term329510;

    public UserOption_setMirror_103149386244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term329214 = new Long(6801904611028883308L);
        term329208 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term329210 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term329212 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term329228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329243 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term329208, term329208.getClass(), "id", -1166933553512550451L);
        setLongField(term329210, term329210.getClass(), "id", 8078986124163646662L);
        setLongField(term329212, term329212.getClass(), "id", -4063541867163085959L);
        setField(term329212, term329212.getClass(), "extId", term329214);
        setField(term329212, term329212.getClass(), "luid", "WGFWnMkBcA");
        setIntField(term329229, term329229.getClass(), "year", 2010);
        setShortField(term329229, term329229.getClass(), "month", (short) 12);
        setShortField(term329229, term329229.getClass(), "day", (short) 7);
        setField(term329228, term329228.getClass(), "date", term329229);
        setByteField(term329233, term329233.getClass(), "hour", (byte) 4);
        setByteField(term329233, term329233.getClass(), "minute", (byte) 15);
        setByteField(term329233, term329233.getClass(), "second", (byte) 36);
        setIntField(term329233, term329233.getClass(), "nano", 783217794);
        setField(term329228, term329228.getClass(), "time", term329233);
        setField(term329212, term329212.getClass(), "registerTime", term329228);
        setIntField(term329239, term329239.getClass(), "year", 2010);
        setShortField(term329239, term329239.getClass(), "month", (short) 6);
        setShortField(term329239, term329239.getClass(), "day", (short) 7);
        setField(term329238, term329238.getClass(), "date", term329239);
        setByteField(term329243, term329243.getClass(), "hour", (byte) 12);
        setByteField(term329243, term329243.getClass(), "minute", (byte) 23);
        setByteField(term329243, term329243.getClass(), "second", (byte) 28);
        setIntField(term329243, term329243.getClass(), "nano", 63850935);
        setField(term329238, term329238.getClass(), "time", term329243);
        setField(term329212, term329212.getClass(), "accessTime", term329238);
        setField(term329210, term329210.getClass(), "card", term329212);
        setField(term329210, term329210.getClass(), "userName", "jUcshCwsgg");
        setIntField(term329210, term329210.getClass(), "level", 277950814);
        setIntField(term329210, term329210.getClass(), "reincarnationNum", -1351951482);
        setLongField(term329210, term329210.getClass(), "exp", 8870661960969690617L);
        setLongField(term329210, term329210.getClass(), "point", 7841427778312486833L);
        setLongField(term329210, term329210.getClass(), "totalPoint", -7233207313488754159L);
        setIntField(term329210, term329210.getClass(), "playCount", 260046683);
        setIntField(term329210, term329210.getClass(), "jewelCount", -1480568202);
        setIntField(term329210, term329210.getClass(), "totalJewelCount", -323812063);
        setIntField(term329210, term329210.getClass(), "medalCount", 1754621668);
        setIntField(term329210, term329210.getClass(), "playerRating", -771723689);
        setIntField(term329210, term329210.getClass(), "highestRating", -1561284414);
        setIntField(term329210, term329210.getClass(), "battlePoint", 278664158);
        setIntField(term329210, term329210.getClass(), "bestBattlePoint", 744530669);
        setIntField(term329210, term329210.getClass(), "overDamageBattlePoint", -1504728921);
        setBooleanField(term329210, term329210.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term329210, term329210.getClass(), "nameplateId", 116468085);
        setIntField(term329210, term329210.getClass(), "trophyId", 1669425961);
        setIntField(term329210, term329210.getClass(), "cardId", 1319396977);
        setIntField(term329210, term329210.getClass(), "characterId", 125667037);
        setIntField(term329210, term329210.getClass(), "characterVoiceNo", 29653165);
        setIntField(term329210, term329210.getClass(), "tabSetting", 1348076400);
        setIntField(term329210, term329210.getClass(), "tabSortSetting", 2054986925);
        setIntField(term329210, term329210.getClass(), "cardCategorySetting", -1792558197);
        setIntField(term329210, term329210.getClass(), "cardSortSetting", -1356988453);
        setIntField(term329210, term329210.getClass(), "rivalScoreCategorySetting", -1989711010);
        setIntField(term329210, term329210.getClass(), "playedTutorialBit", 1973819104);
        setIntField(term329210, term329210.getClass(), "firstTutorialCancelNum", 851052368);
        setLongField(term329210, term329210.getClass(), "sumTechHighScore", 7142653124091476395L);
        setLongField(term329210, term329210.getClass(), "sumTechBasicHighScore", 3551074370483963997L);
        setLongField(term329210, term329210.getClass(), "sumTechAdvancedHighScore", 1982556811689350521L);
        setLongField(term329210, term329210.getClass(), "sumTechExpertHighScore", 9173117839317404421L);
        setLongField(term329210, term329210.getClass(), "sumTechMasterHighScore", 6615406581850185615L);
        setLongField(term329210, term329210.getClass(), "sumTechLunaticHighScore", 699223295588165160L);
        setLongField(term329210, term329210.getClass(), "sumBattleHighScore", 3150338467228555906L);
        setLongField(term329210, term329210.getClass(), "sumBattleBasicHighScore", -8565148269950595772L);
        setLongField(term329210, term329210.getClass(), "sumBattleAdvancedHighScore", 5301986151564203282L);
        setLongField(term329210, term329210.getClass(), "sumBattleExpertHighScore", 6849993105980293851L);
        setLongField(term329210, term329210.getClass(), "sumBattleMasterHighScore", 2491627326513962090L);
        setLongField(term329210, term329210.getClass(), "sumBattleLunaticHighScore", 4687278140587597394L);
        setField(term329210, term329210.getClass(), "eventWatchedDate", "xpFOaimaSg");
        setField(term329210, term329210.getClass(), "cmEventWatchedDate", "hEFGtPxjNH");
        setField(term329210, term329210.getClass(), "firstGameId", "AIBCAHpZon");
        setField(term329210, term329210.getClass(), "firstRomVersion", "QmiDauyFKt");
        setField(term329210, term329210.getClass(), "firstDataVersion", "KrYHnsjDRt");
        setField(term329210, term329210.getClass(), "firstPlayDate", "jDXIBbKPIH");
        setField(term329210, term329210.getClass(), "lastGameId", "AiYklHWniK");
        setField(term329210, term329210.getClass(), "lastRomVersion", "UhapzrGGrx");
        setField(term329210, term329210.getClass(), "lastDataVersion", "xrifBoxLyo");
        setField(term329210, term329210.getClass(), "compatibleCmVersion", "cewzVDrMhZ");
        setField(term329210, term329210.getClass(), "lastPlayDate", "TezmypiRMP");
        setIntField(term329210, term329210.getClass(), "lastPlaceId", -2128379023);
        setField(term329210, term329210.getClass(), "lastPlaceName", "SWqxWsTMpf");
        setIntField(term329210, term329210.getClass(), "lastRegionId", -1391245948);
        setField(term329210, term329210.getClass(), "lastRegionName", "vxPokFfKsD");
        setIntField(term329210, term329210.getClass(), "lastAllNetId", 1558078237);
        setField(term329210, term329210.getClass(), "lastClientId", "DEmUEFlolg");
        setIntField(term329210, term329210.getClass(), "lastUsedDeckId", -1162925802);
        setIntField(term329210, term329210.getClass(), "lastPlayMusicLevel", 1637912538);
        setIntField(term329210, term329210.getClass(), "lastEmoneyBrand", 1047821366);
        setField(term329208, term329208.getClass(), "user", term329210);
        setIntField(term329208, term329208.getClass(), "optionSet", -1352024989);
        setIntField(term329208, term329208.getClass(), "speed", -424014188);
        setIntField(term329208, term329208.getClass(), "mirror", -1093224022);
        setIntField(term329208, term329208.getClass(), "judgeTiming", 2073644979);
        setIntField(term329208, term329208.getClass(), "judgeAdjustment", 1451190250);
        setIntField(term329208, term329208.getClass(), "abort", -1238169318);
        setIntField(term329208, term329208.getClass(), "stealthField", -501928682);
        setIntField(term329208, term329208.getClass(), "tapSound", 1038197384);
        setIntField(term329208, term329208.getClass(), "volGuide", 1888359359);
        setIntField(term329208, term329208.getClass(), "volAll", -274920819);
        setIntField(term329208, term329208.getClass(), "volTap", -2114633562);
        setIntField(term329208, term329208.getClass(), "volCrTap", -7919563);
        setIntField(term329208, term329208.getClass(), "volHold", 1028590227);
        setIntField(term329208, term329208.getClass(), "volSide", -2066534737);
        setIntField(term329208, term329208.getClass(), "volFlick", -708772056);
        setIntField(term329208, term329208.getClass(), "volBell", 52910608);
        setIntField(term329208, term329208.getClass(), "volEnemy", 1605914830);
        setIntField(term329208, term329208.getClass(), "volSkill", 1403983011);
        setIntField(term329208, term329208.getClass(), "volDamage", 241425640);
        setIntField(term329208, term329208.getClass(), "colorField", 956126825);
        setIntField(term329208, term329208.getClass(), "colorLaneBright", 1665859306);
        setIntField(term329208, term329208.getClass(), "colorWallBright", 1794952368);
        setIntField(term329208, term329208.getClass(), "colorLane", 43322397);
        setIntField(term329208, term329208.getClass(), "colorSide", 129502702);
        setIntField(term329208, term329208.getClass(), "effectDamage", 1010593023);
        setIntField(term329208, term329208.getClass(), "effectPos", 496590404);
        setIntField(term329208, term329208.getClass(), "judgeDisp", -1024580443);
        setIntField(term329208, term329208.getClass(), "judgePos", 1723556689);
        setIntField(term329208, term329208.getClass(), "judgeBreak", 1523450777);
        setIntField(term329208, term329208.getClass(), "judgeHit", 2145724988);
        setIntField(term329208, term329208.getClass(), "platinumBreakDisp", 1452806901);
        setIntField(term329208, term329208.getClass(), "judgeCriticalBreak", 1935745319);
        setIntField(term329208, term329208.getClass(), "matching", -82786863);
        setIntField(term329208, term329208.getClass(), "dispPlayerLv", -1367102110);
        setIntField(term329208, term329208.getClass(), "dispRating", -312245686);
        setIntField(term329208, term329208.getClass(), "dispBP", -1262949869);
        setIntField(term329208, term329208.getClass(), "headphone", 143583387);
        term329510 = new Integer(1962305334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term329510;
        callMethod(klass, "setMirror", argTypes, term329208, args);
    }

};


