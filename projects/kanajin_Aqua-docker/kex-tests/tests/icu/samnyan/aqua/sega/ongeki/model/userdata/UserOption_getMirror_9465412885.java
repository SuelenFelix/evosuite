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

public class UserOption_getMirror_9465412885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310761;

    public UserOption_getMirror_9465412885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310767 = new Long(-6759247883224780481L);
        term310761 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term310763 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term310765 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term310781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310796 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term310761, term310761.getClass(), "id", -8052666254920327428L);
        setLongField(term310763, term310763.getClass(), "id", -6317509225785803580L);
        setLongField(term310765, term310765.getClass(), "id", -858579607242908410L);
        setField(term310765, term310765.getClass(), "extId", term310767);
        setField(term310765, term310765.getClass(), "luid", "BybNDgOqaU");
        setIntField(term310782, term310782.getClass(), "year", 2010);
        setShortField(term310782, term310782.getClass(), "month", (short) 7);
        setShortField(term310782, term310782.getClass(), "day", (short) 17);
        setField(term310781, term310781.getClass(), "date", term310782);
        setByteField(term310786, term310786.getClass(), "hour", (byte) 3);
        setByteField(term310786, term310786.getClass(), "minute", (byte) 45);
        setByteField(term310786, term310786.getClass(), "second", (byte) 30);
        setIntField(term310786, term310786.getClass(), "nano", 146814860);
        setField(term310781, term310781.getClass(), "time", term310786);
        setField(term310765, term310765.getClass(), "registerTime", term310781);
        setIntField(term310792, term310792.getClass(), "year", 2024);
        setShortField(term310792, term310792.getClass(), "month", (short) 12);
        setShortField(term310792, term310792.getClass(), "day", (short) 5);
        setField(term310791, term310791.getClass(), "date", term310792);
        setByteField(term310796, term310796.getClass(), "hour", (byte) 2);
        setByteField(term310796, term310796.getClass(), "minute", (byte) 50);
        setByteField(term310796, term310796.getClass(), "second", (byte) 28);
        setIntField(term310796, term310796.getClass(), "nano", 545409856);
        setField(term310791, term310791.getClass(), "time", term310796);
        setField(term310765, term310765.getClass(), "accessTime", term310791);
        setField(term310763, term310763.getClass(), "card", term310765);
        setField(term310763, term310763.getClass(), "userName", "kBHetuXVIX");
        setIntField(term310763, term310763.getClass(), "level", 146563883);
        setIntField(term310763, term310763.getClass(), "reincarnationNum", 1799665489);
        setLongField(term310763, term310763.getClass(), "exp", 1564806527297902084L);
        setLongField(term310763, term310763.getClass(), "point", -3728237493431839892L);
        setLongField(term310763, term310763.getClass(), "totalPoint", 418076593619990520L);
        setIntField(term310763, term310763.getClass(), "playCount", 169721628);
        setIntField(term310763, term310763.getClass(), "jewelCount", -1490169360);
        setIntField(term310763, term310763.getClass(), "totalJewelCount", 69395748);
        setIntField(term310763, term310763.getClass(), "medalCount", 378800126);
        setIntField(term310763, term310763.getClass(), "playerRating", -1992116727);
        setIntField(term310763, term310763.getClass(), "highestRating", 640309304);
        setIntField(term310763, term310763.getClass(), "battlePoint", -219854717);
        setIntField(term310763, term310763.getClass(), "bestBattlePoint", 873009421);
        setIntField(term310763, term310763.getClass(), "overDamageBattlePoint", 262200959);
        setBooleanField(term310763, term310763.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term310763, term310763.getClass(), "nameplateId", 974169701);
        setIntField(term310763, term310763.getClass(), "trophyId", -314909077);
        setIntField(term310763, term310763.getClass(), "cardId", 1607017048);
        setIntField(term310763, term310763.getClass(), "characterId", -99136729);
        setIntField(term310763, term310763.getClass(), "characterVoiceNo", -355824448);
        setIntField(term310763, term310763.getClass(), "tabSetting", 852249692);
        setIntField(term310763, term310763.getClass(), "tabSortSetting", 1951861706);
        setIntField(term310763, term310763.getClass(), "cardCategorySetting", -586915273);
        setIntField(term310763, term310763.getClass(), "cardSortSetting", -2047610899);
        setIntField(term310763, term310763.getClass(), "rivalScoreCategorySetting", 926362344);
        setIntField(term310763, term310763.getClass(), "playedTutorialBit", -2061277187);
        setIntField(term310763, term310763.getClass(), "firstTutorialCancelNum", -571146931);
        setLongField(term310763, term310763.getClass(), "sumTechHighScore", 2052697577314269433L);
        setLongField(term310763, term310763.getClass(), "sumTechBasicHighScore", -1657675531545553803L);
        setLongField(term310763, term310763.getClass(), "sumTechAdvancedHighScore", -8560334467325602122L);
        setLongField(term310763, term310763.getClass(), "sumTechExpertHighScore", -411978007694560633L);
        setLongField(term310763, term310763.getClass(), "sumTechMasterHighScore", 1842413600680396651L);
        setLongField(term310763, term310763.getClass(), "sumTechLunaticHighScore", 1458425551828083604L);
        setLongField(term310763, term310763.getClass(), "sumBattleHighScore", 8505671513912175462L);
        setLongField(term310763, term310763.getClass(), "sumBattleBasicHighScore", 2411941530936075970L);
        setLongField(term310763, term310763.getClass(), "sumBattleAdvancedHighScore", -1138132210883603334L);
        setLongField(term310763, term310763.getClass(), "sumBattleExpertHighScore", 9195992737118281366L);
        setLongField(term310763, term310763.getClass(), "sumBattleMasterHighScore", -2926945131365241270L);
        setLongField(term310763, term310763.getClass(), "sumBattleLunaticHighScore", 3522559230555471069L);
        setField(term310763, term310763.getClass(), "eventWatchedDate", "wjgkxGVWLp");
        setField(term310763, term310763.getClass(), "cmEventWatchedDate", "CGBDZPutSb");
        setField(term310763, term310763.getClass(), "firstGameId", "zlUSnfUdoF");
        setField(term310763, term310763.getClass(), "firstRomVersion", "HdpjMQhjhR");
        setField(term310763, term310763.getClass(), "firstDataVersion", "YGkFfIaeGd");
        setField(term310763, term310763.getClass(), "firstPlayDate", "yLXjLruNNP");
        setField(term310763, term310763.getClass(), "lastGameId", "VPHDBNPBGm");
        setField(term310763, term310763.getClass(), "lastRomVersion", "lBIJygADhM");
        setField(term310763, term310763.getClass(), "lastDataVersion", "rpMOuRGfGr");
        setField(term310763, term310763.getClass(), "compatibleCmVersion", "QdOdiCkUpj");
        setField(term310763, term310763.getClass(), "lastPlayDate", "gcbuFHLquR");
        setIntField(term310763, term310763.getClass(), "lastPlaceId", 1416875561);
        setField(term310763, term310763.getClass(), "lastPlaceName", "qYxAvMgHse");
        setIntField(term310763, term310763.getClass(), "lastRegionId", 1101028268);
        setField(term310763, term310763.getClass(), "lastRegionName", "QOxTTxLEBd");
        setIntField(term310763, term310763.getClass(), "lastAllNetId", 503606564);
        setField(term310763, term310763.getClass(), "lastClientId", "JNrjfsJkdd");
        setIntField(term310763, term310763.getClass(), "lastUsedDeckId", -1450888579);
        setIntField(term310763, term310763.getClass(), "lastPlayMusicLevel", -162933550);
        setIntField(term310763, term310763.getClass(), "lastEmoneyBrand", -2059318658);
        setField(term310761, term310761.getClass(), "user", term310763);
        setIntField(term310761, term310761.getClass(), "optionSet", -740333526);
        setIntField(term310761, term310761.getClass(), "speed", 224139949);
        setIntField(term310761, term310761.getClass(), "mirror", -731821524);
        setIntField(term310761, term310761.getClass(), "judgeTiming", -1897165341);
        setIntField(term310761, term310761.getClass(), "judgeAdjustment", -1429453285);
        setIntField(term310761, term310761.getClass(), "abort", -1024644833);
        setIntField(term310761, term310761.getClass(), "stealthField", 1040338785);
        setIntField(term310761, term310761.getClass(), "tapSound", -482239805);
        setIntField(term310761, term310761.getClass(), "volGuide", 664653763);
        setIntField(term310761, term310761.getClass(), "volAll", 2134829135);
        setIntField(term310761, term310761.getClass(), "volTap", -1719222583);
        setIntField(term310761, term310761.getClass(), "volCrTap", 437944159);
        setIntField(term310761, term310761.getClass(), "volHold", -2076214380);
        setIntField(term310761, term310761.getClass(), "volSide", -1080020994);
        setIntField(term310761, term310761.getClass(), "volFlick", -1903678868);
        setIntField(term310761, term310761.getClass(), "volBell", 1081203074);
        setIntField(term310761, term310761.getClass(), "volEnemy", 168032716);
        setIntField(term310761, term310761.getClass(), "volSkill", 942811278);
        setIntField(term310761, term310761.getClass(), "volDamage", -15679804);
        setIntField(term310761, term310761.getClass(), "colorField", -492536842);
        setIntField(term310761, term310761.getClass(), "colorLaneBright", 151903958);
        setIntField(term310761, term310761.getClass(), "colorWallBright", 12496784);
        setIntField(term310761, term310761.getClass(), "colorLane", -844034618);
        setIntField(term310761, term310761.getClass(), "colorSide", -1748142279);
        setIntField(term310761, term310761.getClass(), "effectDamage", -491909135);
        setIntField(term310761, term310761.getClass(), "effectPos", 867692955);
        setIntField(term310761, term310761.getClass(), "judgeDisp", -604436957);
        setIntField(term310761, term310761.getClass(), "judgePos", -199329423);
        setIntField(term310761, term310761.getClass(), "judgeBreak", -1406544369);
        setIntField(term310761, term310761.getClass(), "judgeHit", 1404521823);
        setIntField(term310761, term310761.getClass(), "platinumBreakDisp", -269313334);
        setIntField(term310761, term310761.getClass(), "judgeCriticalBreak", 1447672220);
        setIntField(term310761, term310761.getClass(), "matching", -1173046529);
        setIntField(term310761, term310761.getClass(), "dispPlayerLv", 1923011577);
        setIntField(term310761, term310761.getClass(), "dispRating", -1675567439);
        setIntField(term310761, term310761.getClass(), "dispBP", 1925374475);
        setIntField(term310761, term310761.getClass(), "headphone", -125266739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMirror", argTypes, term310761, args);
    }

};


