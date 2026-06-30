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

public class UserData_setFirstDataVersion_1366386047108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67838;

    public UserData_setFirstDataVersion_1366386047108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67842 = new Long(-1539859611880912454L);
        term67838 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term67840 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67871 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67838, term67838.getClass(), "id", -4079309837554264946L);
        setLongField(term67840, term67840.getClass(), "id", -3282485254549275185L);
        setField(term67840, term67840.getClass(), "extId", term67842);
        setField(term67840, term67840.getClass(), "luid", "CQMdMBIICe");
        setIntField(term67857, term67857.getClass(), "year", 2021);
        setShortField(term67857, term67857.getClass(), "month", (short) 2);
        setShortField(term67857, term67857.getClass(), "day", (short) 21);
        setField(term67856, term67856.getClass(), "date", term67857);
        setByteField(term67861, term67861.getClass(), "hour", (byte) 4);
        setByteField(term67861, term67861.getClass(), "minute", (byte) 22);
        setByteField(term67861, term67861.getClass(), "second", (byte) 2);
        setIntField(term67861, term67861.getClass(), "nano", 752727543);
        setField(term67856, term67856.getClass(), "time", term67861);
        setField(term67840, term67840.getClass(), "registerTime", term67856);
        setIntField(term67867, term67867.getClass(), "year", 2017);
        setShortField(term67867, term67867.getClass(), "month", (short) 8);
        setShortField(term67867, term67867.getClass(), "day", (short) 30);
        setField(term67866, term67866.getClass(), "date", term67867);
        setByteField(term67871, term67871.getClass(), "hour", (byte) 3);
        setByteField(term67871, term67871.getClass(), "minute", (byte) 48);
        setByteField(term67871, term67871.getClass(), "second", (byte) 37);
        setIntField(term67871, term67871.getClass(), "nano", 121640121);
        setField(term67866, term67866.getClass(), "time", term67871);
        setField(term67840, term67840.getClass(), "accessTime", term67866);
        setField(term67838, term67838.getClass(), "card", term67840);
        setField(term67838, term67838.getClass(), "userName", "rbJaIkrSnM");
        setIntField(term67838, term67838.getClass(), "level", -1044514554);
        setIntField(term67838, term67838.getClass(), "reincarnationNum", 35189099);
        setLongField(term67838, term67838.getClass(), "exp", 1359306275461301169L);
        setLongField(term67838, term67838.getClass(), "point", -5217551292483969913L);
        setLongField(term67838, term67838.getClass(), "totalPoint", 3440455167808262818L);
        setIntField(term67838, term67838.getClass(), "playCount", -1399937823);
        setIntField(term67838, term67838.getClass(), "jewelCount", 1439151010);
        setIntField(term67838, term67838.getClass(), "totalJewelCount", 520109121);
        setIntField(term67838, term67838.getClass(), "medalCount", -1374704112);
        setIntField(term67838, term67838.getClass(), "playerRating", 1603677150);
        setIntField(term67838, term67838.getClass(), "highestRating", -926340720);
        setIntField(term67838, term67838.getClass(), "battlePoint", -1134329349);
        setIntField(term67838, term67838.getClass(), "bestBattlePoint", -1590495256);
        setIntField(term67838, term67838.getClass(), "overDamageBattlePoint", 1804035317);
        setBooleanField(term67838, term67838.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term67838, term67838.getClass(), "nameplateId", -1627336108);
        setIntField(term67838, term67838.getClass(), "trophyId", -70819831);
        setIntField(term67838, term67838.getClass(), "cardId", 1601014438);
        setIntField(term67838, term67838.getClass(), "characterId", -1549492777);
        setIntField(term67838, term67838.getClass(), "characterVoiceNo", -1166523434);
        setIntField(term67838, term67838.getClass(), "tabSetting", -1459222679);
        setIntField(term67838, term67838.getClass(), "tabSortSetting", 91387193);
        setIntField(term67838, term67838.getClass(), "cardCategorySetting", -457093173);
        setIntField(term67838, term67838.getClass(), "cardSortSetting", -738503746);
        setIntField(term67838, term67838.getClass(), "rivalScoreCategorySetting", 1118865267);
        setIntField(term67838, term67838.getClass(), "playedTutorialBit", 1899392740);
        setIntField(term67838, term67838.getClass(), "firstTutorialCancelNum", 144291847);
        setLongField(term67838, term67838.getClass(), "sumTechHighScore", -4517489106829707868L);
        setLongField(term67838, term67838.getClass(), "sumTechBasicHighScore", 3134763618587864799L);
        setLongField(term67838, term67838.getClass(), "sumTechAdvancedHighScore", 2315991740687437411L);
        setLongField(term67838, term67838.getClass(), "sumTechExpertHighScore", 8871323174678446760L);
        setLongField(term67838, term67838.getClass(), "sumTechMasterHighScore", 3223972915053331194L);
        setLongField(term67838, term67838.getClass(), "sumTechLunaticHighScore", 2718592162673693959L);
        setLongField(term67838, term67838.getClass(), "sumBattleHighScore", -5221197842613792699L);
        setLongField(term67838, term67838.getClass(), "sumBattleBasicHighScore", 8797226144896755216L);
        setLongField(term67838, term67838.getClass(), "sumBattleAdvancedHighScore", -4524622074523380827L);
        setLongField(term67838, term67838.getClass(), "sumBattleExpertHighScore", 3094101285402200938L);
        setLongField(term67838, term67838.getClass(), "sumBattleMasterHighScore", -1691547788317547227L);
        setLongField(term67838, term67838.getClass(), "sumBattleLunaticHighScore", 5409837706558296333L);
        setField(term67838, term67838.getClass(), "eventWatchedDate", "EAKcPFEKbX");
        setField(term67838, term67838.getClass(), "cmEventWatchedDate", "uPdAMNFhdG");
        setField(term67838, term67838.getClass(), "firstGameId", "VjXPlvOnMK");
        setField(term67838, term67838.getClass(), "firstRomVersion", "VVfwcKWfYk");
        setField(term67838, term67838.getClass(), "firstDataVersion", "tsYXZxQtLG");
        setField(term67838, term67838.getClass(), "firstPlayDate", "JUAWRJdehl");
        setField(term67838, term67838.getClass(), "lastGameId", "fFslDwqqzQ");
        setField(term67838, term67838.getClass(), "lastRomVersion", "oyTybTkTFd");
        setField(term67838, term67838.getClass(), "lastDataVersion", "NNjMZLPIcc");
        setField(term67838, term67838.getClass(), "compatibleCmVersion", "fAcvTHLHOa");
        setField(term67838, term67838.getClass(), "lastPlayDate", "QavvcNVesW");
        setIntField(term67838, term67838.getClass(), "lastPlaceId", 263154490);
        setField(term67838, term67838.getClass(), "lastPlaceName", "JmFxhkDeIA");
        setIntField(term67838, term67838.getClass(), "lastRegionId", 1685033038);
        setField(term67838, term67838.getClass(), "lastRegionName", "XcJqDBnnMZ");
        setIntField(term67838, term67838.getClass(), "lastAllNetId", 1455872685);
        setField(term67838, term67838.getClass(), "lastClientId", "SchXFoqYFy");
        setIntField(term67838, term67838.getClass(), "lastUsedDeckId", -895803070);
        setIntField(term67838, term67838.getClass(), "lastPlayMusicLevel", -2065313027);
        setIntField(term67838, term67838.getClass(), "lastEmoneyBrand", 394881188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MnHKbTZBTr";
        callMethod(klass, "setFirstDataVersion", argTypes, term67838, args);
    }

};


