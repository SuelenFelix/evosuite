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

public class UserOption_getColorLaneBright_80860991023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319077;

    public UserOption_getColorLaneBright_80860991023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term319083 = new Long(6465539339431559532L);
        term319077 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term319079 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term319081 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term319097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319112 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term319077, term319077.getClass(), "id", -7850351057440349461L);
        setLongField(term319079, term319079.getClass(), "id", 6778944575047515200L);
        setLongField(term319081, term319081.getClass(), "id", -3506435293677650801L);
        setField(term319081, term319081.getClass(), "extId", term319083);
        setField(term319081, term319081.getClass(), "luid", "AQCfezvABR");
        setIntField(term319098, term319098.getClass(), "year", 2014);
        setShortField(term319098, term319098.getClass(), "month", (short) 4);
        setShortField(term319098, term319098.getClass(), "day", (short) 17);
        setField(term319097, term319097.getClass(), "date", term319098);
        setByteField(term319102, term319102.getClass(), "hour", (byte) 17);
        setByteField(term319102, term319102.getClass(), "minute", (byte) 12);
        setByteField(term319102, term319102.getClass(), "second", (byte) 58);
        setIntField(term319102, term319102.getClass(), "nano", 190091480);
        setField(term319097, term319097.getClass(), "time", term319102);
        setField(term319081, term319081.getClass(), "registerTime", term319097);
        setIntField(term319108, term319108.getClass(), "year", 2027);
        setShortField(term319108, term319108.getClass(), "month", (short) 5);
        setShortField(term319108, term319108.getClass(), "day", (short) 28);
        setField(term319107, term319107.getClass(), "date", term319108);
        setByteField(term319112, term319112.getClass(), "hour", (byte) 7);
        setByteField(term319112, term319112.getClass(), "minute", (byte) 44);
        setByteField(term319112, term319112.getClass(), "second", (byte) 46);
        setIntField(term319112, term319112.getClass(), "nano", 87733183);
        setField(term319107, term319107.getClass(), "time", term319112);
        setField(term319081, term319081.getClass(), "accessTime", term319107);
        setField(term319079, term319079.getClass(), "card", term319081);
        setField(term319079, term319079.getClass(), "userName", "khfYJUMptM");
        setIntField(term319079, term319079.getClass(), "level", 1295104869);
        setIntField(term319079, term319079.getClass(), "reincarnationNum", 7476990);
        setLongField(term319079, term319079.getClass(), "exp", -5953961465742830083L);
        setLongField(term319079, term319079.getClass(), "point", 3538596464286777441L);
        setLongField(term319079, term319079.getClass(), "totalPoint", 2761060873639994291L);
        setIntField(term319079, term319079.getClass(), "playCount", -187952821);
        setIntField(term319079, term319079.getClass(), "jewelCount", -2084242855);
        setIntField(term319079, term319079.getClass(), "totalJewelCount", -1516692137);
        setIntField(term319079, term319079.getClass(), "medalCount", 1313192861);
        setIntField(term319079, term319079.getClass(), "playerRating", -1767172334);
        setIntField(term319079, term319079.getClass(), "highestRating", -40339714);
        setIntField(term319079, term319079.getClass(), "battlePoint", -1662035010);
        setIntField(term319079, term319079.getClass(), "bestBattlePoint", -1418703569);
        setIntField(term319079, term319079.getClass(), "overDamageBattlePoint", 357193357);
        setBooleanField(term319079, term319079.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term319079, term319079.getClass(), "nameplateId", 638287098);
        setIntField(term319079, term319079.getClass(), "trophyId", 2068330956);
        setIntField(term319079, term319079.getClass(), "cardId", -2133447577);
        setIntField(term319079, term319079.getClass(), "characterId", -220178445);
        setIntField(term319079, term319079.getClass(), "characterVoiceNo", -735692856);
        setIntField(term319079, term319079.getClass(), "tabSetting", -604285208);
        setIntField(term319079, term319079.getClass(), "tabSortSetting", 1406502733);
        setIntField(term319079, term319079.getClass(), "cardCategorySetting", 457897221);
        setIntField(term319079, term319079.getClass(), "cardSortSetting", 583221280);
        setIntField(term319079, term319079.getClass(), "rivalScoreCategorySetting", 2082993823);
        setIntField(term319079, term319079.getClass(), "playedTutorialBit", 116896794);
        setIntField(term319079, term319079.getClass(), "firstTutorialCancelNum", 1231807515);
        setLongField(term319079, term319079.getClass(), "sumTechHighScore", -7030935519110702447L);
        setLongField(term319079, term319079.getClass(), "sumTechBasicHighScore", -1173137850516100498L);
        setLongField(term319079, term319079.getClass(), "sumTechAdvancedHighScore", 8111861481594383190L);
        setLongField(term319079, term319079.getClass(), "sumTechExpertHighScore", -2692634180957098116L);
        setLongField(term319079, term319079.getClass(), "sumTechMasterHighScore", -4349207274799146261L);
        setLongField(term319079, term319079.getClass(), "sumTechLunaticHighScore", -7767543635525872118L);
        setLongField(term319079, term319079.getClass(), "sumBattleHighScore", 1486987843039783385L);
        setLongField(term319079, term319079.getClass(), "sumBattleBasicHighScore", 3911817293184299790L);
        setLongField(term319079, term319079.getClass(), "sumBattleAdvancedHighScore", 1900094371445145980L);
        setLongField(term319079, term319079.getClass(), "sumBattleExpertHighScore", 4403559277497269096L);
        setLongField(term319079, term319079.getClass(), "sumBattleMasterHighScore", -2449075308905625409L);
        setLongField(term319079, term319079.getClass(), "sumBattleLunaticHighScore", 2687615153773785155L);
        setField(term319079, term319079.getClass(), "eventWatchedDate", "CfEQwakHbo");
        setField(term319079, term319079.getClass(), "cmEventWatchedDate", "ZsmyFqxuVj");
        setField(term319079, term319079.getClass(), "firstGameId", "GeGOpdgDzW");
        setField(term319079, term319079.getClass(), "firstRomVersion", "xIGpJjkyZp");
        setField(term319079, term319079.getClass(), "firstDataVersion", "FpfqmbeHsA");
        setField(term319079, term319079.getClass(), "firstPlayDate", "femqsSNrxF");
        setField(term319079, term319079.getClass(), "lastGameId", "KgdTpMyqBU");
        setField(term319079, term319079.getClass(), "lastRomVersion", "xsHkgOxsOG");
        setField(term319079, term319079.getClass(), "lastDataVersion", "YKbfdPBRSl");
        setField(term319079, term319079.getClass(), "compatibleCmVersion", "rEdjFTfZpG");
        setField(term319079, term319079.getClass(), "lastPlayDate", "HEtVgWRMpz");
        setIntField(term319079, term319079.getClass(), "lastPlaceId", 1281018748);
        setField(term319079, term319079.getClass(), "lastPlaceName", "YLwLrXgHyE");
        setIntField(term319079, term319079.getClass(), "lastRegionId", -1567042600);
        setField(term319079, term319079.getClass(), "lastRegionName", "loIOcHuzbL");
        setIntField(term319079, term319079.getClass(), "lastAllNetId", -1851599258);
        setField(term319079, term319079.getClass(), "lastClientId", "vvCeDHZquI");
        setIntField(term319079, term319079.getClass(), "lastUsedDeckId", 1297768569);
        setIntField(term319079, term319079.getClass(), "lastPlayMusicLevel", 819122136);
        setIntField(term319079, term319079.getClass(), "lastEmoneyBrand", 171275083);
        setField(term319077, term319077.getClass(), "user", term319079);
        setIntField(term319077, term319077.getClass(), "optionSet", 1029583492);
        setIntField(term319077, term319077.getClass(), "speed", 496403430);
        setIntField(term319077, term319077.getClass(), "mirror", -1220075590);
        setIntField(term319077, term319077.getClass(), "judgeTiming", -1726895820);
        setIntField(term319077, term319077.getClass(), "judgeAdjustment", -478293204);
        setIntField(term319077, term319077.getClass(), "abort", 991962495);
        setIntField(term319077, term319077.getClass(), "stealthField", 996721265);
        setIntField(term319077, term319077.getClass(), "tapSound", -234666429);
        setIntField(term319077, term319077.getClass(), "volGuide", 1815111003);
        setIntField(term319077, term319077.getClass(), "volAll", -1407430200);
        setIntField(term319077, term319077.getClass(), "volTap", -96203616);
        setIntField(term319077, term319077.getClass(), "volCrTap", -793698346);
        setIntField(term319077, term319077.getClass(), "volHold", 708079222);
        setIntField(term319077, term319077.getClass(), "volSide", -137252861);
        setIntField(term319077, term319077.getClass(), "volFlick", 1630616830);
        setIntField(term319077, term319077.getClass(), "volBell", 1334699881);
        setIntField(term319077, term319077.getClass(), "volEnemy", 992493749);
        setIntField(term319077, term319077.getClass(), "volSkill", 41248964);
        setIntField(term319077, term319077.getClass(), "volDamage", -1549033130);
        setIntField(term319077, term319077.getClass(), "colorField", -1755019956);
        setIntField(term319077, term319077.getClass(), "colorLaneBright", 364532158);
        setIntField(term319077, term319077.getClass(), "colorWallBright", 482828741);
        setIntField(term319077, term319077.getClass(), "colorLane", -1106802731);
        setIntField(term319077, term319077.getClass(), "colorSide", -532485481);
        setIntField(term319077, term319077.getClass(), "effectDamage", 188077968);
        setIntField(term319077, term319077.getClass(), "effectPos", -602545418);
        setIntField(term319077, term319077.getClass(), "judgeDisp", 1002406020);
        setIntField(term319077, term319077.getClass(), "judgePos", 652971611);
        setIntField(term319077, term319077.getClass(), "judgeBreak", 54644642);
        setIntField(term319077, term319077.getClass(), "judgeHit", 2016278744);
        setIntField(term319077, term319077.getClass(), "platinumBreakDisp", -1399475438);
        setIntField(term319077, term319077.getClass(), "judgeCriticalBreak", 130353690);
        setIntField(term319077, term319077.getClass(), "matching", -848898997);
        setIntField(term319077, term319077.getClass(), "dispPlayerLv", 792668171);
        setIntField(term319077, term319077.getClass(), "dispRating", -1538372393);
        setIntField(term319077, term319077.getClass(), "dispBP", 63080824);
        setIntField(term319077, term319077.getClass(), "headphone", 1582457956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorLaneBright", argTypes, term319077, args);
    }

};


