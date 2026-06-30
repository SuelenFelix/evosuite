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

public class UserOption_setJudgeAdjustment_108342394146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330136;
     Object term330438;

    public UserOption_setJudgeAdjustment_108342394146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term330142 = new Long(4872921045907555824L);
        term330136 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term330138 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term330140 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term330156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330171 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term330136, term330136.getClass(), "id", -3928969582603897507L);
        setLongField(term330138, term330138.getClass(), "id", 3204703380652810776L);
        setLongField(term330140, term330140.getClass(), "id", 2218395544653511176L);
        setField(term330140, term330140.getClass(), "extId", term330142);
        setField(term330140, term330140.getClass(), "luid", "kqVIQgFWid");
        setIntField(term330157, term330157.getClass(), "year", 2015);
        setShortField(term330157, term330157.getClass(), "month", (short) 5);
        setShortField(term330157, term330157.getClass(), "day", (short) 30);
        setField(term330156, term330156.getClass(), "date", term330157);
        setByteField(term330161, term330161.getClass(), "hour", (byte) 3);
        setByteField(term330161, term330161.getClass(), "minute", (byte) 2);
        setByteField(term330161, term330161.getClass(), "second", (byte) 10);
        setIntField(term330161, term330161.getClass(), "nano", 201133922);
        setField(term330156, term330156.getClass(), "time", term330161);
        setField(term330140, term330140.getClass(), "registerTime", term330156);
        setIntField(term330167, term330167.getClass(), "year", 2027);
        setShortField(term330167, term330167.getClass(), "month", (short) 5);
        setShortField(term330167, term330167.getClass(), "day", (short) 31);
        setField(term330166, term330166.getClass(), "date", term330167);
        setByteField(term330171, term330171.getClass(), "hour", (byte) 7);
        setByteField(term330171, term330171.getClass(), "minute", (byte) 45);
        setByteField(term330171, term330171.getClass(), "second", (byte) 3);
        setIntField(term330171, term330171.getClass(), "nano", 347509118);
        setField(term330166, term330166.getClass(), "time", term330171);
        setField(term330140, term330140.getClass(), "accessTime", term330166);
        setField(term330138, term330138.getClass(), "card", term330140);
        setField(term330138, term330138.getClass(), "userName", "BJnGkduQYG");
        setIntField(term330138, term330138.getClass(), "level", -2005220505);
        setIntField(term330138, term330138.getClass(), "reincarnationNum", 1585188717);
        setLongField(term330138, term330138.getClass(), "exp", 8299655109346175296L);
        setLongField(term330138, term330138.getClass(), "point", 6161820605779478637L);
        setLongField(term330138, term330138.getClass(), "totalPoint", -6654250759775039308L);
        setIntField(term330138, term330138.getClass(), "playCount", -2930454);
        setIntField(term330138, term330138.getClass(), "jewelCount", -1013772215);
        setIntField(term330138, term330138.getClass(), "totalJewelCount", -885124539);
        setIntField(term330138, term330138.getClass(), "medalCount", -494597587);
        setIntField(term330138, term330138.getClass(), "playerRating", -1897031636);
        setIntField(term330138, term330138.getClass(), "highestRating", 400013611);
        setIntField(term330138, term330138.getClass(), "battlePoint", -1642575075);
        setIntField(term330138, term330138.getClass(), "bestBattlePoint", -852288210);
        setIntField(term330138, term330138.getClass(), "overDamageBattlePoint", -293817390);
        setBooleanField(term330138, term330138.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term330138, term330138.getClass(), "nameplateId", -1318120636);
        setIntField(term330138, term330138.getClass(), "trophyId", -919397046);
        setIntField(term330138, term330138.getClass(), "cardId", -1152386296);
        setIntField(term330138, term330138.getClass(), "characterId", 1426892945);
        setIntField(term330138, term330138.getClass(), "characterVoiceNo", -1234646726);
        setIntField(term330138, term330138.getClass(), "tabSetting", 1047808691);
        setIntField(term330138, term330138.getClass(), "tabSortSetting", -2072337452);
        setIntField(term330138, term330138.getClass(), "cardCategorySetting", 807300991);
        setIntField(term330138, term330138.getClass(), "cardSortSetting", 496005386);
        setIntField(term330138, term330138.getClass(), "rivalScoreCategorySetting", -984981496);
        setIntField(term330138, term330138.getClass(), "playedTutorialBit", 630125092);
        setIntField(term330138, term330138.getClass(), "firstTutorialCancelNum", -2083378694);
        setLongField(term330138, term330138.getClass(), "sumTechHighScore", -2497014264519942876L);
        setLongField(term330138, term330138.getClass(), "sumTechBasicHighScore", 1628971502053233494L);
        setLongField(term330138, term330138.getClass(), "sumTechAdvancedHighScore", -5025602486401169114L);
        setLongField(term330138, term330138.getClass(), "sumTechExpertHighScore", -7344311622222498901L);
        setLongField(term330138, term330138.getClass(), "sumTechMasterHighScore", -7495878991573767208L);
        setLongField(term330138, term330138.getClass(), "sumTechLunaticHighScore", 5948719178581389173L);
        setLongField(term330138, term330138.getClass(), "sumBattleHighScore", 6435552234064333128L);
        setLongField(term330138, term330138.getClass(), "sumBattleBasicHighScore", 8136920167513885089L);
        setLongField(term330138, term330138.getClass(), "sumBattleAdvancedHighScore", -3583290057255927627L);
        setLongField(term330138, term330138.getClass(), "sumBattleExpertHighScore", 7741469789676719715L);
        setLongField(term330138, term330138.getClass(), "sumBattleMasterHighScore", -4433179426805897388L);
        setLongField(term330138, term330138.getClass(), "sumBattleLunaticHighScore", 8490707659975538079L);
        setField(term330138, term330138.getClass(), "eventWatchedDate", "bQHldIycGG");
        setField(term330138, term330138.getClass(), "cmEventWatchedDate", "jbJUEodTLg");
        setField(term330138, term330138.getClass(), "firstGameId", "FRkoYbUSPt");
        setField(term330138, term330138.getClass(), "firstRomVersion", "kDOpmOkvUY");
        setField(term330138, term330138.getClass(), "firstDataVersion", "fydwIxuzLl");
        setField(term330138, term330138.getClass(), "firstPlayDate", "ikgWrFOYJi");
        setField(term330138, term330138.getClass(), "lastGameId", "FvhwwRnPwZ");
        setField(term330138, term330138.getClass(), "lastRomVersion", "UBAijNJtfg");
        setField(term330138, term330138.getClass(), "lastDataVersion", "OmCXCalCOm");
        setField(term330138, term330138.getClass(), "compatibleCmVersion", "hmzSOGURTt");
        setField(term330138, term330138.getClass(), "lastPlayDate", "hJFHELVlxA");
        setIntField(term330138, term330138.getClass(), "lastPlaceId", 1239933976);
        setField(term330138, term330138.getClass(), "lastPlaceName", "VzpzLljWnH");
        setIntField(term330138, term330138.getClass(), "lastRegionId", -1554633398);
        setField(term330138, term330138.getClass(), "lastRegionName", "sJWqJqDTvz");
        setIntField(term330138, term330138.getClass(), "lastAllNetId", 1690600247);
        setField(term330138, term330138.getClass(), "lastClientId", "KrPrUSgnHn");
        setIntField(term330138, term330138.getClass(), "lastUsedDeckId", -1197557816);
        setIntField(term330138, term330138.getClass(), "lastPlayMusicLevel", 870745222);
        setIntField(term330138, term330138.getClass(), "lastEmoneyBrand", -971717999);
        setField(term330136, term330136.getClass(), "user", term330138);
        setIntField(term330136, term330136.getClass(), "optionSet", 1154969193);
        setIntField(term330136, term330136.getClass(), "speed", -278262913);
        setIntField(term330136, term330136.getClass(), "mirror", -1747516472);
        setIntField(term330136, term330136.getClass(), "judgeTiming", 698742025);
        setIntField(term330136, term330136.getClass(), "judgeAdjustment", 985694184);
        setIntField(term330136, term330136.getClass(), "abort", -1683496665);
        setIntField(term330136, term330136.getClass(), "stealthField", -1003323784);
        setIntField(term330136, term330136.getClass(), "tapSound", 268939325);
        setIntField(term330136, term330136.getClass(), "volGuide", -542512468);
        setIntField(term330136, term330136.getClass(), "volAll", -983909603);
        setIntField(term330136, term330136.getClass(), "volTap", 1903231334);
        setIntField(term330136, term330136.getClass(), "volCrTap", 1121884055);
        setIntField(term330136, term330136.getClass(), "volHold", -1842829912);
        setIntField(term330136, term330136.getClass(), "volSide", 1009600826);
        setIntField(term330136, term330136.getClass(), "volFlick", -1548432397);
        setIntField(term330136, term330136.getClass(), "volBell", 73972775);
        setIntField(term330136, term330136.getClass(), "volEnemy", -1517164483);
        setIntField(term330136, term330136.getClass(), "volSkill", -543646157);
        setIntField(term330136, term330136.getClass(), "volDamage", -1489575010);
        setIntField(term330136, term330136.getClass(), "colorField", 2059365027);
        setIntField(term330136, term330136.getClass(), "colorLaneBright", -1882752529);
        setIntField(term330136, term330136.getClass(), "colorWallBright", 1080940354);
        setIntField(term330136, term330136.getClass(), "colorLane", 1202769119);
        setIntField(term330136, term330136.getClass(), "colorSide", 2136561070);
        setIntField(term330136, term330136.getClass(), "effectDamage", 609012058);
        setIntField(term330136, term330136.getClass(), "effectPos", 2086672902);
        setIntField(term330136, term330136.getClass(), "judgeDisp", 174619955);
        setIntField(term330136, term330136.getClass(), "judgePos", -1810980771);
        setIntField(term330136, term330136.getClass(), "judgeBreak", -1306395034);
        setIntField(term330136, term330136.getClass(), "judgeHit", -1500115801);
        setIntField(term330136, term330136.getClass(), "platinumBreakDisp", 1598085752);
        setIntField(term330136, term330136.getClass(), "judgeCriticalBreak", -755725066);
        setIntField(term330136, term330136.getClass(), "matching", -1744733255);
        setIntField(term330136, term330136.getClass(), "dispPlayerLv", 387460157);
        setIntField(term330136, term330136.getClass(), "dispRating", -259892358);
        setIntField(term330136, term330136.getClass(), "dispBP", -2021731334);
        setIntField(term330136, term330136.getClass(), "headphone", 460292973);
        term330438 = new Integer(-127687310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term330438;
        callMethod(klass, "setJudgeAdjustment", argTypes, term330136, args);
    }

};


