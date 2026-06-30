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

public class UserData_setCharacterVoiceNo_136250190484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57558;
     Object term57821;

    public UserData_setCharacterVoiceNo_136250190484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57562 = new Long(-4023935540989049732L);
        term57558 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term57560 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57581 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57591 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57558, term57558.getClass(), "id", -6648383051825562915L);
        setLongField(term57560, term57560.getClass(), "id", -4486155849590836885L);
        setField(term57560, term57560.getClass(), "extId", term57562);
        setField(term57560, term57560.getClass(), "luid", "pktmgYsknu");
        setIntField(term57577, term57577.getClass(), "year", 2012);
        setShortField(term57577, term57577.getClass(), "month", (short) 2);
        setShortField(term57577, term57577.getClass(), "day", (short) 18);
        setField(term57576, term57576.getClass(), "date", term57577);
        setByteField(term57581, term57581.getClass(), "hour", (byte) 4);
        setByteField(term57581, term57581.getClass(), "minute", (byte) 27);
        setByteField(term57581, term57581.getClass(), "second", (byte) 19);
        setIntField(term57581, term57581.getClass(), "nano", 948215601);
        setField(term57576, term57576.getClass(), "time", term57581);
        setField(term57560, term57560.getClass(), "registerTime", term57576);
        setIntField(term57587, term57587.getClass(), "year", 2029);
        setShortField(term57587, term57587.getClass(), "month", (short) 11);
        setShortField(term57587, term57587.getClass(), "day", (short) 23);
        setField(term57586, term57586.getClass(), "date", term57587);
        setByteField(term57591, term57591.getClass(), "hour", (byte) 18);
        setByteField(term57591, term57591.getClass(), "minute", (byte) 47);
        setByteField(term57591, term57591.getClass(), "second", (byte) 36);
        setIntField(term57591, term57591.getClass(), "nano", 43248731);
        setField(term57586, term57586.getClass(), "time", term57591);
        setField(term57560, term57560.getClass(), "accessTime", term57586);
        setField(term57558, term57558.getClass(), "card", term57560);
        setField(term57558, term57558.getClass(), "userName", "SsMHzYNeji");
        setIntField(term57558, term57558.getClass(), "level", 1124496804);
        setIntField(term57558, term57558.getClass(), "reincarnationNum", -792786703);
        setLongField(term57558, term57558.getClass(), "exp", -6012687164779285598L);
        setLongField(term57558, term57558.getClass(), "point", 2233851663671602704L);
        setLongField(term57558, term57558.getClass(), "totalPoint", 6887740911666145680L);
        setIntField(term57558, term57558.getClass(), "playCount", 331010013);
        setIntField(term57558, term57558.getClass(), "jewelCount", 275287586);
        setIntField(term57558, term57558.getClass(), "totalJewelCount", 628507821);
        setIntField(term57558, term57558.getClass(), "medalCount", 247792610);
        setIntField(term57558, term57558.getClass(), "playerRating", -2059652097);
        setIntField(term57558, term57558.getClass(), "highestRating", 75564248);
        setIntField(term57558, term57558.getClass(), "battlePoint", -829801689);
        setIntField(term57558, term57558.getClass(), "bestBattlePoint", 265481386);
        setIntField(term57558, term57558.getClass(), "overDamageBattlePoint", -893720551);
        setBooleanField(term57558, term57558.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term57558, term57558.getClass(), "nameplateId", 696829611);
        setIntField(term57558, term57558.getClass(), "trophyId", 1751983051);
        setIntField(term57558, term57558.getClass(), "cardId", -1416766445);
        setIntField(term57558, term57558.getClass(), "characterId", -203238563);
        setIntField(term57558, term57558.getClass(), "characterVoiceNo", -132358473);
        setIntField(term57558, term57558.getClass(), "tabSetting", 130567867);
        setIntField(term57558, term57558.getClass(), "tabSortSetting", 33782620);
        setIntField(term57558, term57558.getClass(), "cardCategorySetting", -818766632);
        setIntField(term57558, term57558.getClass(), "cardSortSetting", 45627161);
        setIntField(term57558, term57558.getClass(), "rivalScoreCategorySetting", -206817101);
        setIntField(term57558, term57558.getClass(), "playedTutorialBit", 1541533024);
        setIntField(term57558, term57558.getClass(), "firstTutorialCancelNum", -1032828989);
        setLongField(term57558, term57558.getClass(), "sumTechHighScore", -4871907458438465560L);
        setLongField(term57558, term57558.getClass(), "sumTechBasicHighScore", 7748272685716656724L);
        setLongField(term57558, term57558.getClass(), "sumTechAdvancedHighScore", -304168856452232538L);
        setLongField(term57558, term57558.getClass(), "sumTechExpertHighScore", -6655020803769744426L);
        setLongField(term57558, term57558.getClass(), "sumTechMasterHighScore", -6267313683795118791L);
        setLongField(term57558, term57558.getClass(), "sumTechLunaticHighScore", -1963200229998373954L);
        setLongField(term57558, term57558.getClass(), "sumBattleHighScore", 4805489732294700772L);
        setLongField(term57558, term57558.getClass(), "sumBattleBasicHighScore", 619728764207590202L);
        setLongField(term57558, term57558.getClass(), "sumBattleAdvancedHighScore", 7237161792345397933L);
        setLongField(term57558, term57558.getClass(), "sumBattleExpertHighScore", -3847444891371711747L);
        setLongField(term57558, term57558.getClass(), "sumBattleMasterHighScore", 1696001790379760891L);
        setLongField(term57558, term57558.getClass(), "sumBattleLunaticHighScore", -4760671466516104310L);
        setField(term57558, term57558.getClass(), "eventWatchedDate", "wzAFLFdaEQ");
        setField(term57558, term57558.getClass(), "cmEventWatchedDate", "IcbBNUXJqX");
        setField(term57558, term57558.getClass(), "firstGameId", "LONFjqAsUp");
        setField(term57558, term57558.getClass(), "firstRomVersion", "tAhydlbSMf");
        setField(term57558, term57558.getClass(), "firstDataVersion", "wNYtcPFyIe");
        setField(term57558, term57558.getClass(), "firstPlayDate", "tlIqgTUSQw");
        setField(term57558, term57558.getClass(), "lastGameId", "UvweyXjDhG");
        setField(term57558, term57558.getClass(), "lastRomVersion", "wnoVhNwdJy");
        setField(term57558, term57558.getClass(), "lastDataVersion", "uQGMBLrmAj");
        setField(term57558, term57558.getClass(), "compatibleCmVersion", "vNFaheDeBv");
        setField(term57558, term57558.getClass(), "lastPlayDate", "CiPMRxGoHO");
        setIntField(term57558, term57558.getClass(), "lastPlaceId", -649944911);
        setField(term57558, term57558.getClass(), "lastPlaceName", "LauKpKmenw");
        setIntField(term57558, term57558.getClass(), "lastRegionId", -1426067073);
        setField(term57558, term57558.getClass(), "lastRegionName", "TydzbTXvbY");
        setIntField(term57558, term57558.getClass(), "lastAllNetId", -1679645192);
        setField(term57558, term57558.getClass(), "lastClientId", "yNogNNecFu");
        setIntField(term57558, term57558.getClass(), "lastUsedDeckId", 1524285721);
        setIntField(term57558, term57558.getClass(), "lastPlayMusicLevel", -808971480);
        setIntField(term57558, term57558.getClass(), "lastEmoneyBrand", 534508972);
        term57821 = new Integer(-301935716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57821;
        callMethod(klass, "setCharacterVoiceNo", argTypes, term57558, args);
    }

};


