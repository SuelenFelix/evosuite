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

public class UserData_getSumBattleLunaticHighScore_86675530341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39261;

    public UserData_getSumBattleLunaticHighScore_86675530341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39265 = new Long(6689117472719450333L);
        term39261 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term39263 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39284 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39294 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39261, term39261.getClass(), "id", -1658464487289836175L);
        setLongField(term39263, term39263.getClass(), "id", -8555339910220884151L);
        setField(term39263, term39263.getClass(), "extId", term39265);
        setField(term39263, term39263.getClass(), "luid", "iXRAYcFyfS");
        setIntField(term39280, term39280.getClass(), "year", 2013);
        setShortField(term39280, term39280.getClass(), "month", (short) 10);
        setShortField(term39280, term39280.getClass(), "day", (short) 7);
        setField(term39279, term39279.getClass(), "date", term39280);
        setByteField(term39284, term39284.getClass(), "hour", (byte) 12);
        setByteField(term39284, term39284.getClass(), "minute", (byte) 2);
        setByteField(term39284, term39284.getClass(), "second", (byte) 42);
        setIntField(term39284, term39284.getClass(), "nano", 202308437);
        setField(term39279, term39279.getClass(), "time", term39284);
        setField(term39263, term39263.getClass(), "registerTime", term39279);
        setIntField(term39290, term39290.getClass(), "year", 2019);
        setShortField(term39290, term39290.getClass(), "month", (short) 12);
        setShortField(term39290, term39290.getClass(), "day", (short) 29);
        setField(term39289, term39289.getClass(), "date", term39290);
        setByteField(term39294, term39294.getClass(), "hour", (byte) 16);
        setByteField(term39294, term39294.getClass(), "minute", (byte) 10);
        setByteField(term39294, term39294.getClass(), "second", (byte) 1);
        setIntField(term39294, term39294.getClass(), "nano", 198559584);
        setField(term39289, term39289.getClass(), "time", term39294);
        setField(term39263, term39263.getClass(), "accessTime", term39289);
        setField(term39261, term39261.getClass(), "card", term39263);
        setField(term39261, term39261.getClass(), "userName", "lokyclbLEz");
        setIntField(term39261, term39261.getClass(), "level", -1047476590);
        setIntField(term39261, term39261.getClass(), "reincarnationNum", -804745833);
        setLongField(term39261, term39261.getClass(), "exp", 8483270362078349289L);
        setLongField(term39261, term39261.getClass(), "point", -2660365005868686870L);
        setLongField(term39261, term39261.getClass(), "totalPoint", 79870604313788787L);
        setIntField(term39261, term39261.getClass(), "playCount", 1080834214);
        setIntField(term39261, term39261.getClass(), "jewelCount", 323842695);
        setIntField(term39261, term39261.getClass(), "totalJewelCount", 331897564);
        setIntField(term39261, term39261.getClass(), "medalCount", -968105925);
        setIntField(term39261, term39261.getClass(), "playerRating", -206020926);
        setIntField(term39261, term39261.getClass(), "highestRating", -2054014210);
        setIntField(term39261, term39261.getClass(), "battlePoint", 1179045520);
        setIntField(term39261, term39261.getClass(), "bestBattlePoint", 1056739921);
        setIntField(term39261, term39261.getClass(), "overDamageBattlePoint", 1384627927);
        setBooleanField(term39261, term39261.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term39261, term39261.getClass(), "nameplateId", -1252280115);
        setIntField(term39261, term39261.getClass(), "trophyId", -120849363);
        setIntField(term39261, term39261.getClass(), "cardId", 147387583);
        setIntField(term39261, term39261.getClass(), "characterId", -1307347557);
        setIntField(term39261, term39261.getClass(), "characterVoiceNo", 1092325030);
        setIntField(term39261, term39261.getClass(), "tabSetting", -1901115940);
        setIntField(term39261, term39261.getClass(), "tabSortSetting", 1934437115);
        setIntField(term39261, term39261.getClass(), "cardCategorySetting", 1820319919);
        setIntField(term39261, term39261.getClass(), "cardSortSetting", 1444962020);
        setIntField(term39261, term39261.getClass(), "rivalScoreCategorySetting", 1636228804);
        setIntField(term39261, term39261.getClass(), "playedTutorialBit", -1650533427);
        setIntField(term39261, term39261.getClass(), "firstTutorialCancelNum", -1076430316);
        setLongField(term39261, term39261.getClass(), "sumTechHighScore", -5116722010996804482L);
        setLongField(term39261, term39261.getClass(), "sumTechBasicHighScore", 1713582982697786878L);
        setLongField(term39261, term39261.getClass(), "sumTechAdvancedHighScore", -815959191072093025L);
        setLongField(term39261, term39261.getClass(), "sumTechExpertHighScore", 1118770099037757943L);
        setLongField(term39261, term39261.getClass(), "sumTechMasterHighScore", 8084091396945491294L);
        setLongField(term39261, term39261.getClass(), "sumTechLunaticHighScore", -4010221274821200437L);
        setLongField(term39261, term39261.getClass(), "sumBattleHighScore", 802806007271882853L);
        setLongField(term39261, term39261.getClass(), "sumBattleBasicHighScore", -687030958964015701L);
        setLongField(term39261, term39261.getClass(), "sumBattleAdvancedHighScore", -6658692066502742692L);
        setLongField(term39261, term39261.getClass(), "sumBattleExpertHighScore", 7505187196596103566L);
        setLongField(term39261, term39261.getClass(), "sumBattleMasterHighScore", 3827525335107462030L);
        setLongField(term39261, term39261.getClass(), "sumBattleLunaticHighScore", -6895327543559831172L);
        setField(term39261, term39261.getClass(), "eventWatchedDate", "hAPmQGaxkI");
        setField(term39261, term39261.getClass(), "cmEventWatchedDate", "ojrnLnJZjT");
        setField(term39261, term39261.getClass(), "firstGameId", "rtvXSMjOdJ");
        setField(term39261, term39261.getClass(), "firstRomVersion", "EDkfjuDpNv");
        setField(term39261, term39261.getClass(), "firstDataVersion", "LNHkTUfuHX");
        setField(term39261, term39261.getClass(), "firstPlayDate", "SVWcOAHiTp");
        setField(term39261, term39261.getClass(), "lastGameId", "oShLCaneoQ");
        setField(term39261, term39261.getClass(), "lastRomVersion", "nwKkzNpzyC");
        setField(term39261, term39261.getClass(), "lastDataVersion", "CwrsdYnHpH");
        setField(term39261, term39261.getClass(), "compatibleCmVersion", "jifjXNXluS");
        setField(term39261, term39261.getClass(), "lastPlayDate", "uDayZDXPOP");
        setIntField(term39261, term39261.getClass(), "lastPlaceId", 1984492528);
        setField(term39261, term39261.getClass(), "lastPlaceName", "kbjWxMAIhY");
        setIntField(term39261, term39261.getClass(), "lastRegionId", -655764067);
        setField(term39261, term39261.getClass(), "lastRegionName", "GmtlSgqKcI");
        setIntField(term39261, term39261.getClass(), "lastAllNetId", 31238744);
        setField(term39261, term39261.getClass(), "lastClientId", "ssSbvPoMjB");
        setIntField(term39261, term39261.getClass(), "lastUsedDeckId", 680031965);
        setIntField(term39261, term39261.getClass(), "lastPlayMusicLevel", -2112419098);
        setIntField(term39261, term39261.getClass(), "lastEmoneyBrand", -1649429373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleLunaticHighScore", argTypes, term39261, args);
    }

};


