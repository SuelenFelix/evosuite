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

public class UserDeck_setDeckId_11971712759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146278;
     Object term146547;

    public UserDeck_setDeckId_11971712759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146284 = new Long(-7296330380944173376L);
        term146278 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term146280 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term146282 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146303 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146313 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146278, term146278.getClass(), "id", 7002747498598132651L);
        setLongField(term146280, term146280.getClass(), "id", -4106378391623749221L);
        setLongField(term146282, term146282.getClass(), "id", 1647223669694832539L);
        setField(term146282, term146282.getClass(), "extId", term146284);
        setField(term146282, term146282.getClass(), "luid", "ctdWGECgpL");
        setIntField(term146299, term146299.getClass(), "year", 2014);
        setShortField(term146299, term146299.getClass(), "month", (short) 11);
        setShortField(term146299, term146299.getClass(), "day", (short) 30);
        setField(term146298, term146298.getClass(), "date", term146299);
        setByteField(term146303, term146303.getClass(), "hour", (byte) 19);
        setByteField(term146303, term146303.getClass(), "minute", (byte) 38);
        setByteField(term146303, term146303.getClass(), "second", (byte) 52);
        setIntField(term146303, term146303.getClass(), "nano", 246326841);
        setField(term146298, term146298.getClass(), "time", term146303);
        setField(term146282, term146282.getClass(), "registerTime", term146298);
        setIntField(term146309, term146309.getClass(), "year", 2028);
        setShortField(term146309, term146309.getClass(), "month", (short) 5);
        setShortField(term146309, term146309.getClass(), "day", (short) 3);
        setField(term146308, term146308.getClass(), "date", term146309);
        setByteField(term146313, term146313.getClass(), "hour", (byte) 15);
        setByteField(term146313, term146313.getClass(), "minute", (byte) 33);
        setByteField(term146313, term146313.getClass(), "second", (byte) 14);
        setIntField(term146313, term146313.getClass(), "nano", 322733130);
        setField(term146308, term146308.getClass(), "time", term146313);
        setField(term146282, term146282.getClass(), "accessTime", term146308);
        setField(term146280, term146280.getClass(), "card", term146282);
        setField(term146280, term146280.getClass(), "userName", "NpOvJxLOcu");
        setIntField(term146280, term146280.getClass(), "level", -737020605);
        setIntField(term146280, term146280.getClass(), "reincarnationNum", -1689975721);
        setLongField(term146280, term146280.getClass(), "exp", -1665991383187401754L);
        setLongField(term146280, term146280.getClass(), "point", 886500788864709071L);
        setLongField(term146280, term146280.getClass(), "totalPoint", 3473141408597616198L);
        setIntField(term146280, term146280.getClass(), "playCount", -559277061);
        setIntField(term146280, term146280.getClass(), "jewelCount", -1559272301);
        setIntField(term146280, term146280.getClass(), "totalJewelCount", -695146667);
        setIntField(term146280, term146280.getClass(), "medalCount", 504837140);
        setIntField(term146280, term146280.getClass(), "playerRating", 1644155444);
        setIntField(term146280, term146280.getClass(), "highestRating", -146974597);
        setIntField(term146280, term146280.getClass(), "battlePoint", 1867052080);
        setIntField(term146280, term146280.getClass(), "bestBattlePoint", 1062960081);
        setIntField(term146280, term146280.getClass(), "overDamageBattlePoint", -1298172941);
        setBooleanField(term146280, term146280.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term146280, term146280.getClass(), "nameplateId", -601138209);
        setIntField(term146280, term146280.getClass(), "trophyId", -1113477185);
        setIntField(term146280, term146280.getClass(), "cardId", 585885138);
        setIntField(term146280, term146280.getClass(), "characterId", 567631199);
        setIntField(term146280, term146280.getClass(), "characterVoiceNo", -1413886938);
        setIntField(term146280, term146280.getClass(), "tabSetting", 2087447261);
        setIntField(term146280, term146280.getClass(), "tabSortSetting", 1781286950);
        setIntField(term146280, term146280.getClass(), "cardCategorySetting", -1567536215);
        setIntField(term146280, term146280.getClass(), "cardSortSetting", -193229422);
        setIntField(term146280, term146280.getClass(), "rivalScoreCategorySetting", -1390564838);
        setIntField(term146280, term146280.getClass(), "playedTutorialBit", 1895198236);
        setIntField(term146280, term146280.getClass(), "firstTutorialCancelNum", -1239270544);
        setLongField(term146280, term146280.getClass(), "sumTechHighScore", 9143283504158287377L);
        setLongField(term146280, term146280.getClass(), "sumTechBasicHighScore", 7791280724501222127L);
        setLongField(term146280, term146280.getClass(), "sumTechAdvancedHighScore", 6543095797057428731L);
        setLongField(term146280, term146280.getClass(), "sumTechExpertHighScore", 5617055376355096578L);
        setLongField(term146280, term146280.getClass(), "sumTechMasterHighScore", 7842964386053122233L);
        setLongField(term146280, term146280.getClass(), "sumTechLunaticHighScore", -1946702932576873493L);
        setLongField(term146280, term146280.getClass(), "sumBattleHighScore", 4734324551571991059L);
        setLongField(term146280, term146280.getClass(), "sumBattleBasicHighScore", -6403166372713114614L);
        setLongField(term146280, term146280.getClass(), "sumBattleAdvancedHighScore", 4907124420463868330L);
        setLongField(term146280, term146280.getClass(), "sumBattleExpertHighScore", -8706686643236214379L);
        setLongField(term146280, term146280.getClass(), "sumBattleMasterHighScore", 7578527961231712641L);
        setLongField(term146280, term146280.getClass(), "sumBattleLunaticHighScore", -8194612635638937413L);
        setField(term146280, term146280.getClass(), "eventWatchedDate", "VuMCtXnbbd");
        setField(term146280, term146280.getClass(), "cmEventWatchedDate", "fXGAskxMPG");
        setField(term146280, term146280.getClass(), "firstGameId", "IRGoqHyCCH");
        setField(term146280, term146280.getClass(), "firstRomVersion", "UsLqohewfX");
        setField(term146280, term146280.getClass(), "firstDataVersion", "llZOjgXknR");
        setField(term146280, term146280.getClass(), "firstPlayDate", "nHkhqzmpyo");
        setField(term146280, term146280.getClass(), "lastGameId", "UsfMPJEJAN");
        setField(term146280, term146280.getClass(), "lastRomVersion", "WlleIjkKZP");
        setField(term146280, term146280.getClass(), "lastDataVersion", "psVYDPctDq");
        setField(term146280, term146280.getClass(), "compatibleCmVersion", "JlSzeHQccT");
        setField(term146280, term146280.getClass(), "lastPlayDate", "RGbggEITDh");
        setIntField(term146280, term146280.getClass(), "lastPlaceId", -877554724);
        setField(term146280, term146280.getClass(), "lastPlaceName", "QUvccjNkOP");
        setIntField(term146280, term146280.getClass(), "lastRegionId", -1123007297);
        setField(term146280, term146280.getClass(), "lastRegionName", "tSAXbiQHko");
        setIntField(term146280, term146280.getClass(), "lastAllNetId", 144368885);
        setField(term146280, term146280.getClass(), "lastClientId", "YVEDjJuvaY");
        setIntField(term146280, term146280.getClass(), "lastUsedDeckId", -1855501977);
        setIntField(term146280, term146280.getClass(), "lastPlayMusicLevel", -602021892);
        setIntField(term146280, term146280.getClass(), "lastEmoneyBrand", 1020456975);
        setField(term146278, term146278.getClass(), "user", term146280);
        setIntField(term146278, term146278.getClass(), "deckId", 164978650);
        setIntField(term146278, term146278.getClass(), "cardId1", -1868859083);
        setIntField(term146278, term146278.getClass(), "cardId2", -626522297);
        setIntField(term146278, term146278.getClass(), "cardId3", 973355727);
        term146547 = new Integer(1359931152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term146547;
        callMethod(klass, "setDeckId", argTypes, term146278, args);
    }

};


