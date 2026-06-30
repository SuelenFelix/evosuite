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

public class UserTrainingRoom_setAuthKey_17932315619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17551;

    public UserTrainingRoom_setAuthKey_17932315619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17557 = new Long(4178434741742309755L);
        term17551 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term17553 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term17555 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17586 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17551, term17551.getClass(), "id", 7594342965038171122L);
        setLongField(term17553, term17553.getClass(), "id", -4475453924678388077L);
        setLongField(term17555, term17555.getClass(), "id", 3831842879355381917L);
        setField(term17555, term17555.getClass(), "extId", term17557);
        setField(term17555, term17555.getClass(), "luid", "IiNCZfdouL");
        setIntField(term17572, term17572.getClass(), "year", 2011);
        setShortField(term17572, term17572.getClass(), "month", (short) 4);
        setShortField(term17572, term17572.getClass(), "day", (short) 19);
        setField(term17571, term17571.getClass(), "date", term17572);
        setByteField(term17576, term17576.getClass(), "hour", (byte) 12);
        setByteField(term17576, term17576.getClass(), "minute", (byte) 0);
        setByteField(term17576, term17576.getClass(), "second", (byte) 14);
        setIntField(term17576, term17576.getClass(), "nano", 849079063);
        setField(term17571, term17571.getClass(), "time", term17576);
        setField(term17555, term17555.getClass(), "registerTime", term17571);
        setIntField(term17582, term17582.getClass(), "year", 2014);
        setShortField(term17582, term17582.getClass(), "month", (short) 8);
        setShortField(term17582, term17582.getClass(), "day", (short) 17);
        setField(term17581, term17581.getClass(), "date", term17582);
        setByteField(term17586, term17586.getClass(), "hour", (byte) 19);
        setByteField(term17586, term17586.getClass(), "minute", (byte) 32);
        setByteField(term17586, term17586.getClass(), "second", (byte) 5);
        setIntField(term17586, term17586.getClass(), "nano", 604713831);
        setField(term17581, term17581.getClass(), "time", term17586);
        setField(term17555, term17555.getClass(), "accessTime", term17581);
        setField(term17553, term17553.getClass(), "card", term17555);
        setField(term17553, term17553.getClass(), "userName", "AhOHzCsHKW");
        setIntField(term17553, term17553.getClass(), "level", 2108571355);
        setIntField(term17553, term17553.getClass(), "reincarnationNum", 1909966089);
        setLongField(term17553, term17553.getClass(), "exp", -2196447813514870436L);
        setLongField(term17553, term17553.getClass(), "point", 2984955721798941743L);
        setLongField(term17553, term17553.getClass(), "totalPoint", 7495572757420909707L);
        setIntField(term17553, term17553.getClass(), "playCount", 1827255916);
        setIntField(term17553, term17553.getClass(), "jewelCount", 2039815750);
        setIntField(term17553, term17553.getClass(), "totalJewelCount", 2079590265);
        setIntField(term17553, term17553.getClass(), "medalCount", -435079567);
        setIntField(term17553, term17553.getClass(), "playerRating", -1017617829);
        setIntField(term17553, term17553.getClass(), "highestRating", 270928865);
        setIntField(term17553, term17553.getClass(), "battlePoint", -308526089);
        setIntField(term17553, term17553.getClass(), "bestBattlePoint", -359675864);
        setIntField(term17553, term17553.getClass(), "overDamageBattlePoint", -1671982964);
        setBooleanField(term17553, term17553.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term17553, term17553.getClass(), "nameplateId", 776218451);
        setIntField(term17553, term17553.getClass(), "trophyId", -1362132929);
        setIntField(term17553, term17553.getClass(), "cardId", 1267740164);
        setIntField(term17553, term17553.getClass(), "characterId", 1363887997);
        setIntField(term17553, term17553.getClass(), "characterVoiceNo", -1744763945);
        setIntField(term17553, term17553.getClass(), "tabSetting", 852281447);
        setIntField(term17553, term17553.getClass(), "tabSortSetting", 1248430530);
        setIntField(term17553, term17553.getClass(), "cardCategorySetting", -1911828505);
        setIntField(term17553, term17553.getClass(), "cardSortSetting", 241725499);
        setIntField(term17553, term17553.getClass(), "rivalScoreCategorySetting", 823179298);
        setIntField(term17553, term17553.getClass(), "playedTutorialBit", 1174484848);
        setIntField(term17553, term17553.getClass(), "firstTutorialCancelNum", 939889496);
        setLongField(term17553, term17553.getClass(), "sumTechHighScore", -1237494311441603673L);
        setLongField(term17553, term17553.getClass(), "sumTechBasicHighScore", 3550928874058758597L);
        setLongField(term17553, term17553.getClass(), "sumTechAdvancedHighScore", 987797117310260031L);
        setLongField(term17553, term17553.getClass(), "sumTechExpertHighScore", -4703513086610650698L);
        setLongField(term17553, term17553.getClass(), "sumTechMasterHighScore", -8123300791906968552L);
        setLongField(term17553, term17553.getClass(), "sumTechLunaticHighScore", 7654605795400256601L);
        setLongField(term17553, term17553.getClass(), "sumBattleHighScore", 3610800451815944213L);
        setLongField(term17553, term17553.getClass(), "sumBattleBasicHighScore", -3548672426577893003L);
        setLongField(term17553, term17553.getClass(), "sumBattleAdvancedHighScore", 1592020674405941254L);
        setLongField(term17553, term17553.getClass(), "sumBattleExpertHighScore", 4098407345651793258L);
        setLongField(term17553, term17553.getClass(), "sumBattleMasterHighScore", 3128610259359668233L);
        setLongField(term17553, term17553.getClass(), "sumBattleLunaticHighScore", -7966859634511305171L);
        setField(term17553, term17553.getClass(), "eventWatchedDate", "UqgLPaaAHi");
        setField(term17553, term17553.getClass(), "cmEventWatchedDate", "xypryEkUPF");
        setField(term17553, term17553.getClass(), "firstGameId", "zyZTzHNjQr");
        setField(term17553, term17553.getClass(), "firstRomVersion", "YSrFKQQwXE");
        setField(term17553, term17553.getClass(), "firstDataVersion", "qxhOsmyyjm");
        setField(term17553, term17553.getClass(), "firstPlayDate", "DuKcNfVVYR");
        setField(term17553, term17553.getClass(), "lastGameId", "fRujHWvXjJ");
        setField(term17553, term17553.getClass(), "lastRomVersion", "EAIAAStlTz");
        setField(term17553, term17553.getClass(), "lastDataVersion", "yIWXcOQTgy");
        setField(term17553, term17553.getClass(), "compatibleCmVersion", "xAWekqanqc");
        setField(term17553, term17553.getClass(), "lastPlayDate", "GSOWFHMlbF");
        setIntField(term17553, term17553.getClass(), "lastPlaceId", -495242269);
        setField(term17553, term17553.getClass(), "lastPlaceName", "vpZIqpFbKM");
        setIntField(term17553, term17553.getClass(), "lastRegionId", 932810106);
        setField(term17553, term17553.getClass(), "lastRegionName", "dAbwpJCDif");
        setIntField(term17553, term17553.getClass(), "lastAllNetId", -2138801137);
        setField(term17553, term17553.getClass(), "lastClientId", "ATSXJPySio");
        setIntField(term17553, term17553.getClass(), "lastUsedDeckId", -1470115841);
        setIntField(term17553, term17553.getClass(), "lastPlayMusicLevel", 480909331);
        setIntField(term17553, term17553.getClass(), "lastEmoneyBrand", -2024983877);
        setField(term17551, term17551.getClass(), "user", term17553);
        setField(term17551, term17551.getClass(), "authKey", "XZkOUcbfFg");
        setIntField(term17551, term17551.getClass(), "roomId", 1757149811);
        setIntField(term17551, term17551.getClass(), "cardId", 1505375686);
        setField(term17551, term17551.getClass(), "valueDate", "TGiJfagfky");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BJklinBmhN";
        callMethod(klass, "setAuthKey", argTypes, term17551, args);
    }

};


