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

public class UserOption_getJudgeHit_9316721132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323235;

    public UserOption_getJudgeHit_9316721132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323241 = new Long(-4561371668792438386L);
        term323235 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term323237 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term323239 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term323255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323270 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term323235, term323235.getClass(), "id", -6843122938604239075L);
        setLongField(term323237, term323237.getClass(), "id", 3757671571806695588L);
        setLongField(term323239, term323239.getClass(), "id", 6491036333741959887L);
        setField(term323239, term323239.getClass(), "extId", term323241);
        setField(term323239, term323239.getClass(), "luid", "jxDxvRhFCL");
        setIntField(term323256, term323256.getClass(), "year", 2028);
        setShortField(term323256, term323256.getClass(), "month", (short) 8);
        setShortField(term323256, term323256.getClass(), "day", (short) 27);
        setField(term323255, term323255.getClass(), "date", term323256);
        setByteField(term323260, term323260.getClass(), "hour", (byte) 5);
        setByteField(term323260, term323260.getClass(), "minute", (byte) 50);
        setByteField(term323260, term323260.getClass(), "second", (byte) 39);
        setIntField(term323260, term323260.getClass(), "nano", 53415756);
        setField(term323255, term323255.getClass(), "time", term323260);
        setField(term323239, term323239.getClass(), "registerTime", term323255);
        setIntField(term323266, term323266.getClass(), "year", 2015);
        setShortField(term323266, term323266.getClass(), "month", (short) 3);
        setShortField(term323266, term323266.getClass(), "day", (short) 11);
        setField(term323265, term323265.getClass(), "date", term323266);
        setByteField(term323270, term323270.getClass(), "hour", (byte) 23);
        setByteField(term323270, term323270.getClass(), "minute", (byte) 11);
        setByteField(term323270, term323270.getClass(), "second", (byte) 50);
        setIntField(term323270, term323270.getClass(), "nano", 517297304);
        setField(term323265, term323265.getClass(), "time", term323270);
        setField(term323239, term323239.getClass(), "accessTime", term323265);
        setField(term323237, term323237.getClass(), "card", term323239);
        setField(term323237, term323237.getClass(), "userName", "GAedBERJiH");
        setIntField(term323237, term323237.getClass(), "level", -1120956826);
        setIntField(term323237, term323237.getClass(), "reincarnationNum", -39297907);
        setLongField(term323237, term323237.getClass(), "exp", 3572291081271678449L);
        setLongField(term323237, term323237.getClass(), "point", 1587079425378557428L);
        setLongField(term323237, term323237.getClass(), "totalPoint", 6333822935256653225L);
        setIntField(term323237, term323237.getClass(), "playCount", 1915363701);
        setIntField(term323237, term323237.getClass(), "jewelCount", -591612123);
        setIntField(term323237, term323237.getClass(), "totalJewelCount", -125433342);
        setIntField(term323237, term323237.getClass(), "medalCount", 2138132426);
        setIntField(term323237, term323237.getClass(), "playerRating", 447637059);
        setIntField(term323237, term323237.getClass(), "highestRating", -1515997420);
        setIntField(term323237, term323237.getClass(), "battlePoint", 736187393);
        setIntField(term323237, term323237.getClass(), "bestBattlePoint", 451224390);
        setIntField(term323237, term323237.getClass(), "overDamageBattlePoint", 1611341095);
        setBooleanField(term323237, term323237.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term323237, term323237.getClass(), "nameplateId", 1035979953);
        setIntField(term323237, term323237.getClass(), "trophyId", -1619724677);
        setIntField(term323237, term323237.getClass(), "cardId", 484570444);
        setIntField(term323237, term323237.getClass(), "characterId", -590318386);
        setIntField(term323237, term323237.getClass(), "characterVoiceNo", 193707542);
        setIntField(term323237, term323237.getClass(), "tabSetting", 843737635);
        setIntField(term323237, term323237.getClass(), "tabSortSetting", -556953295);
        setIntField(term323237, term323237.getClass(), "cardCategorySetting", -845722720);
        setIntField(term323237, term323237.getClass(), "cardSortSetting", 1736623587);
        setIntField(term323237, term323237.getClass(), "rivalScoreCategorySetting", 1301307983);
        setIntField(term323237, term323237.getClass(), "playedTutorialBit", 404933593);
        setIntField(term323237, term323237.getClass(), "firstTutorialCancelNum", -1929368595);
        setLongField(term323237, term323237.getClass(), "sumTechHighScore", -375425948682078541L);
        setLongField(term323237, term323237.getClass(), "sumTechBasicHighScore", -6754491672198121939L);
        setLongField(term323237, term323237.getClass(), "sumTechAdvancedHighScore", -1139855651815080322L);
        setLongField(term323237, term323237.getClass(), "sumTechExpertHighScore", 6351896430811130111L);
        setLongField(term323237, term323237.getClass(), "sumTechMasterHighScore", -7084331544685808046L);
        setLongField(term323237, term323237.getClass(), "sumTechLunaticHighScore", 4983484715174199976L);
        setLongField(term323237, term323237.getClass(), "sumBattleHighScore", -1813636469959173315L);
        setLongField(term323237, term323237.getClass(), "sumBattleBasicHighScore", -759398210576919333L);
        setLongField(term323237, term323237.getClass(), "sumBattleAdvancedHighScore", 8593614297182564129L);
        setLongField(term323237, term323237.getClass(), "sumBattleExpertHighScore", 7647629579942803162L);
        setLongField(term323237, term323237.getClass(), "sumBattleMasterHighScore", -1362709445545834058L);
        setLongField(term323237, term323237.getClass(), "sumBattleLunaticHighScore", 1765156457127618584L);
        setField(term323237, term323237.getClass(), "eventWatchedDate", "FIPLXKyBVK");
        setField(term323237, term323237.getClass(), "cmEventWatchedDate", "QJefaGUvza");
        setField(term323237, term323237.getClass(), "firstGameId", "RlmgTSaZbY");
        setField(term323237, term323237.getClass(), "firstRomVersion", "vPFrEpbZbR");
        setField(term323237, term323237.getClass(), "firstDataVersion", "DdlbPJoSMI");
        setField(term323237, term323237.getClass(), "firstPlayDate", "LRLnhcxjxW");
        setField(term323237, term323237.getClass(), "lastGameId", "VBCnQjbjwb");
        setField(term323237, term323237.getClass(), "lastRomVersion", "eiCWOzbxQg");
        setField(term323237, term323237.getClass(), "lastDataVersion", "WkPwMFEfEl");
        setField(term323237, term323237.getClass(), "compatibleCmVersion", "trTXEUBFFL");
        setField(term323237, term323237.getClass(), "lastPlayDate", "GuOcEiTCIZ");
        setIntField(term323237, term323237.getClass(), "lastPlaceId", 372813155);
        setField(term323237, term323237.getClass(), "lastPlaceName", "CcEkUVBHel");
        setIntField(term323237, term323237.getClass(), "lastRegionId", -645249448);
        setField(term323237, term323237.getClass(), "lastRegionName", "WIrvJpHUpM");
        setIntField(term323237, term323237.getClass(), "lastAllNetId", 14263424);
        setField(term323237, term323237.getClass(), "lastClientId", "GDyIzvZUQR");
        setIntField(term323237, term323237.getClass(), "lastUsedDeckId", -198617243);
        setIntField(term323237, term323237.getClass(), "lastPlayMusicLevel", -1881742095);
        setIntField(term323237, term323237.getClass(), "lastEmoneyBrand", 1173187619);
        setField(term323235, term323235.getClass(), "user", term323237);
        setIntField(term323235, term323235.getClass(), "optionSet", -64344650);
        setIntField(term323235, term323235.getClass(), "speed", 1958057421);
        setIntField(term323235, term323235.getClass(), "mirror", -660062568);
        setIntField(term323235, term323235.getClass(), "judgeTiming", -1908480000);
        setIntField(term323235, term323235.getClass(), "judgeAdjustment", 749109931);
        setIntField(term323235, term323235.getClass(), "abort", -1931166992);
        setIntField(term323235, term323235.getClass(), "stealthField", 215166713);
        setIntField(term323235, term323235.getClass(), "tapSound", -1734474318);
        setIntField(term323235, term323235.getClass(), "volGuide", -1347924820);
        setIntField(term323235, term323235.getClass(), "volAll", 148510675);
        setIntField(term323235, term323235.getClass(), "volTap", -386090895);
        setIntField(term323235, term323235.getClass(), "volCrTap", -1080770866);
        setIntField(term323235, term323235.getClass(), "volHold", -2100126483);
        setIntField(term323235, term323235.getClass(), "volSide", 490490667);
        setIntField(term323235, term323235.getClass(), "volFlick", 2022466682);
        setIntField(term323235, term323235.getClass(), "volBell", -1219968440);
        setIntField(term323235, term323235.getClass(), "volEnemy", 2066816648);
        setIntField(term323235, term323235.getClass(), "volSkill", 974988563);
        setIntField(term323235, term323235.getClass(), "volDamage", 988540753);
        setIntField(term323235, term323235.getClass(), "colorField", 285008202);
        setIntField(term323235, term323235.getClass(), "colorLaneBright", -1232476987);
        setIntField(term323235, term323235.getClass(), "colorWallBright", -389049863);
        setIntField(term323235, term323235.getClass(), "colorLane", -106722855);
        setIntField(term323235, term323235.getClass(), "colorSide", 1048311111);
        setIntField(term323235, term323235.getClass(), "effectDamage", -1928898148);
        setIntField(term323235, term323235.getClass(), "effectPos", -1220755239);
        setIntField(term323235, term323235.getClass(), "judgeDisp", -874654273);
        setIntField(term323235, term323235.getClass(), "judgePos", 1325634384);
        setIntField(term323235, term323235.getClass(), "judgeBreak", 129241207);
        setIntField(term323235, term323235.getClass(), "judgeHit", 782825646);
        setIntField(term323235, term323235.getClass(), "platinumBreakDisp", 1592590302);
        setIntField(term323235, term323235.getClass(), "judgeCriticalBreak", 1909858470);
        setIntField(term323235, term323235.getClass(), "matching", 127566139);
        setIntField(term323235, term323235.getClass(), "dispPlayerLv", -571748060);
        setIntField(term323235, term323235.getClass(), "dispRating", 823958755);
        setIntField(term323235, term323235.getClass(), "dispBP", 755047567);
        setIntField(term323235, term323235.getClass(), "headphone", -1510543479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeHit", argTypes, term323235, args);
    }

};


