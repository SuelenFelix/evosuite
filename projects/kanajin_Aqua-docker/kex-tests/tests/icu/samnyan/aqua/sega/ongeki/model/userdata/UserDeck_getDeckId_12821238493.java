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

public class UserDeck_getDeckId_12821238493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143279;

    public UserDeck_getDeckId_12821238493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143285 = new Long(-3033337370154155851L);
        term143279 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term143281 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term143283 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143314 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143279, term143279.getClass(), "id", -6676388826732078328L);
        setLongField(term143281, term143281.getClass(), "id", 7080058150453679588L);
        setLongField(term143283, term143283.getClass(), "id", 1123295401008598438L);
        setField(term143283, term143283.getClass(), "extId", term143285);
        setField(term143283, term143283.getClass(), "luid", "CHVVqdbuYH");
        setIntField(term143300, term143300.getClass(), "year", 2011);
        setShortField(term143300, term143300.getClass(), "month", (short) 12);
        setShortField(term143300, term143300.getClass(), "day", (short) 10);
        setField(term143299, term143299.getClass(), "date", term143300);
        setByteField(term143304, term143304.getClass(), "hour", (byte) 13);
        setByteField(term143304, term143304.getClass(), "minute", (byte) 50);
        setByteField(term143304, term143304.getClass(), "second", (byte) 43);
        setIntField(term143304, term143304.getClass(), "nano", 632619706);
        setField(term143299, term143299.getClass(), "time", term143304);
        setField(term143283, term143283.getClass(), "registerTime", term143299);
        setIntField(term143310, term143310.getClass(), "year", 2016);
        setShortField(term143310, term143310.getClass(), "month", (short) 9);
        setShortField(term143310, term143310.getClass(), "day", (short) 16);
        setField(term143309, term143309.getClass(), "date", term143310);
        setByteField(term143314, term143314.getClass(), "hour", (byte) 16);
        setByteField(term143314, term143314.getClass(), "minute", (byte) 33);
        setByteField(term143314, term143314.getClass(), "second", (byte) 2);
        setIntField(term143314, term143314.getClass(), "nano", 767888558);
        setField(term143309, term143309.getClass(), "time", term143314);
        setField(term143283, term143283.getClass(), "accessTime", term143309);
        setField(term143281, term143281.getClass(), "card", term143283);
        setField(term143281, term143281.getClass(), "userName", "rLNYIbBxpb");
        setIntField(term143281, term143281.getClass(), "level", 1265600687);
        setIntField(term143281, term143281.getClass(), "reincarnationNum", 156680957);
        setLongField(term143281, term143281.getClass(), "exp", 3420854384214643170L);
        setLongField(term143281, term143281.getClass(), "point", -8695606846865602184L);
        setLongField(term143281, term143281.getClass(), "totalPoint", 3825080985088376106L);
        setIntField(term143281, term143281.getClass(), "playCount", -181324663);
        setIntField(term143281, term143281.getClass(), "jewelCount", 973270477);
        setIntField(term143281, term143281.getClass(), "totalJewelCount", 50996915);
        setIntField(term143281, term143281.getClass(), "medalCount", -241796987);
        setIntField(term143281, term143281.getClass(), "playerRating", -1252248921);
        setIntField(term143281, term143281.getClass(), "highestRating", 1214656233);
        setIntField(term143281, term143281.getClass(), "battlePoint", 376569110);
        setIntField(term143281, term143281.getClass(), "bestBattlePoint", -366233083);
        setIntField(term143281, term143281.getClass(), "overDamageBattlePoint", -1586250649);
        setBooleanField(term143281, term143281.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term143281, term143281.getClass(), "nameplateId", 714204805);
        setIntField(term143281, term143281.getClass(), "trophyId", -1539644001);
        setIntField(term143281, term143281.getClass(), "cardId", 1694021329);
        setIntField(term143281, term143281.getClass(), "characterId", -340695215);
        setIntField(term143281, term143281.getClass(), "characterVoiceNo", -965593105);
        setIntField(term143281, term143281.getClass(), "tabSetting", -1713765557);
        setIntField(term143281, term143281.getClass(), "tabSortSetting", -100503999);
        setIntField(term143281, term143281.getClass(), "cardCategorySetting", -1152780010);
        setIntField(term143281, term143281.getClass(), "cardSortSetting", 1773328262);
        setIntField(term143281, term143281.getClass(), "rivalScoreCategorySetting", 1076156036);
        setIntField(term143281, term143281.getClass(), "playedTutorialBit", 497222104);
        setIntField(term143281, term143281.getClass(), "firstTutorialCancelNum", -422135580);
        setLongField(term143281, term143281.getClass(), "sumTechHighScore", 2704505669401942665L);
        setLongField(term143281, term143281.getClass(), "sumTechBasicHighScore", 4015194226806564554L);
        setLongField(term143281, term143281.getClass(), "sumTechAdvancedHighScore", 6250843230638835062L);
        setLongField(term143281, term143281.getClass(), "sumTechExpertHighScore", 4713781347167935774L);
        setLongField(term143281, term143281.getClass(), "sumTechMasterHighScore", 1915950612436522101L);
        setLongField(term143281, term143281.getClass(), "sumTechLunaticHighScore", 6424630432395930744L);
        setLongField(term143281, term143281.getClass(), "sumBattleHighScore", -7151035380073434983L);
        setLongField(term143281, term143281.getClass(), "sumBattleBasicHighScore", -4542614386172304387L);
        setLongField(term143281, term143281.getClass(), "sumBattleAdvancedHighScore", 8945111617494109011L);
        setLongField(term143281, term143281.getClass(), "sumBattleExpertHighScore", 202493038499333325L);
        setLongField(term143281, term143281.getClass(), "sumBattleMasterHighScore", 6342509951155248187L);
        setLongField(term143281, term143281.getClass(), "sumBattleLunaticHighScore", 3411042195807403878L);
        setField(term143281, term143281.getClass(), "eventWatchedDate", "kdvVBzzgOS");
        setField(term143281, term143281.getClass(), "cmEventWatchedDate", "cwXRILYula");
        setField(term143281, term143281.getClass(), "firstGameId", "GRIytmuHxn");
        setField(term143281, term143281.getClass(), "firstRomVersion", "kTzFRQAqyW");
        setField(term143281, term143281.getClass(), "firstDataVersion", "VHZcekDeFJ");
        setField(term143281, term143281.getClass(), "firstPlayDate", "JpemqlOPQk");
        setField(term143281, term143281.getClass(), "lastGameId", "wZMPsUUQHd");
        setField(term143281, term143281.getClass(), "lastRomVersion", "kfQRMGKNWd");
        setField(term143281, term143281.getClass(), "lastDataVersion", "DmPsloRwDO");
        setField(term143281, term143281.getClass(), "compatibleCmVersion", "VELROAvnmN");
        setField(term143281, term143281.getClass(), "lastPlayDate", "aYIchgguwD");
        setIntField(term143281, term143281.getClass(), "lastPlaceId", -1726471303);
        setField(term143281, term143281.getClass(), "lastPlaceName", "YeMojFOdIm");
        setIntField(term143281, term143281.getClass(), "lastRegionId", 1563484306);
        setField(term143281, term143281.getClass(), "lastRegionName", "SlRtNRtKAG");
        setIntField(term143281, term143281.getClass(), "lastAllNetId", -1064532569);
        setField(term143281, term143281.getClass(), "lastClientId", "tjWInMuXpE");
        setIntField(term143281, term143281.getClass(), "lastUsedDeckId", 1894908411);
        setIntField(term143281, term143281.getClass(), "lastPlayMusicLevel", 1128957140);
        setIntField(term143281, term143281.getClass(), "lastEmoneyBrand", 1975880274);
        setField(term143279, term143279.getClass(), "user", term143281);
        setIntField(term143279, term143279.getClass(), "deckId", 1216213747);
        setIntField(term143279, term143279.getClass(), "cardId1", -428741760);
        setIntField(term143279, term143279.getClass(), "cardId2", 570973373);
        setIntField(term143279, term143279.getClass(), "cardId3", -1116126684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeckId", argTypes, term143279, args);
    }

};


