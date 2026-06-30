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

public class UserEventPoint_init_15631976250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381546;

    public UserEventPoint_init_15631976250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term381550 = new Long(-4851193391918639512L);
        term381546 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term381548 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term381564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term381565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term381569 = newInstance(Class.forName("java.time.LocalTime"));
        Object term381574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term381575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term381579 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term381546, term381546.getClass(), "id", -521022457342934775L);
        setLongField(term381548, term381548.getClass(), "id", 2811907255159908613L);
        setField(term381548, term381548.getClass(), "extId", term381550);
        setField(term381548, term381548.getClass(), "luid", "MXffWwtjOL");
        setIntField(term381565, term381565.getClass(), "year", 2017);
        setShortField(term381565, term381565.getClass(), "month", (short) 5);
        setShortField(term381565, term381565.getClass(), "day", (short) 22);
        setField(term381564, term381564.getClass(), "date", term381565);
        setByteField(term381569, term381569.getClass(), "hour", (byte) 14);
        setByteField(term381569, term381569.getClass(), "minute", (byte) 0);
        setByteField(term381569, term381569.getClass(), "second", (byte) 49);
        setIntField(term381569, term381569.getClass(), "nano", 354492142);
        setField(term381564, term381564.getClass(), "time", term381569);
        setField(term381548, term381548.getClass(), "registerTime", term381564);
        setIntField(term381575, term381575.getClass(), "year", 2024);
        setShortField(term381575, term381575.getClass(), "month", (short) 4);
        setShortField(term381575, term381575.getClass(), "day", (short) 4);
        setField(term381574, term381574.getClass(), "date", term381575);
        setByteField(term381579, term381579.getClass(), "hour", (byte) 6);
        setByteField(term381579, term381579.getClass(), "minute", (byte) 44);
        setByteField(term381579, term381579.getClass(), "second", (byte) 55);
        setIntField(term381579, term381579.getClass(), "nano", 929065738);
        setField(term381574, term381574.getClass(), "time", term381579);
        setField(term381548, term381548.getClass(), "accessTime", term381574);
        setField(term381546, term381546.getClass(), "card", term381548);
        setField(term381546, term381546.getClass(), "userName", "VowOZMmKKT");
        setIntField(term381546, term381546.getClass(), "level", -403254031);
        setIntField(term381546, term381546.getClass(), "reincarnationNum", 2132693713);
        setLongField(term381546, term381546.getClass(), "exp", 4244659522671323406L);
        setLongField(term381546, term381546.getClass(), "point", -9012830499897640819L);
        setLongField(term381546, term381546.getClass(), "totalPoint", 5557913271075393319L);
        setIntField(term381546, term381546.getClass(), "playCount", 1358453506);
        setIntField(term381546, term381546.getClass(), "jewelCount", -722894219);
        setIntField(term381546, term381546.getClass(), "totalJewelCount", 1631278826);
        setIntField(term381546, term381546.getClass(), "medalCount", -732762490);
        setIntField(term381546, term381546.getClass(), "playerRating", -1029707628);
        setIntField(term381546, term381546.getClass(), "highestRating", 716064346);
        setIntField(term381546, term381546.getClass(), "battlePoint", 1962136817);
        setIntField(term381546, term381546.getClass(), "bestBattlePoint", -2138792445);
        setIntField(term381546, term381546.getClass(), "overDamageBattlePoint", 1994734503);
        setBooleanField(term381546, term381546.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term381546, term381546.getClass(), "nameplateId", 1102838331);
        setIntField(term381546, term381546.getClass(), "trophyId", -547093821);
        setIntField(term381546, term381546.getClass(), "cardId", 1666400454);
        setIntField(term381546, term381546.getClass(), "characterId", 1541927634);
        setIntField(term381546, term381546.getClass(), "characterVoiceNo", 1137154957);
        setIntField(term381546, term381546.getClass(), "tabSetting", -87603184);
        setIntField(term381546, term381546.getClass(), "tabSortSetting", 1632958958);
        setIntField(term381546, term381546.getClass(), "cardCategorySetting", -1488981624);
        setIntField(term381546, term381546.getClass(), "cardSortSetting", -1859888367);
        setIntField(term381546, term381546.getClass(), "rivalScoreCategorySetting", -738859682);
        setIntField(term381546, term381546.getClass(), "playedTutorialBit", 1203486037);
        setIntField(term381546, term381546.getClass(), "firstTutorialCancelNum", -425039461);
        setLongField(term381546, term381546.getClass(), "sumTechHighScore", 5607000905139658337L);
        setLongField(term381546, term381546.getClass(), "sumTechBasicHighScore", -1749694233602317206L);
        setLongField(term381546, term381546.getClass(), "sumTechAdvancedHighScore", 8212069310307342179L);
        setLongField(term381546, term381546.getClass(), "sumTechExpertHighScore", 6402759083434375911L);
        setLongField(term381546, term381546.getClass(), "sumTechMasterHighScore", 4029683020168474010L);
        setLongField(term381546, term381546.getClass(), "sumTechLunaticHighScore", -6001058655651040500L);
        setLongField(term381546, term381546.getClass(), "sumBattleHighScore", -7219613300598571468L);
        setLongField(term381546, term381546.getClass(), "sumBattleBasicHighScore", 2098551455703096138L);
        setLongField(term381546, term381546.getClass(), "sumBattleAdvancedHighScore", 3123902339717569486L);
        setLongField(term381546, term381546.getClass(), "sumBattleExpertHighScore", -2867649348332886536L);
        setLongField(term381546, term381546.getClass(), "sumBattleMasterHighScore", 7108832179012374769L);
        setLongField(term381546, term381546.getClass(), "sumBattleLunaticHighScore", 7326093236054382968L);
        setField(term381546, term381546.getClass(), "eventWatchedDate", "QHfTwIkbkT");
        setField(term381546, term381546.getClass(), "cmEventWatchedDate", "oexyCXqWFm");
        setField(term381546, term381546.getClass(), "firstGameId", "CYsiLCKvkg");
        setField(term381546, term381546.getClass(), "firstRomVersion", "xseIGlnBdy");
        setField(term381546, term381546.getClass(), "firstDataVersion", "DzAUIAXmKG");
        setField(term381546, term381546.getClass(), "firstPlayDate", "SoRuiQAOdh");
        setField(term381546, term381546.getClass(), "lastGameId", "ejNlGaFszD");
        setField(term381546, term381546.getClass(), "lastRomVersion", "lLOVzTOZrn");
        setField(term381546, term381546.getClass(), "lastDataVersion", "LKnFPHURqD");
        setField(term381546, term381546.getClass(), "compatibleCmVersion", "OnkfuPhhWD");
        setField(term381546, term381546.getClass(), "lastPlayDate", "EAlxxJmhWV");
        setIntField(term381546, term381546.getClass(), "lastPlaceId", -1901247998);
        setField(term381546, term381546.getClass(), "lastPlaceName", "pGpyBYgIUV");
        setIntField(term381546, term381546.getClass(), "lastRegionId", 624755502);
        setField(term381546, term381546.getClass(), "lastRegionName", "KkkRKjjUWW");
        setIntField(term381546, term381546.getClass(), "lastAllNetId", -451012125);
        setField(term381546, term381546.getClass(), "lastClientId", "rEfPzNbUmY");
        setIntField(term381546, term381546.getClass(), "lastUsedDeckId", 1354725634);
        setIntField(term381546, term381546.getClass(), "lastPlayMusicLevel", -1752729977);
        setIntField(term381546, term381546.getClass(), "lastEmoneyBrand", -2105143460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term381546;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


