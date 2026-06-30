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

public class UserData_setLastPlaceName_974102137116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71378;

    public UserData_setLastPlaceName_974102137116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71382 = new Long(-8471550651709805183L);
        term71378 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term71380 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71411 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71378, term71378.getClass(), "id", 5163944658879449034L);
        setLongField(term71380, term71380.getClass(), "id", -2762998546435960413L);
        setField(term71380, term71380.getClass(), "extId", term71382);
        setField(term71380, term71380.getClass(), "luid", "bvybTJUNMY");
        setIntField(term71397, term71397.getClass(), "year", 2023);
        setShortField(term71397, term71397.getClass(), "month", (short) 4);
        setShortField(term71397, term71397.getClass(), "day", (short) 10);
        setField(term71396, term71396.getClass(), "date", term71397);
        setByteField(term71401, term71401.getClass(), "hour", (byte) 19);
        setByteField(term71401, term71401.getClass(), "minute", (byte) 34);
        setByteField(term71401, term71401.getClass(), "second", (byte) 41);
        setIntField(term71401, term71401.getClass(), "nano", 911888376);
        setField(term71396, term71396.getClass(), "time", term71401);
        setField(term71380, term71380.getClass(), "registerTime", term71396);
        setIntField(term71407, term71407.getClass(), "year", 2014);
        setShortField(term71407, term71407.getClass(), "month", (short) 2);
        setShortField(term71407, term71407.getClass(), "day", (short) 5);
        setField(term71406, term71406.getClass(), "date", term71407);
        setByteField(term71411, term71411.getClass(), "hour", (byte) 14);
        setByteField(term71411, term71411.getClass(), "minute", (byte) 2);
        setByteField(term71411, term71411.getClass(), "second", (byte) 4);
        setIntField(term71411, term71411.getClass(), "nano", 458277660);
        setField(term71406, term71406.getClass(), "time", term71411);
        setField(term71380, term71380.getClass(), "accessTime", term71406);
        setField(term71378, term71378.getClass(), "card", term71380);
        setField(term71378, term71378.getClass(), "userName", "MoGyMoOkMi");
        setIntField(term71378, term71378.getClass(), "level", 1946252506);
        setIntField(term71378, term71378.getClass(), "reincarnationNum", -1279902182);
        setLongField(term71378, term71378.getClass(), "exp", -1286201195708279888L);
        setLongField(term71378, term71378.getClass(), "point", -4497907374818723648L);
        setLongField(term71378, term71378.getClass(), "totalPoint", -8836354257007073767L);
        setIntField(term71378, term71378.getClass(), "playCount", -551427938);
        setIntField(term71378, term71378.getClass(), "jewelCount", 1334551737);
        setIntField(term71378, term71378.getClass(), "totalJewelCount", -1187792021);
        setIntField(term71378, term71378.getClass(), "medalCount", 1724189490);
        setIntField(term71378, term71378.getClass(), "playerRating", -850819450);
        setIntField(term71378, term71378.getClass(), "highestRating", 1652716990);
        setIntField(term71378, term71378.getClass(), "battlePoint", 958228032);
        setIntField(term71378, term71378.getClass(), "bestBattlePoint", 624789164);
        setIntField(term71378, term71378.getClass(), "overDamageBattlePoint", 117919201);
        setBooleanField(term71378, term71378.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term71378, term71378.getClass(), "nameplateId", 1389237948);
        setIntField(term71378, term71378.getClass(), "trophyId", 866670285);
        setIntField(term71378, term71378.getClass(), "cardId", -2004076717);
        setIntField(term71378, term71378.getClass(), "characterId", -1695237959);
        setIntField(term71378, term71378.getClass(), "characterVoiceNo", 1317356126);
        setIntField(term71378, term71378.getClass(), "tabSetting", 2058932005);
        setIntField(term71378, term71378.getClass(), "tabSortSetting", -773196588);
        setIntField(term71378, term71378.getClass(), "cardCategorySetting", -1082451840);
        setIntField(term71378, term71378.getClass(), "cardSortSetting", 120368183);
        setIntField(term71378, term71378.getClass(), "rivalScoreCategorySetting", 1721841052);
        setIntField(term71378, term71378.getClass(), "playedTutorialBit", -1801745263);
        setIntField(term71378, term71378.getClass(), "firstTutorialCancelNum", 1232286807);
        setLongField(term71378, term71378.getClass(), "sumTechHighScore", -1461657660894361614L);
        setLongField(term71378, term71378.getClass(), "sumTechBasicHighScore", 1715352043372419387L);
        setLongField(term71378, term71378.getClass(), "sumTechAdvancedHighScore", 5275491898202461780L);
        setLongField(term71378, term71378.getClass(), "sumTechExpertHighScore", -2039714302053648737L);
        setLongField(term71378, term71378.getClass(), "sumTechMasterHighScore", -8013526278764187887L);
        setLongField(term71378, term71378.getClass(), "sumTechLunaticHighScore", 697161019627941929L);
        setLongField(term71378, term71378.getClass(), "sumBattleHighScore", 5572685640122211331L);
        setLongField(term71378, term71378.getClass(), "sumBattleBasicHighScore", -8410507195062360746L);
        setLongField(term71378, term71378.getClass(), "sumBattleAdvancedHighScore", 2635341406861932189L);
        setLongField(term71378, term71378.getClass(), "sumBattleExpertHighScore", -4881546824985102139L);
        setLongField(term71378, term71378.getClass(), "sumBattleMasterHighScore", 573913569116349195L);
        setLongField(term71378, term71378.getClass(), "sumBattleLunaticHighScore", 8421862887742044664L);
        setField(term71378, term71378.getClass(), "eventWatchedDate", "qDEvNqJeGg");
        setField(term71378, term71378.getClass(), "cmEventWatchedDate", "fUxWNxirZc");
        setField(term71378, term71378.getClass(), "firstGameId", "vHkrNjGRyv");
        setField(term71378, term71378.getClass(), "firstRomVersion", "PxGAOnzJzj");
        setField(term71378, term71378.getClass(), "firstDataVersion", "fQVSHtJlDS");
        setField(term71378, term71378.getClass(), "firstPlayDate", "CGdXCWNTxp");
        setField(term71378, term71378.getClass(), "lastGameId", "TUBgEnrcjn");
        setField(term71378, term71378.getClass(), "lastRomVersion", "eUhEGNLBOk");
        setField(term71378, term71378.getClass(), "lastDataVersion", "UrLisdyvVs");
        setField(term71378, term71378.getClass(), "compatibleCmVersion", "VckRXyiShh");
        setField(term71378, term71378.getClass(), "lastPlayDate", "ZKwDTklKHb");
        setIntField(term71378, term71378.getClass(), "lastPlaceId", -507386961);
        setField(term71378, term71378.getClass(), "lastPlaceName", "tQMlnMStsQ");
        setIntField(term71378, term71378.getClass(), "lastRegionId", -476320083);
        setField(term71378, term71378.getClass(), "lastRegionName", "OYJvKAMFEk");
        setIntField(term71378, term71378.getClass(), "lastAllNetId", -2100928588);
        setField(term71378, term71378.getClass(), "lastClientId", "puNAveVBkA");
        setIntField(term71378, term71378.getClass(), "lastUsedDeckId", -81621107);
        setIntField(term71378, term71378.getClass(), "lastPlayMusicLevel", -1617104329);
        setIntField(term71378, term71378.getClass(), "lastEmoneyBrand", -34705122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BcZKUIbuQL";
        callMethod(klass, "setLastPlaceName", argTypes, term71378, args);
    }

};


