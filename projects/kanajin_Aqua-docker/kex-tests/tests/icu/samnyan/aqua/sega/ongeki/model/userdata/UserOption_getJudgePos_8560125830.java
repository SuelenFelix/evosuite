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

public class UserOption_getJudgePos_8560125830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322311;

    public UserOption_getJudgePos_8560125830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term322317 = new Long(-1211273460223868511L);
        term322311 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term322313 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term322315 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term322331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322346 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term322311, term322311.getClass(), "id", -7017822287347188189L);
        setLongField(term322313, term322313.getClass(), "id", 5427360185896392790L);
        setLongField(term322315, term322315.getClass(), "id", -7757866180288034414L);
        setField(term322315, term322315.getClass(), "extId", term322317);
        setField(term322315, term322315.getClass(), "luid", "ayJGrhwawO");
        setIntField(term322332, term322332.getClass(), "year", 2028);
        setShortField(term322332, term322332.getClass(), "month", (short) 12);
        setShortField(term322332, term322332.getClass(), "day", (short) 8);
        setField(term322331, term322331.getClass(), "date", term322332);
        setByteField(term322336, term322336.getClass(), "hour", (byte) 9);
        setByteField(term322336, term322336.getClass(), "minute", (byte) 54);
        setByteField(term322336, term322336.getClass(), "second", (byte) 38);
        setIntField(term322336, term322336.getClass(), "nano", 872886477);
        setField(term322331, term322331.getClass(), "time", term322336);
        setField(term322315, term322315.getClass(), "registerTime", term322331);
        setIntField(term322342, term322342.getClass(), "year", 2027);
        setShortField(term322342, term322342.getClass(), "month", (short) 5);
        setShortField(term322342, term322342.getClass(), "day", (short) 27);
        setField(term322341, term322341.getClass(), "date", term322342);
        setByteField(term322346, term322346.getClass(), "hour", (byte) 8);
        setByteField(term322346, term322346.getClass(), "minute", (byte) 24);
        setByteField(term322346, term322346.getClass(), "second", (byte) 24);
        setIntField(term322346, term322346.getClass(), "nano", 133978101);
        setField(term322341, term322341.getClass(), "time", term322346);
        setField(term322315, term322315.getClass(), "accessTime", term322341);
        setField(term322313, term322313.getClass(), "card", term322315);
        setField(term322313, term322313.getClass(), "userName", "rsWtwFMuuE");
        setIntField(term322313, term322313.getClass(), "level", -1629061284);
        setIntField(term322313, term322313.getClass(), "reincarnationNum", 614077584);
        setLongField(term322313, term322313.getClass(), "exp", -5677999678954882596L);
        setLongField(term322313, term322313.getClass(), "point", -5946696325858133944L);
        setLongField(term322313, term322313.getClass(), "totalPoint", 8355506701434040790L);
        setIntField(term322313, term322313.getClass(), "playCount", 1613570880);
        setIntField(term322313, term322313.getClass(), "jewelCount", -1066282695);
        setIntField(term322313, term322313.getClass(), "totalJewelCount", 449049984);
        setIntField(term322313, term322313.getClass(), "medalCount", -174720521);
        setIntField(term322313, term322313.getClass(), "playerRating", 176159726);
        setIntField(term322313, term322313.getClass(), "highestRating", 145078069);
        setIntField(term322313, term322313.getClass(), "battlePoint", -602903146);
        setIntField(term322313, term322313.getClass(), "bestBattlePoint", -1411855479);
        setIntField(term322313, term322313.getClass(), "overDamageBattlePoint", 1832816267);
        setBooleanField(term322313, term322313.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term322313, term322313.getClass(), "nameplateId", -1078115971);
        setIntField(term322313, term322313.getClass(), "trophyId", -1342129393);
        setIntField(term322313, term322313.getClass(), "cardId", -198585857);
        setIntField(term322313, term322313.getClass(), "characterId", 1021673948);
        setIntField(term322313, term322313.getClass(), "characterVoiceNo", 996539266);
        setIntField(term322313, term322313.getClass(), "tabSetting", -216766818);
        setIntField(term322313, term322313.getClass(), "tabSortSetting", -1969282471);
        setIntField(term322313, term322313.getClass(), "cardCategorySetting", -1205706522);
        setIntField(term322313, term322313.getClass(), "cardSortSetting", -1800270634);
        setIntField(term322313, term322313.getClass(), "rivalScoreCategorySetting", 2063284492);
        setIntField(term322313, term322313.getClass(), "playedTutorialBit", -544984538);
        setIntField(term322313, term322313.getClass(), "firstTutorialCancelNum", -1377446937);
        setLongField(term322313, term322313.getClass(), "sumTechHighScore", 9178844703290082758L);
        setLongField(term322313, term322313.getClass(), "sumTechBasicHighScore", 5987734863626414730L);
        setLongField(term322313, term322313.getClass(), "sumTechAdvancedHighScore", 8944740219027484363L);
        setLongField(term322313, term322313.getClass(), "sumTechExpertHighScore", 8946024759848834068L);
        setLongField(term322313, term322313.getClass(), "sumTechMasterHighScore", 3525186031247727901L);
        setLongField(term322313, term322313.getClass(), "sumTechLunaticHighScore", -7152744351254265902L);
        setLongField(term322313, term322313.getClass(), "sumBattleHighScore", -1272331385362691192L);
        setLongField(term322313, term322313.getClass(), "sumBattleBasicHighScore", 5204591483473399297L);
        setLongField(term322313, term322313.getClass(), "sumBattleAdvancedHighScore", -1635952534113425881L);
        setLongField(term322313, term322313.getClass(), "sumBattleExpertHighScore", 2601196449944883624L);
        setLongField(term322313, term322313.getClass(), "sumBattleMasterHighScore", 2709444502366694113L);
        setLongField(term322313, term322313.getClass(), "sumBattleLunaticHighScore", 6521731178483846836L);
        setField(term322313, term322313.getClass(), "eventWatchedDate", "sxJdUrFkTy");
        setField(term322313, term322313.getClass(), "cmEventWatchedDate", "kOveoVkjRn");
        setField(term322313, term322313.getClass(), "firstGameId", "PjRshABUcj");
        setField(term322313, term322313.getClass(), "firstRomVersion", "cNhYwXUGAr");
        setField(term322313, term322313.getClass(), "firstDataVersion", "hUymjatGKZ");
        setField(term322313, term322313.getClass(), "firstPlayDate", "HPddujnhxc");
        setField(term322313, term322313.getClass(), "lastGameId", "BuyWlJeKtn");
        setField(term322313, term322313.getClass(), "lastRomVersion", "FbncABBoFx");
        setField(term322313, term322313.getClass(), "lastDataVersion", "BqSxvGTFSh");
        setField(term322313, term322313.getClass(), "compatibleCmVersion", "COxxMUYQnt");
        setField(term322313, term322313.getClass(), "lastPlayDate", "IfPUoWeVlJ");
        setIntField(term322313, term322313.getClass(), "lastPlaceId", -1242189550);
        setField(term322313, term322313.getClass(), "lastPlaceName", "XalHuXYQXO");
        setIntField(term322313, term322313.getClass(), "lastRegionId", -1245175992);
        setField(term322313, term322313.getClass(), "lastRegionName", "TGlROBzOZo");
        setIntField(term322313, term322313.getClass(), "lastAllNetId", -1285624829);
        setField(term322313, term322313.getClass(), "lastClientId", "fCkgGHBPkD");
        setIntField(term322313, term322313.getClass(), "lastUsedDeckId", -575933303);
        setIntField(term322313, term322313.getClass(), "lastPlayMusicLevel", 220842489);
        setIntField(term322313, term322313.getClass(), "lastEmoneyBrand", 509983681);
        setField(term322311, term322311.getClass(), "user", term322313);
        setIntField(term322311, term322311.getClass(), "optionSet", 949160032);
        setIntField(term322311, term322311.getClass(), "speed", -663146155);
        setIntField(term322311, term322311.getClass(), "mirror", -756879395);
        setIntField(term322311, term322311.getClass(), "judgeTiming", 1085421816);
        setIntField(term322311, term322311.getClass(), "judgeAdjustment", 1255911049);
        setIntField(term322311, term322311.getClass(), "abort", -839027611);
        setIntField(term322311, term322311.getClass(), "stealthField", -1124162495);
        setIntField(term322311, term322311.getClass(), "tapSound", 1340944720);
        setIntField(term322311, term322311.getClass(), "volGuide", -909139484);
        setIntField(term322311, term322311.getClass(), "volAll", -1976139427);
        setIntField(term322311, term322311.getClass(), "volTap", 303991487);
        setIntField(term322311, term322311.getClass(), "volCrTap", 1367064616);
        setIntField(term322311, term322311.getClass(), "volHold", 203718519);
        setIntField(term322311, term322311.getClass(), "volSide", 537247387);
        setIntField(term322311, term322311.getClass(), "volFlick", 1914948652);
        setIntField(term322311, term322311.getClass(), "volBell", -239857621);
        setIntField(term322311, term322311.getClass(), "volEnemy", 1772736429);
        setIntField(term322311, term322311.getClass(), "volSkill", -1816339027);
        setIntField(term322311, term322311.getClass(), "volDamage", -1235548167);
        setIntField(term322311, term322311.getClass(), "colorField", -1314719002);
        setIntField(term322311, term322311.getClass(), "colorLaneBright", -1170411431);
        setIntField(term322311, term322311.getClass(), "colorWallBright", 1088952067);
        setIntField(term322311, term322311.getClass(), "colorLane", 472610780);
        setIntField(term322311, term322311.getClass(), "colorSide", -2133619302);
        setIntField(term322311, term322311.getClass(), "effectDamage", 1552095995);
        setIntField(term322311, term322311.getClass(), "effectPos", -1747718939);
        setIntField(term322311, term322311.getClass(), "judgeDisp", 1965173166);
        setIntField(term322311, term322311.getClass(), "judgePos", 1581877075);
        setIntField(term322311, term322311.getClass(), "judgeBreak", 1615268673);
        setIntField(term322311, term322311.getClass(), "judgeHit", 1152887206);
        setIntField(term322311, term322311.getClass(), "platinumBreakDisp", 1901884310);
        setIntField(term322311, term322311.getClass(), "judgeCriticalBreak", -178445255);
        setIntField(term322311, term322311.getClass(), "matching", 304875983);
        setIntField(term322311, term322311.getClass(), "dispPlayerLv", 1800211738);
        setIntField(term322311, term322311.getClass(), "dispRating", -1008531865);
        setIntField(term322311, term322311.getClass(), "dispBP", -1757951451);
        setIntField(term322311, term322311.getClass(), "headphone", -1455399102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgePos", argTypes, term322311, args);
    }

};


