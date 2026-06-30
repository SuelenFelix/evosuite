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

public class UserCard_getMaxLevel_4171409628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115139;

    public UserCard_getMaxLevel_4171409628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115145 = new Long(-1635471392209071620L);
        term115139 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term115141 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term115143 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115174 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115139, term115139.getClass(), "id", 3378400540021500468L);
        setLongField(term115141, term115141.getClass(), "id", 371307308166678989L);
        setLongField(term115143, term115143.getClass(), "id", 1849809279069072572L);
        setField(term115143, term115143.getClass(), "extId", term115145);
        setField(term115143, term115143.getClass(), "luid", "waPCjDLHIu");
        setIntField(term115160, term115160.getClass(), "year", 2029);
        setShortField(term115160, term115160.getClass(), "month", (short) 6);
        setShortField(term115160, term115160.getClass(), "day", (short) 25);
        setField(term115159, term115159.getClass(), "date", term115160);
        setByteField(term115164, term115164.getClass(), "hour", (byte) 14);
        setByteField(term115164, term115164.getClass(), "minute", (byte) 19);
        setByteField(term115164, term115164.getClass(), "second", (byte) 52);
        setIntField(term115164, term115164.getClass(), "nano", 250367769);
        setField(term115159, term115159.getClass(), "time", term115164);
        setField(term115143, term115143.getClass(), "registerTime", term115159);
        setIntField(term115170, term115170.getClass(), "year", 2011);
        setShortField(term115170, term115170.getClass(), "month", (short) 11);
        setShortField(term115170, term115170.getClass(), "day", (short) 24);
        setField(term115169, term115169.getClass(), "date", term115170);
        setByteField(term115174, term115174.getClass(), "hour", (byte) 5);
        setByteField(term115174, term115174.getClass(), "minute", (byte) 45);
        setByteField(term115174, term115174.getClass(), "second", (byte) 11);
        setIntField(term115174, term115174.getClass(), "nano", 438339982);
        setField(term115169, term115169.getClass(), "time", term115174);
        setField(term115143, term115143.getClass(), "accessTime", term115169);
        setField(term115141, term115141.getClass(), "card", term115143);
        setField(term115141, term115141.getClass(), "userName", "ziLgjZfcmc");
        setIntField(term115141, term115141.getClass(), "level", 1037164777);
        setIntField(term115141, term115141.getClass(), "reincarnationNum", -1061962496);
        setLongField(term115141, term115141.getClass(), "exp", -5031718258279253914L);
        setLongField(term115141, term115141.getClass(), "point", 6190088843493110441L);
        setLongField(term115141, term115141.getClass(), "totalPoint", -1838351096671692042L);
        setIntField(term115141, term115141.getClass(), "playCount", -1456265994);
        setIntField(term115141, term115141.getClass(), "jewelCount", 716720347);
        setIntField(term115141, term115141.getClass(), "totalJewelCount", -1144539304);
        setIntField(term115141, term115141.getClass(), "medalCount", -1038395932);
        setIntField(term115141, term115141.getClass(), "playerRating", 1842163221);
        setIntField(term115141, term115141.getClass(), "highestRating", 468583702);
        setIntField(term115141, term115141.getClass(), "battlePoint", -875891947);
        setIntField(term115141, term115141.getClass(), "bestBattlePoint", 1496553034);
        setIntField(term115141, term115141.getClass(), "overDamageBattlePoint", 272546912);
        setBooleanField(term115141, term115141.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term115141, term115141.getClass(), "nameplateId", -1534845297);
        setIntField(term115141, term115141.getClass(), "trophyId", 1159214599);
        setIntField(term115141, term115141.getClass(), "cardId", 2063913776);
        setIntField(term115141, term115141.getClass(), "characterId", -167719421);
        setIntField(term115141, term115141.getClass(), "characterVoiceNo", 1185474565);
        setIntField(term115141, term115141.getClass(), "tabSetting", -1081016436);
        setIntField(term115141, term115141.getClass(), "tabSortSetting", 1465385986);
        setIntField(term115141, term115141.getClass(), "cardCategorySetting", 1976158913);
        setIntField(term115141, term115141.getClass(), "cardSortSetting", 696093985);
        setIntField(term115141, term115141.getClass(), "rivalScoreCategorySetting", 488572556);
        setIntField(term115141, term115141.getClass(), "playedTutorialBit", 2103579931);
        setIntField(term115141, term115141.getClass(), "firstTutorialCancelNum", -363708885);
        setLongField(term115141, term115141.getClass(), "sumTechHighScore", 8050421694732798692L);
        setLongField(term115141, term115141.getClass(), "sumTechBasicHighScore", -3349491132061900439L);
        setLongField(term115141, term115141.getClass(), "sumTechAdvancedHighScore", 7854997525393036309L);
        setLongField(term115141, term115141.getClass(), "sumTechExpertHighScore", 5527519479747605509L);
        setLongField(term115141, term115141.getClass(), "sumTechMasterHighScore", -2099702742253776791L);
        setLongField(term115141, term115141.getClass(), "sumTechLunaticHighScore", 4455503613197760207L);
        setLongField(term115141, term115141.getClass(), "sumBattleHighScore", -2213600428279271018L);
        setLongField(term115141, term115141.getClass(), "sumBattleBasicHighScore", 626353265438400302L);
        setLongField(term115141, term115141.getClass(), "sumBattleAdvancedHighScore", 5906403446691111195L);
        setLongField(term115141, term115141.getClass(), "sumBattleExpertHighScore", -2545711420820127794L);
        setLongField(term115141, term115141.getClass(), "sumBattleMasterHighScore", -9095378486001039156L);
        setLongField(term115141, term115141.getClass(), "sumBattleLunaticHighScore", -4363412272132313401L);
        setField(term115141, term115141.getClass(), "eventWatchedDate", "NpOgFaCXxB");
        setField(term115141, term115141.getClass(), "cmEventWatchedDate", "xAfHHeOBie");
        setField(term115141, term115141.getClass(), "firstGameId", "NTXawZXYgT");
        setField(term115141, term115141.getClass(), "firstRomVersion", "KrNHXyCftn");
        setField(term115141, term115141.getClass(), "firstDataVersion", "qoZIehoMQV");
        setField(term115141, term115141.getClass(), "firstPlayDate", "mUjsuGJONY");
        setField(term115141, term115141.getClass(), "lastGameId", "GOumeOeOmE");
        setField(term115141, term115141.getClass(), "lastRomVersion", "tYTspNFBci");
        setField(term115141, term115141.getClass(), "lastDataVersion", "gPqqqLlWBv");
        setField(term115141, term115141.getClass(), "compatibleCmVersion", "IlWYmbzQQL");
        setField(term115141, term115141.getClass(), "lastPlayDate", "pinoPipukP");
        setIntField(term115141, term115141.getClass(), "lastPlaceId", -1777069422);
        setField(term115141, term115141.getClass(), "lastPlaceName", "qqnzeIWFCa");
        setIntField(term115141, term115141.getClass(), "lastRegionId", 1328193739);
        setField(term115141, term115141.getClass(), "lastRegionName", "gOdeBqOhYH");
        setIntField(term115141, term115141.getClass(), "lastAllNetId", 1769168524);
        setField(term115141, term115141.getClass(), "lastClientId", "EyPdpJTxkZ");
        setIntField(term115141, term115141.getClass(), "lastUsedDeckId", 527335694);
        setIntField(term115141, term115141.getClass(), "lastPlayMusicLevel", 1217049721);
        setIntField(term115141, term115141.getClass(), "lastEmoneyBrand", 843041661);
        setField(term115139, term115139.getClass(), "user", term115141);
        setIntField(term115139, term115139.getClass(), "cardId", -1);
        setIntField(term115139, term115139.getClass(), "digitalStock", 1);
        setIntField(term115139, term115139.getClass(), "analogStock", -1872674019);
        setIntField(term115139, term115139.getClass(), "level", 580191788);
        setIntField(term115139, term115139.getClass(), "maxLevel", 10);
        setIntField(term115139, term115139.getClass(), "exp", -1340848376);
        setIntField(term115139, term115139.getClass(), "printCount", -1482512097);
        setIntField(term115139, term115139.getClass(), "useCount", -2076427376);
        setBooleanField(term115139, term115139.getClass(), "isNew", true);
        setField(term115139, term115139.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term115139, term115139.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term115139, term115139.getClass(), "skillId", -852476369);
        setBooleanField(term115139, term115139.getClass(), "isAcquired", true);
        setField(term115139, term115139.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLevel", argTypes, term115139, args);
    }

};


