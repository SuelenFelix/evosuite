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

public class UserDeck_getCardId3_16375775356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144566;

    public UserDeck_getCardId3_16375775356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144572 = new Long(-3718250311794019732L);
        term144566 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term144568 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term144570 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term144586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144601 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144566, term144566.getClass(), "id", 5489704491045183230L);
        setLongField(term144568, term144568.getClass(), "id", 8064212368146926892L);
        setLongField(term144570, term144570.getClass(), "id", -5338712600945246254L);
        setField(term144570, term144570.getClass(), "extId", term144572);
        setField(term144570, term144570.getClass(), "luid", "QIBFEnRCeZ");
        setIntField(term144587, term144587.getClass(), "year", 2014);
        setShortField(term144587, term144587.getClass(), "month", (short) 7);
        setShortField(term144587, term144587.getClass(), "day", (short) 5);
        setField(term144586, term144586.getClass(), "date", term144587);
        setByteField(term144591, term144591.getClass(), "hour", (byte) 16);
        setByteField(term144591, term144591.getClass(), "minute", (byte) 28);
        setByteField(term144591, term144591.getClass(), "second", (byte) 51);
        setIntField(term144591, term144591.getClass(), "nano", 627591414);
        setField(term144586, term144586.getClass(), "time", term144591);
        setField(term144570, term144570.getClass(), "registerTime", term144586);
        setIntField(term144597, term144597.getClass(), "year", 2028);
        setShortField(term144597, term144597.getClass(), "month", (short) 7);
        setShortField(term144597, term144597.getClass(), "day", (short) 20);
        setField(term144596, term144596.getClass(), "date", term144597);
        setByteField(term144601, term144601.getClass(), "hour", (byte) 23);
        setByteField(term144601, term144601.getClass(), "minute", (byte) 53);
        setByteField(term144601, term144601.getClass(), "second", (byte) 34);
        setIntField(term144601, term144601.getClass(), "nano", 196205860);
        setField(term144596, term144596.getClass(), "time", term144601);
        setField(term144570, term144570.getClass(), "accessTime", term144596);
        setField(term144568, term144568.getClass(), "card", term144570);
        setField(term144568, term144568.getClass(), "userName", "HVMLhVrWly");
        setIntField(term144568, term144568.getClass(), "level", -949536306);
        setIntField(term144568, term144568.getClass(), "reincarnationNum", -531020119);
        setLongField(term144568, term144568.getClass(), "exp", -1385049448724814299L);
        setLongField(term144568, term144568.getClass(), "point", -299180928798282669L);
        setLongField(term144568, term144568.getClass(), "totalPoint", 4099058079038335133L);
        setIntField(term144568, term144568.getClass(), "playCount", 257618497);
        setIntField(term144568, term144568.getClass(), "jewelCount", -1053171626);
        setIntField(term144568, term144568.getClass(), "totalJewelCount", -523085747);
        setIntField(term144568, term144568.getClass(), "medalCount", 417603895);
        setIntField(term144568, term144568.getClass(), "playerRating", -1482676874);
        setIntField(term144568, term144568.getClass(), "highestRating", -1157428137);
        setIntField(term144568, term144568.getClass(), "battlePoint", 1937997872);
        setIntField(term144568, term144568.getClass(), "bestBattlePoint", -1961074437);
        setIntField(term144568, term144568.getClass(), "overDamageBattlePoint", 2132751608);
        setBooleanField(term144568, term144568.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term144568, term144568.getClass(), "nameplateId", -739046971);
        setIntField(term144568, term144568.getClass(), "trophyId", 1735844763);
        setIntField(term144568, term144568.getClass(), "cardId", -1276527088);
        setIntField(term144568, term144568.getClass(), "characterId", -1354264089);
        setIntField(term144568, term144568.getClass(), "characterVoiceNo", -2041515106);
        setIntField(term144568, term144568.getClass(), "tabSetting", 699571489);
        setIntField(term144568, term144568.getClass(), "tabSortSetting", 2067513821);
        setIntField(term144568, term144568.getClass(), "cardCategorySetting", 1556440556);
        setIntField(term144568, term144568.getClass(), "cardSortSetting", -436359872);
        setIntField(term144568, term144568.getClass(), "rivalScoreCategorySetting", -1959666038);
        setIntField(term144568, term144568.getClass(), "playedTutorialBit", 2128660618);
        setIntField(term144568, term144568.getClass(), "firstTutorialCancelNum", -1354012258);
        setLongField(term144568, term144568.getClass(), "sumTechHighScore", 4542667912513581035L);
        setLongField(term144568, term144568.getClass(), "sumTechBasicHighScore", 3649520034075759873L);
        setLongField(term144568, term144568.getClass(), "sumTechAdvancedHighScore", 7052915803933404608L);
        setLongField(term144568, term144568.getClass(), "sumTechExpertHighScore", -8526050442754184170L);
        setLongField(term144568, term144568.getClass(), "sumTechMasterHighScore", -6442130209472383871L);
        setLongField(term144568, term144568.getClass(), "sumTechLunaticHighScore", 1225890311764636256L);
        setLongField(term144568, term144568.getClass(), "sumBattleHighScore", 1618551564796004962L);
        setLongField(term144568, term144568.getClass(), "sumBattleBasicHighScore", 7886428173666895304L);
        setLongField(term144568, term144568.getClass(), "sumBattleAdvancedHighScore", 930277214231655780L);
        setLongField(term144568, term144568.getClass(), "sumBattleExpertHighScore", 5102991381655513464L);
        setLongField(term144568, term144568.getClass(), "sumBattleMasterHighScore", -4266639436316113959L);
        setLongField(term144568, term144568.getClass(), "sumBattleLunaticHighScore", -6618251861373768695L);
        setField(term144568, term144568.getClass(), "eventWatchedDate", "yVHTwpMOSD");
        setField(term144568, term144568.getClass(), "cmEventWatchedDate", "ZFThLVgXzT");
        setField(term144568, term144568.getClass(), "firstGameId", "wpSuVLuVSu");
        setField(term144568, term144568.getClass(), "firstRomVersion", "BauBYWlTXL");
        setField(term144568, term144568.getClass(), "firstDataVersion", "dAoPTQFCFN");
        setField(term144568, term144568.getClass(), "firstPlayDate", "AAVsuSsxLS");
        setField(term144568, term144568.getClass(), "lastGameId", "ElCmThplmP");
        setField(term144568, term144568.getClass(), "lastRomVersion", "QmHpkkQsav");
        setField(term144568, term144568.getClass(), "lastDataVersion", "hMSzYZiZXX");
        setField(term144568, term144568.getClass(), "compatibleCmVersion", "XDCvxTTtyO");
        setField(term144568, term144568.getClass(), "lastPlayDate", "kOpXEPJinJ");
        setIntField(term144568, term144568.getClass(), "lastPlaceId", -734919944);
        setField(term144568, term144568.getClass(), "lastPlaceName", "rttNPStAfM");
        setIntField(term144568, term144568.getClass(), "lastRegionId", -91371563);
        setField(term144568, term144568.getClass(), "lastRegionName", "THLYTYdxwA");
        setIntField(term144568, term144568.getClass(), "lastAllNetId", 4662703);
        setField(term144568, term144568.getClass(), "lastClientId", "nMaKkGsKjH");
        setIntField(term144568, term144568.getClass(), "lastUsedDeckId", -2118566618);
        setIntField(term144568, term144568.getClass(), "lastPlayMusicLevel", 1655029720);
        setIntField(term144568, term144568.getClass(), "lastEmoneyBrand", -793892224);
        setField(term144566, term144566.getClass(), "user", term144568);
        setIntField(term144566, term144566.getClass(), "deckId", 1440702542);
        setIntField(term144566, term144566.getClass(), "cardId1", -943970524);
        setIntField(term144566, term144566.getClass(), "cardId2", 917621965);
        setIntField(term144566, term144566.getClass(), "cardId3", 749518086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId3", argTypes, term144566, args);
    }

};


