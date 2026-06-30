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

public class UserData_setFirstTutorialCancelNum_46474409291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60533;
     Object term60796;

    public UserData_setFirstTutorialCancelNum_46474409291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60537 = new Long(8034714140377562739L);
        term60533 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term60535 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60566 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60533, term60533.getClass(), "id", 5731856064047201131L);
        setLongField(term60535, term60535.getClass(), "id", 7405337470806099590L);
        setField(term60535, term60535.getClass(), "extId", term60537);
        setField(term60535, term60535.getClass(), "luid", "jELmrpQCNf");
        setIntField(term60552, term60552.getClass(), "year", 2019);
        setShortField(term60552, term60552.getClass(), "month", (short) 12);
        setShortField(term60552, term60552.getClass(), "day", (short) 8);
        setField(term60551, term60551.getClass(), "date", term60552);
        setByteField(term60556, term60556.getClass(), "hour", (byte) 6);
        setByteField(term60556, term60556.getClass(), "minute", (byte) 0);
        setByteField(term60556, term60556.getClass(), "second", (byte) 32);
        setIntField(term60556, term60556.getClass(), "nano", 371231280);
        setField(term60551, term60551.getClass(), "time", term60556);
        setField(term60535, term60535.getClass(), "registerTime", term60551);
        setIntField(term60562, term60562.getClass(), "year", 2024);
        setShortField(term60562, term60562.getClass(), "month", (short) 3);
        setShortField(term60562, term60562.getClass(), "day", (short) 19);
        setField(term60561, term60561.getClass(), "date", term60562);
        setByteField(term60566, term60566.getClass(), "hour", (byte) 16);
        setByteField(term60566, term60566.getClass(), "minute", (byte) 8);
        setByteField(term60566, term60566.getClass(), "second", (byte) 55);
        setIntField(term60566, term60566.getClass(), "nano", 955822950);
        setField(term60561, term60561.getClass(), "time", term60566);
        setField(term60535, term60535.getClass(), "accessTime", term60561);
        setField(term60533, term60533.getClass(), "card", term60535);
        setField(term60533, term60533.getClass(), "userName", "NkjAcBXmmT");
        setIntField(term60533, term60533.getClass(), "level", 9043673);
        setIntField(term60533, term60533.getClass(), "reincarnationNum", 2059842684);
        setLongField(term60533, term60533.getClass(), "exp", 7098365422551787072L);
        setLongField(term60533, term60533.getClass(), "point", 2683449026393099745L);
        setLongField(term60533, term60533.getClass(), "totalPoint", 5966731553888818893L);
        setIntField(term60533, term60533.getClass(), "playCount", 578623316);
        setIntField(term60533, term60533.getClass(), "jewelCount", -676216760);
        setIntField(term60533, term60533.getClass(), "totalJewelCount", 1859109121);
        setIntField(term60533, term60533.getClass(), "medalCount", 1727853532);
        setIntField(term60533, term60533.getClass(), "playerRating", -54706718);
        setIntField(term60533, term60533.getClass(), "highestRating", 461863345);
        setIntField(term60533, term60533.getClass(), "battlePoint", 733174414);
        setIntField(term60533, term60533.getClass(), "bestBattlePoint", -1055100686);
        setIntField(term60533, term60533.getClass(), "overDamageBattlePoint", 1994661826);
        setBooleanField(term60533, term60533.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term60533, term60533.getClass(), "nameplateId", -2050574403);
        setIntField(term60533, term60533.getClass(), "trophyId", 1891840747);
        setIntField(term60533, term60533.getClass(), "cardId", -118389472);
        setIntField(term60533, term60533.getClass(), "characterId", -706486666);
        setIntField(term60533, term60533.getClass(), "characterVoiceNo", 1426550776);
        setIntField(term60533, term60533.getClass(), "tabSetting", 1793694701);
        setIntField(term60533, term60533.getClass(), "tabSortSetting", 1334634518);
        setIntField(term60533, term60533.getClass(), "cardCategorySetting", -1358832342);
        setIntField(term60533, term60533.getClass(), "cardSortSetting", 330525017);
        setIntField(term60533, term60533.getClass(), "rivalScoreCategorySetting", -2097182938);
        setIntField(term60533, term60533.getClass(), "playedTutorialBit", -1911268197);
        setIntField(term60533, term60533.getClass(), "firstTutorialCancelNum", 1989699628);
        setLongField(term60533, term60533.getClass(), "sumTechHighScore", -8607443959885285191L);
        setLongField(term60533, term60533.getClass(), "sumTechBasicHighScore", 5658001480414187301L);
        setLongField(term60533, term60533.getClass(), "sumTechAdvancedHighScore", -3320854059921237888L);
        setLongField(term60533, term60533.getClass(), "sumTechExpertHighScore", 516977411185784220L);
        setLongField(term60533, term60533.getClass(), "sumTechMasterHighScore", -7738436979075632041L);
        setLongField(term60533, term60533.getClass(), "sumTechLunaticHighScore", -2179210404388147539L);
        setLongField(term60533, term60533.getClass(), "sumBattleHighScore", -9023419576773079155L);
        setLongField(term60533, term60533.getClass(), "sumBattleBasicHighScore", -6945410207309729506L);
        setLongField(term60533, term60533.getClass(), "sumBattleAdvancedHighScore", 7325191132338984037L);
        setLongField(term60533, term60533.getClass(), "sumBattleExpertHighScore", -6048008000576751518L);
        setLongField(term60533, term60533.getClass(), "sumBattleMasterHighScore", -2877090978001180900L);
        setLongField(term60533, term60533.getClass(), "sumBattleLunaticHighScore", 3191029552291281213L);
        setField(term60533, term60533.getClass(), "eventWatchedDate", "KgtGJGInhu");
        setField(term60533, term60533.getClass(), "cmEventWatchedDate", "mVHDjrsMAV");
        setField(term60533, term60533.getClass(), "firstGameId", "rjWnqcjYuU");
        setField(term60533, term60533.getClass(), "firstRomVersion", "JhszTkUWCg");
        setField(term60533, term60533.getClass(), "firstDataVersion", "gfNPCeiULY");
        setField(term60533, term60533.getClass(), "firstPlayDate", "aUJLXfcWME");
        setField(term60533, term60533.getClass(), "lastGameId", "ixeIpUaVug");
        setField(term60533, term60533.getClass(), "lastRomVersion", "TELyWFMBJv");
        setField(term60533, term60533.getClass(), "lastDataVersion", "bIqbgRdzpB");
        setField(term60533, term60533.getClass(), "compatibleCmVersion", "FIUbHJmAEj");
        setField(term60533, term60533.getClass(), "lastPlayDate", "mJrFDaDdyY");
        setIntField(term60533, term60533.getClass(), "lastPlaceId", 1406976166);
        setField(term60533, term60533.getClass(), "lastPlaceName", "HqyBQNuLnz");
        setIntField(term60533, term60533.getClass(), "lastRegionId", -683361157);
        setField(term60533, term60533.getClass(), "lastRegionName", "xWkZKbrvmX");
        setIntField(term60533, term60533.getClass(), "lastAllNetId", 1735058829);
        setField(term60533, term60533.getClass(), "lastClientId", "PTEWoxLNqQ");
        setIntField(term60533, term60533.getClass(), "lastUsedDeckId", -1945706596);
        setIntField(term60533, term60533.getClass(), "lastPlayMusicLevel", 13487895);
        setIntField(term60533, term60533.getClass(), "lastEmoneyBrand", 369911284);
        term60796 = new Integer(1488504614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60796;
        callMethod(klass, "setFirstTutorialCancelNum", argTypes, term60533, args);
    }

};


