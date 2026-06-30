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

public class UserData_setBestBattlePoint_66262522677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54583;
     Object term54846;

    public UserData_setBestBattlePoint_66262522677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54587 = new Long(-1214968196781083707L);
        term54583 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term54585 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54616 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54583, term54583.getClass(), "id", -1045336622757351064L);
        setLongField(term54585, term54585.getClass(), "id", -736341939344099077L);
        setField(term54585, term54585.getClass(), "extId", term54587);
        setField(term54585, term54585.getClass(), "luid", "yZDlWLIKEp");
        setIntField(term54602, term54602.getClass(), "year", 2020);
        setShortField(term54602, term54602.getClass(), "month", (short) 10);
        setShortField(term54602, term54602.getClass(), "day", (short) 2);
        setField(term54601, term54601.getClass(), "date", term54602);
        setByteField(term54606, term54606.getClass(), "hour", (byte) 1);
        setByteField(term54606, term54606.getClass(), "minute", (byte) 41);
        setByteField(term54606, term54606.getClass(), "second", (byte) 48);
        setIntField(term54606, term54606.getClass(), "nano", 834720747);
        setField(term54601, term54601.getClass(), "time", term54606);
        setField(term54585, term54585.getClass(), "registerTime", term54601);
        setIntField(term54612, term54612.getClass(), "year", 2022);
        setShortField(term54612, term54612.getClass(), "month", (short) 3);
        setShortField(term54612, term54612.getClass(), "day", (short) 31);
        setField(term54611, term54611.getClass(), "date", term54612);
        setByteField(term54616, term54616.getClass(), "hour", (byte) 3);
        setByteField(term54616, term54616.getClass(), "minute", (byte) 43);
        setByteField(term54616, term54616.getClass(), "second", (byte) 28);
        setIntField(term54616, term54616.getClass(), "nano", 772790770);
        setField(term54611, term54611.getClass(), "time", term54616);
        setField(term54585, term54585.getClass(), "accessTime", term54611);
        setField(term54583, term54583.getClass(), "card", term54585);
        setField(term54583, term54583.getClass(), "userName", "dAEiXUxDrI");
        setIntField(term54583, term54583.getClass(), "level", 1760654275);
        setIntField(term54583, term54583.getClass(), "reincarnationNum", -1048247843);
        setLongField(term54583, term54583.getClass(), "exp", -2070593800297942364L);
        setLongField(term54583, term54583.getClass(), "point", -7023621481714478007L);
        setLongField(term54583, term54583.getClass(), "totalPoint", 4942278370983962653L);
        setIntField(term54583, term54583.getClass(), "playCount", -545135207);
        setIntField(term54583, term54583.getClass(), "jewelCount", 969786656);
        setIntField(term54583, term54583.getClass(), "totalJewelCount", -1568320050);
        setIntField(term54583, term54583.getClass(), "medalCount", 398869857);
        setIntField(term54583, term54583.getClass(), "playerRating", -2011847985);
        setIntField(term54583, term54583.getClass(), "highestRating", 1113480119);
        setIntField(term54583, term54583.getClass(), "battlePoint", -159235116);
        setIntField(term54583, term54583.getClass(), "bestBattlePoint", 1280384723);
        setIntField(term54583, term54583.getClass(), "overDamageBattlePoint", 1755299610);
        setBooleanField(term54583, term54583.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term54583, term54583.getClass(), "nameplateId", 1141997389);
        setIntField(term54583, term54583.getClass(), "trophyId", -1491507262);
        setIntField(term54583, term54583.getClass(), "cardId", 1071463645);
        setIntField(term54583, term54583.getClass(), "characterId", 165616136);
        setIntField(term54583, term54583.getClass(), "characterVoiceNo", 887351836);
        setIntField(term54583, term54583.getClass(), "tabSetting", 2002612399);
        setIntField(term54583, term54583.getClass(), "tabSortSetting", -1256668289);
        setIntField(term54583, term54583.getClass(), "cardCategorySetting", -1377964851);
        setIntField(term54583, term54583.getClass(), "cardSortSetting", -1288314969);
        setIntField(term54583, term54583.getClass(), "rivalScoreCategorySetting", -1625206430);
        setIntField(term54583, term54583.getClass(), "playedTutorialBit", 1599734340);
        setIntField(term54583, term54583.getClass(), "firstTutorialCancelNum", 1262425699);
        setLongField(term54583, term54583.getClass(), "sumTechHighScore", 4497530590028813461L);
        setLongField(term54583, term54583.getClass(), "sumTechBasicHighScore", -3027046249023055574L);
        setLongField(term54583, term54583.getClass(), "sumTechAdvancedHighScore", 2253264840516591315L);
        setLongField(term54583, term54583.getClass(), "sumTechExpertHighScore", 7357901219511867751L);
        setLongField(term54583, term54583.getClass(), "sumTechMasterHighScore", -5944574827460812990L);
        setLongField(term54583, term54583.getClass(), "sumTechLunaticHighScore", -7455884456909857061L);
        setLongField(term54583, term54583.getClass(), "sumBattleHighScore", 505687838503487032L);
        setLongField(term54583, term54583.getClass(), "sumBattleBasicHighScore", -6352136697288518051L);
        setLongField(term54583, term54583.getClass(), "sumBattleAdvancedHighScore", -5146908173679489755L);
        setLongField(term54583, term54583.getClass(), "sumBattleExpertHighScore", 2722397189272361522L);
        setLongField(term54583, term54583.getClass(), "sumBattleMasterHighScore", 410377497345443793L);
        setLongField(term54583, term54583.getClass(), "sumBattleLunaticHighScore", 3905078592631516923L);
        setField(term54583, term54583.getClass(), "eventWatchedDate", "AgQWngzXPH");
        setField(term54583, term54583.getClass(), "cmEventWatchedDate", "EZJmAIzdHM");
        setField(term54583, term54583.getClass(), "firstGameId", "LAOkeXXkDr");
        setField(term54583, term54583.getClass(), "firstRomVersion", "YkZqFgrgVM");
        setField(term54583, term54583.getClass(), "firstDataVersion", "QEJBgSNviH");
        setField(term54583, term54583.getClass(), "firstPlayDate", "bjigisSVNp");
        setField(term54583, term54583.getClass(), "lastGameId", "yJCCaWqQuK");
        setField(term54583, term54583.getClass(), "lastRomVersion", "tgBNqkdndl");
        setField(term54583, term54583.getClass(), "lastDataVersion", "GXKhRJLVFZ");
        setField(term54583, term54583.getClass(), "compatibleCmVersion", "qDflhZTJjR");
        setField(term54583, term54583.getClass(), "lastPlayDate", "bzQSjpIauE");
        setIntField(term54583, term54583.getClass(), "lastPlaceId", -515051505);
        setField(term54583, term54583.getClass(), "lastPlaceName", "ESQqarFUtp");
        setIntField(term54583, term54583.getClass(), "lastRegionId", -1071258857);
        setField(term54583, term54583.getClass(), "lastRegionName", "TiCRQbKtcf");
        setIntField(term54583, term54583.getClass(), "lastAllNetId", 1274665398);
        setField(term54583, term54583.getClass(), "lastClientId", "shGEZulpDG");
        setIntField(term54583, term54583.getClass(), "lastUsedDeckId", -1093564935);
        setIntField(term54583, term54583.getClass(), "lastPlayMusicLevel", -1092739931);
        setIntField(term54583, term54583.getClass(), "lastEmoneyBrand", 859336834);
        term54846 = new Integer(-924154861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54846;
        callMethod(klass, "setBestBattlePoint", argTypes, term54583, args);
    }

};


