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

public class UserCard_getCardId_7062102174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112867;

    public UserCard_getCardId_7062102174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112873 = new Long(-7456852906235966771L);
        term112867 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term112869 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term112871 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112892 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112902 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112867, term112867.getClass(), "id", -4044998073854844261L);
        setLongField(term112869, term112869.getClass(), "id", -4377201782345316368L);
        setLongField(term112871, term112871.getClass(), "id", 4591494899495202891L);
        setField(term112871, term112871.getClass(), "extId", term112873);
        setField(term112871, term112871.getClass(), "luid", "mianqYKlGq");
        setIntField(term112888, term112888.getClass(), "year", 2019);
        setShortField(term112888, term112888.getClass(), "month", (short) 8);
        setShortField(term112888, term112888.getClass(), "day", (short) 6);
        setField(term112887, term112887.getClass(), "date", term112888);
        setByteField(term112892, term112892.getClass(), "hour", (byte) 19);
        setByteField(term112892, term112892.getClass(), "minute", (byte) 30);
        setByteField(term112892, term112892.getClass(), "second", (byte) 36);
        setIntField(term112892, term112892.getClass(), "nano", 118147558);
        setField(term112887, term112887.getClass(), "time", term112892);
        setField(term112871, term112871.getClass(), "registerTime", term112887);
        setIntField(term112898, term112898.getClass(), "year", 2010);
        setShortField(term112898, term112898.getClass(), "month", (short) 11);
        setShortField(term112898, term112898.getClass(), "day", (short) 17);
        setField(term112897, term112897.getClass(), "date", term112898);
        setByteField(term112902, term112902.getClass(), "hour", (byte) 7);
        setByteField(term112902, term112902.getClass(), "minute", (byte) 36);
        setByteField(term112902, term112902.getClass(), "second", (byte) 53);
        setIntField(term112902, term112902.getClass(), "nano", 316643445);
        setField(term112897, term112897.getClass(), "time", term112902);
        setField(term112871, term112871.getClass(), "accessTime", term112897);
        setField(term112869, term112869.getClass(), "card", term112871);
        setField(term112869, term112869.getClass(), "userName", "GmpbCvsoQd");
        setIntField(term112869, term112869.getClass(), "level", -2104858494);
        setIntField(term112869, term112869.getClass(), "reincarnationNum", 1665727494);
        setLongField(term112869, term112869.getClass(), "exp", 9004339418221265333L);
        setLongField(term112869, term112869.getClass(), "point", -4921777329679620402L);
        setLongField(term112869, term112869.getClass(), "totalPoint", -1932971718994425216L);
        setIntField(term112869, term112869.getClass(), "playCount", 487781899);
        setIntField(term112869, term112869.getClass(), "jewelCount", 322622063);
        setIntField(term112869, term112869.getClass(), "totalJewelCount", -1768300641);
        setIntField(term112869, term112869.getClass(), "medalCount", 996684751);
        setIntField(term112869, term112869.getClass(), "playerRating", 1947256067);
        setIntField(term112869, term112869.getClass(), "highestRating", -2111706143);
        setIntField(term112869, term112869.getClass(), "battlePoint", 1147638144);
        setIntField(term112869, term112869.getClass(), "bestBattlePoint", 1513541114);
        setIntField(term112869, term112869.getClass(), "overDamageBattlePoint", 558747577);
        setBooleanField(term112869, term112869.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term112869, term112869.getClass(), "nameplateId", 532432884);
        setIntField(term112869, term112869.getClass(), "trophyId", 177236415);
        setIntField(term112869, term112869.getClass(), "cardId", -2132027119);
        setIntField(term112869, term112869.getClass(), "characterId", -2101727195);
        setIntField(term112869, term112869.getClass(), "characterVoiceNo", 2111423493);
        setIntField(term112869, term112869.getClass(), "tabSetting", -1312934868);
        setIntField(term112869, term112869.getClass(), "tabSortSetting", 603212671);
        setIntField(term112869, term112869.getClass(), "cardCategorySetting", 751318072);
        setIntField(term112869, term112869.getClass(), "cardSortSetting", 1804409580);
        setIntField(term112869, term112869.getClass(), "rivalScoreCategorySetting", -1690181848);
        setIntField(term112869, term112869.getClass(), "playedTutorialBit", 2007546193);
        setIntField(term112869, term112869.getClass(), "firstTutorialCancelNum", 499702355);
        setLongField(term112869, term112869.getClass(), "sumTechHighScore", -260757668007520022L);
        setLongField(term112869, term112869.getClass(), "sumTechBasicHighScore", 4569566508553805491L);
        setLongField(term112869, term112869.getClass(), "sumTechAdvancedHighScore", 6042583076327712792L);
        setLongField(term112869, term112869.getClass(), "sumTechExpertHighScore", 1345696300989096828L);
        setLongField(term112869, term112869.getClass(), "sumTechMasterHighScore", 6610524700334315331L);
        setLongField(term112869, term112869.getClass(), "sumTechLunaticHighScore", 8379508227335651638L);
        setLongField(term112869, term112869.getClass(), "sumBattleHighScore", -778268704984627761L);
        setLongField(term112869, term112869.getClass(), "sumBattleBasicHighScore", 2186745825304330256L);
        setLongField(term112869, term112869.getClass(), "sumBattleAdvancedHighScore", 8001753816112731868L);
        setLongField(term112869, term112869.getClass(), "sumBattleExpertHighScore", -7840155942784857364L);
        setLongField(term112869, term112869.getClass(), "sumBattleMasterHighScore", -6818389405863606069L);
        setLongField(term112869, term112869.getClass(), "sumBattleLunaticHighScore", 2939885095630797961L);
        setField(term112869, term112869.getClass(), "eventWatchedDate", "ypYkYRcFQq");
        setField(term112869, term112869.getClass(), "cmEventWatchedDate", "lXLLmOVwcF");
        setField(term112869, term112869.getClass(), "firstGameId", "lIrBbPBrDY");
        setField(term112869, term112869.getClass(), "firstRomVersion", "RDqKYQTmEE");
        setField(term112869, term112869.getClass(), "firstDataVersion", "MrUUMyYAHK");
        setField(term112869, term112869.getClass(), "firstPlayDate", "mltJfFDGWB");
        setField(term112869, term112869.getClass(), "lastGameId", "jXearfyNpX");
        setField(term112869, term112869.getClass(), "lastRomVersion", "BhmFDzFKBZ");
        setField(term112869, term112869.getClass(), "lastDataVersion", "LfhJOBaMfN");
        setField(term112869, term112869.getClass(), "compatibleCmVersion", "gTpNrKjAOw");
        setField(term112869, term112869.getClass(), "lastPlayDate", "mezvZVqRCp");
        setIntField(term112869, term112869.getClass(), "lastPlaceId", 1045240417);
        setField(term112869, term112869.getClass(), "lastPlaceName", "bZOShgQvtT");
        setIntField(term112869, term112869.getClass(), "lastRegionId", -1436610766);
        setField(term112869, term112869.getClass(), "lastRegionName", "SrodJwobhd");
        setIntField(term112869, term112869.getClass(), "lastAllNetId", 276963904);
        setField(term112869, term112869.getClass(), "lastClientId", "aEKxCMZaAl");
        setIntField(term112869, term112869.getClass(), "lastUsedDeckId", -919658244);
        setIntField(term112869, term112869.getClass(), "lastPlayMusicLevel", -1456911717);
        setIntField(term112869, term112869.getClass(), "lastEmoneyBrand", -142288958);
        setField(term112867, term112867.getClass(), "user", term112869);
        setIntField(term112867, term112867.getClass(), "cardId", -1);
        setIntField(term112867, term112867.getClass(), "digitalStock", 1);
        setIntField(term112867, term112867.getClass(), "analogStock", 1673468911);
        setIntField(term112867, term112867.getClass(), "level", 814489039);
        setIntField(term112867, term112867.getClass(), "maxLevel", 10);
        setIntField(term112867, term112867.getClass(), "exp", -1649480647);
        setIntField(term112867, term112867.getClass(), "printCount", 337161557);
        setIntField(term112867, term112867.getClass(), "useCount", 2092620912);
        setBooleanField(term112867, term112867.getClass(), "isNew", true);
        setField(term112867, term112867.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term112867, term112867.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term112867, term112867.getClass(), "skillId", 1992363953);
        setBooleanField(term112867, term112867.getClass(), "isAcquired", true);
        setField(term112867, term112867.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term112867, args);
    }

};


