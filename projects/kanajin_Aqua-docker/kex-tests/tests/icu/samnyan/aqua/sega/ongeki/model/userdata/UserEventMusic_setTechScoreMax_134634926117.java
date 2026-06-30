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

public class UserEventMusic_setTechScoreMax_134634926117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377175;
     Object term377459;

    public UserEventMusic_setTechScoreMax_134634926117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term377181 = new Long(-3548672426577893003L);
        term377175 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term377177 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term377179 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term377195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term377205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377210 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term377175, term377175.getClass(), "id", 6133928852375985046L);
        setLongField(term377177, term377177.getClass(), "id", -7736609182984112796L);
        setLongField(term377179, term377179.getClass(), "id", 6109938066068365841L);
        setField(term377179, term377179.getClass(), "extId", term377181);
        setField(term377179, term377179.getClass(), "luid", "lIgDfcPIZF");
        setIntField(term377196, term377196.getClass(), "year", 2016);
        setShortField(term377196, term377196.getClass(), "month", (short) 8);
        setShortField(term377196, term377196.getClass(), "day", (short) 19);
        setField(term377195, term377195.getClass(), "date", term377196);
        setByteField(term377200, term377200.getClass(), "hour", (byte) 4);
        setByteField(term377200, term377200.getClass(), "minute", (byte) 17);
        setByteField(term377200, term377200.getClass(), "second", (byte) 57);
        setIntField(term377200, term377200.getClass(), "nano", 599218097);
        setField(term377195, term377195.getClass(), "time", term377200);
        setField(term377179, term377179.getClass(), "registerTime", term377195);
        setIntField(term377206, term377206.getClass(), "year", 2027);
        setShortField(term377206, term377206.getClass(), "month", (short) 9);
        setShortField(term377206, term377206.getClass(), "day", (short) 12);
        setField(term377205, term377205.getClass(), "date", term377206);
        setByteField(term377210, term377210.getClass(), "hour", (byte) 18);
        setByteField(term377210, term377210.getClass(), "minute", (byte) 3);
        setByteField(term377210, term377210.getClass(), "second", (byte) 54);
        setIntField(term377210, term377210.getClass(), "nano", 211973594);
        setField(term377205, term377205.getClass(), "time", term377210);
        setField(term377179, term377179.getClass(), "accessTime", term377205);
        setField(term377177, term377177.getClass(), "card", term377179);
        setField(term377177, term377177.getClass(), "userName", "AFRqPQlDTP");
        setIntField(term377177, term377177.getClass(), "level", 1599642541);
        setIntField(term377177, term377177.getClass(), "reincarnationNum", 1527140540);
        setLongField(term377177, term377177.getClass(), "exp", 3031096947813434695L);
        setLongField(term377177, term377177.getClass(), "point", -7147074133211717034L);
        setLongField(term377177, term377177.getClass(), "totalPoint", 4414070736582070441L);
        setIntField(term377177, term377177.getClass(), "playCount", 1281498934);
        setIntField(term377177, term377177.getClass(), "jewelCount", -1647895473);
        setIntField(term377177, term377177.getClass(), "totalJewelCount", -946991446);
        setIntField(term377177, term377177.getClass(), "medalCount", -44488611);
        setIntField(term377177, term377177.getClass(), "playerRating", -2062219039);
        setIntField(term377177, term377177.getClass(), "highestRating", 1469822295);
        setIntField(term377177, term377177.getClass(), "battlePoint", 1356389947);
        setIntField(term377177, term377177.getClass(), "bestBattlePoint", -1673719872);
        setIntField(term377177, term377177.getClass(), "overDamageBattlePoint", 270758496);
        setBooleanField(term377177, term377177.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term377177, term377177.getClass(), "nameplateId", 1100853803);
        setIntField(term377177, term377177.getClass(), "trophyId", 1622073269);
        setIntField(term377177, term377177.getClass(), "cardId", 197721921);
        setIntField(term377177, term377177.getClass(), "characterId", 2133499920);
        setIntField(term377177, term377177.getClass(), "characterVoiceNo", 1352271050);
        setIntField(term377177, term377177.getClass(), "tabSetting", 1025260913);
        setIntField(term377177, term377177.getClass(), "tabSortSetting", -1129732398);
        setIntField(term377177, term377177.getClass(), "cardCategorySetting", 1551564487);
        setIntField(term377177, term377177.getClass(), "cardSortSetting", 155830867);
        setIntField(term377177, term377177.getClass(), "rivalScoreCategorySetting", -1682606072);
        setIntField(term377177, term377177.getClass(), "playedTutorialBit", 976267550);
        setIntField(term377177, term377177.getClass(), "firstTutorialCancelNum", 1139190313);
        setLongField(term377177, term377177.getClass(), "sumTechHighScore", 8426003842884357203L);
        setLongField(term377177, term377177.getClass(), "sumTechBasicHighScore", -5686069824472009834L);
        setLongField(term377177, term377177.getClass(), "sumTechAdvancedHighScore", 8922579962951250056L);
        setLongField(term377177, term377177.getClass(), "sumTechExpertHighScore", 4212642222579828287L);
        setLongField(term377177, term377177.getClass(), "sumTechMasterHighScore", -541671776001881294L);
        setLongField(term377177, term377177.getClass(), "sumTechLunaticHighScore", -6059476337408616780L);
        setLongField(term377177, term377177.getClass(), "sumBattleHighScore", 7884575343057051051L);
        setLongField(term377177, term377177.getClass(), "sumBattleBasicHighScore", 1223728664705448690L);
        setLongField(term377177, term377177.getClass(), "sumBattleAdvancedHighScore", -7062257737211643376L);
        setLongField(term377177, term377177.getClass(), "sumBattleExpertHighScore", -234927808548700384L);
        setLongField(term377177, term377177.getClass(), "sumBattleMasterHighScore", 6906348880285738276L);
        setLongField(term377177, term377177.getClass(), "sumBattleLunaticHighScore", -5529249145193483243L);
        setField(term377177, term377177.getClass(), "eventWatchedDate", "JqUaDkkuTO");
        setField(term377177, term377177.getClass(), "cmEventWatchedDate", "cIdTROgmXL");
        setField(term377177, term377177.getClass(), "firstGameId", "txsvhpGZwt");
        setField(term377177, term377177.getClass(), "firstRomVersion", "gcDfxldLUD");
        setField(term377177, term377177.getClass(), "firstDataVersion", "SdeCxZUmQW");
        setField(term377177, term377177.getClass(), "firstPlayDate", "dwmAJjBRtx");
        setField(term377177, term377177.getClass(), "lastGameId", "tAEFWQNBKj");
        setField(term377177, term377177.getClass(), "lastRomVersion", "fcnyiOkOkc");
        setField(term377177, term377177.getClass(), "lastDataVersion", "uFZnvjTicx");
        setField(term377177, term377177.getClass(), "compatibleCmVersion", "jssrdNpiyJ");
        setField(term377177, term377177.getClass(), "lastPlayDate", "RVxeRpTKzR");
        setIntField(term377177, term377177.getClass(), "lastPlaceId", 1247868105);
        setField(term377177, term377177.getClass(), "lastPlaceName", "kkTIUhmlyF");
        setIntField(term377177, term377177.getClass(), "lastRegionId", 1326171837);
        setField(term377177, term377177.getClass(), "lastRegionName", "CwYrhnMGve");
        setIntField(term377177, term377177.getClass(), "lastAllNetId", 377087217);
        setField(term377177, term377177.getClass(), "lastClientId", "TVHtetcHdI");
        setIntField(term377177, term377177.getClass(), "lastUsedDeckId", 1321305146);
        setIntField(term377177, term377177.getClass(), "lastPlayMusicLevel", 1916226838);
        setIntField(term377177, term377177.getClass(), "lastEmoneyBrand", 2065861434);
        setField(term377175, term377175.getClass(), "user", term377177);
        setIntField(term377175, term377175.getClass(), "eventId", -2007928618);
        setIntField(term377175, term377175.getClass(), "type", 571650613);
        setIntField(term377175, term377175.getClass(), "musicId", -881782446);
        setIntField(term377175, term377175.getClass(), "level", 907791487);
        setIntField(term377175, term377175.getClass(), "techScoreMax", -1140118271);
        setIntField(term377175, term377175.getClass(), "platinumScoreMax", 1033933467);
        setField(term377175, term377175.getClass(), "techRecordDate", "SKcuJdZdMb");
        setBooleanField(term377175, term377175.getClass(), "isTechNewRecord", false);
        term377459 = new Integer(647803716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term377459;
        callMethod(klass, "setTechScoreMax", argTypes, term377175, args);
    }

};


