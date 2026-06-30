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

public class UserPlaylog_getEventName_42028613411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188170;

    public UserPlaylog_getEventName_42028613411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188176 = new Long(7006402814669334483L);
        term188170 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term188172 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term188174 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term188190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188195 = newInstance(Class.forName("java.time.LocalTime"));
        Object term188200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188205 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term188170, term188170.getClass(), "id", 4448036272888742346L);
        setLongField(term188172, term188172.getClass(), "id", -6551984474115045703L);
        setLongField(term188174, term188174.getClass(), "id", -1914456014579434174L);
        setField(term188174, term188174.getClass(), "extId", term188176);
        setField(term188174, term188174.getClass(), "luid", "EhUQbbAhWQ");
        setIntField(term188191, term188191.getClass(), "year", 2025);
        setShortField(term188191, term188191.getClass(), "month", (short) 8);
        setShortField(term188191, term188191.getClass(), "day", (short) 27);
        setField(term188190, term188190.getClass(), "date", term188191);
        setByteField(term188195, term188195.getClass(), "hour", (byte) 17);
        setByteField(term188195, term188195.getClass(), "minute", (byte) 10);
        setByteField(term188195, term188195.getClass(), "second", (byte) 17);
        setIntField(term188195, term188195.getClass(), "nano", 43520203);
        setField(term188190, term188190.getClass(), "time", term188195);
        setField(term188174, term188174.getClass(), "registerTime", term188190);
        setIntField(term188201, term188201.getClass(), "year", 2029);
        setShortField(term188201, term188201.getClass(), "month", (short) 4);
        setShortField(term188201, term188201.getClass(), "day", (short) 4);
        setField(term188200, term188200.getClass(), "date", term188201);
        setByteField(term188205, term188205.getClass(), "hour", (byte) 21);
        setByteField(term188205, term188205.getClass(), "minute", (byte) 28);
        setByteField(term188205, term188205.getClass(), "second", (byte) 58);
        setIntField(term188205, term188205.getClass(), "nano", 639031577);
        setField(term188200, term188200.getClass(), "time", term188205);
        setField(term188174, term188174.getClass(), "accessTime", term188200);
        setField(term188172, term188172.getClass(), "card", term188174);
        setField(term188172, term188172.getClass(), "userName", "iIlZyBWPsg");
        setIntField(term188172, term188172.getClass(), "level", 353352132);
        setIntField(term188172, term188172.getClass(), "reincarnationNum", -367345783);
        setLongField(term188172, term188172.getClass(), "exp", 2889076053035999370L);
        setLongField(term188172, term188172.getClass(), "point", 8488472394277550174L);
        setLongField(term188172, term188172.getClass(), "totalPoint", -8768875143570831312L);
        setIntField(term188172, term188172.getClass(), "playCount", 2080342380);
        setIntField(term188172, term188172.getClass(), "jewelCount", -686275247);
        setIntField(term188172, term188172.getClass(), "totalJewelCount", -1216022402);
        setIntField(term188172, term188172.getClass(), "medalCount", -520857416);
        setIntField(term188172, term188172.getClass(), "playerRating", -733551609);
        setIntField(term188172, term188172.getClass(), "highestRating", -1356258979);
        setIntField(term188172, term188172.getClass(), "battlePoint", 55318841);
        setIntField(term188172, term188172.getClass(), "bestBattlePoint", 2081805554);
        setIntField(term188172, term188172.getClass(), "overDamageBattlePoint", 679008476);
        setBooleanField(term188172, term188172.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term188172, term188172.getClass(), "nameplateId", 1853917521);
        setIntField(term188172, term188172.getClass(), "trophyId", 1330121230);
        setIntField(term188172, term188172.getClass(), "cardId", -216630452);
        setIntField(term188172, term188172.getClass(), "characterId", 1361809573);
        setIntField(term188172, term188172.getClass(), "characterVoiceNo", 1790505574);
        setIntField(term188172, term188172.getClass(), "tabSetting", -1813277220);
        setIntField(term188172, term188172.getClass(), "tabSortSetting", -1095231728);
        setIntField(term188172, term188172.getClass(), "cardCategorySetting", 1735286345);
        setIntField(term188172, term188172.getClass(), "cardSortSetting", 1644109867);
        setIntField(term188172, term188172.getClass(), "rivalScoreCategorySetting", -465156572);
        setIntField(term188172, term188172.getClass(), "playedTutorialBit", -1400504878);
        setIntField(term188172, term188172.getClass(), "firstTutorialCancelNum", -245021343);
        setLongField(term188172, term188172.getClass(), "sumTechHighScore", 199547563242621651L);
        setLongField(term188172, term188172.getClass(), "sumTechBasicHighScore", -455859287126500868L);
        setLongField(term188172, term188172.getClass(), "sumTechAdvancedHighScore", 607834717263740574L);
        setLongField(term188172, term188172.getClass(), "sumTechExpertHighScore", -6195826606387081327L);
        setLongField(term188172, term188172.getClass(), "sumTechMasterHighScore", 4224737123868689959L);
        setLongField(term188172, term188172.getClass(), "sumTechLunaticHighScore", 1362938310875978915L);
        setLongField(term188172, term188172.getClass(), "sumBattleHighScore", 6158081691773104291L);
        setLongField(term188172, term188172.getClass(), "sumBattleBasicHighScore", 6844268458017887233L);
        setLongField(term188172, term188172.getClass(), "sumBattleAdvancedHighScore", -3495607289661947719L);
        setLongField(term188172, term188172.getClass(), "sumBattleExpertHighScore", -3061610539470350124L);
        setLongField(term188172, term188172.getClass(), "sumBattleMasterHighScore", -4154912416981825176L);
        setLongField(term188172, term188172.getClass(), "sumBattleLunaticHighScore", 5193777070686642216L);
        setField(term188172, term188172.getClass(), "eventWatchedDate", "KmeTSoiLRD");
        setField(term188172, term188172.getClass(), "cmEventWatchedDate", "MSIEshhzHU");
        setField(term188172, term188172.getClass(), "firstGameId", "ZccndtPqcy");
        setField(term188172, term188172.getClass(), "firstRomVersion", "cRznRdugDW");
        setField(term188172, term188172.getClass(), "firstDataVersion", "vTMJdYrXUJ");
        setField(term188172, term188172.getClass(), "firstPlayDate", "vVbSRADXpc");
        setField(term188172, term188172.getClass(), "lastGameId", "WpmNATXFgJ");
        setField(term188172, term188172.getClass(), "lastRomVersion", "iVyIjcuuMq");
        setField(term188172, term188172.getClass(), "lastDataVersion", "chRvdrzGHA");
        setField(term188172, term188172.getClass(), "compatibleCmVersion", "fFKbgbAoRN");
        setField(term188172, term188172.getClass(), "lastPlayDate", "bvOUtmPAVd");
        setIntField(term188172, term188172.getClass(), "lastPlaceId", 352873149);
        setField(term188172, term188172.getClass(), "lastPlaceName", "stNPwaLCkm");
        setIntField(term188172, term188172.getClass(), "lastRegionId", 249757493);
        setField(term188172, term188172.getClass(), "lastRegionName", "qoqYRoXwDw");
        setIntField(term188172, term188172.getClass(), "lastAllNetId", -2028608831);
        setField(term188172, term188172.getClass(), "lastClientId", "nxIphOkSDI");
        setIntField(term188172, term188172.getClass(), "lastUsedDeckId", 1831890168);
        setIntField(term188172, term188172.getClass(), "lastPlayMusicLevel", 560641076);
        setIntField(term188172, term188172.getClass(), "lastEmoneyBrand", 2058467976);
        setField(term188170, term188170.getClass(), "user", term188172);
        setIntField(term188170, term188170.getClass(), "sortNumber", -1355674818);
        setIntField(term188170, term188170.getClass(), "placeId", 1133607570);
        setField(term188170, term188170.getClass(), "placeName", "GCQxTTEWts");
        setField(term188170, term188170.getClass(), "playDate", "xUiroWeOcE");
        setField(term188170, term188170.getClass(), "userPlayDate", "aBXTrvOsDW");
        setIntField(term188170, term188170.getClass(), "musicId", 1098498400);
        setIntField(term188170, term188170.getClass(), "level", 333972333);
        setIntField(term188170, term188170.getClass(), "playKind", -963004238);
        setIntField(term188170, term188170.getClass(), "eventId", -1034086033);
        setField(term188170, term188170.getClass(), "eventName", "EUToKuexOA");
        setIntField(term188170, term188170.getClass(), "eventPoint", -1730877004);
        setIntField(term188170, term188170.getClass(), "playedUserId1", -44426778);
        setIntField(term188170, term188170.getClass(), "playedUserId2", 712891292);
        setIntField(term188170, term188170.getClass(), "playedUserId3", -1159253488);
        setField(term188170, term188170.getClass(), "playedUserName1", "mYuAJWhFzG");
        setField(term188170, term188170.getClass(), "playedUserName2", "BXvuwhgbIH");
        setField(term188170, term188170.getClass(), "playedUserName3", "KrVIKgzory");
        setIntField(term188170, term188170.getClass(), "playedMusicLevel1", 134959746);
        setIntField(term188170, term188170.getClass(), "playedMusicLevel2", 1720246226);
        setIntField(term188170, term188170.getClass(), "playedMusicLevel3", 1873634280);
        setIntField(term188170, term188170.getClass(), "cardId1", 377263610);
        setIntField(term188170, term188170.getClass(), "cardId2", 90974568);
        setIntField(term188170, term188170.getClass(), "cardId3", 1807676493);
        setIntField(term188170, term188170.getClass(), "cardLevel1", -305806713);
        setIntField(term188170, term188170.getClass(), "cardLevel2", 2061837241);
        setIntField(term188170, term188170.getClass(), "cardLevel3", 1081840138);
        setIntField(term188170, term188170.getClass(), "cardAttack1", -161898154);
        setIntField(term188170, term188170.getClass(), "cardAttack2", 250703931);
        setIntField(term188170, term188170.getClass(), "cardAttack3", -1894406361);
        setIntField(term188170, term188170.getClass(), "bossCharaId", 1742486272);
        setIntField(term188170, term188170.getClass(), "bossLevel", -973045837);
        setIntField(term188170, term188170.getClass(), "bossAttribute", 134712754);
        setIntField(term188170, term188170.getClass(), "clearStatus", -1259800083);
        setIntField(term188170, term188170.getClass(), "techScore", 34131474);
        setIntField(term188170, term188170.getClass(), "techScoreRank", -631704303);
        setIntField(term188170, term188170.getClass(), "battleScore", -1635979050);
        setIntField(term188170, term188170.getClass(), "battleScoreRank", 70002762);
        setIntField(term188170, term188170.getClass(), "platinumScore", 389525410);
        setIntField(term188170, term188170.getClass(), "maxCombo", 2112942190);
        setIntField(term188170, term188170.getClass(), "judgeMiss", 398996323);
        setIntField(term188170, term188170.getClass(), "judgeHit", -440295917);
        setIntField(term188170, term188170.getClass(), "judgeBreak", -780746391);
        setIntField(term188170, term188170.getClass(), "judgeCriticalBreak", -118585157);
        setIntField(term188170, term188170.getClass(), "rateTap", -1914726727);
        setIntField(term188170, term188170.getClass(), "rateHold", 123445242);
        setIntField(term188170, term188170.getClass(), "rateFlick", -1900798875);
        setIntField(term188170, term188170.getClass(), "rateSideTap", 449339836);
        setIntField(term188170, term188170.getClass(), "rateSideHold", -141504269);
        setIntField(term188170, term188170.getClass(), "bellCount", 831427858);
        setIntField(term188170, term188170.getClass(), "totalBellCount", -1304168942);
        setIntField(term188170, term188170.getClass(), "damageCount", 539294515);
        setIntField(term188170, term188170.getClass(), "overDamage", -689957065);
        setBooleanField(term188170, term188170.getClass(), "isTechNewRecord", false);
        setBooleanField(term188170, term188170.getClass(), "isBattleNewRecord", false);
        setBooleanField(term188170, term188170.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term188170, term188170.getClass(), "isFullCombo", true);
        setBooleanField(term188170, term188170.getClass(), "isFullBell", false);
        setBooleanField(term188170, term188170.getClass(), "isAllBreak", true);
        setIntField(term188170, term188170.getClass(), "playerRating", 1191175314);
        setIntField(term188170, term188170.getClass(), "battlePoint", -809294633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventName", argTypes, term188170, args);
    }

};


