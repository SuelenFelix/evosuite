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

public class UserDeck_equals_71081987513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148002;
     Object term148271;

    public UserDeck_equals_71081987513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148008 = new Long(-1497280900081695731L);
        term148002 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term148004 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term148006 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148027 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148037 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148002, term148002.getClass(), "id", 6963970575086999533L);
        setLongField(term148004, term148004.getClass(), "id", 5105112975336983731L);
        setLongField(term148006, term148006.getClass(), "id", -9186690585381714388L);
        setField(term148006, term148006.getClass(), "extId", term148008);
        setField(term148006, term148006.getClass(), "luid", "eLHzvuaXzN");
        setIntField(term148023, term148023.getClass(), "year", 2022);
        setShortField(term148023, term148023.getClass(), "month", (short) 10);
        setShortField(term148023, term148023.getClass(), "day", (short) 27);
        setField(term148022, term148022.getClass(), "date", term148023);
        setByteField(term148027, term148027.getClass(), "hour", (byte) 11);
        setByteField(term148027, term148027.getClass(), "minute", (byte) 11);
        setByteField(term148027, term148027.getClass(), "second", (byte) 36);
        setIntField(term148027, term148027.getClass(), "nano", 239549048);
        setField(term148022, term148022.getClass(), "time", term148027);
        setField(term148006, term148006.getClass(), "registerTime", term148022);
        setIntField(term148033, term148033.getClass(), "year", 2015);
        setShortField(term148033, term148033.getClass(), "month", (short) 1);
        setShortField(term148033, term148033.getClass(), "day", (short) 22);
        setField(term148032, term148032.getClass(), "date", term148033);
        setByteField(term148037, term148037.getClass(), "hour", (byte) 4);
        setByteField(term148037, term148037.getClass(), "minute", (byte) 37);
        setByteField(term148037, term148037.getClass(), "second", (byte) 36);
        setIntField(term148037, term148037.getClass(), "nano", 685453197);
        setField(term148032, term148032.getClass(), "time", term148037);
        setField(term148006, term148006.getClass(), "accessTime", term148032);
        setField(term148004, term148004.getClass(), "card", term148006);
        setField(term148004, term148004.getClass(), "userName", "uRfUkNdrxy");
        setIntField(term148004, term148004.getClass(), "level", -754991776);
        setIntField(term148004, term148004.getClass(), "reincarnationNum", 252830341);
        setLongField(term148004, term148004.getClass(), "exp", -8943190512725272770L);
        setLongField(term148004, term148004.getClass(), "point", -3096079272204223413L);
        setLongField(term148004, term148004.getClass(), "totalPoint", -8639676041073659624L);
        setIntField(term148004, term148004.getClass(), "playCount", 1540328966);
        setIntField(term148004, term148004.getClass(), "jewelCount", -1473745505);
        setIntField(term148004, term148004.getClass(), "totalJewelCount", -186887389);
        setIntField(term148004, term148004.getClass(), "medalCount", 1862081090);
        setIntField(term148004, term148004.getClass(), "playerRating", -290784129);
        setIntField(term148004, term148004.getClass(), "highestRating", 2007865762);
        setIntField(term148004, term148004.getClass(), "battlePoint", -666918167);
        setIntField(term148004, term148004.getClass(), "bestBattlePoint", 898423021);
        setIntField(term148004, term148004.getClass(), "overDamageBattlePoint", 2126116511);
        setBooleanField(term148004, term148004.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term148004, term148004.getClass(), "nameplateId", -1607033559);
        setIntField(term148004, term148004.getClass(), "trophyId", 606770187);
        setIntField(term148004, term148004.getClass(), "cardId", -2099435269);
        setIntField(term148004, term148004.getClass(), "characterId", -1960948468);
        setIntField(term148004, term148004.getClass(), "characterVoiceNo", 463987540);
        setIntField(term148004, term148004.getClass(), "tabSetting", -1061698279);
        setIntField(term148004, term148004.getClass(), "tabSortSetting", 955556184);
        setIntField(term148004, term148004.getClass(), "cardCategorySetting", -1983502078);
        setIntField(term148004, term148004.getClass(), "cardSortSetting", 1255011076);
        setIntField(term148004, term148004.getClass(), "rivalScoreCategorySetting", -685777121);
        setIntField(term148004, term148004.getClass(), "playedTutorialBit", -1692733101);
        setIntField(term148004, term148004.getClass(), "firstTutorialCancelNum", 502455086);
        setLongField(term148004, term148004.getClass(), "sumTechHighScore", -8654133453167861068L);
        setLongField(term148004, term148004.getClass(), "sumTechBasicHighScore", 1302180142523634814L);
        setLongField(term148004, term148004.getClass(), "sumTechAdvancedHighScore", -6295079778414786639L);
        setLongField(term148004, term148004.getClass(), "sumTechExpertHighScore", 3830756266330425128L);
        setLongField(term148004, term148004.getClass(), "sumTechMasterHighScore", 3477821797047547186L);
        setLongField(term148004, term148004.getClass(), "sumTechLunaticHighScore", 3131988462381690798L);
        setLongField(term148004, term148004.getClass(), "sumBattleHighScore", -1525935246375657779L);
        setLongField(term148004, term148004.getClass(), "sumBattleBasicHighScore", -806485174871630554L);
        setLongField(term148004, term148004.getClass(), "sumBattleAdvancedHighScore", 3706923802053078021L);
        setLongField(term148004, term148004.getClass(), "sumBattleExpertHighScore", 7278370914249794834L);
        setLongField(term148004, term148004.getClass(), "sumBattleMasterHighScore", 9001878848855581390L);
        setLongField(term148004, term148004.getClass(), "sumBattleLunaticHighScore", -2289137554161812615L);
        setField(term148004, term148004.getClass(), "eventWatchedDate", "zjPpxnBoXA");
        setField(term148004, term148004.getClass(), "cmEventWatchedDate", "DmZnQgsFaG");
        setField(term148004, term148004.getClass(), "firstGameId", "FtsrtvMwwt");
        setField(term148004, term148004.getClass(), "firstRomVersion", "CnzmKRmFKz");
        setField(term148004, term148004.getClass(), "firstDataVersion", "mwselRsbwp");
        setField(term148004, term148004.getClass(), "firstPlayDate", "tMCXGgbNrO");
        setField(term148004, term148004.getClass(), "lastGameId", "aXWtFmBWUL");
        setField(term148004, term148004.getClass(), "lastRomVersion", "CYNAzQnEzc");
        setField(term148004, term148004.getClass(), "lastDataVersion", "kwqIRfclWq");
        setField(term148004, term148004.getClass(), "compatibleCmVersion", "KsAdLTNdQU");
        setField(term148004, term148004.getClass(), "lastPlayDate", "pmwKSOyzWR");
        setIntField(term148004, term148004.getClass(), "lastPlaceId", -1126933002);
        setField(term148004, term148004.getClass(), "lastPlaceName", "OcYwcQLlkd");
        setIntField(term148004, term148004.getClass(), "lastRegionId", 1486444842);
        setField(term148004, term148004.getClass(), "lastRegionName", "blXGNdFiqf");
        setIntField(term148004, term148004.getClass(), "lastAllNetId", 2054666202);
        setField(term148004, term148004.getClass(), "lastClientId", "sLUdRliwnh");
        setIntField(term148004, term148004.getClass(), "lastUsedDeckId", 1227044061);
        setIntField(term148004, term148004.getClass(), "lastPlayMusicLevel", -195818221);
        setIntField(term148004, term148004.getClass(), "lastEmoneyBrand", -210604022);
        setField(term148002, term148002.getClass(), "user", term148004);
        setIntField(term148002, term148002.getClass(), "deckId", 1198201318);
        setIntField(term148002, term148002.getClass(), "cardId1", -1343762602);
        setIntField(term148002, term148002.getClass(), "cardId2", -167150075);
        setIntField(term148002, term148002.getClass(), "cardId3", -1368631720);
        term148271 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148271;
        callMethod(klass, "equals", argTypes, term148002, args);
    }

};


