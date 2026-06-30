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

public class UserPlaylog_getEventId_191668378710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187538;

    public UserPlaylog_getEventId_191668378710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187544 = new Long(8024477479047145752L);
        term187538 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term187540 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term187542 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term187558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187573 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187538, term187538.getClass(), "id", -6395891323159812853L);
        setLongField(term187540, term187540.getClass(), "id", -5016135743410612221L);
        setLongField(term187542, term187542.getClass(), "id", 5876553591384977274L);
        setField(term187542, term187542.getClass(), "extId", term187544);
        setField(term187542, term187542.getClass(), "luid", "rCWvaRZdUo");
        setIntField(term187559, term187559.getClass(), "year", 2011);
        setShortField(term187559, term187559.getClass(), "month", (short) 11);
        setShortField(term187559, term187559.getClass(), "day", (short) 10);
        setField(term187558, term187558.getClass(), "date", term187559);
        setByteField(term187563, term187563.getClass(), "hour", (byte) 16);
        setByteField(term187563, term187563.getClass(), "minute", (byte) 19);
        setByteField(term187563, term187563.getClass(), "second", (byte) 18);
        setIntField(term187563, term187563.getClass(), "nano", 955766756);
        setField(term187558, term187558.getClass(), "time", term187563);
        setField(term187542, term187542.getClass(), "registerTime", term187558);
        setIntField(term187569, term187569.getClass(), "year", 2011);
        setShortField(term187569, term187569.getClass(), "month", (short) 3);
        setShortField(term187569, term187569.getClass(), "day", (short) 20);
        setField(term187568, term187568.getClass(), "date", term187569);
        setByteField(term187573, term187573.getClass(), "hour", (byte) 2);
        setByteField(term187573, term187573.getClass(), "minute", (byte) 22);
        setByteField(term187573, term187573.getClass(), "second", (byte) 29);
        setIntField(term187573, term187573.getClass(), "nano", 438239474);
        setField(term187568, term187568.getClass(), "time", term187573);
        setField(term187542, term187542.getClass(), "accessTime", term187568);
        setField(term187540, term187540.getClass(), "card", term187542);
        setField(term187540, term187540.getClass(), "userName", "BMnJwMRfdp");
        setIntField(term187540, term187540.getClass(), "level", -1966369959);
        setIntField(term187540, term187540.getClass(), "reincarnationNum", 2001592972);
        setLongField(term187540, term187540.getClass(), "exp", 3496095984619985954L);
        setLongField(term187540, term187540.getClass(), "point", -3275163220898580731L);
        setLongField(term187540, term187540.getClass(), "totalPoint", 674072293379122114L);
        setIntField(term187540, term187540.getClass(), "playCount", 2125618714);
        setIntField(term187540, term187540.getClass(), "jewelCount", 1278193964);
        setIntField(term187540, term187540.getClass(), "totalJewelCount", 1697847830);
        setIntField(term187540, term187540.getClass(), "medalCount", 854534842);
        setIntField(term187540, term187540.getClass(), "playerRating", -1868669722);
        setIntField(term187540, term187540.getClass(), "highestRating", -1617240473);
        setIntField(term187540, term187540.getClass(), "battlePoint", -717100223);
        setIntField(term187540, term187540.getClass(), "bestBattlePoint", 232465097);
        setIntField(term187540, term187540.getClass(), "overDamageBattlePoint", -219639847);
        setBooleanField(term187540, term187540.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term187540, term187540.getClass(), "nameplateId", -1883997010);
        setIntField(term187540, term187540.getClass(), "trophyId", 589940035);
        setIntField(term187540, term187540.getClass(), "cardId", 303311411);
        setIntField(term187540, term187540.getClass(), "characterId", -107635745);
        setIntField(term187540, term187540.getClass(), "characterVoiceNo", -1852838695);
        setIntField(term187540, term187540.getClass(), "tabSetting", 49083098);
        setIntField(term187540, term187540.getClass(), "tabSortSetting", -92217686);
        setIntField(term187540, term187540.getClass(), "cardCategorySetting", -1677257791);
        setIntField(term187540, term187540.getClass(), "cardSortSetting", 683954616);
        setIntField(term187540, term187540.getClass(), "rivalScoreCategorySetting", -1408363971);
        setIntField(term187540, term187540.getClass(), "playedTutorialBit", 48119406);
        setIntField(term187540, term187540.getClass(), "firstTutorialCancelNum", 123440622);
        setLongField(term187540, term187540.getClass(), "sumTechHighScore", 1655388202346680320L);
        setLongField(term187540, term187540.getClass(), "sumTechBasicHighScore", -8061670638141457258L);
        setLongField(term187540, term187540.getClass(), "sumTechAdvancedHighScore", -1558715660728740099L);
        setLongField(term187540, term187540.getClass(), "sumTechExpertHighScore", -984459098685985283L);
        setLongField(term187540, term187540.getClass(), "sumTechMasterHighScore", -1412419717013452103L);
        setLongField(term187540, term187540.getClass(), "sumTechLunaticHighScore", -1656688279009509497L);
        setLongField(term187540, term187540.getClass(), "sumBattleHighScore", 4646436806504898616L);
        setLongField(term187540, term187540.getClass(), "sumBattleBasicHighScore", -1312205360267418697L);
        setLongField(term187540, term187540.getClass(), "sumBattleAdvancedHighScore", 5106675463767553325L);
        setLongField(term187540, term187540.getClass(), "sumBattleExpertHighScore", -8630078807258379510L);
        setLongField(term187540, term187540.getClass(), "sumBattleMasterHighScore", -7789153659686320993L);
        setLongField(term187540, term187540.getClass(), "sumBattleLunaticHighScore", 2965330256979714872L);
        setField(term187540, term187540.getClass(), "eventWatchedDate", "PrHlVcXwbV");
        setField(term187540, term187540.getClass(), "cmEventWatchedDate", "THYqjTOZeh");
        setField(term187540, term187540.getClass(), "firstGameId", "PrSmUcNTjZ");
        setField(term187540, term187540.getClass(), "firstRomVersion", "eTqMMvDhOk");
        setField(term187540, term187540.getClass(), "firstDataVersion", "GrzQcftIiy");
        setField(term187540, term187540.getClass(), "firstPlayDate", "NuebxSinWP");
        setField(term187540, term187540.getClass(), "lastGameId", "RxhYQyihmS");
        setField(term187540, term187540.getClass(), "lastRomVersion", "JYhhBZSIiK");
        setField(term187540, term187540.getClass(), "lastDataVersion", "jAjlzIxoaM");
        setField(term187540, term187540.getClass(), "compatibleCmVersion", "PKfzqTdjtP");
        setField(term187540, term187540.getClass(), "lastPlayDate", "eJLBbWRDRk");
        setIntField(term187540, term187540.getClass(), "lastPlaceId", -1768690545);
        setField(term187540, term187540.getClass(), "lastPlaceName", "EREdbSLmio");
        setIntField(term187540, term187540.getClass(), "lastRegionId", -1655526781);
        setField(term187540, term187540.getClass(), "lastRegionName", "fnnUVrmaXG");
        setIntField(term187540, term187540.getClass(), "lastAllNetId", -2080302114);
        setField(term187540, term187540.getClass(), "lastClientId", "MDHWoNRyfV");
        setIntField(term187540, term187540.getClass(), "lastUsedDeckId", -661400963);
        setIntField(term187540, term187540.getClass(), "lastPlayMusicLevel", -423080768);
        setIntField(term187540, term187540.getClass(), "lastEmoneyBrand", -78695612);
        setField(term187538, term187538.getClass(), "user", term187540);
        setIntField(term187538, term187538.getClass(), "sortNumber", 1199748690);
        setIntField(term187538, term187538.getClass(), "placeId", -1982962318);
        setField(term187538, term187538.getClass(), "placeName", "yAuFGfiEiN");
        setField(term187538, term187538.getClass(), "playDate", "EtOSnELQvg");
        setField(term187538, term187538.getClass(), "userPlayDate", "dkQQxXUxmC");
        setIntField(term187538, term187538.getClass(), "musicId", 1593132746);
        setIntField(term187538, term187538.getClass(), "level", 1522102912);
        setIntField(term187538, term187538.getClass(), "playKind", -211973081);
        setIntField(term187538, term187538.getClass(), "eventId", 725283135);
        setField(term187538, term187538.getClass(), "eventName", "SsuEoOzBgE");
        setIntField(term187538, term187538.getClass(), "eventPoint", -1719671182);
        setIntField(term187538, term187538.getClass(), "playedUserId1", -538422081);
        setIntField(term187538, term187538.getClass(), "playedUserId2", -927155686);
        setIntField(term187538, term187538.getClass(), "playedUserId3", -1434757746);
        setField(term187538, term187538.getClass(), "playedUserName1", "EcvJGrLPRz");
        setField(term187538, term187538.getClass(), "playedUserName2", "XtIfJsUuvC");
        setField(term187538, term187538.getClass(), "playedUserName3", "WhLgjfGIGf");
        setIntField(term187538, term187538.getClass(), "playedMusicLevel1", -1310339010);
        setIntField(term187538, term187538.getClass(), "playedMusicLevel2", -1447648390);
        setIntField(term187538, term187538.getClass(), "playedMusicLevel3", -1299088423);
        setIntField(term187538, term187538.getClass(), "cardId1", 977296957);
        setIntField(term187538, term187538.getClass(), "cardId2", 1586808362);
        setIntField(term187538, term187538.getClass(), "cardId3", -512737863);
        setIntField(term187538, term187538.getClass(), "cardLevel1", -1649958441);
        setIntField(term187538, term187538.getClass(), "cardLevel2", -1404279126);
        setIntField(term187538, term187538.getClass(), "cardLevel3", 493437846);
        setIntField(term187538, term187538.getClass(), "cardAttack1", -909658371);
        setIntField(term187538, term187538.getClass(), "cardAttack2", -1238691745);
        setIntField(term187538, term187538.getClass(), "cardAttack3", 300313903);
        setIntField(term187538, term187538.getClass(), "bossCharaId", 1575380093);
        setIntField(term187538, term187538.getClass(), "bossLevel", 776765535);
        setIntField(term187538, term187538.getClass(), "bossAttribute", 723360748);
        setIntField(term187538, term187538.getClass(), "clearStatus", -831759632);
        setIntField(term187538, term187538.getClass(), "techScore", -156726292);
        setIntField(term187538, term187538.getClass(), "techScoreRank", 1907884024);
        setIntField(term187538, term187538.getClass(), "battleScore", -799156553);
        setIntField(term187538, term187538.getClass(), "battleScoreRank", -1923382317);
        setIntField(term187538, term187538.getClass(), "platinumScore", 95911344);
        setIntField(term187538, term187538.getClass(), "maxCombo", -1645593981);
        setIntField(term187538, term187538.getClass(), "judgeMiss", -1999330416);
        setIntField(term187538, term187538.getClass(), "judgeHit", -1659723057);
        setIntField(term187538, term187538.getClass(), "judgeBreak", 1685315409);
        setIntField(term187538, term187538.getClass(), "judgeCriticalBreak", -1697320127);
        setIntField(term187538, term187538.getClass(), "rateTap", 90743281);
        setIntField(term187538, term187538.getClass(), "rateHold", -369043862);
        setIntField(term187538, term187538.getClass(), "rateFlick", 321344575);
        setIntField(term187538, term187538.getClass(), "rateSideTap", -1944164836);
        setIntField(term187538, term187538.getClass(), "rateSideHold", -1481390257);
        setIntField(term187538, term187538.getClass(), "bellCount", -550936196);
        setIntField(term187538, term187538.getClass(), "totalBellCount", -587355829);
        setIntField(term187538, term187538.getClass(), "damageCount", 640876559);
        setIntField(term187538, term187538.getClass(), "overDamage", 1516812723);
        setBooleanField(term187538, term187538.getClass(), "isTechNewRecord", false);
        setBooleanField(term187538, term187538.getClass(), "isBattleNewRecord", true);
        setBooleanField(term187538, term187538.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term187538, term187538.getClass(), "isFullCombo", false);
        setBooleanField(term187538, term187538.getClass(), "isFullBell", true);
        setBooleanField(term187538, term187538.getClass(), "isAllBreak", false);
        setIntField(term187538, term187538.getClass(), "playerRating", 1897673784);
        setIntField(term187538, term187538.getClass(), "battlePoint", 379634520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term187538, args);
    }

};


