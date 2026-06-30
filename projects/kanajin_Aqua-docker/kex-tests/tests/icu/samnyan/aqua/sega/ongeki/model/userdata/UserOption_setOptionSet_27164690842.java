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

public class UserOption_setOptionSet_27164690842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328280;
     Object term328582;

    public UserOption_setOptionSet_27164690842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term328286 = new Long(-1413653349314156044L);
        term328280 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term328282 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term328284 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term328300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328305 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328315 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term328280, term328280.getClass(), "id", -3156716036987211193L);
        setLongField(term328282, term328282.getClass(), "id", 2789739133731993663L);
        setLongField(term328284, term328284.getClass(), "id", -3894409113604760092L);
        setField(term328284, term328284.getClass(), "extId", term328286);
        setField(term328284, term328284.getClass(), "luid", "fdHMPQFDFD");
        setIntField(term328301, term328301.getClass(), "year", 2028);
        setShortField(term328301, term328301.getClass(), "month", (short) 11);
        setShortField(term328301, term328301.getClass(), "day", (short) 11);
        setField(term328300, term328300.getClass(), "date", term328301);
        setByteField(term328305, term328305.getClass(), "hour", (byte) 22);
        setByteField(term328305, term328305.getClass(), "minute", (byte) 43);
        setByteField(term328305, term328305.getClass(), "second", (byte) 6);
        setIntField(term328305, term328305.getClass(), "nano", 620750633);
        setField(term328300, term328300.getClass(), "time", term328305);
        setField(term328284, term328284.getClass(), "registerTime", term328300);
        setIntField(term328311, term328311.getClass(), "year", 2014);
        setShortField(term328311, term328311.getClass(), "month", (short) 4);
        setShortField(term328311, term328311.getClass(), "day", (short) 5);
        setField(term328310, term328310.getClass(), "date", term328311);
        setByteField(term328315, term328315.getClass(), "hour", (byte) 16);
        setByteField(term328315, term328315.getClass(), "minute", (byte) 15);
        setByteField(term328315, term328315.getClass(), "second", (byte) 4);
        setIntField(term328315, term328315.getClass(), "nano", 176240374);
        setField(term328310, term328310.getClass(), "time", term328315);
        setField(term328284, term328284.getClass(), "accessTime", term328310);
        setField(term328282, term328282.getClass(), "card", term328284);
        setField(term328282, term328282.getClass(), "userName", "fUfWoxtXAi");
        setIntField(term328282, term328282.getClass(), "level", 1621975946);
        setIntField(term328282, term328282.getClass(), "reincarnationNum", -392223103);
        setLongField(term328282, term328282.getClass(), "exp", 6315537518480035475L);
        setLongField(term328282, term328282.getClass(), "point", 5890619206104577487L);
        setLongField(term328282, term328282.getClass(), "totalPoint", -2165462081329743041L);
        setIntField(term328282, term328282.getClass(), "playCount", -2114475369);
        setIntField(term328282, term328282.getClass(), "jewelCount", 909761129);
        setIntField(term328282, term328282.getClass(), "totalJewelCount", 18292002);
        setIntField(term328282, term328282.getClass(), "medalCount", 417808170);
        setIntField(term328282, term328282.getClass(), "playerRating", 644921312);
        setIntField(term328282, term328282.getClass(), "highestRating", 684210384);
        setIntField(term328282, term328282.getClass(), "battlePoint", -1030878611);
        setIntField(term328282, term328282.getClass(), "bestBattlePoint", 598675220);
        setIntField(term328282, term328282.getClass(), "overDamageBattlePoint", -1045981963);
        setBooleanField(term328282, term328282.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term328282, term328282.getClass(), "nameplateId", -1461190427);
        setIntField(term328282, term328282.getClass(), "trophyId", -668368968);
        setIntField(term328282, term328282.getClass(), "cardId", 1965913653);
        setIntField(term328282, term328282.getClass(), "characterId", -1060483797);
        setIntField(term328282, term328282.getClass(), "characterVoiceNo", 2089690998);
        setIntField(term328282, term328282.getClass(), "tabSetting", -844432502);
        setIntField(term328282, term328282.getClass(), "tabSortSetting", -1962249815);
        setIntField(term328282, term328282.getClass(), "cardCategorySetting", -938436337);
        setIntField(term328282, term328282.getClass(), "cardSortSetting", -2081415444);
        setIntField(term328282, term328282.getClass(), "rivalScoreCategorySetting", 1005069869);
        setIntField(term328282, term328282.getClass(), "playedTutorialBit", 113344233);
        setIntField(term328282, term328282.getClass(), "firstTutorialCancelNum", 2008077190);
        setLongField(term328282, term328282.getClass(), "sumTechHighScore", -9127613282618538513L);
        setLongField(term328282, term328282.getClass(), "sumTechBasicHighScore", -4740907574677023090L);
        setLongField(term328282, term328282.getClass(), "sumTechAdvancedHighScore", -4929293969409297284L);
        setLongField(term328282, term328282.getClass(), "sumTechExpertHighScore", -8502036879042687013L);
        setLongField(term328282, term328282.getClass(), "sumTechMasterHighScore", -2610716285513913590L);
        setLongField(term328282, term328282.getClass(), "sumTechLunaticHighScore", 2920066438728640561L);
        setLongField(term328282, term328282.getClass(), "sumBattleHighScore", -2968780635327755323L);
        setLongField(term328282, term328282.getClass(), "sumBattleBasicHighScore", -4985454205020638415L);
        setLongField(term328282, term328282.getClass(), "sumBattleAdvancedHighScore", -6605774448731523330L);
        setLongField(term328282, term328282.getClass(), "sumBattleExpertHighScore", -8211883879267548616L);
        setLongField(term328282, term328282.getClass(), "sumBattleMasterHighScore", -2097441427284695834L);
        setLongField(term328282, term328282.getClass(), "sumBattleLunaticHighScore", -1824410218542752320L);
        setField(term328282, term328282.getClass(), "eventWatchedDate", "GPtQLvLUTa");
        setField(term328282, term328282.getClass(), "cmEventWatchedDate", "ucBGCHjgSA");
        setField(term328282, term328282.getClass(), "firstGameId", "WOWNXkOuUP");
        setField(term328282, term328282.getClass(), "firstRomVersion", "wRQNJpLKVi");
        setField(term328282, term328282.getClass(), "firstDataVersion", "vQSApvoQMP");
        setField(term328282, term328282.getClass(), "firstPlayDate", "nRxOUNMjRb");
        setField(term328282, term328282.getClass(), "lastGameId", "iZxdUGgeAn");
        setField(term328282, term328282.getClass(), "lastRomVersion", "xVHZCmzqsX");
        setField(term328282, term328282.getClass(), "lastDataVersion", "eWxAAGGkbu");
        setField(term328282, term328282.getClass(), "compatibleCmVersion", "WbpPOhQgSI");
        setField(term328282, term328282.getClass(), "lastPlayDate", "VOmCCENirQ");
        setIntField(term328282, term328282.getClass(), "lastPlaceId", -549548133);
        setField(term328282, term328282.getClass(), "lastPlaceName", "rxgQjSStoH");
        setIntField(term328282, term328282.getClass(), "lastRegionId", 1616299373);
        setField(term328282, term328282.getClass(), "lastRegionName", "rKiEEuzFCD");
        setIntField(term328282, term328282.getClass(), "lastAllNetId", -1578467780);
        setField(term328282, term328282.getClass(), "lastClientId", "fTsnJYdRRQ");
        setIntField(term328282, term328282.getClass(), "lastUsedDeckId", 1162648885);
        setIntField(term328282, term328282.getClass(), "lastPlayMusicLevel", 1961017690);
        setIntField(term328282, term328282.getClass(), "lastEmoneyBrand", 511551647);
        setField(term328280, term328280.getClass(), "user", term328282);
        setIntField(term328280, term328280.getClass(), "optionSet", 1258932332);
        setIntField(term328280, term328280.getClass(), "speed", -839265758);
        setIntField(term328280, term328280.getClass(), "mirror", -1758426538);
        setIntField(term328280, term328280.getClass(), "judgeTiming", 1824116965);
        setIntField(term328280, term328280.getClass(), "judgeAdjustment", -1369478211);
        setIntField(term328280, term328280.getClass(), "abort", 271758747);
        setIntField(term328280, term328280.getClass(), "stealthField", -1522018525);
        setIntField(term328280, term328280.getClass(), "tapSound", 1056397743);
        setIntField(term328280, term328280.getClass(), "volGuide", 423150618);
        setIntField(term328280, term328280.getClass(), "volAll", -331188138);
        setIntField(term328280, term328280.getClass(), "volTap", 452861971);
        setIntField(term328280, term328280.getClass(), "volCrTap", 233956740);
        setIntField(term328280, term328280.getClass(), "volHold", 784786065);
        setIntField(term328280, term328280.getClass(), "volSide", -1150190375);
        setIntField(term328280, term328280.getClass(), "volFlick", 2019123147);
        setIntField(term328280, term328280.getClass(), "volBell", -2004315391);
        setIntField(term328280, term328280.getClass(), "volEnemy", 783251457);
        setIntField(term328280, term328280.getClass(), "volSkill", 75955740);
        setIntField(term328280, term328280.getClass(), "volDamage", 1873501970);
        setIntField(term328280, term328280.getClass(), "colorField", 2062401058);
        setIntField(term328280, term328280.getClass(), "colorLaneBright", 1857369874);
        setIntField(term328280, term328280.getClass(), "colorWallBright", 1970011244);
        setIntField(term328280, term328280.getClass(), "colorLane", -1426757140);
        setIntField(term328280, term328280.getClass(), "colorSide", -1254420032);
        setIntField(term328280, term328280.getClass(), "effectDamage", 758112612);
        setIntField(term328280, term328280.getClass(), "effectPos", -1609198447);
        setIntField(term328280, term328280.getClass(), "judgeDisp", 1395245543);
        setIntField(term328280, term328280.getClass(), "judgePos", -1401508518);
        setIntField(term328280, term328280.getClass(), "judgeBreak", -1998883830);
        setIntField(term328280, term328280.getClass(), "judgeHit", 849028402);
        setIntField(term328280, term328280.getClass(), "platinumBreakDisp", 123822516);
        setIntField(term328280, term328280.getClass(), "judgeCriticalBreak", -1365351657);
        setIntField(term328280, term328280.getClass(), "matching", 1728653113);
        setIntField(term328280, term328280.getClass(), "dispPlayerLv", -776018312);
        setIntField(term328280, term328280.getClass(), "dispRating", -1536039432);
        setIntField(term328280, term328280.getClass(), "dispBP", 135942667);
        setIntField(term328280, term328280.getClass(), "headphone", -1967901380);
        term328582 = new Integer(-1737107470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term328582;
        callMethod(klass, "setOptionSet", argTypes, term328280, args);
    }

};


