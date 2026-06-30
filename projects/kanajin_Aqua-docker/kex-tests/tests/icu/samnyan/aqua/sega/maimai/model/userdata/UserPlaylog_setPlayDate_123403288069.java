package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserPlaylog_setPlayDate_123403288069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145277;

    public UserPlaylog_setPlayDate_123403288069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145283 = new Long(3423155413133381764L);
        term145277 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term145279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term145281 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term145297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145312 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term145277, term145277.getClass(), "id", 2016254485611358021L);
        setLongField(term145279, term145279.getClass(), "id", 7087994518559082143L);
        setLongField(term145281, term145281.getClass(), "id", -4261531885468581427L);
        setField(term145281, term145281.getClass(), "extId", term145283);
        setField(term145281, term145281.getClass(), "luid", "ZbjykDvTqF");
        setIntField(term145298, term145298.getClass(), "year", 2011);
        setShortField(term145298, term145298.getClass(), "month", (short) 6);
        setShortField(term145298, term145298.getClass(), "day", (short) 27);
        setField(term145297, term145297.getClass(), "date", term145298);
        setByteField(term145302, term145302.getClass(), "hour", (byte) 12);
        setByteField(term145302, term145302.getClass(), "minute", (byte) 48);
        setByteField(term145302, term145302.getClass(), "second", (byte) 45);
        setIntField(term145302, term145302.getClass(), "nano", 332145929);
        setField(term145297, term145297.getClass(), "time", term145302);
        setField(term145281, term145281.getClass(), "registerTime", term145297);
        setIntField(term145308, term145308.getClass(), "year", 2020);
        setShortField(term145308, term145308.getClass(), "month", (short) 4);
        setShortField(term145308, term145308.getClass(), "day", (short) 29);
        setField(term145307, term145307.getClass(), "date", term145308);
        setByteField(term145312, term145312.getClass(), "hour", (byte) 2);
        setByteField(term145312, term145312.getClass(), "minute", (byte) 54);
        setByteField(term145312, term145312.getClass(), "second", (byte) 2);
        setIntField(term145312, term145312.getClass(), "nano", 314066531);
        setField(term145307, term145307.getClass(), "time", term145312);
        setField(term145281, term145281.getClass(), "accessTime", term145307);
        setField(term145279, term145279.getClass(), "card", term145281);
        setIntField(term145279, term145279.getClass(), "lastDataVersion", -1313076553);
        setField(term145279, term145279.getClass(), "userName", "HmpRVfDNrn");
        setIntField(term145279, term145279.getClass(), "point", 1689692580);
        setIntField(term145279, term145279.getClass(), "totalPoint", -824986027);
        setIntField(term145279, term145279.getClass(), "iconId", -1553793374);
        setIntField(term145279, term145279.getClass(), "nameplateId", -1182075907);
        setIntField(term145279, term145279.getClass(), "frameId", -716928978);
        setIntField(term145279, term145279.getClass(), "trophyId", -1092562849);
        setIntField(term145279, term145279.getClass(), "playCount", 249979911);
        setIntField(term145279, term145279.getClass(), "playVsCount", -1015808608);
        setIntField(term145279, term145279.getClass(), "playSyncCount", -642571564);
        setIntField(term145279, term145279.getClass(), "winCount", -1691073345);
        setIntField(term145279, term145279.getClass(), "helpCount", -1193140740);
        setIntField(term145279, term145279.getClass(), "comboCount", -1587301779);
        setIntField(term145279, term145279.getClass(), "feverCount", -268046415);
        setIntField(term145279, term145279.getClass(), "totalHiScore", 25070635);
        setIntField(term145279, term145279.getClass(), "totalEasyHighScore", 1768435290);
        setIntField(term145279, term145279.getClass(), "totalBasicHighScore", 813571003);
        setIntField(term145279, term145279.getClass(), "totalAdvancedHighScore", 613913808);
        setIntField(term145279, term145279.getClass(), "totalExpertHighScore", 1218208288);
        setIntField(term145279, term145279.getClass(), "totalMasterHighScore", -1723555071);
        setIntField(term145279, term145279.getClass(), "totalReMasterHighScore", -253585217);
        setIntField(term145279, term145279.getClass(), "totalHighSync", -43905294);
        setIntField(term145279, term145279.getClass(), "totalEasySync", 903044702);
        setIntField(term145279, term145279.getClass(), "totalBasicSync", 496575552);
        setIntField(term145279, term145279.getClass(), "totalAdvancedSync", -721070306);
        setIntField(term145279, term145279.getClass(), "totalExpertSync", -1512308594);
        setIntField(term145279, term145279.getClass(), "totalMasterSync", -826658409);
        setIntField(term145279, term145279.getClass(), "totalReMasterSync", 1010337146);
        setIntField(term145279, term145279.getClass(), "playerRating", -1076936509);
        setIntField(term145279, term145279.getClass(), "highestRating", 1772973336);
        setIntField(term145279, term145279.getClass(), "rankAuthTailId", -1826915997);
        setField(term145279, term145279.getClass(), "eventWatchedDate", "PdGPETcyXN");
        setField(term145279, term145279.getClass(), "webLimitDate", "rWXLyvesHI");
        setIntField(term145279, term145279.getClass(), "challengeTrackPhase", 412630021);
        setIntField(term145279, term145279.getClass(), "firstPlayBits", 711881458);
        setField(term145279, term145279.getClass(), "lastPlayDate", "iRfJJNrMLZ");
        setIntField(term145279, term145279.getClass(), "lastPlaceId", -1210162042);
        setField(term145279, term145279.getClass(), "lastPlaceName", "sYrnlJNHsq");
        setIntField(term145279, term145279.getClass(), "lastRegionId", 1537040246);
        setField(term145279, term145279.getClass(), "lastRegionName", "POHTKvZAAU");
        setField(term145279, term145279.getClass(), "lastClientId", "HSQaALDFNu");
        setField(term145279, term145279.getClass(), "lastCountryCode", "aOaXBQyJal");
        setIntField(term145279, term145279.getClass(), "eventPoint", -165158827);
        setIntField(term145279, term145279.getClass(), "totalLv", 1187943069);
        setIntField(term145279, term145279.getClass(), "lastLoginBonusDay", -2126093553);
        setIntField(term145279, term145279.getClass(), "lastSurvivalBonusDay", -538478573);
        setIntField(term145279, term145279.getClass(), "loginBonusLv", 121445721);
        setField(term145277, term145277.getClass(), "user", term145279);
        setIntField(term145277, term145277.getClass(), "orderId", 2068943350);
        setLongField(term145277, term145277.getClass(), "sortNumber", -5071622903555986914L);
        setIntField(term145277, term145277.getClass(), "placeId", 1680566581);
        setField(term145277, term145277.getClass(), "placeName", "vRbigVGnNS");
        setField(term145277, term145277.getClass(), "country", "bVteGrLeFP");
        setIntField(term145277, term145277.getClass(), "regionId", -727477309);
        setField(term145277, term145277.getClass(), "playDate", "LLVxzGZuym");
        setField(term145277, term145277.getClass(), "userPlayDate", "FHWZKmPKlK");
        setIntField(term145277, term145277.getClass(), "musicId", 1506062884);
        setIntField(term145277, term145277.getClass(), "level", -321471675);
        setIntField(term145277, term145277.getClass(), "gameMode", -1737748475);
        setIntField(term145277, term145277.getClass(), "rivalNum", -296912830);
        setIntField(term145277, term145277.getClass(), "track", -1026594352);
        setIntField(term145277, term145277.getClass(), "eventId", -1364781830);
        setBooleanField(term145277, term145277.getClass(), "isFreeToPlay", false);
        setIntField(term145277, term145277.getClass(), "playerRating", 1400905117);
        setLongField(term145277, term145277.getClass(), "playedUserId1", 3882122150290927490L);
        setField(term145277, term145277.getClass(), "playedUserName1", "MqWvZIWxCr");
        setIntField(term145277, term145277.getClass(), "playedMusicLevel1", 1552987322);
        setLongField(term145277, term145277.getClass(), "playedUserId2", -1606772867931980245L);
        setField(term145277, term145277.getClass(), "playedUserName2", "iiMXpaWLIH");
        setIntField(term145277, term145277.getClass(), "playedMusicLevel2", 1780231583);
        setLongField(term145277, term145277.getClass(), "playedUserId3", -681588793216734678L);
        setField(term145277, term145277.getClass(), "playedUserName3", "MqMDTdIpYR");
        setIntField(term145277, term145277.getClass(), "playedMusicLevel3", 700150534);
        setIntField(term145277, term145277.getClass(), "achievement", -2041618961);
        setIntField(term145277, term145277.getClass(), "score", 1915946291);
        setIntField(term145277, term145277.getClass(), "tapScore", 623809890);
        setIntField(term145277, term145277.getClass(), "holdScore", -12465819);
        setIntField(term145277, term145277.getClass(), "slideScore", -1869167677);
        setIntField(term145277, term145277.getClass(), "breakScore", -897779384);
        setIntField(term145277, term145277.getClass(), "syncRate", 814979614);
        setIntField(term145277, term145277.getClass(), "vsWin", -1970498561);
        setBooleanField(term145277, term145277.getClass(), "isAllPerfect", false);
        setIntField(term145277, term145277.getClass(), "fullCombo", 982521346);
        setIntField(term145277, term145277.getClass(), "maxFever", -302394850);
        setIntField(term145277, term145277.getClass(), "maxCombo", -336834837);
        setIntField(term145277, term145277.getClass(), "tapPerfect", -1108318288);
        setIntField(term145277, term145277.getClass(), "tapGreat", -435114704);
        setIntField(term145277, term145277.getClass(), "tapGood", 142789522);
        setIntField(term145277, term145277.getClass(), "tapBad", 342934559);
        setIntField(term145277, term145277.getClass(), "holdPerfect", 1103167653);
        setIntField(term145277, term145277.getClass(), "holdGreat", 681051450);
        setIntField(term145277, term145277.getClass(), "holdGood", -250002255);
        setIntField(term145277, term145277.getClass(), "holdBad", 1800364);
        setIntField(term145277, term145277.getClass(), "slidePerfect", -304061975);
        setIntField(term145277, term145277.getClass(), "slideGreat", -1743837327);
        setIntField(term145277, term145277.getClass(), "slideGood", -2074707092);
        setIntField(term145277, term145277.getClass(), "slideBad", -1546650170);
        setIntField(term145277, term145277.getClass(), "breakPerfect", 845666879);
        setIntField(term145277, term145277.getClass(), "breakGreat", -2138689322);
        setIntField(term145277, term145277.getClass(), "breakGood", 191811468);
        setIntField(term145277, term145277.getClass(), "breakBad", -1361727288);
        setBooleanField(term145277, term145277.getClass(), "isTrackSkip", false);
        setBooleanField(term145277, term145277.getClass(), "isHighScore", true);
        setBooleanField(term145277, term145277.getClass(), "isChallengeTrack", true);
        setIntField(term145277, term145277.getClass(), "challengeLife", 605815345);
        setIntField(term145277, term145277.getClass(), "challengeRemain", -95586153);
        setIntField(term145277, term145277.getClass(), "isAllPerfectPlus", 926007523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuwidsQbSs";
        callMethod(klass, "setPlayDate", argTypes, term145277, args);
    }

};


