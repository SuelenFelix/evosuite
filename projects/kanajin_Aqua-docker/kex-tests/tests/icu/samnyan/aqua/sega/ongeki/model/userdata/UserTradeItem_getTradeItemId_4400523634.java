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

public class UserTradeItem_getTradeItemId_4400523634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151976;

    public UserTradeItem_getTradeItemId_4400523634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151982 = new Long(4139034517298316285L);
        term151976 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term151978 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term151980 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152001 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152011 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151976, term151976.getClass(), "id", 4269796195929114553L);
        setLongField(term151978, term151978.getClass(), "id", 8591178855281158820L);
        setLongField(term151980, term151980.getClass(), "id", -8153185445188422129L);
        setField(term151980, term151980.getClass(), "extId", term151982);
        setField(term151980, term151980.getClass(), "luid", "PXtEfvnxXo");
        setIntField(term151997, term151997.getClass(), "year", 2022);
        setShortField(term151997, term151997.getClass(), "month", (short) 11);
        setShortField(term151997, term151997.getClass(), "day", (short) 16);
        setField(term151996, term151996.getClass(), "date", term151997);
        setByteField(term152001, term152001.getClass(), "hour", (byte) 12);
        setByteField(term152001, term152001.getClass(), "minute", (byte) 41);
        setByteField(term152001, term152001.getClass(), "second", (byte) 8);
        setIntField(term152001, term152001.getClass(), "nano", 873900846);
        setField(term151996, term151996.getClass(), "time", term152001);
        setField(term151980, term151980.getClass(), "registerTime", term151996);
        setIntField(term152007, term152007.getClass(), "year", 2016);
        setShortField(term152007, term152007.getClass(), "month", (short) 8);
        setShortField(term152007, term152007.getClass(), "day", (short) 9);
        setField(term152006, term152006.getClass(), "date", term152007);
        setByteField(term152011, term152011.getClass(), "hour", (byte) 11);
        setByteField(term152011, term152011.getClass(), "minute", (byte) 35);
        setByteField(term152011, term152011.getClass(), "second", (byte) 27);
        setIntField(term152011, term152011.getClass(), "nano", 440006638);
        setField(term152006, term152006.getClass(), "time", term152011);
        setField(term151980, term151980.getClass(), "accessTime", term152006);
        setField(term151978, term151978.getClass(), "card", term151980);
        setField(term151978, term151978.getClass(), "userName", "VRanEGfPea");
        setIntField(term151978, term151978.getClass(), "level", -593876319);
        setIntField(term151978, term151978.getClass(), "reincarnationNum", -319651858);
        setLongField(term151978, term151978.getClass(), "exp", 2128957764288200150L);
        setLongField(term151978, term151978.getClass(), "point", -8941000155799667503L);
        setLongField(term151978, term151978.getClass(), "totalPoint", 8762299939166364370L);
        setIntField(term151978, term151978.getClass(), "playCount", -1605318650);
        setIntField(term151978, term151978.getClass(), "jewelCount", -1715705311);
        setIntField(term151978, term151978.getClass(), "totalJewelCount", 1583733510);
        setIntField(term151978, term151978.getClass(), "medalCount", -1283509243);
        setIntField(term151978, term151978.getClass(), "playerRating", -1360455750);
        setIntField(term151978, term151978.getClass(), "highestRating", -1612479152);
        setIntField(term151978, term151978.getClass(), "battlePoint", -1375350596);
        setIntField(term151978, term151978.getClass(), "bestBattlePoint", 1037044797);
        setIntField(term151978, term151978.getClass(), "overDamageBattlePoint", -236855495);
        setBooleanField(term151978, term151978.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term151978, term151978.getClass(), "nameplateId", 1407499360);
        setIntField(term151978, term151978.getClass(), "trophyId", -824739842);
        setIntField(term151978, term151978.getClass(), "cardId", 1736957152);
        setIntField(term151978, term151978.getClass(), "characterId", -526630921);
        setIntField(term151978, term151978.getClass(), "characterVoiceNo", -1766101899);
        setIntField(term151978, term151978.getClass(), "tabSetting", -1198424905);
        setIntField(term151978, term151978.getClass(), "tabSortSetting", -782844264);
        setIntField(term151978, term151978.getClass(), "cardCategorySetting", -546737664);
        setIntField(term151978, term151978.getClass(), "cardSortSetting", 2004350139);
        setIntField(term151978, term151978.getClass(), "rivalScoreCategorySetting", 1239280488);
        setIntField(term151978, term151978.getClass(), "playedTutorialBit", -1336481907);
        setIntField(term151978, term151978.getClass(), "firstTutorialCancelNum", 1804282244);
        setLongField(term151978, term151978.getClass(), "sumTechHighScore", -2058732347677769008L);
        setLongField(term151978, term151978.getClass(), "sumTechBasicHighScore", -1212345114056050539L);
        setLongField(term151978, term151978.getClass(), "sumTechAdvancedHighScore", -4426532311030321254L);
        setLongField(term151978, term151978.getClass(), "sumTechExpertHighScore", -8995282364511244030L);
        setLongField(term151978, term151978.getClass(), "sumTechMasterHighScore", -7544795113627609897L);
        setLongField(term151978, term151978.getClass(), "sumTechLunaticHighScore", -7410716980592987419L);
        setLongField(term151978, term151978.getClass(), "sumBattleHighScore", -8130508753770018315L);
        setLongField(term151978, term151978.getClass(), "sumBattleBasicHighScore", -2385943956066150347L);
        setLongField(term151978, term151978.getClass(), "sumBattleAdvancedHighScore", -4896376683016823289L);
        setLongField(term151978, term151978.getClass(), "sumBattleExpertHighScore", 5308872668918566041L);
        setLongField(term151978, term151978.getClass(), "sumBattleMasterHighScore", 8731808618480993258L);
        setLongField(term151978, term151978.getClass(), "sumBattleLunaticHighScore", 1785131375653736493L);
        setField(term151978, term151978.getClass(), "eventWatchedDate", "aGdROcHtyG");
        setField(term151978, term151978.getClass(), "cmEventWatchedDate", "grxNCPTaxQ");
        setField(term151978, term151978.getClass(), "firstGameId", "VSAOMfeZza");
        setField(term151978, term151978.getClass(), "firstRomVersion", "SfwPnHKjAh");
        setField(term151978, term151978.getClass(), "firstDataVersion", "slVCZJOwTn");
        setField(term151978, term151978.getClass(), "firstPlayDate", "wyOXHOMKYx");
        setField(term151978, term151978.getClass(), "lastGameId", "rvkJHBxSuS");
        setField(term151978, term151978.getClass(), "lastRomVersion", "XChVAzyqqj");
        setField(term151978, term151978.getClass(), "lastDataVersion", "niqsKibyMX");
        setField(term151978, term151978.getClass(), "compatibleCmVersion", "EEigYHpeLr");
        setField(term151978, term151978.getClass(), "lastPlayDate", "iOZRBGDCUA");
        setIntField(term151978, term151978.getClass(), "lastPlaceId", 1481607063);
        setField(term151978, term151978.getClass(), "lastPlaceName", "SNLGmwYLAV");
        setIntField(term151978, term151978.getClass(), "lastRegionId", 972749902);
        setField(term151978, term151978.getClass(), "lastRegionName", "FskwpQdCkf");
        setIntField(term151978, term151978.getClass(), "lastAllNetId", -1556774479);
        setField(term151978, term151978.getClass(), "lastClientId", "GQONGOQPIz");
        setIntField(term151978, term151978.getClass(), "lastUsedDeckId", -74035050);
        setIntField(term151978, term151978.getClass(), "lastPlayMusicLevel", 1681611551);
        setIntField(term151978, term151978.getClass(), "lastEmoneyBrand", 1979378883);
        setField(term151976, term151976.getClass(), "user", term151978);
        setIntField(term151976, term151976.getClass(), "chapterId", -471723430);
        setIntField(term151976, term151976.getClass(), "tradeItemId", -1834936016);
        setIntField(term151976, term151976.getClass(), "tradeCount", -1317671732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeItemId", argTypes, term151976, args);
    }

};


